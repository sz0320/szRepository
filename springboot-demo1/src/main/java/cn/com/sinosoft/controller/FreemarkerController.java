package cn.com.sinosoft.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkerController {

	@RequestMapping("/freemarkerShow")
	public String freemarkerShow(Map<String, Object> map) {
		map.put("name", "胡江平");
		map.put("sex", "1");
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		map.put("list", list);
		return "freemarker";
	}
}
