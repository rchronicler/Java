package LiangBab11;

public class Student extends Person {
    protected final String STATUS;

    public static final String FRESHMAN = "freshman";
    public static final String SOPHOMORE = "sophomore";
    public static final String JUNIOR = "junior";
    public static final String SENIOR = "senior";

    public Student(String name, String address, String phoneNumber, String emailAddress, String STATUS) {
        super(name, address, phoneNumber, emailAddress);
        this.STATUS = STATUS;
    }

    public String getStatus() {
        return STATUS;
    }

    @Override
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}