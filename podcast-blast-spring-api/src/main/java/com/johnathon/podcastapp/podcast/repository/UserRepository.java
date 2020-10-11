package com.johnathon.podcastapp.podcast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnathon.podcastapp.podcast.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
//	User findUserBy(String name);
}
