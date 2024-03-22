package LiangBab11;

public class Main {
    public static void main(String[] args) {
        Person dimas = new Person("Dimas", "Jl. Jakarta", "085754550557", "dimas@gmail.com");
        Student dani = new Student("Dani", "Jl. Bogor", "085754550557", "dani@yahoo.com", Student.FRESHMAN);
        Employee budi = new Employee("Budi", "Jl. Malang", "085754550557", "Budi@mail.net", "Google", 1000000,
                new MyDate());
        Faculty eko = new Faculty("Eko", "Jl. Surabaya", "085754550557", "Eko@protonmail.com", "Facebook", 2000000,
                "08.00-16.00", "Lecturer");
        Staff jono = new Staff("Microsoft", 3000000, new MyDate(), "Manager", "Jono", "Jl. Bandung", "085754550557",
                "Jono@bloo.com");

        System.out.println(dimas.toString());
        System.out.println(dani.toString());
        System.out.println(budi.toString());
        System.out.println(eko.toString());
        System.out.println(jono.toString());
    }
}
