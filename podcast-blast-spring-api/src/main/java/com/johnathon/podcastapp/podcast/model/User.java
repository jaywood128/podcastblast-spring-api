package com.johnathon.podcastapp.podcast.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="user")

public class User {

		@Id
		private Long id;
		private String email;
		private String name;

		@OneToMany
		private Set<Podcast> subscribedPodcasts;

		@ManyToOne
		private Set<Episode> downloadedEpisodes;

}
