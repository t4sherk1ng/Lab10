import firstEx.British;
import firstEx.Frenchman;
import firstEx.Person;
import firstEx.Russian;

public class Main {
    public static void main(String[] args)  {
        Person[] mock = new Person[3];
        mock[0] = new Russian(null);
        mock[1] = new British("Adam");
        mock[2] = new Frenchman("Pierre");
        for (int i = 0; i < mock.length; i++) {
            System.out.println(mock[i]);
        }
    }
}