package com.test.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.crm.mapper.CustomerMapper;
import com.test.crm.pojo.Customer;
import com.test.crm.pojo.QueryVo;
import com.test.crm.service.CustomerService;
import com.test.crm.utils.Page;

/**
 * @Description
 * @author ghsticker
 * 2019年2月8日
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public Page<Customer> queryCustomerByQueryVo(QueryVo vo) {

		
		vo.setStart((vo.getPage()-1) * vo.getRows());
		
		//总页数
		int total = customerMapper.queryCountByQueryVo(vo);
		
		List<Customer> rows = customerMapper.queryCustomerByQueryVo(vo);
		
		Page<Customer> page = new Page<Customer>(total, vo.getPage(), vo.getRows(), rows);
		
		return page;
	}

	@Override
	public Customer queryCustomerById(Integer id) {

		return customerMapper.queryCustomerById(id);
	}

	@Override
	public void updateCustomerById(Customer customer) {

		customerMapper.updateCustomerById(customer);
	}

	@Override
	public void deleteCustomerById(Integer id) {

		customerMapper.deleteCustomerById(id);
	}

}




