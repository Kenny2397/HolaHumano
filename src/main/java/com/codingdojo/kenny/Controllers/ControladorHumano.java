package com.codingdojo.kenny.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorHumano {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String name(@RequestParam(value="name", required=false) String name,
			@RequestParam(value="last_name", required=false) String last_name) {
		if(name == null) {
			return "<h1>Welcome Humano</h1>";
		}else if (last_name == null){
			return "<h1>Welcome "+name+"</h1>";
		}else {
			return "<h1>Welcome "+name+last_name+"</h1>";
		}
	}
}
