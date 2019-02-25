package com.test.crm.mapper;

import java.util.List;

import com.test.crm.pojo.Customer;
import com.test.crm.pojo.QueryVo;

/**
 * @Description
 * @author ghsticker
 * 2019��2��8��
 */
public interface CustomerMapper {

	/**
	 * 
	* @Description: ����QueryVo��ҳ��ѯ
	* @param @param vo
	* @param @return      
	* @return List<Customer>
	* @throws
	 */
	List<Customer> queryCustomerByQueryVo(QueryVo vo);
	
	/**
	 * 
	* @Description: ��ѯ���ݵ�����
	* @param @param vo
	* @param @return      
	* @return int
	* @throws
	 */
	int queryCountByQueryVo(QueryVo vo);
	
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












