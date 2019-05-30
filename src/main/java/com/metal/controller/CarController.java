package com.metal.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ResponseBody;
import com.metal.pojo.TbCar;
import com.metal.service.CarService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarService carService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findAll")
	public List<TbCar> findAll(){			
		return carService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return carService.findPage(page, rows);
	}
	
	/**
	 * 添加或者修改
	 * @param mine
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addOrUpdate")
	public Result addOrUpdate(@RequestBody TbCar mine){
		if(StringUtils.isEmpty(mine.getId())) {
			try {
				carService.add(mine);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
		}else{
			try {
				carService.update(mine);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
		}
		
	}
	

	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/findOne")
	public TbCar findOne(Integer id){
		return carService.findOne(id);		
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/delete")
	public Result delete(Integer id){
		try {
			carService.delete(id);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param key
	 * @param page
	 * @param limit
	 * @return
	 */
	 @ResponseBody
	@RequestMapping("/search")
	public PageResult search(String key, int page, int limit  ){
		TbCar mine=new TbCar();
		if(!StringUtils.isEmpty(key)) {
			
		}
		return carService.findPage(mine, page, limit);		
	}
	
}
