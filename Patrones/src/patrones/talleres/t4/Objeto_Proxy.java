package patrones.talleres.t4;

import java.io.*;
import java.net.*;

public class Objeto_Proxy implements Runnable{
	private Thread thread;
	Socket socket;
	InputStream in;
	PrintWriter salida;
	int character;

	public Objeto_Proxy(){
		try{
			socket = new Socket("127.0.0.1", 45455);
			System.out.println("Conectando....");
			in = socket.getInputStream();
			salida = new PrintWriter (socket.getOutputStream(), true);
			thread = new Thread(this);
			thread.start();
		} catch(IOException ioe){
			System.err.println("Error al conectarse: "+ioe.getMessage());
		} catch (Exception e){
			System.err.println("Error general: "+e.getMessage());
		}

		if(socket != null && socket.isConnected()){
			System.out.println("Conectado!!!");
		}
	}

	@Override
	public void run()
	{
		try{
			while ((character = in.read()) != -1) {
				System.out.print((char) character);
			}
		} catch (Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	public void saludar(){
		salida.println("Hola terricolas");
	}

	public void decirEstado(){
		salida.println("Queremos paz");
	}

	public void despedirse(){
		salida.println("Hasta luego");
	}
}