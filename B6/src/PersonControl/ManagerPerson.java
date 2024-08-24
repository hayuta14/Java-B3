package PersonControl;

import java.util.Scanner;

public class ManagerPerson {


    public Person inputPersonInfo(Scanner scan)throws Exception{
        boolean valid = false;
        String name,address;
        double salary = 0;
        System.out.println("Input Information of Person");
        System.out.println("Please Input name: ");
        name = scan.nextLine();
        System.out.println("Please Input address: ");
        address = scan.nextLine();
        while (!valid){
            try{
                System.out.println("Please Input salary: ");
                salary = Double.parseDouble(scan.nextLine());
                if(salary<=0){
                    throw new Exception("Salary must be greater than zero");
                }
                valid = true;

            }catch (NumberFormatException e){
                System.out.println("You must type a digit");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return new Person(name,salary,address);
    }

    public void displayPersonInfo(Person person){
        System.out.println("Infomation of People you have entered: ");
        System.out.println("Name: "+person.getName());
        System.out.println("Address: "+person.getAddress());
        System.out.println("Salary: "+person.getSalary());
    }

    public Person[] sortBySalary(Person[] persons) {
        int n = persons.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (persons[j].getSalary() > persons[j+1].getSalary()) {
                    // Swap persons[j+1] and persons[j]
                    Person temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                }
            }
        }
        return persons;
    }}


