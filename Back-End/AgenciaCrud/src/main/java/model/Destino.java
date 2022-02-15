package model;

public class Destino {

	private int Id;
	private String Nome;
	private String Pais;
	private String Cidade;
	private String Estado;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
    @Override
	public String toString() {
		return "Destino [Id=" + Id + ", Nome=" + Nome + ", Pais=" + Pais + ", Cidade=" + Cidade + ", Estado=" + Estado
				+ "]";
	}

}