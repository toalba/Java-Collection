import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.json.*;


public class Handler {

    public List<LocalDate> gLocalDates(List<JSONObject> jsonyearList)
    {
        try {
            List<LocalDate> dList = new ArrayList<>();
            for (int i = 0; i < jsonyearList.size(); i++) {
                JSONObject obj = jsonyearList.get(i);
                System.out.println("Loading... "+obj.getString("message"));
                JSONArray arr= obj.getJSONArray("holidays");
                for (int j = 0; j < arr.length(); j++)
                {
                  LocalDate date = getDateofJSON(arr.getJSONObject(j));
                  dList.add(date);
                }                        
            }
            return dList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
    }
    public LocalDate getDateofJSON(JSONObject obj)
    {
        try {
            JSONObject obj2 = obj.getJSONObject("holiday");
            return LocalDate.parse(obj2.getString("date"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
