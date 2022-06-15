package TP5;

public class Ellipse extends Forme2D 
{
	Ellipse(String nom , float d1 , float d2)
	{
		super(nom,d1,d2);
	}
	float surface ()
	{
		return (float)(Math.PI*d1*d2) ; 
	}
	float perimetre()
	{
		return ((float)(Math.PI*Math.sqrt(2*Math.pow(d1, 2)*Math.pow(d2, 2)))) ;
	}
	
	public void affiche_forme() {
		System.out.println("Je suis un ellipse "+toString());
	}
}
