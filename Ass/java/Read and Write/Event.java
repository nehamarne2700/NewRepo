
public class Event {
	String eventName;
	int attendeesCount;
	String ownerName;
	
	public Event() {
		
	}

	public Event(String eventName, int attendeesCount,String ownerName)
	{
		this.eventName = eventName;
		this.attendeesCount = attendeesCount;
		this.ownerName = ownerName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getAttendeesCount() {
		return attendeesCount;
	}

	public void setAttendeesCount(int attendeesCount) {
		this.attendeesCount = attendeesCount;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
}