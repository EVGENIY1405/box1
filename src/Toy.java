public class Toy implements Runnable {
    private final long time_off = 500L;

    @Override
    public void run() {
        try {
            while (true) {
                if (TumblerSwitch.isTumblerSwitch()) {
                    Thread.sleep(time_off);
                    TumblerSwitch.setTumblerSwitch(false);
                    System.out.println("cat turn off");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}