/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

/**
 *
 * @author dasith silva
 */

public class Appointment extends Date{
	private String description;
	private String time;
	
	/*
	 * Default constructor
	 */
	public Appointment(){
		super();
		description="";
		time="";
		
	}
	
	/*
	 * Constructor to create an Appointment object
	 * @param year- year of date
	 * @param month- month of date
	 * @param day- day of date
	 * @param desc- description of Appointment
	 * @param time- time of Appointment
	 */
	public Appointment(int year, int month, int day , String desc, String time){
		super(year, month, day);
		description=desc;
		this.time=time;
	}
	
	/*
	 * Returns String representation of object
	 * @return returns String representation of object
	 */
	public String toString(){
		return super.toString()+"     "+time+"      "+description;
	}
	
	/*
	 * Checks if the object has a given description
	 * @param des- description to be compared with
	 * @return equalDescription- whether the objects have the same description
	 */
	public boolean equalDescription(String des){
		boolean equalDescription=false;
		if (description.equals(des)){
			equalDescription=true;
			
		}
		return equalDescription;
		
	}
	
	/*
	 * Returns description of object
	 * @return description- description of object
	 */
	public String getDescription(){
		return description;
	}
	
	/*
	 * Returns time of object
	 * @return time-time of object
	 */
	public String getTime(){
		return time;
	}
	
	/*
	 * Returns a copy of the passed object and returns it
	 * @param copy- object to be copied
	 * @return app- object of appointment
	 */
	public Appointment getAppointment(Appointment copy){
		Appointment app=new Appointment(copy.getYear(), copy.getMonth(),copy.getDay(), copy.getDescription(), copy.getTime());
		return app;
	}

}

