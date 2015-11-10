package encrypt;

import java.net.*;
import java.io.*;

public class socket_Client {
	Socket socket;
	BufferedReader in = null;
	PrintWriter out = null;
	public void listenSocket(){
		//Create socket connection
		try{
		     socket = new Socket("kq6py", 4321);
		     out = new PrintWriter(socket.getOutputStream(), 
		                 true);
		     in = new BufferedReader(new InputStreamReader(
		                socket.getInputStream()));
		} catch (UnknownHostException e) {
		     System.out.println("Unknown host: Lizard");
		     System.exit(1);
		} catch  (IOException e) {
		     System.out.println("No I/O");
		     System.exit(1);
		}
	}
		//if(source == button){
		//Send data over socket
		//      String text = textField.getText();
		//      out.println(text);
		//      textField.setText(new String(""));
		//      out.println(text);
		//Receive text from server
		//   try{
		//     String line = in.readLine();
		//     System.out.println("Text received: " + line);
		//   } catch (IOException e){
		//     System.out.println("Read failed");
		//     System.exit(1);
		//   }
		//}  
}
