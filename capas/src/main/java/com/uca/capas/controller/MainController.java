package com.uca.capas.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Student;

@Controller
public class MainController {
	
	@GetMapping(path = "/ejemplo1", produces= MediaType.TEXT_PLAIN_VALUE )
	@ResponseBody
	public String ejemplo1() {
		return "Bienvenidos\n" +  "Programacion N-Capas"; 
	}
	
	@GetMapping("/ejemplo2")
	public @ResponseBody List<Student> ejemplo2(){
		
		return Arrays.asList(
				new Student ("Nombre1", "Apellido","10/10/1992","CarreraX",true),
				new Student ("Nombre2", "Apellido",  "10/10/1992","Ingenieria en Limones", false)
			);
	}
	
	/**************************************************************************************************/
	
	
	@GetMapping("/inicio")
	public String inicio(Student student) {
		return "index";
	}
	
	
	@PostMapping("/formData")
	public ModelAndView procesar(Student student) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("estado", student.delegateEstado());
		mav.addObject("student", student);
		mav.setViewName("prueba");
		
		return mav;
	}
}
