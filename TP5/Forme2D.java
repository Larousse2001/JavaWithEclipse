package TP5;

abstract class Forme2D 
{
	protected String nom ;
	protected float d1 , d2 ;
	Forme2D(String nom , float d1 , float d2)
	{
		this.nom = nom ; 
		this.d1 = d1;
		this.d2 = d2;
	}
	abstract float surface () ;
	abstract float perimetre() ;
	public void affiche_forme() {
		System.out.println(""+toString());
	}
	public String toString() 
	{
		return "de nom "+nom+", \nde d1 = "+d1+",de d2 = "+d2+" ,de surface = "
				+surface() +" et de perimetre = "+perimetre();
	}
	
}
