public class FootballPlayer extends HomoSapien{
    int shirtNo;
    String position;
    public FootballPlayer(String name, int shirtNo, String position, double height, double weight, int age) {
        super(name, height, weight, age);
        this.shirtNo = shirtNo;
        this.position = position;
    }

    public void shoot() {
        System.out.println(name + " is shooting a ball.");
    }

    public void pass() {
        System.out.println(name + " is passing to Messi.");
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Let's play football!");
    }
}
