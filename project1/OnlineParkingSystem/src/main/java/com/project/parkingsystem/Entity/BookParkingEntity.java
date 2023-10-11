package com.project.parkingsystem.Entity;

public class BookParkingEntity {

	private String username ;
	private String adate ;
	private String ddate ;
	private String atime ;
	private String dtime ;
	private String vechno ;
	private String location ;
	private int slot ;
	
	public BookParkingEntity(String username, String adate, String ddate, String atime, String dtime, String vechno,
			String location, int slot) {
		super();
		this.username = username;
		this.adate = adate;
		this.ddate = ddate;
		this.atime = atime;
		this.dtime = dtime;
		this.vechno = vechno;
		this.location = location;
		this.slot = slot;
	}

	public BookParkingEntity() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAdate() {
		return adate;
	}

	public void setAdate(String adate) {
		this.adate = adate;
	}

	public String getDdate() {
		return ddate;
	}

	public void setDdate(String ddate) {
		this.ddate = ddate;
	}

	public String getAtime() {
		return atime;
	}

	public void setAtime(String atime) {
		this.atime = atime;
	}

	public String getDtime() {
		return dtime;
	}

	public void setDtime(String dtime) {
		this.dtime = dtime;
	}

	public String getVechno() {
		return vechno;
	}

	public void setVechno(String vechno) {
		this.vechno = vechno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	@Override
	public String toString() {
		return "BookParkingEntity [username=" + username + ", adate=" + adate + ", ddate=" + ddate + ", atime=" + atime
				+ ", dtime=" + dtime + ", vechno=" + vechno + ", location=" + location + ", slot=" + slot + "]";
	}
	  
}
