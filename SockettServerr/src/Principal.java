import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Principal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(4999);
		Socket s = ss.accept();
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		int num1 = Integer.parseInt(bf.readLine());
		System.out.println("Cliente mandou: "+num1);
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		int resultQ = quadrado(num1);
		pr.println("Quadrado: "+resultQ);
		pr.flush();
		
		
	}
	public static int quadrado(int a) {
		return a*a;
	}
	public static int ant(int a) {
		return a-1;
	}

}
