package cn.sinosoft.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;

public class ContextHolder {

	public static ApplicationContext getApplicationContext() {
		return ContextLoader.getCurrentWebApplicationContext();
	}
}
