package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.ProjectConfiguration.ProjectConfiguration;
import com.example.model.Song;
import com.example.services.VehicleServices;

public class Example {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		VehicleServices vehicleServices = context.getBean(VehicleServices.class);
		System.out.println(vehicleServices.getClass());
		Song song = new Song();
		song.setTitle("Blank Space");
		song.setSingerName("Taylor Swift");
		boolean vehicleStarted = true;
		
		
		String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
		//System.out.println(moveVehicleStatus);
		String playMusicStatus = vehicleServices.playMusic(vehicleStarted,song);
		String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);
		//System.out.println(applyBrakeStatus);
		//System.out.println(playMusicStatus);

	}

}
