package com.soprasteria;

import java.util.Random;

public class Conto {
	private int id;
	private String user;
	private double saldo;
	Random genId = new Random();
	
	
	public Conto(String user) {
		this.user = user;
		saldo = 0;
		id = genId.nextInt(1001)+1;
	}
	
	//CHECK TRANSAZIONE
	public void prelievo(double importo) {
		if((saldo - importo) >= 0) {
			saldo -=importo;
			System.out.println(">>OPERAZIONE APPROVATA<<");
		}
		else System.out.println("<!>NON E' STATO POSSIBILE CONCLUDERE LA TRANSAZIONE<!>");
	}
	
	public void deposito(double importo) {
		saldo += importo; 
		System.out.println(">>DEPOSITO EFFETTUATO \n <<");
	}
	
	@Override 
	public String toString() {
		return "\n\n \t DATI USER-ID : "+id+"\n\t USERNAME : "+user+"\n\t SALDO :"+saldo;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
