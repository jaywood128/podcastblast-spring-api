package com.johnathon.podcastapp.podcast;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import java.util.ArrayList;

import javax.persistence.EntityExistsException;
import javax.persistence.PersistenceException;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import static org.junit.Assert.*;

import com.johnathon.podcastapp.podcast.model.Podcast;
import com.johnathon.podcastapp.podcast.model.User;
import com.johnathon.podcastapp.podcast.repository.UserInsertRepository;

@SpringBootTest
public class PodcastApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void givenUserEntity_whenInsertedTwiceWithEntityManager_thenEntityManagerExceptionIsThrown() {
		UserInsertRepository userInsertRepository = new UserInsertRepository();
	    assertThatExceptionOfType(EntityExistsException.class).isThrownBy(() -> {
	        userInsertRepository.insertWithEntityManager(new User(1L, "Johnathon", "jaywood128@gmail.com"));
	        userInsertRepository.insertWithEntityManager(new User(2L, "Tijana", "tijana@mail.com"));
	    });
	}
//	@Test
//	public void givenData_whenInsert_ThenCreateMtoMrelationship() {
//		User user = new User(1L, "Johnathon", "jaywood128@gmail.com");
//		ArrayList<Long> genreIds = new ArrayList<>();
//		genreIds.add(68L);
//		genreIds.add(133L);
//		genreIds.add(134L);
//		
//		Podcast podcast = new Podcast(1L, "09b986e503d4448ab0b625f6233bdd65", "https://cdn-images-1.listennotes.com/podcasts/saturday-night-live-snl-afterparty-john-sEoTraLnKPB-_iOE4lLZ2pD.1400x1400.jpg", genreIds, "https://cdn-images-1.listennotes.com/podcasts/saturday-night-live-snl-afterparty-john-wm1CtQVkRfy-_iOE4lLZ2pD.300x300.jpg", "Saturday Night Live (SNL) Afterparty", "https://www.listennotes.com/c/09b986e503d4448ab0b625f6233bdd65/", "Saturday Night Live (SNL) Afterparty");
//	
//	assertNotNull(user);
//	assertNotNull(podcast);
//
//	}
	
}
