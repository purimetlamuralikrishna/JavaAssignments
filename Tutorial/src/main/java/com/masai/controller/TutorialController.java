package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Tutorial;
import com.masai.service.TutorialService;

@RestController
public class TutorialController {
	
	@Autowired
	TutorialService tService;

	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	
	@PostMapping("/api/tutorials")
	public Tutorial addTutorial(@RequestBody Tutorial tutorial) {
		
		return tService.createTutorial(tutorial);
	}
	
	@GetMapping("/api/tutorials")
	public List<Tutorial> getList(){
		
		return tService.listTutorials();
	}
	
	@GetMapping("/api/tutorials/{id}")
	public Tutorial getId(@PathVariable ("id") Integer id){
		
		return tService.getById(id);
	}
	
	@PostMapping("/api/tutorials/{id}")
	public Tutorial addTutorial(@PathVariable ("id") Integer id, @RequestBody Tutorial tutorial) {
		
		return tService.updateById(id, tutorial);
	}
	
	@DeleteMapping("/api/tutorials/{id}")
	public Tutorial deleteById(@PathVariable ("id") Integer id){
		
		return tService.removeById(id);
	}
	
	@DeleteMapping("/api/tutorials")
	public String deleteAll(){
		
		return tService.removeAll();
	}
	
}
