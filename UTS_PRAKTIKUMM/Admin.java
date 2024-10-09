/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PRAKTIKUMM;

/**
 *
 * @author LENOVO LOQ
 */
public class Admin implements AccessLevel{
   @Override
    public void showAccess() {
        System.out.println("Anda masuk sebagai: Admin");
    }

    public void manageRoomAvailability(Hotel hotel, int roomNumber, boolean available) {
        Room room = hotel.getRoomByNumber(roomNumber);
        if (room != null) {
            room.setAvailable(available);
            System.out.println("Kamar No: " + roomNumber + " berhasil diubah statusnya menjadi " + (available ? "Tersedia" : "Tidak Tersedia"));
        } else {
            System.out.println("Kamar tidak ditemukan.");
        }
    } 
}
