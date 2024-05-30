package firstDemo;


public class Main {
    public static void main(String[] args) {
        Object[] objects = new Object[5];
        objects[0] = new Citizen("Bob",31, "123", "30-11-2022");
        objects[1] = new Student("Tom",19, "124", "30-11-2022", "100500");
        objects[2] = new Student("Ann",20, "125", "30-11-2022", "100501");
        objects[3] = new Citizen("Tim",84, "126", "30-11-2022");
        objects[4] = new Anonymous("31-11-2000");
        for (Object item : objects){
            if (item instanceof Person) System.out.println(((Person)item).getName());
        }
        int citizenCount = 0;
        int studentCount = 0;
        int anonymousCount = 0;

        for (Object item : objects) {
            if (item instanceof Citizen) {
                citizenCount++;
            } else if (item instanceof Student) {
                studentCount++;
            } else if (item instanceof Anonymous) {
                anonymousCount++;
            }
        }

        System.out.println("Количество горожан: " + citizenCount);
        System.out.println("Количество студентов: " + studentCount);
        System.out.println("Количество анонимов: " + anonymousCount);
    }
}