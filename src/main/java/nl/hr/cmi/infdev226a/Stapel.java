package nl.hr.cmi.infdev226a;

/**
 * De stapel, of eigenlijk 'Stack', is ook een 
 * klassieke datastructuur.
 * In [Hubbard, Hoofdstuk 5] wordt de Stack besproken. 
 * Niet te veel spieken, daar leert u immers minder van. 
 * 
 * In deze klasse implementeer je zelf een Stack, door alleen 
 * maar gebruik te maken van de opslag methode die de 
 * klasse GelinkteLijst je biedt. De Node komt in deze
 * klasse niet voor.
 */
public class Stapel {
	private GelinkteLijst lijst;
	
	public Stapel(){
		lijst = new GelinkteLijst();
	}
	
	/**
	 * Zet een object boven op de stapel
	 * @param object
	 */
    public void push(Object object){
		lijst.insertFirst(object);
	}
	
	/**
	 * Haalt het bovenste object van de stapel
	 * LIFO: Last-in, First-out
	 * @return het bovenste object
	 */
    public Object pop(){
		Object o = lijst.getFirst();
		lijst.remove(o);
		return o;
	}
	
	/**
	 * Geeft het bovenste object terug, maar 
	 * laat het op de stapel staan.
	 * @return
	 */
    public Object front(){
		return lijst.getFirst();
	}

	/**
	 * Geeft 'true' als er niks op de stapel ligt.
	 * @return
	 */
    public boolean isEmpty(){
		return lijst.getSize() == 0;
	}
}
