package com.ct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff {

	private String name;

	private int experience;

	private String department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getShiftTime() {
		return shiftTime;
	}

	public void setShiftTime(String shiftTime) {
		this.shiftTime = shiftTime;
	}

	private String shiftTime;

	@Override
	public void assist() {
		System.out.println(name + " (Nurse) is assisting in " + department + " department.");
		System.out.println("Experience: " + experience + " years");
		System.out.println("Shift Time: " + shiftTime);
	}
}
