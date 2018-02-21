package com.coder.web.rest.service;

import org.springframework.data.repository.CrudRepository;

import com.coder.web.rest.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
