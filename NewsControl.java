package com.example.demo.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.*;
import com.example.demo.Jpa.*;
@RestController
@RequestMapping("api")
public class NewsControl {
	
	
	@Autowired private ArticleNewDao ndao;
	@Autowired private hashtagDao odao;
	@Autowired private EventDao edao;
	@Autowired private SubjectDao sdao;
	@Autowired private JobTagsDao jtdao;
	
	
	
	@GetMapping("/getNews")
	public List<ArticleNews>getNews() {
	
	
	return ndao.findAll(); 
	
}
	
	@PostMapping(value= "/addNews" , consumes = "application/json")
	public void add(@RequestBody ArticleNews artc) {
	
		
		ndao.save(artc);
	
	
	
}
	
	
	@PostMapping(value= "/addSubj" , consumes = "application/json")
	public void addsubj(@RequestBody Subjects artc) {
	
		
		sdao.save(artc);
	
	
	
}
	
	
	
	@GetMapping("/getEvents")
	public List<Events> getEvents() {
	
	
	return edao.findAll(); 
	
}
	
	
	
	
	@GetMapping("/getSubjects")
	public List<Subjects> getSubjects() {
	
	
	return sdao.findAll(); 
	
}
	
	
	
	@GetMapping("/getoptions")
	public List<Taghash> getoptions() {
	
	
	return odao.findAll(); 
	
}
	
	
	@GetMapping("/getJoboptions")
	public List<TagsJob> getJOboptions() {
	
	
	return jtdao.findAll(); 
	
}
	
	
	
	
	@PostMapping(value= "/Subjects/id" , consumes = "application/json")
	public Optional<Subjects> getEmail(@RequestBody  Subjects sub) {
	
		
		return sdao.findById(sub.getId());
	
	
	
}

	
}
