package LiangBab11;

public class Staff extends Employee {
    private String title;

    public Staff(String office, double salary, MyDate dateHired, String title, String name, String address,
            String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}
