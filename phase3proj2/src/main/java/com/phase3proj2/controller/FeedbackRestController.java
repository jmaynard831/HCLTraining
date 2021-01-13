package com.phase3proj2.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phase3proj2.model.Feedback;
import com.phase3proj2.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackRestController {

	@Autowired
	private FeedbackService fbservice;

	/*
	 * Provide a body which is converted into an object
	 */
	@PostMapping("/postfeedback")
	public void postFeedback(@Valid @RequestBody Feedback feedback) {
		fbservice.postFeedback(feedback);
	}

	
	/*
	 * Receive all feedbacks
	 */
	@PostMapping("/getallfeedback")
	public List<Feedback> getAllFeedback(){
		return fbservice.getAllFeedback();
	}
	
	/*
	 * Send an id and a feedback to update 
	 */
	@PostMapping("/updatefeedback/{fbid}")
	public void updateFeedback(@PathVariable("fbid") String fbid, @Valid @RequestBody Feedback feedback){
		fbservice.updateFeedback(fbid, feedback);
	}
	
	/*
	 * Delete a feedback
	 */
	@PostMapping("/deletefeedback/{fbid}")
	public void deleteFeedback(@PathVariable("fbid") String fbid){
		fbservice.deleteFeedback(fbid);
	}
}
