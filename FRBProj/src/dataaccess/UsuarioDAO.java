package dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

/*TODO Refazer classe quando for feito o banco de dados*/
public class UsuarioDAO {

	private static List<Usuario> listUsuarios = new ArrayList<>();
	
	public UsuarioDAO(){}
	
	public void inserir(Usuario u){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
	    EntityManager em = emf.createEntityManager();
		em.persist(u);
		em.close();
	}
	
	public boolean autentica(String user, String senha){
		for (int i = 0; !listUsuarios.isEmpty() && i < listUsuarios.size(); i++) {
			if (listUsuarios.get(i).getNome().equals(user) && listUsuarios.get(i).getSenha().equals(senha)) {
				return true;
			}
		}
		return false;
	}
	
}
