/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PRAKTIKUMM;

/**
 *
 * @author LENOVO LOQ
 */
public class Customer implements AccessLevel {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private String idDocument;
    private String paymentMethod;
    private String checkInDate;
    private String checkOutDate;
    private int numberOfGuests;

    public Customer(String name, String phoneNumber, String email, String address, String idDocument, String paymentMethod, int numberOfGuests) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.idDocument = idDocument;
        this.paymentMethod = paymentMethod;
        this.numberOfGuests = numberOfGuests;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @Override
    public void showAccess() {
        System.out.println("Anda masuk sebagai: Customer");
    }

    public void viewReservationDetails() {
        System.out.println("Nama: " + name);
        System.out.println("Nomor Telepon: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + address);
        System.out.println("Dokumen Identitas: " + idDocument);
        System.out.println("Metode Pembayaran: " + paymentMethod);
        System.out.println("Jumlah Tamu: " + numberOfGuests);
        System.out.println("Tanggal Check-In: " + checkInDate);
        System.out.println("Tanggal Check-Out: " + checkOutDate);
    }
}
