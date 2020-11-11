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
    private long id;

    @ManyToOne
    private Podcast podcast;
    
    @ManyToOne
    private User user; 

}
