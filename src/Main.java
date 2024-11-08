//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        University university1 = new University();
        University university2 = new University();
        University university3 = new University();

        School school1 = new School();
        School school2 = new School();
        School school3 = new School();

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        university1.setName("Polite");
        university1.setAddress("Ch.Aitmatov 12");
        university1.setAge(100);

        university2.setName("Polsdfite");
        university2.setAddress("Ch.Aitmatov 132");
        university2.setAge(32);

        university3.setName("Polidfte");
        university3.setAddress("Ch.Aitmatov 1222");
        university3.setAge(45);

        University[] universities = new University[]{university1,university2,university3};

        school1.setName("kaxe Saaliev");
        school1.setAddress("sadan reva 42");

        school2.setName("Kudaibergen Saaliev");
        school2.setAddress("Konok Kaazy 342");

        school3.setName("satylgan sanat");
        school3.setAddress("Konok Kaazy 142");

        School[] schools = new School[]{school1,school2,school3};

        car1.setModel("BMW");
        car1.setSpeed(380);
        car1.setVolume(5.5);

        car2.setModel("ferarry");
        car2.setSpeed(1000);
        car2.setVolume(8.5);

        car3.setModel("mazda");
        car3.setSpeed(320);
        car3.setVolume(3.5);

        Car[] cars = new Car[]{car1,car2,car3};

        person1.setName("Baiel");
        person1.setSurname("Karybaev");
        person1.setAge(20);

        person2.setName("Kanchoro");
        person2.setSurname("Marimav");
        person2.setAge(21);

        person3.setName("Aibek");
        person3.setSurname("Duisho uulu");
        person3.setAge(19);

        Person[] people = {person1,person2,person3};

        System.out.println("                  Universityes\n");
        for (University university : universities) {
            university.getInfo();
            System.out.println("----========----");
        }
        System.out.println("                  Schooles\n");
        for (School school : schools) {
            school.getInfo();
            System.out.println("----========----");
        }
        System.out.println("                  Cars\n");
        for (Car car : cars) {
            car.getInfo();
            System.out.println("----========----");
        }
        System.out.println("                  Peoples\n");
        for (Person person : people) {
            person.getInfo();
            System.out.println("----========----");
        }


    }
}