package model;

public class Promocao {
	

	private int Id;
	private String Nome;
	private String Descricao;
	private double Valor;

	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

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
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}

	@Override
	public String toString() {
		return "Promocao [Id=" + Id + ", Nome=" + Nome + ", Descricao=" + Descricao + ", Valor=" + Valor + "]";
	}
	
}
