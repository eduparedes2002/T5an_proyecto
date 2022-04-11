package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Usuario;

public class Demo07 {

	public static void main(String[] args) {
		//listar el contenido de los
		//usuarios, según el tipo indicando---uso de parametros
		
		//Listado de todos los usuarios
				EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
				// 2. crea el manejador de entidades
				EntityManager em = fabrica.createEntityManager();
				// 3. empezar mi transacción -->En listado-->
				
				//select*from tb_usuarios where idtipo=?
				TypedQuery<Usuario>consulta= em.createQuery("select u from Usuario u where tipo= :xtipo",Usuario.class);
				
				
				//establecer parametros
				
			consulta.setParameter("xtipo",1);
				List<Usuario>lstUsuarios=consulta.getResultList();
				
				
				
				
				for (Usuario u : lstUsuarios) {
					System.out.println(u);
					
				}
				
				
				//Cierre
				em.close();
				System.out.println("Termino.........");
	}
}
