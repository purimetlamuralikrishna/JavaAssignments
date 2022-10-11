package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.masai.entity.Tutorial;
import com.masai.repositery.TutorialRepositery;

@Service
public class TutorialService {

	@Autowired
	TutorialRepositery tRepo;
	
	
	
	public Tutorial createTutorial(Tutorial tutorial) {
		
		tRepo.save(tutorial);
		
		return tutorial;
	}
	
	
	public List<Tutorial> listTutorials() {
		
		return tRepo.findAll();
	}
	
	public Tutorial getById(Integer id) {
		
		
		
		return tRepo.findById(id).get();
	}
	
	public Tutorial updateById(Integer id,Tutorial tutorial) {
		
		
		return createTutorial(tutorial);
	}
	
	public Tutorial removeById(Integer id) {
		
		Tutorial t = getById(id);
		tRepo.deleteById(id);
		return t;
	}
	
	public String removeAll() {
		
		tRepo.deleteAll();
		
		return "Removed Scussfully";
	}
	
//	public List<Tutorial> getPublished() {
//		
//		return tRepo.findByPublishedTutorials();
//	}
//	
//	public List<Tutorial> getByTitle(String title) {
//		
//		
//		
//		return tRepo.findByTitleTutorials(title);
//	}
}
