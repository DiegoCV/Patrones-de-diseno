package patrones.talleres.t4;

import java.io.*;
import java.net.*;

public class Persona_Remota implements Runnable{
	private Thread thread;
	ServerSocket socket;
	PrintWriter salida;
	Socket communicationSocket;

	public static void main(String args[]){
		Persona_Remota pr = new Persona_Remota();
	}

	public Persona_Remota(){
		try{
			socket = new ServerSocket(45455);
			communicationSocket = socket.accept();
			salida = new PrintWriter(communicationSocket.getOutputStream(), true);
			thread = new Thread(this);
			thread.start();
		} catch (Exception e){
			System.out.println("Ha ocurrido un error: "+e.getMessage());
		}
	}

	@Override
	public void run(){
		String textoEntrada;
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader
				(communicationSocket.getInputStream()));
			while((textoEntrada = in.readLine()) != null){
				if(textoEntrada.equals("Hola terricolas")){
					saludar();
				} else if(textoEntrada.equals("Queremos paz")){
					decirEstado();
				} else if(textoEntrada.equals("Hasta luego")){
					despedirse();
				}
			}
		} catch (Exception e){
			System.out.println("Error general: "+e.getMessage());
		}
	}

	public void saludar(){
		salida.println("Hola!!!");
	}

	public void decirEstado(){
		salida.println("Estoy contento");
	}

	public void despedirse(){
		salida.println("Chao!!!");
	}
}