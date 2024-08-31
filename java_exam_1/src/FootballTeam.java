import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FootballTeam {
    List<FootballPlayer> players = new ArrayList<>();

    // Phương thức tạo đội
    public void createPlayer() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 11; i++) {
            System.out.println("Enter details for player " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Shirt No: ");
            int shirtNo = scanner.nextInt();
            System.out.print("Position: ");
            String position = scanner.next();
            System.out.print("Height: ");
            double height = scanner.nextDouble();
            System.out.print("Weight: ");
            double weight = scanner.nextDouble();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            FootballPlayer player = new FootballPlayer(name, shirtNo, position, height, weight, age);
            players.add(player);
        }
    }

    // Phương thức hiển thị thông tin tất cả cầu thủ
    public void display() {
        for (FootballPlayer player : players) {
            System.out.println("Name: " + player.name + ", Shirt No: " + player.shirtNo + ", Position: " + player.position);
        }}}