package com.metal.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.util.StringUtils;
import com.metal.mapper.TbWaMapper;
import com.metal.pojo.TbWa;
import com.metal.pojo.TbWaExample;
import com.metal.pojo.TbWaExample.Criteria;
import com.metal.service.CarService;
import com.metal.service.WaService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class WaServiceImpl implements WaService {

	@Autowired
	private TbWaMapper waMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbWa> findAll() {
		return waMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbWa> page=   (Page<TbWa>) waMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbWa mine) {
		waMapper.insert(mine);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbWa mine){
		waMapper.updateByPrimaryKeySelective(mine);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbWa findOne(Integer id){
		return waMapper.selectByPrimaryKey(id);
	}

	/**
	 * 删除
	 */
	@Override
	public void delete(Integer id) {
		
		waMapper.deleteByPrimaryKey(id);
				
	}
	
	
		@Override
	public PageResult findPage(TbWa wa, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbWaExample example=new TbWaExample();
		Criteria criteria = example.createCriteria();
		
		if(wa!=null){			
				
			if(!StringUtils.isEmpty(wa.getWaname())) {
				criteria.andWanameLike("%"+wa.getWaname()+"%");
			}
		}
		
		Page<TbWa> page= (Page<TbWa>)waMapper.selectByExample(example);		
		return new PageResult(0,"",page.getTotal(), page.getResult());
	}
	
}
