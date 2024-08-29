import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoctorManagement dm = new DoctorManagement();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("========= Doctor Management ==========");
            System.out.println("1. Add Doctor");
            System.out.println("2. Update Doctor");
            System.out.println("3. Delete Doctor");
            System.out.println("4. Search Doctor");
            System.out.println("5. Display Doctors");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.println("--------- Add Doctor ----------");
                        System.out.print("Enter Code: ");
                        String code = scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Specialization: ");
                        String specialization = scanner.nextLine();
                        System.out.print("Enter Availability: ");
                        int availability = scanner.nextInt();
                        scanner.nextLine(); // consume newline

                        Doctor newDoctor = new Doctor(code, name, specialization, availability);
                        dm.addDoctor(newDoctor);
                        System.out.println("Doctor added successfully!");
                        break;

                    case 2:
                        System.out.println("--------- Update Doctor ----------");
                        System.out.print("Enter Code: ");
                        String uCode = scanner.nextLine();
                        System.out.print("Enter Name (leave blank to keep current): ");
                        String uName = scanner.nextLine();
                        System.out.print("Enter Specialization (leave blank to keep current): ");
                        String uSpecialization = scanner.nextLine();
                        System.out.print("Enter Availability (enter -1 to keep current): ");
                        int uAvailability = scanner.nextInt();
                        scanner.nextLine(); // consume newline

                        Doctor updateDoctor = dm.searchDoctor(uCode).get(uCode);
                        if (updateDoctor != null) {
                            if (!uName.isEmpty()) updateDoctor.setName(uName);
                            if (!uSpecialization.isEmpty()) updateDoctor.setSpecialization(uSpecialization);
                            if (uAvailability != -1) updateDoctor.setAvailability(uAvailability);

                            dm.updateDoctor(updateDoctor);
                            System.out.println("Doctor updated successfully!");
                        } else {
                            System.out.println("Doctor code doesn’t exist");
                        }
                        break;

                    case 3:
                        System.out.println("--------- Delete Doctor ----------");
                        System.out.print("Enter Code: ");
                        String dCode = scanner.nextLine();
                        dm.deleteDoctor(dCode);
                        System.out.println("Doctor deleted successfully!");
                        break;

                    case 4:
                        System.out.println("---------- Search Doctor ----------");
                        System.out.print("Enter text: ");
                        String input = scanner.nextLine();
                        HashMap<String, Doctor> results = dm.searchDoctor(input);
                        System.out.println("--------- Result ------------");
                        for (Doctor doctor : results.values()) {
                            System.out.println(doctor);
                        }
                        break;

                    case 5:
                        System.out.println("---------- Display Doctors ----------");
                        dm.displayDoctors();
                        break;

                    case 6:
                        System.out.println("Exiting program...");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice! Please try again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
