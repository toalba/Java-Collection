import java.util.HashMap;
import java.util.Scanner;

public class Menu{

    private HashMap<String,String> Kalenderausw = new HashMap<String,String>();
    private void fillup()
    {
       Kalenderausw.put("AUT", "de.austrian#holiday@group.v.calendar.google.com");
       Kalenderausw.put("DE", "de.german#holiday@group.v.calendar.google.com");
    }
    public Menu(){
        fillup();
    }
    public String Landoptions()
    {
        String[] options = {"Österreich","Deutschland"};
        String v;
        Scanner s = new Scanner(System.in);
        System.out.print("Landoptionen:");
        for (int i = 0; i < options.length; i++) {
            System.out.print(" "+options[i]+",");
        }
        System.out.println();
        switch (s.next()) {
            case "Österreich": v = "AUT";break;
            case "Deutschland": v = "DE";break;
            default: v = "AUT";
        }
        s.close();
        return Kalenderausw.get(v);
    }
    public String maxdate()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Gebe das max. Jahr in Format <yyyy> ein:");
        String datum = s.next();
        return datum;
    }
    public String mindate()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Gebe das min. Jahr in Format <yyyy> ein:");
        String datum = s.next();
        s.close();
        return datum;
    }

    

}