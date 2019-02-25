package com.test.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.crm.mapper.BaseDictMapper;
import com.test.crm.pojo.BaseDict;
import com.test.crm.service.BaseDictService;

/**
 * @Description
 * @author ghsticker
 * 2019Äê2ÔÂ8ÈÕ
 */
@Service
public class BaseDictServiceImpl implements BaseDictService {

	@Autowired
	private BaseDictMapper baseDIctMapper;
	
	@Override
	public List<BaseDict> queryBaseDictByDictTypeCode(String dictTypeCode) {

		return baseDIctMapper.queryBaseDictByDictTypeCode(dictTypeCode);
	}

}

