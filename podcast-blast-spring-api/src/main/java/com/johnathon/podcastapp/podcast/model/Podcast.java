package com.johnathon.podcastapp.podcast.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "podcast")

public class Podcast {

	@Id
	private long id;

	private String apiId;

	private String image;

	private ArrayList<Integer> genreIds = new ArrayList<Integer>();

	private String thumbnail;

	private String titleOriginal;

	private String listenNotesUrl;

	private String titleHighlighted;

	@ManyToMany(mappedBy="podcasts")
	private Set<User> users = new HashSet<>();

	@OneToMany
	private Set<Episode> episodes = new HashSet<>();
	
	
	
	public Podcast(long id, String apiId, String image, String thumbnail,
			String titleOriginal, String listenNotesUrl, String titleHighlighted) {
		super();
		this.id = id;
		this.apiId = apiId;
		this.image = image;
//		this.genreIds = genreIds;
		this.thumbnail = thumbnail;
		this.titleOriginal = titleOriginal;
		this.listenNotesUrl = listenNotesUrl;
		this.titleHighlighted = titleHighlighted;
	}
	public Set<User> getUsers(){
		return this.users;
	}
	
	public boolean setUser(User user){
		if(user != null) {
			return this.users.add(user);
		}
		return false;
	}

	public Set<Episode> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(Episode episode) {
		if(episode != null) {
			this.episodes.add(episode);
		}
	}


}
