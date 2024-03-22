package swalayan;

public class Customer {
    private String custName;
    private double custBalance;
    // Nomor pelanggan
    private String custId;
    // PIN
    private int custPin;
    private String custRank;

    public Customer(String name, int balance, String custId, int custPin, String custRank) {
        this.custName = name;
        this.custBalance = balance;
        this.custId = custId;
        this.custPin = custPin;
        this.custRank = custRank;
    }

    public String getId() {
        return this.custId;
    }

    public int getCustPin() {
        return this.custPin;
    }

    public String getName() {
        return this.custName;
    }

    public double getBalance() {
        return this.custBalance;
    }

    public String getRank() {
        return this.custRank;
    }

    public double topUp(double amount) {
        this.custBalance += amount;
        return this.custBalance;
    }

    public double setBalance(double balance) {
        this.custBalance = balance;
        return this.custBalance;
    }
}
