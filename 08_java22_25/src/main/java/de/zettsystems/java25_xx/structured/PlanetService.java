package de.zettsystems.java25_xx.structured;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;

public class PlanetService {
    public String getPlanet(int planetId) throws Exception {
        System.out.println("BEGIN getPlanet()");
        String url = "https://swapi.dev/api/planets/" + planetId + "/";
        String ret = "?";

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet request = new HttpGet(url);
        CloseableHttpResponse response = httpClient.execute(request);

        // Check the response status code
        if (response.getCode() != 200) {
            System.err.println("Error fetching planet information for ID: " + planetId);
            throw new RuntimeException("Error fetching planet information for ID: " + planetId);
        } else {
            // Parse the JSON response and extract planet information
            ret = EntityUtils.toString(response.getEntity());
            System.out.println("Got a Planet: " + ret);
        }

        // Close the HTTP response and client
        response.close();
        httpClient.close();
        return ret;
    }
}
