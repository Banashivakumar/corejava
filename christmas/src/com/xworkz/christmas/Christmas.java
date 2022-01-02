package com.xworkz.christmas;

import java.util.Objects;

public class Christmas {
	
	float date;
    byte noOfDays;
    
   public Christmas (float date, byte noOfDays) {
	   this.date=date;
	   this.noOfDays=noOfDays;
   }
	   public String toString() {
		   return this.getClass().getSimpleName()+"date:"+date+"\t noOfDays \t:"+noOfDays;
	   }
	   
	   public int hashCode() {
		   return Objects.hash(date,noOfDays);
	   }
	   
	   
	   public boolean equals(Object obj) {
		   if(obj==null) {
			   return false;
		   }else {
			   if(obj instanceof Christmas) {
				   Christmas object = (Christmas) obj;
                  if(this.date==object.date) {
                	  if(this.noOfDays==object.noOfDays) {
                    	  return true;
                      }
                	  else {
                	  return false;
                      }
                  }
                  else {
                	  return false;
                  }
			   }
			   else {
				   return false;
			   }
				   
		   }
	   }
}


