package ex2;

public class ResultatRang implements Resultat{
	
	private int rang;

	public ResultatRang(int rang) {
		this.rang=rang;
	}
	public String toString() {
		return "ResultatRang [rang=" + rang + "]";
	}
	public void affiche()
	{
		System.out.println(this.toString());
	}
	public int getRang() {
		return rang;
	}
	public int compareTo(Resultat r)
	{
		if (r.getClass().getSimpleName().equals("ResultatRang"))
		{
			if (this.rang==((ResultatRang) r).getRang())
			{
				return 0;
			}
			else 
			{
				if (this.rang>((ResultatRang) r).getRang())
				{
					return 1;
				}
				else 
					return -1;
			}
		}
		else 
			return -2;
	}
}
