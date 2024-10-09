/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PRAKTIKUMM;

/**
 *
 * @author LENOVO LOQ
 */

public class Hotel {
    private Room room1;
    private Room room2;
    private Room room3;

    public Hotel() {
        // Menambahkan beberapa kamar
        room1 = new Room(1, "Standard", 500000.0, true);
        room2 = new Room(2, "Deluxe", 750000.0, true);
        room3 = new Room(3, "Suite", 1200000.0, true);
    }

    public void showAvailableRooms() {
        System.out.println("Ketersediaan kamar saat ini:");
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
    }

    public Room getRoomByNumber(int roomNumber) {
        if (room1.getRoomNumber() == roomNumber && room1.isAvailable()) {
            return room1;
        } else if (room2.getRoomNumber() == roomNumber && room2.isAvailable()) {
            return room2;
        } else if (room3.getRoomNumber() == roomNumber && room3.isAvailable()) {
            return room3;
        }
        return null; // Kamar tidak ditemukan atau tidak tersedia
    }

    public void bookRoom(Room room) {
        room.setAvailable(false); // Tandai kamar sebagai tidak tersedia
    }
}
