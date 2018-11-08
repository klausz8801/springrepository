package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

//create table Topic with primary key id
@Entity
public class Course {

	@Id
	private String courseId;
	private String name;
	private String description;
	// many to one relationship: many courses for one topic
	@ManyToOne
	private Topic topic;

	public Course() {

	}

	public Course(String courseId, String name, String description, String topicId) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.description = description;
		// Add empty topic with id
		this.topic = new Topic(topicId, "", "");

	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}