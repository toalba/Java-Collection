
public class Comp {

    public static void main(String[] args) {

        // try to avoid as much spaces as possible
        String url = "https://deutsche-feiertage-api.de/api/v1/";
        Apicon apicon = new Apicon(url);
        Menu menu = new Menu();
        Sucher sucher = new Sucher();
        Handler handler = new Handler();
        
        sucher.sucher(handler.gLocalDates(apicon.getfeiertagObject(menu.maxdate(), menu.mindate())));

    }
}