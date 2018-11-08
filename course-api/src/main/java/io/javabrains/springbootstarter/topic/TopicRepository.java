package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

//what is the data entity/table, what type is the primary key - so CRUD will be automatically applied, only very special queries must be added
public interface TopicRepository extends CrudRepository<Topic, String>{
	//getAllTopics
	//getTopics(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
	
}