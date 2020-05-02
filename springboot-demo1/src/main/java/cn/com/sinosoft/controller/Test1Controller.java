package cn.com.sinosoft.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.sinosoft.mapper.EmpMapper;
import cn.com.sinosoft.po.Emp;

@RestController
@RequestMapping("/test1Controller")
public class Test1Controller {

	private static Logger logger = LoggerFactory.getLogger(Test1Controller.class);
	
	@PostMapping("/test")
	public Map<String, Object> test(@RequestBody Map<String,Object> paramMap) {
		Integer i = 5;
		Map<String, Object> map = new HashMap<String, Object>();
		logger.info("this is info level log text");
		Integer empNo = (Integer) paramMap.get("empNo");
		int a = i / empNo;
		Emp emp = empMapper.findEmp(empNo);
		map.put("emp", emp);
		return map;
	}
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	EmpMapper empMapper;
}
