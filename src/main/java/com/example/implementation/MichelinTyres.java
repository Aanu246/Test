package com.example.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.interfaces.Tyres;

@Component
@Primary
public class MichelinTyres implements Tyres {
	
	@Override
	public String rotate() {
		return "vehicle moving with the help of Michelin tyres";
	}
	
	@Override
	public String stop() {
		return "Vehicle stopped with the help of Michelin tyres";
	}

}
