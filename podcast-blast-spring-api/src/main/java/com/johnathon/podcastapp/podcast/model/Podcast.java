package com.johnathon.podcastapp.podcast.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="podcast")

public class Podcast {

    @Id
    private String id;

    private String image;

    private String[] genreIds[];

    private String thumbnail;

    private String titleOriginal;

    private String listenNotesUrl;

    private String titleHighlighted;


    @ManyToOne(cascade=CascadeType.PERSIST)
        private User user;

    @OneToMany
        private Set<Episode> episodes;

    @OneToMany
        private Set<User> subscribedUsers;
    
  
}
