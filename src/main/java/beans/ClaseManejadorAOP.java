package beans;

import java.sql.SQLException;

public class ClaseManejadorAOP {
	
   public void metodoAfter(){
	   System.out.println("Metodo after");
   }
   
   public void metodoBefore(){
	   System.out.println("Metodo before");
   }
   
   public void metodoAfterReturning(String valor){
	   System.out.println("Metodo after returnun ---- palabra es ----- " + valor + " -------");
   }
   
   public void metodoAfterThrowing(SQLException ex){
	   System.out.println("La excepcion es: " + ex.getMessage());
   }
   
}
