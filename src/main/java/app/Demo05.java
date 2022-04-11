package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo05 {

	public static void main(String[] args) {
		//version mejorada de eliminar

		// 1. fabrica el acceso a los datos
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		// 2. crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		// 3. empezar mi transacción -->En busqueda-->
		
		//select...where id...
		Usuario u = new Usuario();

		u.setCodigo(10);

		

		if(em.find(Usuario.class, u.getCodigo())==null)

			System.out.println("Usuario no existee");

		else {
		em.getTransaction().begin();
		em.remove(em.find(Usuario.class, u.getCodigo())); // !!Ojo.. Necesita un objeto que se debe devolver

		//Confirmación	

		em.getTransaction().commit();

		System.out.println("Usuario eliminado correctamente");

		}

	//cierre

		em.close();
		
		System.out.println("Termino.........");
	}
}
