package EjercicioHibernate.ejercicioHibernate;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;




public class Principal {

	
	private static Logger logger = LogManager.getLogger(Principal.class);
	
	static SessionFactory sessionFactory;
	
	public static void main(String[] args) {
		
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

		Departamento dp = new Departamento();
		dp = DepartamentoDAO.readDepartamento(session, 1);
		System.out.println(dp.toString());
		
		//leer empleado
		
		Empleado em = new Empleado();
		em = EmpleadoDAO.readEmpleado(session, 20);
		System.out.println(em.toString());
		
		//Borrar un departamento
		DepartamentoDAO.deleteDepartamento(session, d);

		//Borrar un empleado
		EmpleadoDAO.deleteEmpleado(session, e);
		
		//Update un departamento
		Departamento dpupdate = new Departamento();
		dpupdate.setCodigo(3);
		dpupdate.setNombre("update");
		DepartamentoDAO.updateDepartamento(session, dpupdate);
		
		//Update un empleado
		
		Empleado empleadoUpdate = new Empleado();
		empleadoUpdate.setCodigo(12);
		empleadoUpdate.setNombre("Update");
		EmpleadoDAO.updateEmpleado(session, empleadoUpdate);
		tx.commit();

		logger.info(String.format("%1$s: >>>>>> Hacer commit."));

	}

}
