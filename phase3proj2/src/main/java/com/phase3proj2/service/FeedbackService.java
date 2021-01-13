package com.phase3proj2.service;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.phase3proj2.dao.FeedbackDao;
import com.phase3proj2.model.Feedback;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackDao fbdao;

	public boolean postFeedback(@Valid Feedback feedback) {
		try {
			fbdao.save(feedback);
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List<Feedback> getAllFeedback() {
		List<Feedback> list = new ArrayList<>();
		try {
			list = (List<Feedback>) fbdao.findAll();
		} catch (Throwable e) {
			e.printStackTrace();
			return null;
		}

		return list;
	}

	public boolean updateFeedback(String fbid, Feedback feedback) {
		// Check fbid for integer values

		try {
			Integer id = Integer.parseInt(fbid);
			feedback.setFeedbackId(id);
			fbdao.save(feedback);

		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}

	public boolean deleteFeedback(String fbid) {
		try {
			Integer id = Integer.parseInt(fbid);
			fbdao.deleteById(id);
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}

}
