import java.util.HashMap;

public class Menu{

    private HashMap<String,String> Kalenderausw = new HashMap<String,String>();
    private void fillup()
    {
       Kalenderausw.put("AUT", "de.austrian#holiday@group.v.calendar.google.com");
    }
    public Menu(){
        fillup();
    }
    

}