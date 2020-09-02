package com.johnathon.podcastapp.podcast.repository;

import com.johnathon.podcastapp.podcast.model.Podcast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PodcastRepository extends JpaRepository<Podcast, Long> {
    Podcast findByName(String name);
}
