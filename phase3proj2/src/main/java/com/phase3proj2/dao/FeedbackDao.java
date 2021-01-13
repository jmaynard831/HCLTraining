package com.phase3proj2.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.phase3proj2.model.Feedback;

@Repository
public interface FeedbackDao extends CrudRepository<Feedback, Integer>{

}
