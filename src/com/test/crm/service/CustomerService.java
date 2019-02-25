package com.test.crm.service;

import com.test.crm.pojo.Customer;
import com.test.crm.pojo.QueryVo;
import com.test.crm.utils.Page;

/**
 * @Description Customer的业务逻辑层
 * @author ghsticker
 * 2019年2月8日
 */
public interface CustomerService {

	/**
	 * 
	* @Description:  根据条件分页查询客户
	* @param @param vo
	* @param @return      
	* @return Page<Customer>
	* @throws
	 */
	Page<Customer> queryCustomerByQueryVo(QueryVo vo);
	
	/**
	 * 
	* @Description: 根据id查找数据
	* @param @param id
	* @param @return      
	* @return Customer
	* @throws
	 */
	Customer queryCustomerById(Integer id);
	
	/**
	 * 
	* @Description: 根据id修改用户
	* @param @param id      
	* @return void
	* @throws
	 */
	void updateCustomerById(Customer customer);
	
	/**
	 * 
	* @Description: 根据id删除用户
	* @param @param id      
	* @return void
	* @throws
	 */
	void deleteCustomerById(Integer id);
}

