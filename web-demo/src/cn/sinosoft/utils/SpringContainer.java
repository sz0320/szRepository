package cn.sinosoft.utils;

import org.springframework.context.ApplicationContext;

import cn.sinosoft.facade.EmpService;

public class SpringContainer {

	private static ApplicationContext context = null;
	
	public static void setContext(ApplicationContext context) {
		SpringContainer.context = context;
	}
	public static EmpService getEmpService() {
		return (EmpService) context.getBean("empService");
	}
	
}
