package cn.com.sinosoft.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class ExceptionHandlerController {

	@ExceptionHandler(Throwable.class)
	public Map<String, String> exceptionHandler(Throwable e){
		Map<String, String> map = new HashMap<String, String>();
		map.put("respCode", "500");
		map.put("respMsg", "系统异常" + e);
		map.put("errorMsg", "系统异常");
		return map;
	}
}
