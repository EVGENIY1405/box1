public class Main {

    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        User user = new User("Константин", box);
        Toy toy = new Toy("Котик", box);

        user.start();
        toy.start();
        user.join();
    }
}