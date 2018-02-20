package com.coder.web.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.coder.web.rest.entity.Topic;

@Service
public class TopicService {

	private List<Topic> topicList;

	public TopicService() {
		this.topicList = new ArrayList<>();
		topicList.add(new Topic("Spring", "Spring framework", "Lightweight Java,Kotlin, Groove framwork"));
		topicList.add(new Topic("Java", "Java language", "programming language"));
		topicList.add(new Topic("Javascript", "Javascript language", "Scripting"));
		topicList.add(new Topic("Hibernate", "Hibernate framework", "ORM"));
				
	}

	public List<Topic> getAllTopics() {
		return topicList;
	}

	public Topic getTopicById(String id) {
		return topicList.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicList.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topicList.size(); i++) {
			if (topicList.get(i).getId().equals(id)) {
				topicList.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topicList.removeIf(t -> t.getId().equals(id));
		
	}

}
