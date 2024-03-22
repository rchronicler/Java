package LiangBab11;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email,
            String office, double salary, String officeHours, String rank) {
        super(name, address, phone, email, office, salary, new MyDate());
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public Faculty setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
        return this;
    }

    public String getRank() {
        return rank;
    }

    public Faculty setRank(String rank) {
        this.rank = rank;
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours +
                "\nRank: " + rank;
    }
}
