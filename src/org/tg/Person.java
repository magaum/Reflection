package org.tg;

import org.annotation.Name;

public class Person {

	private String name;
	private int age;
	private String sex;
	private double Weight;

	public Person(String nome, int idade, String sexo, double peso) {
		super();
		this.name = nome;
		this.age = idade;
		this.sex = sexo;
		this.Weight = peso;
	}

	public void setNome(String nome, String teste) {
		this.name = nome;
	}

	public int getIdade() {
		return age;
	}

	public void setIdade(int idade) {
		this.age = idade;
	}

	public String getSexo() {
		return sex;
	}

	public void setSexo(String sexo) {
		this.sex = sexo;
	}

	public double getPeso() {
		return Weight;
	}

	public void setPeso(double peso) {
		this.Weight = peso;
	}

	public String getNome() {
		return this.name;
	}

	@Name
	public String isThis() {
		return "Name=" + name + ", Age=" + age + ", Sex=" + sex + ", Weight=" + Weight;
	}

}
