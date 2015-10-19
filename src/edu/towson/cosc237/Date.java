/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

/*
 * This is a representation of date
 */
public class Date {
	
	private int year, month, day;// year to hold date year, month- to hold month value, day to hold day value
	
	/*
	 * Default constructor
	 */
	public Date(){
		year=0;
		month=0;
		day=0;
	}
	
	/*
	 * Second constructor to instantiate object to given values
	 * @param y- year value
	 * @param m- month value
	 * @param d- day value
	 */
	public Date(int y, int m, int d){
		if((y<2015 || m<=0 || m>12 || d<=0 || d>31)){
			year=0;
			month=0;
			day=0;
		}else{
			year=y;
			month=m;
			day=d;
		}
		
	}
	
	/*
	 * Returns the year of object
	 * @return year- year of date
	 */
	public int getYear(){
		return year;
	}
	
	/*
	 * Returns the month of object
	 * @return month- mmoth of date
	 */
	public int getMonth(){
		return month;
	}
	
	/*
	 * Returns the day of object
	 * @return day- day of date
	 */
	public int getDay(){
		return day;
	}
	
	/*
	 * Returns the date in string format
	 * @return a date string
	 */
	public String getDate(){
		return toString();
	}
	/*
	 * Returns if two date objects are equal, current and param object
	 * @param date- an object of date to compare if current object and second object are the same
	 * @return isEqual- returns if the two objects are the same, true if same otherwise false
	 */
	public boolean dateIsEqual(Date date){
		boolean isEqual=true;
		
		if(!(date.getMonth()==month && date.getYear()==year && date.getDay()==day)){
			isEqual=false;
			
		}
		
		return isEqual;
	}
	
	
	/*
	 * Returns a string representation of object
	 * @return string representation of object
	 */
	public String toString(){
		
		return month+"/"+day+"/"+year;
	}
	
	

}
