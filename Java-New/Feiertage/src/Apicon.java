import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.*;


public class Apicon {
    private String url;
    public Apicon(String url)
    {
        this.url=url;
    }
    
    private JSONObject feiertagObject(int yearString) {
        String requestString=url+yearString+"?bundeslaender=bay";
        HttpURLConnection connection = null;
        try {
            URL url = new URL(requestString);
            connection =(HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setUseCaches(false);
            
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("X-DFA-Token", "dfa");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

             //Send request
             
		
            try(BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), "utf-8"))) {
                  StringBuilder response = new StringBuilder();
                  String responseLine = null;
                  while ((responseLine = br.readLine()) != null) {
                      response.append(responseLine.trim());
                  }
                  
                  return new JSONObject(response.toString());
              }            

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<JSONObject> getfeiertagObject(String maxdate,String tstart)
    {
        //here start  will be 2020
        int start = Integer.parseInt(tstart);
        List<JSONObject> yearList = new ArrayList<>();
        for (int i = start; i <= Integer.parseInt(maxdate); i++) {
            yearList.add(feiertagObject(i));
        }
        return yearList;
    }

}
