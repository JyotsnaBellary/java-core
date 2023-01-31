import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Hall> halls = new ArrayList<>();
    System.out.print("Enter the number of halls: ");
    int n = Integer.parseInt(br.readLine());
    for (int i = 1; i <= n; i++) {
      System.out.print("Enter the details of hall " + i + ": ");
      String[] parts = br.readLine().split(",");
      Hall hall = new Hall();
      hall.setName(parts[0]);
      hall.setContact(parts[1]);
      hall.setCostPerDay(Double.parseDouble(parts[2]));
      hall.setOwner(parts[3]);
      halls.add(hall);
    }
    br.close();
    Hall.writeHallDetails(halls);
  }
}
