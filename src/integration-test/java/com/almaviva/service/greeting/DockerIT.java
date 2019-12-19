package com.almaviva.service.greeting;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DockerIT {

    @Test
    public void getHelloDock() throws Exception {
        URL url = new URL("http://localhost:8080/greeting");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        assertEquals("{\"id\":1,\"content\":\"Hello, World!\"}", br.readLine());

    }
}
