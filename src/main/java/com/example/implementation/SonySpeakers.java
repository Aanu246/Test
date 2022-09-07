package com.example.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.interfaces.Speakers;
import com.example.model.Song;

@Component
@Primary
public class SonySpeakers implements Speakers {
	

	

	@Override
	public String makeSound(Song song) {
		return "Playing the song "+song.getTitle()+"by"
				+song.getSingerName()+" with sony speaker";
	}

	

}
