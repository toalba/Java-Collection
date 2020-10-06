import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.*;

public class Comp {

    public static void main(String[] args) {

        String requestString="https://deutsche-feiertage-api.de/api/v1/2020";
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
                  System.out.println(response.toString());
              }            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}