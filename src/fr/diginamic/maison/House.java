package fr.diginamic.maison;

public class House {

	//Instance attributes
	private Room[] rooms = {};
	
	//Instance methods
	public void addRoom(Room room) {
		if (room == null || room.getArea() < 0 || room.getFloor() < 0) {
			return;
		}
		Room[] newArray = new Room[this.rooms.length + 1];
		for (int i = 0; i < this.rooms.length; i++) {
			newArray[i] = this.rooms[i];
		}
		newArray[this.rooms.length] = room;
		this.rooms = newArray;
	}

	public double getTotalArea() {
		double total = 0;
		for (Room room : rooms) {
			total += room.getArea();
		}
		return total;
	}
	
	public double getAreaOfFloor(int floor) {
		double total = 0;
		for (Room room : rooms) {
			if (room.getFloor() == floor) {
				total += room.getArea();
			}
		}
		return total;
	}
	
	public double getTotalAreaOfRoomType(String roomType) {
		double total = 0;
		for (Room room : rooms) {
			if (room.getClass().getSimpleName().equals(roomType)) {
				total += room.getArea();
			}
		}
		return total;
	}
	
	public int getNumberOfRoomType(String roomType) {
		int amount = 0;
		for (Room room : rooms) {
			if (room.getClass().getSimpleName().equals(roomType)) {
				amount++;
			}
		}
		return amount;
	}
	
	//Getters
	public Room[] getRooms() {
		return rooms;
	}
	
}
