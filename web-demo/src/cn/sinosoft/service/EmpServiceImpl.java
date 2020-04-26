package cn.sinosoft.service;

import org.springframework.jdbc.core.JdbcTemplate;

import cn.sinosoft.facade.EmpService;

public class EmpServiceImpl implements EmpService {

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert() {
		System.out.println(jdbcTemplate);

	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
