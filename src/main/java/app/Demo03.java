package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo03 {

	public static void main(String[] args) {
		//Eliminar un Usuario 
		
		// 1. fabrica el acceso a los datos
				EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
				// 2. crea el manejador de entidades
				EntityManager em = fabrica.createEntityManager();
				// 3. empezar mi transacción -->reg,act o eliminar
				em.getTransaction().begin();
				
				//proceso
				//forma 1 eliminacion logica-->actualizacion de estados
				//forma 1 eliminacion fisica-->
				Usuario u=new Usuario();
				u.setCodigo(10);
			
				em.remove(u);// Ojo.Necesita un objeto que se debe devolver
				
				
				// 5. confirmar la transacción
				em.getTransaction().commit();
				
				//Cierre
				em.close();
				System.out.println("Termino.........");
	}
}
