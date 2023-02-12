import java.util.Timer;
import java.util.TimerTask;

public class free {
  public static void main(String[] args) {
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
      public void run() {
        System.out.println("Task is executed.");
      }
    };

    timer.schedule(task, 2000); // 5 seconds
  }
}

