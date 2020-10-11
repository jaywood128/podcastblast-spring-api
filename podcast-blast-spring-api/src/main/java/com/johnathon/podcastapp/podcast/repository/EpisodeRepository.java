package com.johnathon.podcastapp.podcast.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnathon.podcastapp.podcast.model.Episode;

public interface EpisodeRepository extends JpaRepository <Episode, Long> {
	Episode findByTitleOriginal(String OrignialTitle);
}
