package ex2;

public class ResultatDistance implements Resultat{
	
	private double distance;
	
	public ResultatDistance(double distance) {
		this.distance=distance;
	}
	public String toString() {
		return "ResultatDistance [distance=" + distance + "]";
	}
	public void affiche()
	{
		System.out.println(this.toString());
	}
	public double getDistance() {
		return distance;
	}
	public int compareTo(Resultat r)
	{
		if (r.getClass().getSimpleName().equals("ResultatDistance"))
		{
			if (this.distance==((ResultatDistance) r).getDistance())
			{
				return 0;
			}
			else 
			{
				if (this.distance>((ResultatDistance) r).getDistance())
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
