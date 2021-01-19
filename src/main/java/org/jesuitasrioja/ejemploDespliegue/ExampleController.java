package org.jesuitasrioja.ejemploDespliegue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@GetMapping(path = "/hola")
	public String saludo() {
		return "Hello world";
	}

}
