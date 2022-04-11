package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo01 {

	public static void main(String[] args) {
		
		//Agregar un nuevo usuario
		Usuario u =new Usuario();
		u.setCodigo(10);
		u.setNombre("Eduardo");
		u.setApellido("Paredes");
		u.setUsuario("edu@mail.com");
		u.setClave("edu2002");
		u.setFchnacim("2002/12/08");
		u.setTipo(1);
		u.setEstado(1);
		
		//proceso de registro 
		// 1. fabrica el acceso a los datos
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		// 2. crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		// 3. empezar mi transacción
		em.getTransaction().begin();
		try {		
		// 4. procesos --registrar
		em.persist(u);
		// 5. confirmar la transacción
		em.getTransaction().commit();
		}catch (Exception e) {
			System.err.println("Error al registrar..."+e.getMessage());
			
		}
		em.close();
		System.out.println("Termino.........");
	}

}
