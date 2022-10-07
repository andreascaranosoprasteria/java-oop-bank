package com.soprasteria;

import java.util.Scanner;

public class Bank {
	/*
	 * Esercizio di oggi: Java Bank 
	 * Nome repo: java-oop-bank
	 * 1) creare la classe Conto
	 * caratterizzata da: - numero di conto - nome del proprietario - saldo 
	 * i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in
	 * modo che: - alla creazione di un nuovo conto il saldo sia 0€ - 
	 * 
	 * Il codice
	 * conto sia accessibile solo in lettura, 
	 * il proprietario sia accessibile in
	 * lettura e in scrittura e il saldo sia accessibile solo in lettura 
	 * - siano presenti un metodo per versare una somma di denaro sul conto e uno per
	 * prelevare una somma di denaro dal conto (attenzione: il saldo non può mai
	 * diventare negativo) - altri metodi per ritornare le informazioni del conto e
	 * il saldo formattato Aggiungere una classe Bank con metodo main, dove
	 * chiediamo all’utente il suo nome e generiamo un Conto intestato all’utente
	 * con un numero di conto random (da 1 a 1000) Poi chiediamo all’utente cosa
	 * vuole fare dando 3 opzioni: versare una somma o prelevare una somma di denaro
	 * o uscire. Dopo la scelta dell’utente chiediamo quanti soldi vuole versare o
	 * prelevare e proviamo ad effettuare l’operazione sul conto. Se l’operazione
	 * non è valida mostriamo un messaggio di errore. Se l’operazione va a buon fine
	 * mostriamo il saldo attuale del conto. Il menu continua ad apparire fino a che
	 * l’utente sceglie di uscire.
	 */
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("\t\t [Benvenuto] \n Inserisca Username:");
		Conto profilo = new Conto(in.nextLine());
		int flag = -1;
		//DEBUG: stampa dati della classe conto,
		System.out.println(profilo.toString());
		
		do {
			System.out.println("SCELTA: \n 1)Versamento somma: \n 2)Prelievo: \n 3)Esci");
			flag = Integer.parseInt(in.nextLine());
			if(flag == 1) {
				System.out.print("-->AMMONTARE DELLA SOMMA:");
				profilo.deposito(Double.parseDouble(in.nextLine()));
			}
			else if(flag == 2) {
				System.out.print("IMPORTO DA PRELEVARE: ");
				profilo.prelievo(Double.parseDouble(in.nextLine()));
			}
			else if(flag == 3) flag = 3;
			else System.out.println("<!>Hai inserito un valore non valido<!>");
			
			System.out.println("\n<<SALDO ATTUALE : "+String.format("%,12.2f ",profilo.getSaldo())+"£ >>");
		}
		while(flag != 3);

	}
	

}
