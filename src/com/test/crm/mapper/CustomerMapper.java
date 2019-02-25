package com.test.crm.mapper;

import java.util.List;

import com.test.crm.pojo.Customer;
import com.test.crm.pojo.QueryVo;

/**
 * @Description
 * @author ghsticker
 * 2019年2月8日
 */
public interface CustomerMapper {

	/**
	 * 
	* @Description: 根据QueryVo分页查询
	* @param @param vo
	* @param @return      
	* @return List<Customer>
	* @throws
	 */
	List<Customer> queryCustomerByQueryVo(QueryVo vo);
	
	/**
	 * 
	* @Description: 查询数据的条数
	* @param @param vo
	* @param @return      
	* @return int
	* @throws
	 */
	int queryCountByQueryVo(QueryVo vo);
	
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












