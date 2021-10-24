package EjercicioHibernate.ejercicioHibernate;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;




public class Principal {

	
	private static Logger logger = LogManager.getLogger(Principal.class);
	

	
	public static void main(String[] args) {
<<<<<<< HEAD
=======
		
		MenuOpciones menuOpciones = new MenuOpciones();
		menuOpciones.mostrarMenuPrincipal();
		
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		logger.info(String.format("%1$s: >>>>>> Comienzo de la transaction"));

		//Insertar un departamento
		Departamento d = new Departamento();
		d.setCodigo(5);
		d.setCodResponsable(123);
		d.setNombre("DepTest1");
		//DepartamentoDAO.insertDepartamento(session, d);
		
		//Insertar un empleado
		Empleado e = new Empleado();
		e.setCodigo(20);
		e.setNombre("Alicia");
		e.setApellido1("xxxxxxxxx");
		e.setApellido2("Vidal");
		e.setLugarNacimiento("Zamora");
		e.setFechaNacimiento("12101993");
		e.setDireccion("Zamora");
		e.setTelefono("1232323");
		e.setPuesto("Jefaza");
		e.setCodDepartamento(2);
		EmpleadoDAO.insertEmpleado(session, e);
		//leer un departamento segun su codigo
>>>>>>> 6268197963480dab7be7eee4a74d11892c860c5a

		logger.info(String.format("%1$s: >>>>>> Cargar Menu"));
		MenuOpciones.menuMostrar();
		
		


		logger.info(String.format("%1$s: >>>>>> Hacer commit."));

	}

}
