package com.sistemi.informativi.main;

import com.sistemi.informativi.AziendaInformatica;
import com.sistemi.informativi.AziendaMeccanica;
import com.sistemi.informativi.Docente;
import com.sistemi.informativi.DocenteJava;
import com.sistemi.informativi.DocenteMicrosoft;
import com.sistemi.informativi.DocenteReact;
import com.sistemi.informativi.Persona;
import com.sistemi.informativi.Studente;
import com.sistemi.informativi.StudenteLavoratore;

public class MainApplication {

	public static void main(String[] args) {
		
		//Padre
		Persona persona = new Persona();
		
		persona.cammina();
		persona.mangia();
		persona.dorme();
		System.out.println();

		//Figlio
		Studente studente = new Studente();
		
		studente.cammina();
		studente.mangia();
		studente.dorme();
		studente.studia();
		System.out.println();
		
		//figlio del figlio
		StudenteLavoratore studenteLavoratore = new StudenteLavoratore();

		studenteLavoratore.cammina();
		studenteLavoratore.mangia();
		studenteLavoratore.dorme();
		studenteLavoratore.studia();
		studenteLavoratore.lavora();
		System.out.println();
		
		AziendaMeccanica aziendaMeccanica = new AziendaMeccanica();
		
		aziendaMeccanica.assume();
		aziendaMeccanica.produce();
		aziendaMeccanica.fattura();	
		System.out.println();
		
		AziendaInformatica aziendaInformatica = new AziendaInformatica();
		
		aziendaInformatica.assume();
		aziendaInformatica.produce();
		aziendaInformatica.fattura();
		System.out.println("--------------------------------------------------");
		
		DocenteJava docenteJava = new DocenteJava();
		
		docenteJava.spiegaLinguaggio();
		docenteJava.spiegaFramework();
		docenteJava.spiegaArchitettura();
		System.out.println();
		
		DocenteMicrosoft docenteMicrosoft = new DocenteMicrosoft();
		
		docenteMicrosoft.spiegaLinguaggio();
		docenteMicrosoft.spiegaFramework();
		docenteMicrosoft.spiegaArchitettura();
		System.out.println();
		
		DocenteReact docenteReact = new DocenteReact();
		
		docenteReact.spiegaLinguaggio();
		docenteReact.spiegaFramework();
		docenteReact.spiegaArchitettura();
		
		/*
		 * Poliforfismo di oggetto = 
		 * Un oggetto può assumerere a runtime la forma di uno dei suoi figli
		 */
		Docente docente = new DocenteJava();// esempio di PATTERN LOOSE COUPLING
		
		docente.spiegaLinguaggio();
		docente.spiegaFramework();
		docente.spiegaArchitettura();
	}

}
