package com.test.crm.service;

import com.test.crm.pojo.Customer;
import com.test.crm.pojo.QueryVo;
import com.test.crm.utils.Page;

/**
 * @Description Customer��ҵ���߼���
 * @author ghsticker
 * 2019��2��8��
 */
public interface CustomerService {

	/**
	 * 
	* @Description:  ����������ҳ��ѯ�ͻ�
	* @param @param vo
	* @param @return      
	* @return Page<Customer>
	* @throws
	 */
	Page<Customer> queryCustomerByQueryVo(QueryVo vo);
	
	/**
	 * 
	* @Description: ����id��������
	* @param @param id
	* @param @return      
	* @return Customer
	* @throws
	 */
	Customer queryCustomerById(Integer id);
	
	/**
	 * 
	* @Description: ����id�޸��û�
	* @param @param id      
	* @return void
	* @throws
	 */
	void updateCustomerById(Customer customer);
	
	/**
	 * 
	* @Description: ����idɾ���û�
	* @param @param id      
	* @return void
	* @throws
	 */
	void deleteCustomerById(Integer id);
}

