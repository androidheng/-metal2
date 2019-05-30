package com.metal.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.util.StringUtils;
import com.metal.mapper.TbCarMapper;
import com.metal.pojo.TbCar;
import com.metal.pojo.TbCarExample;
import com.metal.pojo.TbCarExample.Criteria;
import com.metal.service.CarService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private TbCarMapper mineMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCar> findAll() {
		return mineMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCar> page=   (Page<TbCar>) mineMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCar mine) {
		mineMapper.insert(mine);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCar mine){
		mineMapper.updateByPrimaryKeySelective(mine);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCar findOne(Integer id){
		return mineMapper.selectByPrimaryKey(id);
	}

	/**
	 * 删除
	 */
	@Override
	public void delete(Integer id) {
		
		mineMapper.deleteByPrimaryKey(id);
				
	}
	
	
		@Override
	public PageResult findPage(TbCar mine, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCarExample example=new TbCarExample();
		Criteria criteria = example.createCriteria();
		
		if(mine!=null){			
				
			if(!StringUtils.isEmpty("")) {
				
			}
		}
		
		Page<TbCar> page= (Page<TbCar>)mineMapper.selectByExample(example);		
		return new PageResult(0,"",page.getTotal(), page.getResult());
	}
	
}
