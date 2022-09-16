package com.example.mypkg.topic;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class topicservice {
	private List <topics> topics =new ArrayList<> (Arrays.asList(
			new topics("spring","spring framework","its good"),
			new topics("java","spring framework","its good"),
			new topics("program","spring framework","its good")
			
			
			
			
			));
	public List <topics> getalltopics(){
		return topics;
		
	}
	public com.example.mypkg.topic.topics getTopic(String id) {
		return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
		
		
	}
	public void addTopic(topics topics) {
		topics.add( topics);
		
	}
	//public void updateTopic(String id, topic topics ) {
		// TODO Auto-generated method stub
		
//	}
	

}
