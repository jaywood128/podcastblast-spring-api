package com.johnathon.podcastapp.podcast.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="user")

public class User {

		@Id
		private Integer id;
		private String name;
		private String email;
		private String passwordDigest;

		@ManyToMany
		@JoinTable(
				name="podcast_users",
				joinColumns = { @JoinColumn(name = "user_id") },
				inverseJoinColumns = { @JoinColumn(name = "podcast_id")}
				)
		private Set<Podcast> podcasts = new HashSet<>();
 
		@OneToMany
		private Set<Episode> episodes = new HashSet<>();
		
		public User(Long id, String name, String email, String passwordDigest) {
			this.id = id;
			this.name = name;
			this.email = email;
			this.passwordDigest = passwordDigest;
			this.podcasts = new HashSet<>();
		}
		
		
		
		public Long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getEmail() {
			return email;
		}

		public Set<Podcast> getPodcasts() {
			return podcasts;
		}

		public void setPodcasts(Podcast podcast) {
			if((podcast != null) && (!this.podcasts.contains(podcast))) {
				this.podcasts.add(podcast);
			}
		}


}
