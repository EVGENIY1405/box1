public class User extends Thread{
    private final long time = 1000;
    private final int count = 10;

    @Override
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                Thread.sleep(time);
                TumblerSwitch.setTumblerSwitch(true);
                System.out.println("user turn on");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}