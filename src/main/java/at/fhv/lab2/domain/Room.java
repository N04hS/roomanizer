package at.fhv.lab2.domain;

/* audacious one - 21.04.2023 */
public class Room {

	private int roomNo;
	private int bedCount;
	private String roomType;

	public Room(int roomNo, int bedCount, String roomType) {
		this.roomNo = roomNo;
		this.bedCount = bedCount;
		this.roomType = roomType;
	}

	public int getRoomNo() { return this.roomNo; }
	public void setRoomNo(int roomNo) { this.roomNo = roomNo; }

	public int getBedCount() { return this.bedCount; }
	public void setBedCount(int bedCount) { this.bedCount = bedCount; }

	public String getRoomType() { return this.roomType; }
	public void setRoomType(String roomType) { this.roomType = roomType; }
}
