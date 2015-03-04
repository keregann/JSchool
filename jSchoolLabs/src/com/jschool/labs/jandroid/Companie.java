package com.jschool.labs.jandroid;

import java.io.ObjectInputStream.GetField;
import java.util.List;

public class Companie {
	String numeCompanie;
	long codFiscal;

    CompanyType tipCompanie;        // de tip enum
	List<Angajat> listaDeAngajati; // lista de tip clasei angajati, poate
									// include si clase care mostenesc de la
									// Angajat
	public String getNumeCompanie() {
		return numeCompanie;
	}

	public void setNumeCompanie(String numeCompanie) {
		this.numeCompanie = numeCompanie;
	}

	public long getCodFiscal() {
		return codFiscal;
	}

	public void setCodFiscal(long codFiscal) {
		this.codFiscal = codFiscal;
	}
	public CompanyType getCompanyType() {
		return tipCompanie;
	}

	public void setCompanyType(CompanyType tipCompanie) {
		this.tipCompanie = tipCompanie;
	}

}
