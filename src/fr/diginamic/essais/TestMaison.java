package fr.diginamic.essais;

import fr.diginamic.maison.House;
import fr.diginamic.maison.Room;
import fr.diginamic.maison.Bathroom;
import fr.diginamic.maison.Bedroom;
import fr.diginamic.maison.Kitchen;
import fr.diginamic.maison.LivingRoom;
import fr.diginamic.maison.WaterCloset;

public class TestMaison {

	public static void main(String[] args) {
		
		House house = new House();

		Bathroom bathroom = new Bathroom(1, 6);
		Bedroom bedroom1 = new Bedroom(1, 7);
		Bedroom bedroom2 = new Bedroom(1, 8);
		Kitchen kitchen = new Kitchen(0, 7);
		LivingRoom livingRoom1 = new LivingRoom(0, 12);
		LivingRoom livingRoom2 = new LivingRoom(0, 10);
		WaterCloset waterCloset = new WaterCloset(0, 5);
		
		Room[] roomArray = new Room[] {bathroom, bedroom1, bedroom2, kitchen, livingRoom1, livingRoom2, waterCloset};
		
		for (Room room : roomArray) {			
			house.addRoom(room);
		}
		
		System.out.println("Superficie du rez de chaussée: " + house.getAreaOfFloor(0) + "m²");
		System.out.println("Superficie du 1er étage: " + house.getAreaOfFloor(1) + "m²");
		System.out.println("Superficie de la maison: " + house.getTotalArea() + "m²");
		System.out.println("Superficie de toutes les chambres: " + house.getTotalAreaOfRoomType("Bedroom") + "m²");
		System.out.println("Nombre de salons: " + house.getNumberOfRoomType("LivingRoom"));
		
	}
	
}
