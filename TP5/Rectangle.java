package TP5;

public class Rectangle extends Forme2D
{
	Rectangle(String nom , float d1 , float d2)
	{
		super(nom,d1,d2);
	}
	float surface()
	{
		return d1*d2 ;
	}
	float perimetre ()
	{
		return (d1+d2)*2 ;
	}
	
	public void affiche_forme() {
		System.out.println("Je suis un rectangle "+toString());
	}
}
