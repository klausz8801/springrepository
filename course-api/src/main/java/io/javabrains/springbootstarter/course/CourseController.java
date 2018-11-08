package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	// query all topics when accessing /topics - get, post or anything
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCoursesByTopic(id);
	}

	// query one topic, id is a variable
	@RequestMapping("/topics/{id}/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return courseService.getCourse(courseId);
	}

	//add
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{id}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String id) {
		course.setTopic(new Topic(id, "", ""));
		courseService.addCourse(course);
	}
	
	//update
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}/courses/{courseId}")
	public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String courseId) {
		course.setTopic(new Topic(id, "", ""));
		courseService.updateCourse(course);
	}
	
	//delete
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId) {
		courseService.deleteCourse(courseId);
	}


}