/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PRAKTIKUMM;

/**
 *
 * @author LENOVO LOQ
 */
public class Reservation {
    private Room room;
    private Customer customer;
    private int numberOfNights;

    public Reservation(Room room, Customer customer, int numberOfNights) {
        this.room = room;
        this.customer = customer;
        this.numberOfNights = numberOfNights;
    }

    public void showReservationDetails() {
        System.out.println("Reservasi untuk kamar nomor: " + room.getRoomNumber());
        System.out.println("Tipe Kamar: " + room.getRoomType());
        System.out.println("Harga per malam: Rp " + room.getPricePerNight());
        System.out.println("Total Biaya: Rp " + (room.getPricePerNight() * numberOfNights));
        customer.viewReservationDetails();
    }
}
