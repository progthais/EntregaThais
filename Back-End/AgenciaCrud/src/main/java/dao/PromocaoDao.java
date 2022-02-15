package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySqlConnection;
import model.Promocao;

public class PromocaoDao implements Crud {
		private static Connection connection = MySqlConnection.createConnection();
		private static String sql;

			public static void create(  Promocao promocao) {
				sql="INSERT INTO promocoes VALUES (null, ?, ?, ?)";
				try {
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setString(1,  promocao.getNome());
					preparedStatement.setString(2,  promocao.getDescricao());
					preparedStatement.setDouble(3, promocao.getValor());
					preparedStatement.executeUpdate();
		System.out.println("Dados inseridos com sucesso!");
					
				}
				catch(SQLException e){
					System.out.println("Erro dados não inseridos no Banco " +e.getMessage());

					
				}

			}
			public static void delete(int promocaoId) {
				
				sql = "DELETE FROM promocoes WHERE id = ?";
				
				try {
					
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setInt(1, promocaoId);
					preparedStatement.executeUpdate();
					
					System.out.println("Dado deletado com sucesso ");

				}
				catch(SQLException e){
					System.out.println("Erro ao deletar dados " +e.getMessage());

					
				}
				
			}
			public static List<Promocao> find(String pesquisa) {
				
				sql = String.format("SELECT * FROM promocoes WHERE nome LIKE '%s%%' OR descricao LIKE '%s%%' ", pesquisa, pesquisa);
				
				List<Promocao> promocoes = new ArrayList<Promocao>();
				
				try {
					
					Statement statement= connection.createStatement();
					ResultSet resultSet = statement.executeQuery(sql);
					
					while (resultSet.next()) {
						Promocao promocao = new Promocao();
						
						promocao.setId(resultSet.getInt("id"));
						promocao.setNome(resultSet.getString("nome"));
						promocao.setDescricao(resultSet.getString("descricao"));
						promocao.setValor(resultSet.getDouble("valor"));
						
						promocoes.add(promocao);
						

					}
					System.out.println("Promoção da agência Viva encontrados! ");
					return promocoes;


				} catch(SQLException e){
					System.out.println("Dados promoção não encontrados no Banco!" +e.getMessage());
					return null;
					
				}

			
			}
			
			public static Promocao findByPk(int promocaoId) {
				
				
		sql = String.format("SELECT * FROM promocoes WHERE id =  %d" , promocaoId);
						
				try {
					
					Statement statement= connection.createStatement();
					ResultSet resultSet = statement.executeQuery(sql);
					Promocao promocao = new  Promocao();

					while (resultSet.next()) {
						
						 promocao.setId(resultSet.getInt("id"));
						 promocao.setNome(resultSet.getString("nome"));
						 promocao.setDescricao(resultSet.getString("descricao"));
						 promocao.setValor(resultSet.getDouble("valor"));
										

					}
					System.out.println("Promoções achadas pela ID ");
					return promocao;

			
			}
		   catch(SQLException e){
				System.out.println("Promoções não foram achadas pela ID" +e.getMessage());
				return null;
				
			}

			}
			
			public static void update( Promocao  promocao) {
				sql="UPDATE promocoes SET nome=?, descricao=?, valor=? WHERE id=?";
				
				try {
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setString(1,  promocao.getNome());
					preparedStatement.setString(2,  promocao.getDescricao());
					preparedStatement.setDouble(3,  promocao.getValor());
					preparedStatement.setInt(4,  promocao.getId());
					
					preparedStatement.executeUpdate();
					
		System.out.println("Dados atualizados! ");
					
				}
				catch(SQLException e){
					System.out.println("Erro ao atualizar dados " +e.getMessage());

					
				}

			}
				
}
