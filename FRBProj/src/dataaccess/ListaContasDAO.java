package dataaccess;

import java.util.ArrayList;
import java.util.List;

import model.Conta;
import model.Usuario;

/*TODO Remover esta classe após o script tiver sido criado */
public class ListaContasDAO {

	private static List<Conta> listConta= new ArrayList<>();
	
	public ListaContasDAO(){}
	
	public void inserir(Conta conta){
		listConta.add(conta);
	}
	
	public void removerPorCodigo(int codigo){
		for (int i = 0; i < listConta.size(); i++) {
			if (codigo == listConta.get(i).getCod()) {
				listConta.remove(i);
				return;
			}
		}
	}
	
	public Usuario buscaPorCodigo(int codigo){
		for (int i = 0; i < listConta.size(); i++) {
			if (codigo == listConta.get(i).getCod()) {
				return new UsuarioDAO().buscaPorId(listConta.get(i).getIdUsuario());
			}
		}
		return null;
	}
	
	public List<Conta> getLista(){
		return listConta;
	}
}
