package com.example.implementation;

import org.springframework.stereotype.Component;

import com.example.model.Song;

@Component
public class BoseSpeakers {
	public String makeSound(Song song) {
		return "Playing the song "+song.getTitle()+" by"+song.getSingerName()+" with bose speaker";
		
	}

}
