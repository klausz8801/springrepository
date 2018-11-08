package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//singleton, business service
@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	
	// return / list topics;
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();

		// add all topics to previously created list called topics ("method reference" is "topics::add")
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}


	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	// "save" method can also perform update as id is primary key
	public void updateTopic(Topic topic, String id) {

		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}

}