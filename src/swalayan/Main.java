package swalayan;

import java.util.Scanner;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Swalayan Tiny!");
        System.out.println(ANSI_YELLOW
                + "Mohon maaf, data center Swalayan Tiny baru saja kebakaran. \nPelanggan diharapkan membuat akun baru."
                + ANSI_RESET);
        // * Input data pelanggan
        // Nomor pelanggan
        String custId;
        String custRank = "none";
        while (true) {
            System.out.print("Nomor pelanggan: ");
            custId = input.nextLine();
            if (custId.length() == 10) {
                break;
            } else {
                System.out.println(ANSI_RED + "Nomor pelanggan harus 10 digit. Silahkan coba lagi." + ANSI_RESET);
            }
        }

        if (custId.substring(0, 2).equals("38")) {
            custRank = "Silver";
        } else if (custId.substring(0, 2).equals("56")) {
            custRank = "Gold";
        } else if (custId.substring(0, 2).equals("74")) {
            custRank = "Platinum";
        } else {
            custRank = "none";
        }

        // Nama pelanggan
        System.out.print("Nama pelanggan: ");
        String custName = input.next();

        // Saldo awal
        int custBalance = 0;
        while (true) {
            System.out.print("Jumlah top up saldo awal: Rp. ");
            custBalance = input.nextInt();
            if (custBalance >= 10000) {
                break;
            } else {
                System.out.println(
                        ANSI_RED + "Minimal top up saldo awal adalah Rp. 10000. Silahkan coba lagi." + ANSI_RESET);
            }
        }

        // PIN
        System.out.print("PIN baru: ");
        int custPin = input.nextInt();

        // Loading membuat akun biar kerasa real
        System.out.println("Membuat akun...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // * Membuat akun
        Customer customer = new Customer(custName, custBalance, custId, custPin, custRank);

        System.out.println("Akun dengan nama " + customer.getName() + " berhasil dibuat!");

        System.out.println("Anda bisa melanjutkan untuk membuat transaksi.");

        // * Menu
        int menu = 0;
        while (true) {
            System.out.println("----------------------------------------------");
            System.out.println("Menu :");
            System.out.println("1. Top up saldo");
            System.out.println("2. Pembelian");
            System.out.println("3. Keluar");
            System.out.println("----------------------------------------------");
            System.out.print("Pilih menu : ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    topUp(customer, input);
                    break;

                case 2:
                    purchase(customer, input);
                    break;

                case 3:
                    System.out.println("Terima kasih telah menjadi pelanggan setia Swalayan Tiny!");
                    System.exit(0);
                    break;
                default:
                    break;
            }

            System.out.println("----------------------------------------------");

            // * Transaksi baru
            System.out.print("Apakah anda ingin membuat transaksi baru? (y/n)");
            char repeat = input.next().charAt(0);
            if (repeat == 'n') {
                menu = 0;
            } else {
                continue;
            }

            // Keluar dari menu
            if (menu == 0) {
                System.out.println("Terima kasih telah melakukan transaksi di Swalayan Tiny!");
                break;
            }
        }
    }

    public static void purchase(Customer customer, Scanner input) {
        input.nextLine();

        while (true) {
            // * Cek nomor pelanggan (bohongan, karena data cuma 1 ajh)
            System.out.print("Masukkan nomor pelanggan anda: ");
            String custId = input.nextLine();
            if (!custId.equals(customer.getId())) {
                System.out.println(ANSI_RED + "Nomor pelanggan tidak ditemukan." + ANSI_RED);
                continue;
            } else {
                System.out.println(
                        "Nomor pelanggan dengan nama " + ANSI_GREEN + customer.getName() + ANSI_RESET + " ditemukan.");
                break;
            }
        }

        // * Cek PIN
        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Masukkan PIN untuk " + ANSI_GREEN + customer.getName() + ANSI_RESET + ": ");
            int pin = input.nextInt();

            if (pin == customer.getCustPin()) {
                System.out.print("Masukkan nominal pembelian: Rp. ");
                double total = input.nextInt();

                if (customer.getBalance() - total < 10000) {
                    System.out.println(ANSI_RED + "Saldo anda tidak mencukupi." + ANSI_RESET);
                    break;
                }

                customer.setBalance(customer.getBalance() - total);

                // cashback untuk pelanggan silver
                if (customer.getRank().equals("Silver")) {
                    // cashback 5% klau di atas 1jt
                    if (total > 1000000) {
                        System.out.println(
                                "Selamat! Sebagai pelanggan Silver,\nAnda mendapatkan cashback 5% dari pembelian anda.");
                        customer.topUp(total * 0.05);
                        System.out.println(
                                ANSI_GREEN + (total * 0.05) + " telah ditambahkan ke saldo anda." + ANSI_RESET);
                        System.out
                                .println("Saldo anda saat ini: Rp. " + ANSI_GREEN + customer.getBalance() + ANSI_RESET);
                    }
                }

                if (customer.getRank().equals("Gold")) {
                    // cashback 7%
                    if (total > 1000000) {
                        System.out.println(
                                "Selamat! Sebagai pelanggan Gold,\nAnda mendapatkan cashback 7% dari pembelian anda.");
                        customer.topUp(total * 0.07);
                        System.out
                                .println(
                                        ANSI_GREEN + (total * 0.07) + " telah ditambahkan ke saldo anda." + ANSI_RESET);
                        System.out
                                .println("Saldo anda saat ini: Rp. " + ANSI_GREEN + customer.getBalance() + ANSI_RESET);
                    } else {
                        // cashback 2%
                        System.out.println(
                                "Selamat! Sebagai pelanggan Gold,\nAnda mendapatkan cashback 2% dari pembelian anda.");
                        customer.topUp(total * 0.02);
                        System.out.println(
                                ANSI_GREEN + (total * 0.02) + " telah ditambahkan ke saldo anda." + ANSI_RESET);
                        System.out.println(
                                "Saldo anda saat ini: Rp. " + ANSI_GREEN + customer.getBalance() + ANSI_RESET);

                    }
                }

                if (customer.getRank().equals("Platinum")) {
                    // cashback 10%
                    if (total > 1000000) {
                        System.out.println(
                                "Selamat! Sebagai pelanggan Platinum,\nAnda mendapatkan cashback 10% dari pembelian anda.");
                        customer.topUp(total * 0.1);
                        System.out
                                .println(ANSI_GREEN + (total * 0.1) + " telah ditambahkan ke saldo anda." + ANSI_RESET);
                        System.out
                                .println("Saldo anda saat ini: Rp. " + ANSI_GREEN + customer.getBalance() + ANSI_RESET);
                    } else {
                        // cashback 5%
                        System.out.println(
                                "Selamat! Sebagai pelanggan Platinum,\nAnda mendapatkan cashback 5% dari pembelian anda.");
                        customer.topUp(total * 0.05);
                        System.out.println(
                                ANSI_GREEN + (total * 0.05) + " telah ditambahkan ke saldo anda." + ANSI_RESET);
                        System.out
                                .println("Saldo anda saat ini: Rp. " + ANSI_GREEN + customer.getBalance() + ANSI_RESET);
                    }
                }
                break;
            } else {
                attempts--;
                if (attempts == 0) {
                    System.out.println(
                            ANSI_RED + "Percobaan habis. Akun anda diblokir. Silahkan hbungi admin." + ANSI_RESET);
                    System.exit(0);
                } else {
                    System.out.println(ANSI_RED + "PIN salah. Sisa percobaan: " + attempts + ANSI_RESET);
                }
            }
        }
    }

    public static void topUp(Customer customer, Scanner input) {
        input.nextLine();

        while (true) {
            // * Cek nomor pelanggan (bohongan, karena data cuma 1 ajh)
            System.out.print("Masukkan nomor pelanggan anda: ");
            String custId = input.nextLine();
            if (!custId.equals(customer.getId())) {
                System.out.println(ANSI_RED + "Nomor pelanggan tidak ditemukan." + ANSI_RED);
                continue;
            } else {
                System.out.println(
                        "Nomor pelanggan dengan nama " + ANSI_GREEN + customer.getName() + ANSI_RESET + " ditemukan.");
                break;
            }
        }

        // * Cek PIN
        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Masukkan PIN untuk " + ANSI_GREEN + customer.getName() + ANSI_RESET + ": ");
            int pin = input.nextInt();

            if (pin == customer.getCustPin()) {
                System.out.print("Masukkan nominal top up saldo: Rp. ");
                double topUp = input.nextInt();
                customer.topUp(topUp);
                System.out.println("Memproses...");
                // loading proses biar kerasa real
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Saldo anda saat ini: Rp. " + ANSI_GREEN + customer.getBalance() + ANSI_RESET);
                break;

            } else {
                attempts--;
                if (attempts == 0) {
                    System.out.println(
                            ANSI_RED + "Percobaan habis. Akun anda diblokir. Silahkan hbungi admin." + ANSI_RESET);
                    System.exit(0);
                } else {
                    System.out.println(ANSI_RED + "PIN salah. Sisa percobaan: " + attempts + ANSI_RESET);
                }
            }
        }
    }
}
