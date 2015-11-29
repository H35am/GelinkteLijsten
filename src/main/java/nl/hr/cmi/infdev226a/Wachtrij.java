package nl.hr.cmi.infdev226a;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Een wachtrij (queue) werkt via het 
 * first-in first-out principe; elementen worden toegevoegd 
 * aan de achterkant en worden verwijderd aan de voorkant.
 * 
 * In deze klasse implementeer je een Queue door alleen 
 * maar gebruik te maken van de opslagmethode die de 
 * klasse GelinkteLijst je biedt. De Node komt niet voor in deze klasse!
 * 
 * In [Hubbard, hoofdstuk 6] wordt de Queue besproken.
 *
 */
public class Wachtrij{
	
	private GelinkteLijst lijst;
	
	public Wachtrij(){
		lijst = new GelinkteLijst();
	}
	
	/**
	 * Zet iets in de wachtrij
	 * aan de achterkant: FIFO
	 */
	public void enqueue(Object o){
		lijst.insertLast(o);
	}
	
	/**
	 * Haal iets van de wachtrij
	 * Aan de voorkant: FIFO
	 */
	public Object dequeue(){
		Object o = lijst.getFirst();
		lijst.remove(o);
		return o;
	}
	
	/**
	 * Het aantal elementen in de wachtrij
	 * @return
	 */
	public int size(){return lijst.getSize();}
	
	/**
	 * Is de lijst leeg?
	 * @return
	 */
	public boolean isEmpty(){return lijst.getSize() == 0;}
	
	/**
	 * Bekijk het eerste element in de wachtrij, 
	 * maar haalt het niet er vanaf. 
	 * Note: het eerste element is als eerste toegevoegd.
	 * @return
	 */
	public Object front(){
		return lijst.getFirst();
	}
}
