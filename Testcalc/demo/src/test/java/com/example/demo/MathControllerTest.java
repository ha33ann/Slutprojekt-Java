// package com.example.demo;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotEquals;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.net.HttpURLConnection;
// import java.net.URL;

// import org.junit.jupiter.api.Test;

// public class MathControllerTest {
    
//     @Test
//     void test() {
//         CalcController controller = new CalcController();
//         int value1 = 100;
//         int value2 = 3;
        
        
//         String response = controller.math("multiplication",value1, value2);
//         assertEquals("300.0", response);
// }
// @Test
//     void testFail() {
//         CalcController controller = new CalcController();
//         int value1 = 100;
//         int value2 = 3;
        
//         String response = controller.math("multiplication",value1, value2);
//         assertNotEquals("3.0", response);
// }
// @Test
//     public void endpointTest() throws IOException {
		
//         URL url = new URL("http://localhost:8080/math/?operation=multiplication&value100=1&value2=3");
// 		HttpURLConnection connection = (HttpURLConnection)url.openConnection();

// 		connection.setRequestMethod("GET");
// 		connection.setRequestProperty("User-Agent", "Mozilla/5.0");
		
// 		int responseCode = connection.getResponseCode();
// 		System.out.println("Response code: " + responseCode);
// 		if (responseCode == HttpURLConnection.HTTP_OK) {
// 			BufferedReader isr = new BufferedReader(
// 					new InputStreamReader(
// 							connection.getInputStream()));
// 			String myText;
// 			StringBuffer myBuffert = new StringBuffer();
			
// 			while ( (myText = isr.readLine()) != null  ) {
// 				myBuffert.append(myText);
// 			}
// 			isr.close();
			
// 			String result = (myBuffert.toString());
//             assertEquals("300.0", result);
// 		} else {
// 			System.out.println("Could not read URL");
// 		}
//     }
// }