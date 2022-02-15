package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySqlConnection;
import model.Destino;

public class DestinoDao implements CrudPromocao {
private static Connection connection = MySqlConnection.createConnection();
private static String sql;

	public static void create(Destino destino) {
		sql="INSERT INTO destinos VALUES (null, ?, ?, ?, ?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, destino.getNome());
			preparedStatement.setString(2, destino.getPais());
			preparedStatement.setString(3, destino.getCidade());
			preparedStatement.setString(4, destino.getEstado());
			preparedStatement.executeUpdate();
System.out.println("Dados inseridos com sucesso!");
			
		}
		catch(SQLException e){
			System.out.println("Erro dados não inseridos no Banco " +e.getMessage());

			
		}

	}
	public static void delete(int destinoId) {
		
		sql = "DELETE FROM destinos WHERE id = ?";
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, destinoId);
			preparedStatement.executeUpdate();
			
			System.out.println("Dado deletado com sucesso ");

		}
		catch(SQLException e){
			System.out.println("Erro ao deletar dados " +e.getMessage());

			
		}
		
	}
	public static List<Destino> find(String pesquisa) {
		
		sql = String.format("SELECT * FROM destinos WHERE nome LIKE '%s%%' OR cidade LIKE '%s%%' OR pais LIKE '%s%%' OR estado LIKE '%s%%'  ", pesquisa, pesquisa, pesquisa, pesquisa);
		
		List<Destino> destinos = new ArrayList<Destino>();
		
		try {
			
			Statement statement= connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				Destino destino = new Destino();
				
				destino.setId(resultSet.getInt("id"));
				destino.setNome(resultSet.getString("nome"));
				destino.setPais(resultSet.getString("pais"));
				destino.setCidade(resultSet.getString("cidade"));
				destino.setEstado(resultSet.getString("estado"));
				
				destinos.add(destino);
				

			}
			System.out.println("Destinos da agência Viva encontrados! ");
			return destinos;


		} catch(SQLException e){
			System.out.println("Destinos não encontrados no Banco!" +e.getMessage());
			return null;
			
		}

	
	}
	
	public static Destino findByPk(int destinoId) {
		
		
sql = String.format("SELECT * FROM destinos WHERE id =  %d" , destinoId);
				
		try {
			
			Statement statement= connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Destino destino = new Destino();

			while (resultSet.next()) {
				
				destino.setId(resultSet.getInt("id"));
				destino.setNome(resultSet.getString("nome"));
				destino.setPais(resultSet.getString("pais"));
				destino.setCidade(resultSet.getString("cidade"));
				destino.setEstado(resultSet.getString("estado"));
								

			}
			System.out.println("Destinos da agência achados ID! ");
			return destino;

	
	}
   catch(SQLException e){
		System.out.println("Destinos pela ID não encontrados no Banco!" +e.getMessage());
		return null;
		
	}

	}
	
	public static void update(Destino destino) {
		sql="UPDATE destinos SET nome=?, pais=?, cidade=?, estado=? WHERE id=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, destino.getNome());
			preparedStatement.setString(2, destino.getPais());
			preparedStatement.setString(3, destino.getCidade());
			preparedStatement.setString(4, destino.getEstado());
			preparedStatement.setInt(5, destino.getId());
			
			preparedStatement.executeUpdate();
			
System.out.println("Dados atualizados! ");
			
		}
		catch(SQLException e){
			System.out.println("Erro ao atualizar dados " +e.getMessage());

			
		}

	}
		
	


}