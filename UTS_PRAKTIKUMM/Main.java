/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PRAKTIKUMM;

/**
 *
 * @author LENOVO LOQ
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        System.out.println("Selamat datang di Hotel Alif!");
        System.out.println("Apakah Anda ingin masuk sebagai admin? (y/n)");
        char adminChoice = scanner.next().charAt(0);
        scanner.nextLine(); // Konsumsi newline

        AccessLevel accessLevel;

        if (adminChoice == 'y') {
            accessLevel = new Admin(); // Admin level access
            accessLevel.showAccess();

            // Admin features
            System.out.println("Masukkan nomor kamar yang ingin diubah ketersediaannya:");
            int roomNumber = scanner.nextInt();
            System.out.println("Apakah kamar ini sekarang tersedia? (true/false)");
            boolean available = scanner.nextBoolean();
            ((Admin) accessLevel).manageRoomAvailability(hotel, roomNumber, available);
        } else {
            // Customer features
            System.out.println("Masukkan Nama Lengkap:");
            String name = scanner.nextLine();

            System.out.println("Masukkan Nomor Telepon:");
            String phoneNumber = scanner.nextLine();

            System.out.println("Masukkan Alamat Email:");
            String email = scanner.nextLine();

            System.out.println("Masukkan Alamat:");
            String address = scanner.nextLine();

            System.out.println("Masukkan Dokumen Identitas (KTP):");
            String idDocument = scanner.nextLine();

            System.out.println("Masukkan Metode Pembayaran:");
            String paymentMethod = scanner.nextLine();

            System.out.println("Masukkan Jumlah Tamu:");
            int numberOfGuests = scanner.nextInt();

            Customer customer = new Customer(name, phoneNumber, email, address, idDocument, paymentMethod, numberOfGuests);
            accessLevel = customer;
            accessLevel.showAccess();

            boolean running = true;
            while (running) {
                System.out.println("Pilih opsi:");
                System.out.println("a. Memesan kamar.");
                System.out.println("b. Mengecek ketersediaan kamar.");
                System.out.println("c. Melihat detail pesanan.");
                System.out.println("d. Level akses untuk admin dan customer.");
                System.out.println("e. Keluar.");

                char option = scanner.next().charAt(0);
                scanner.nextLine(); 

                switch (option) {
                    case 'a':
                        hotel.showAvailableRooms();
                        System.out.println("Pilih nomor kamar untuk dipesan:");
                        int roomNumber = scanner.nextInt();
                        Room room = hotel.getRoomByNumber(roomNumber);
                        if (room != null) {
                            System.out.println("Masukkan tanggal check-in (format: yyyy-mm-dd):");
                            String checkInDate = scanner.next();
                            System.out.println("Masukkan tanggal check-out (format: yyyy-mm-dd):");
                            String checkOutDate = scanner.next();

                            customer.setCheckInDate(checkInDate);
                            customer.setCheckOutDate(checkOutDate);
                            hotel.bookRoom(room);

                            System.out.println("Masukkan jumlah malam:");
                            int numberOfNights = scanner.nextInt();
                            Reservation reservation = new Reservation(room, customer, numberOfNights);
                            reservation.showReservationDetails();
                        } else {
                            System.out.println("Kamar tidak tersedia.");
                        }
                        break;
                    case 'b':
                        hotel.showAvailableRooms();
                        break;
                    case 'c':
                        customer.viewReservationDetails();
                        break;
                    case 'd':
                        accessLevel.showAccess();
                        break;
                    case 'e':
                        running = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }
            }
        }
        scanner.close();
    }
}
