import java.util.HashMap;
import java.util.Scanner;

public class Menu{

    private HashMap<String,String> Kalenderausw = new HashMap<String,String>();
    private void fillup()
    {
       Kalenderausw.put("AUT", "de.austrian#holiday@group.v.calendar.google.com");
    }
    public Menu(){
        fillup();
    }
    public String Landoptions()
    {
        String[] options = {"Österreich"};
        String v;
        Scanner s = new Scanner();
        System.out.print("Landoptionen:");
        for (int i = 0; i < options.length; i++) {
            System.out.print(" "+options[i]+",");
        }
        System.out.println();
        switch (s.next()) {
            case "Österreich": v = "AUT" ;break;
        }
        return Kalenderausw.get(v);
    }

    

}