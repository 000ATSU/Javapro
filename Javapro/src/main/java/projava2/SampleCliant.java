package projava2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;

public class SampleCliant {
  public static void main(String[] args) throws IOException {
    try (var soc = new Socket("localhost", 1700);
         OutputStream output = soc.getOutputStream()) {
      output.write(234);
    } catch (ConnectException e) {
      System.out.println("サーバーが起動していません");
    }
  }
}
