package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarter.topic.Topic;

//singleton, business service
@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;


	// return / list courses for a given topic id;
	public List<Course> getAllCoursesByTopic(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	// return / list topics;
	public List<Course> getAllCourses() {
		List<Course> courses = new ArrayList<>();

		// add all topics to previously created list called topics ("method reference" is "topics::add")
		courseRepository.findAll().forEach(courses::add);
		return courses;
	}
	
	
	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	// "save" method can also perform update as id is primary key
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}

}