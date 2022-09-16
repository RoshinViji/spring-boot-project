package com.example.mypkg.topic;
 


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topic {
	@Autowired
	
private topicservice topicservice;
	
	
	@RequestMapping("/topics")
	public List<topics>  getalltopics() {
		return topicservice.getalltopics();
	}
	@RequestMapping("/topics/{id}")
	public topics getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody  topics topics) {
		topicservice.addTopic(topics);
	}
	
	//@RequestMapping(method=RequestMethod.PUT,value="/topics/{ID")
	//public void updateTopic(@RequestBody  topics topics,@PathVariable String id) {
		//topicservice.updateTopic(id),topics);
//}
}
