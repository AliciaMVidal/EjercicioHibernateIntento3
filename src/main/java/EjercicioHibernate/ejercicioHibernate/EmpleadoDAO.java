package EjercicioHibernate.ejercicioHibernate;

import org.hibernate.Session;

public class EmpleadoDAO {

	
	
	public static void insertEmpleado(Session s, Empleado e) {
		s.save(e);
	}

	public static Empleado readEmpleado(Session s, int codigo) {
		String hQuery = " from Empleado e " + " where e.codigo = :codigo";
		Empleado em = s.createQuery(hQuery, Empleado.class).setParameter("codigo", codigo)
				.setMaxResults(1).uniqueResult();
		return em;
	}
	
	public static void updateEmpleado(Session s, Empleado e) {
		s.update(e);
	}
	
	public static void deleteEmpleado(Session s, Empleado e) {
		//d.getCodigo();
		s.delete(e);
	}
}
