package fr.diginamic.recensement;

import tri.Pays;

public class Ville implements Comparable<Ville> {
	
	public String codeRegion;
	public String nomRegion;
	public String codeDepartement;
	public String codeCommune;
	public String nomCommune;
	public int populationT;
	
	public Ville(String cR, String nR, String cD, String cC, String nC,int pT)
	{
		this.codeRegion=cR;
		this.nomRegion=nR;
		this.codeDepartement=cD;
		this.codeCommune=cC;
		this.nomCommune=nC;
		this.populationT=pT;
	}
	
	public String getCodeR()
	{
		return this.codeRegion;
	}
	public String getNomR()
	{
		return this.nomRegion;
	}
	public String getCodeD()
	{
		return this.codeDepartement;
	}
	public String getCodeC()
	{
		return this.codeCommune;
	}
	public String getNomC()
	{
		return this.nomCommune;
	}
	public int getPopT()
	{
		return this.populationT;
	}

	public String toString()
	{
		return "code de la région :"+this.codeRegion+"\nnom de la region :"+this.nomRegion+
				"\ncode du département :"+this.codeDepartement+"\ncode de la commune :"+this.codeCommune+
				"\nnom de la commune :"+this.nomCommune+"\nPopoulation totale :"+this.populationT;
	}

	@Override
	public int compareTo(Ville vi) {
		int ret=0;
		if(vi.getPopT()>this.populationT)
		{
			ret=1;
		}
		if(vi.getPopT()<this.populationT)
		{
			ret=-1;
		}
		return ret;
	}
}
