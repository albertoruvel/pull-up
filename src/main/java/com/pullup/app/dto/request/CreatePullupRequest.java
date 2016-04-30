package com.pullup.app.dto.request;

import javax.persistence.Column;
import javax.persistence.Id;

public class CreatePullupRequest {
	
	 
	 
	    private String riderId; 
	    private String pullerId; 
	    private String date; 
	    private boolean accepted; 
	    private String requestCoordinates; 
	    private String pickupCoordinates; 
	    private boolean pickedUp;
	    
		public String getRiderId() {
			return riderId;
		}
		public void setRiderId(String riderId) {
			this.riderId = riderId;
		}
		public String getPullerId() {
			return pullerId;
		}
		public void setPullerId(String pullerId) {
			this.pullerId = pullerId;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getRequestCoordinates() {
			return requestCoordinates;
		}
		public void setRequestCoordinates(String requestCoordinates) {
			this.requestCoordinates = requestCoordinates;
		}
		public String getPickupCoordinates() {
			return pickupCoordinates;
		}
		public void setPickupCoordinates(String pickupCoordinates) {
			this.pickupCoordinates = pickupCoordinates;
		}
		public boolean isPickedUp() {
			return pickedUp;
		}
		public void setPickedUp(boolean pickedUp) {
			this.pickedUp = pickedUp;
		} 


}
