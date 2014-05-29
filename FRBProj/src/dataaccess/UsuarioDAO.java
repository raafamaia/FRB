package dataaccess;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

/*TODO Refazer classe quando for feito o banco de dados*/
public class UsuarioDAO {

	private static List<Usuario> listUsuarios = new ArrayList<>();
	
	public UsuarioDAO(){}
	
	public void inserir(Usuario u){
		if (!listUsuarios.isEmpty()) {
			u.setId(listUsuarios.size());
			listUsuarios.add(u);
		}else{
			u.setId(0);
			listUsuarios.add(u);
		}
	}
	
	public void atualizar(Usuario u){
		listUsuarios.set(u.getId(), u);
	}
	
	public Usuario buscaPorId(int id){
		for (int i = 0; !listUsuarios.isEmpty() && i < listUsuarios.size(); i++) {
			if (id == listUsuarios.get(i).getId()) {
				return listUsuarios.get(i);
			}
		}
		return null;
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
