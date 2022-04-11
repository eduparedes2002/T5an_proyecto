package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo04 {

	public static void main(String[] args) {
		//que permita encontrar y devolver los datos
		//de un Usuario, según su código.
		
		// 1. fabrica el acceso a los datos
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		// 2. crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		// 3. empezar mi transacción -->En busqueda-->
		//select...where id...
		Usuario u=em.find(Usuario.class,10);
		//devuelve un obj de Entidad si encuentra el Id,sino devuelve null
		
		if(u==null)
			System.err.println("Usuario no existe");
		else
		System.out.println(u);
		
		
		// 5. confirmar la transacción
		em.getTransaction().commit();
		
		//Cierre
		em.close();
		System.out.println("Termino.........");
	}
}
