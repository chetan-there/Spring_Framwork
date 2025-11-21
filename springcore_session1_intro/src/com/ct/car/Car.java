package com.ct.car;

import org.springframework.stereotype.Component;

import com.ct.engine.DieselEngine;
import com.ct.engine.PetrolEngine;

@Component
public class Car {

	private DieselEngine d_engine;
	private PetrolEngine p_engine;

	public Car(DieselEngine d_engine,PetrolEngine p_engine) {
		this.d_engine = d_engine;
		this.p_engine = p_engine;
	}

	
	public void d_drive() {
		System.out.println(d_engine.start());
		System.out.println("Car is running ");
	}
	
	public void p_drive() {
		System.out.println(p_engine.start());
		System.out.println("Car is running ");
	}
	

}
