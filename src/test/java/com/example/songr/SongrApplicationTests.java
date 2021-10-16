package com.example.songr;

import com.example.songr.controller.Album;
import com.example.songr.model.AlbumModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testAlbum(){
		AlbumModel newTest= new AlbumModel("ssss","hamza",8,1200,"https://i1.sndcdn.com/artworks-000299447418-6z909k-t500x500.jpg");
		assertEquals("ssss",newTest.getTitle());
		newTest.setTitle("set titel");

		newTest.setArtist("hamza");
		assertEquals("hamza", newTest.getArtist());

		newTest.setSongCount(8);
		assertEquals(8, newTest.getSongCount());

		newTest.setLength(1200);
		assertEquals(1200, newTest.getLength());


		newTest.setImageUrl("https://i1.sndcdn.com/artworks-000299447418-6z909k-t500x500.jpg");
		assertEquals("https://i1.sndcdn.com/artworks-000299447418-6z909k-t500x500.jpg", newTest.getImageUrl());

	}
	@Test
	public void ablumsTest(){
		AlbumModel newAlbum = new AlbumModel("sanaa","omar",5,3000,"image URL");

		Assertions.assertEquals("sanaa",newAlbum.getTitle());
		Assertions.assertEquals("omar",newAlbum.getArtist());
		Assertions.assertEquals(3000,newAlbum.getLength());
		Assertions.assertEquals(5,newAlbum.getSongCount());
		Assertions.assertEquals("image URL",newAlbum.getImageUrl());


	}

}
