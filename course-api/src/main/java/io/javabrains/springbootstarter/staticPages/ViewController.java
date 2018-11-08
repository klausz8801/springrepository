package io.javabrains.springbootstarter.staticPages;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.o7planning.thymeleaf.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.javabrains.springbootstarter.course.Course;
import io.javabrains.springbootstarter.course.CourseService;
import io.javabrains.springbootstarter.topic.*;

@Controller
public class ViewController {

	@Autowired
	private TopicService topicService;
	
	@Autowired
	private CourseService cs;
	
	 @RequestMapping(value = { "/","/index" }, method = RequestMethod.GET) public
	 String index() { return "index"; }
	 

	 
	 @RequestMapping(value = {"/topiclist"}, method = RequestMethod.GET) public
	 String topiclist(Model model) {

	 List<Topic> topics = topicService.getAllTopics();

	 model.addAttribute("topicAll", topics);
	 
	 return "topiclist";
	 }
	 
	 
	 @RequestMapping(value = {"/courselist"}, method = RequestMethod.GET) public
	 String courselist(Model model) {

	 List<Course> courses = cs.getAllCourses();

	 model.addAttribute("courseAll", courses);
	 
	 return "courselist";
	 }
	 
	
}
