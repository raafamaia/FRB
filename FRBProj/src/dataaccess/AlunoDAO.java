/*package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dataaccess.ConnectionFactory;
import model.Aluno;


public class AlunoDAO {
	private Connection conn;	
	
	public AlunoDAO(){
		this.conn = new ConnectionFactory().getConnection();
	}
	
	public void inserir(Aluno a){
		
		String sql = "insert into Aluno (nome, ra, montante, periodo, curso, email, senha)"
				+ "values (?,?,?,?,?,?,?)";
		try{
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, a.getNome());
			stmt.setInt(2, a.getRa());
			stmt.setDouble(3, a.getMontante());
			stmt.setString(4, a.getPeriodo());
			stmt.setString(5, a.getCurso());
			stmt.setString(6, a.getEmail());
			stmt.setString(7, a.getSenha());
						
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}		
	}
	
	public List<Aluno> getLista(){
		
		try{
			List<Aluno> lista = new ArrayList<Aluno>();
			PreparedStatement stmt = this.conn.prepareStatement("select * from "
					+ "Alunos");
			ResultSet rs =  stmt.executeQuery();
			
			while(rs.next()){
				
				Aluno a = new Aluno();
				a.setNome(rs.getString("nome"));
				a.setRa(rs.getInt("ra"));
				a.setMontante(rs.getDouble("montante"));				
				
				lista.add(a);
			}
			
			rs.close();
			stmt.close();
			return lista;
				
		}catch(SQLException e){
			throw new RuntimeException(e);
		}		
	}
}
*/