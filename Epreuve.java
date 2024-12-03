package ex2;

public class Epreuve {

	private String denomination;
	private Athlete [] tab;
	private int max;
	private int nbeffectif;
	private boolean etat;
	public Epreuve(String denomination , int max) {
		this.denomination=denomination;
		this.max=max;
		this.etat=false;
		this.nbeffectif=0;
		tab = new Athlete[max];
	}
	public String toString()
	{
		String et;
		if(this.etat)
		{
			et="terminée";
		}
		else
			et="non terminée";
		String liste_athlet="";
		for(int i=0; i<nbeffectif;i++)
		{
			liste_athlet=liste_athlet+tab[i].getNom()+", ";
		}
		return "denomination : "+this.denomination+" etat : "+et+" liste des athletes paticipants: "+liste_athlet;
	}
	public void ajoutAthlete(Athlete a)
	{
		if(nbeffectif<max)
		{
			tab[nbeffectif]=a;
			nbeffectif++;
		}
	}
	void terminer()
	{
		etat=true;
	}
}
