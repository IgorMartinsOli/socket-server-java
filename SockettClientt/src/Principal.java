import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("localhost", 4999);
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println(JOptionPane.showInputDialog("Digite o numero"));
		pr.flush();
		
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		String num = bf.readLine();
		System.out.println(""+num);
		
	}
}