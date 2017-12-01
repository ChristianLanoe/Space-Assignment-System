package Tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Room.Room;
import Room.RoomDB;

public class RoomDB_Serialization_Tester {
	private static Room a;
	private static Room b;
	private static Room c;
	private static Room d;
	private static Room e;
	private static RoomDB rooms;

	public static void makeRooms() {
		a = new Room(1, "Gym", 400, 94, 60);
		b = new Room(2, "Library", 200, 94, 60);
		c = new Room(3, "Cafeteria", 500, 90, 60);
		d = new Room(4, "Computer Lab", 40, 60, 60);
		e = new Room(5, "Board Room", 25, 50, 50);
	}

	public static void addToDB() {
		rooms = new RoomDB();
		rooms.addRoom(a);
		rooms.addRoom(b);
		rooms.addRoom(c);
		rooms.addRoom(d);
		rooms.addRoom(e);
	}

	public static void main(String[] args) {
		// Creating Rooms
		makeRooms();

		// Adding rooms to Room Database
		addToDB();

		System.out.println("Serializing RoomDB....");
		System.out.println("=============================================");
		try {
			FileOutputStream fileOut = new FileOutputStream("docs/rooms.ser");
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(rooms);
			outStream.close();
			fileOut.close();
		} catch (IOException i) {
			// TODO Auto-generated catch block
			i.printStackTrace();
		}

		System.out.println("Deerializing RoomDB....");
		System.out.println("=============================================");
		RoomDB output = null;
		try {
			FileInputStream fileIn = new FileInputStream("docs/rooms.ser");
			ObjectInputStream inStream = new ObjectInputStream(fileIn);
			output = (RoomDB) inStream.readObject();
			inStream.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException i) {
			i.printStackTrace();
			return;
		}

		System.out.println(output.toString());

	}

}
