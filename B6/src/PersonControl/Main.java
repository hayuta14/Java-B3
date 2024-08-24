package PersonControl;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        ManagerPerson management = new ManagerPerson();
        System.out.println("======Management Person Programer=======");
        Person[] persons = new Person[3];

        for (int i = 0;i<3;i++){
            try {
                persons[i] = management.inputPersonInfo(scan);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        try {
            persons = management.sortBySalary(persons);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        for (Person person : persons){
            management.displayPersonInfo(person);
        }

        scan.close();
    }
}