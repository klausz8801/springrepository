package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//what is the data entity/table, what type is the primary key - so CRUD will be automatically applied, only very special queries must be added
public interface CourseRepository extends CrudRepository<Course, String>{

	//naming syntax: follow conventions! "find" for listing
	//implementation is automatic!!!! no code needed
	//public List<Course> findByName(String name);
	
	//public List<Course> findByDescription(String description);
	
	//find by topic id
	public List<Course> findByTopicId(String courseId);
	
	
}