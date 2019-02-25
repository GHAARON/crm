package com.test.crm.service;

import java.util.List;

import com.test.crm.pojo.BaseDict;

/**
 * @Description
 * @author ghsticker
 * 2019��2��8��
 */
public interface BaseDictService {

	/**
	 * 
	* @Description: �����������ѯ����
	* @param @param dictTypeCode
	* @param @return      
	* @return List<BaseDict>
	* @throws
	 */
	List<BaseDict> queryBaseDictByDictTypeCode(String dictTypeCode);
}

