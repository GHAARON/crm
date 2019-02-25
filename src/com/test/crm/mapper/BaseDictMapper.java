package com.test.crm.mapper;

import java.util.List;

import com.test.crm.pojo.BaseDict;

/**
 * @Description
 * @author ghsticker
 * 2019年2月8日
 */
public interface BaseDictMapper {

	/**
	 * 
	* @Description: 根据类别代码查询数据
	* @param @param dictTypeCode
	* @param @return      
	* @return List<BaseDict>
	* @throws
	 */
	List<BaseDict> queryBaseDictByDictTypeCode(String dictTypeCode);
}

