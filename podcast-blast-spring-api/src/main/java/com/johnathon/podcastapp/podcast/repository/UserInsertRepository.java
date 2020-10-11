package com.johnathon.podcastapp.podcast.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.johnathon.podcastapp.podcast.model.User;

@Repository
public class UserInsertRepository {
	@PersistenceContext
    private EntityManager entityManager;
	
	@Transactional
	public void insertWithEntityManager(User user) {
	    this.entityManager.persist(user);
	}
}
