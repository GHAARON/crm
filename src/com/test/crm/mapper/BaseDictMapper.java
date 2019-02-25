package com.test.crm.mapper;

import java.util.List;

import com.test.crm.pojo.BaseDict;

/**
 * @Description
 * @author ghsticker
 * 2019��2��8��
 */
public interface BaseDictMapper {

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

