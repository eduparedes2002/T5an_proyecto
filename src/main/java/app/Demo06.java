package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Usuario;

public class Demo06 {

	public static void main(String[] args) {
		//Listado de todos los usuarios
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		// 2. crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		// 3. empezar mi transacción -->En listado-->
		
		//select*from tb_usuarios
		TypedQuery<Usuario>consulta= em.createQuery("select u from Usuario u",Usuario.class);
		
		List<Usuario>lstUsuarios=consulta.getResultList();
		
		//otra Forma
		
		//List<Usuario>lstUsuarios=em.createQuery("select u from Usuario u",Usuario.class).getResultList();
		
		
		for (Usuario u : lstUsuarios) {
			System.out.println(u);
			
		}
		
		
		//Cierre
		em.close();
		System.out.println("Termino.........");
	}
}
