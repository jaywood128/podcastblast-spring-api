package com.johnathon.podcastapp.podcast.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="episode")


public class Episode {

    @Id
    private String id;

    private String rss;

    private String link;

    private String audio;

    private String image;

    private int itunesId;

    private String thumbnail;

    private String titleOriginal;

    private String listenNotesUrl;

    private int auidoLengthSec;

    private String titleHighlighted;

    private String descriptionOriginal;

    private String descriptionHighlighted;

    private String publisherOrignial;

    @ManyToOne
    private Podcast podcast;
    
    @ManyToOne
    private User user; 

}
