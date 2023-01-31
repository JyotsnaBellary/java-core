
import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Aircraft manufacturer :");
        String name = br.readLine();
        //fill your code
        System.out.println("The models provided by " +name + " are :");
        AircraftDAO aircraftDAO = new AircraftDAO();
        ArrayList<String> ModelList = new ArrayList<>();
        ModelList = aircraftDAO.listModels(name);
        for(String model : ModelList) {
            System.out.println(model);
        }
    }
}

