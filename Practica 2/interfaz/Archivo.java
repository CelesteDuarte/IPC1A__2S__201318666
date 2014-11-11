package interfaz;
import java.io.*;

public class Archivo{
	public static void main(String[] a){
		FileInputStream origen=null;
				FileOutputStream destino = null;
		File f1 = new File("C://Users/C45ASP4311F/Documents/GitHub/Practica 2/Archivo.txt");
		File f2 = new File("C://Users/C45ASP4311F/hola.txt");
		try
		{
			origen = new FileInputStream(f1);
			destino = new FileOutputStream(f2);
			int c;
			
			while ((c = origen.read()) !=-1)
				destino.write((byte)c);
		
		}
		catch (IOException er)
		{
			System.out.println("Excepción de los flujos" + er.getMessage());
			
		}
		finally{
			try{
				origen.close();
				destino.close();
				
			}
			catch (IOException er){
				er.printStackTrace();
				
			}
		}
	}
}