package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo02 {

	public static void main(String[] args) {
		
		//Agregar un nuevo usuario
		Usuario u =new Usuario();
		u.setCodigo(3);
		u.setNombre("Carla");
		u.setApellido("Toro");
		u.setUsuario("U002@gmail.com");
		u.setClave("10002");
		u.setFchnacim("2022-03-21");
		u.setTipo(2);
		u.setEstado(1);
		
		//proceso de registro 
		// 1. fabrica el acceso a los datos
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		// 2. crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		// 3. empezar mi transacci�n
		em.getTransaction().begin();
		try {		
		// 4. procesos --actualizar
		em.merge(u);//si el Id existe actualiza el usuario,sino lo agrega
		// 5. confirmar la transacci�n
		em.getTransaction().commit();
		}catch (Exception e) {
			System.err.println("Error al actualizar..."+e.getMessage());
			
		}
		em.close();
		System.out.println("Termino.........");
	}

}
