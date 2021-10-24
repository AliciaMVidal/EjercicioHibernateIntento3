package EjercicioHibernate.ejercicioHibernate;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;




public class Principal {

	
	private static Logger logger = LogManager.getLogger(Principal.class);
	

	
	public static void main(String[] args) {

		logger.info(String.format("Cargar Menu"));
		MenuOpciones.menuMostrar();
		
		


	}

}
