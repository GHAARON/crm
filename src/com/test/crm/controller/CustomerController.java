package com.test.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.crm.pojo.BaseDict;
import com.test.crm.pojo.Customer;
import com.test.crm.pojo.QueryVo;
import com.test.crm.service.BaseDictService;
import com.test.crm.service.CustomerService;
import com.test.crm.utils.Page;

/**
 * @Description
 * @author ghsticker
 * 2019年2月8日
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private BaseDictService baseDictService;
	
	@Autowired
	private CustomerService customerService;
	
	@Value("${customer_from_type}")
	private String customer_from_type;
	@Value("${customer_industry_type}")
	private String customer_industry_type;
	@Value("${customer_level_type}")
	private String customer_level_type;
	
	@RequestMapping("/list.action")
	public String queryCustomerList(Model model,QueryVo vo){
		//客户来源
		List<BaseDict> fromType = baseDictService.queryBaseDictByDictTypeCode(customer_from_type);
		//所属行业
		List<BaseDict> industryType = baseDictService.queryBaseDictByDictTypeCode(customer_industry_type);
		//客户级别
		List<BaseDict> levelType = baseDictService.queryBaseDictByDictTypeCode(customer_level_type);
				
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		Page<Customer> page = customerService.queryCustomerByQueryVo(vo);
		
		model.addAttribute("page", page);
		model.addAttribute("vo", vo);
		
		return "customer";
	}
	
	
	@RequestMapping("/edit.action")
	@ResponseBody
	public Customer edit(Integer id){
		
		return customerService.queryCustomerById(id);
	}
	
	@RequestMapping("/update.action")
	@ResponseBody
	public String update(Customer customer){
		String msg = "1";
		try {
			customerService.updateCustomerById(customer);
			msg = "0";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	
	@RequestMapping("/delete.action")
	@ResponseBody
	public String delete(Integer id){
		String msg = "1";
		try {
			customerService.deleteCustomerById(id);
			msg = "0";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
	
	
}























