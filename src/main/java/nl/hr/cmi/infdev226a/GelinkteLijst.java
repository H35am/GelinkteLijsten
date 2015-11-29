package nl.hr.cmi.infdev226a;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
public class GelinkteLijst {


    /**
     * Alleen de gelinkte lijst heeft toegang tot de node
     */
    private class Node {
        //Dit is de data die je opslaat
        Object data;

        // referenties naar de vorige en volgende nodes
        Node next, previous;
    }


    private Node first, last;
    private int size;


    public Object getFirst() {
        return first.data;
    }


    public Object getLast() {
        return last.data;
    }

    /**
     * Voeg toe aan de voorkant
     */
    public void insertFirst(Object o) {
        //Create a new node and set all its references
        Node newNode = new Node();
        newNode.data = o;
        newNode.next = first;
        newNode.previous = null;

        //if the list is not empty
        if (this.first != null) {
            //set the old first's previous to the newNode
            this.first.previous = newNode;
        } else {
            //list was empty, newNode will be the only node.
            //so also set the last
            this.last = newNode;
        }

        //set the head to the newNode
        this.first = newNode;
    }

    /**
     * Voeg toe aan de achterkant
     */
    public void insertLast(Object o) {
        Node newNode = new Node();
        newNode.data = o;
        newNode.next = null;
        newNode.previous = last;

        if (this.last != null) {
            this.last.next = newNode;
        } else {
            this.first = newNode;
        }
        this.last = newNode;
    }

    /**
     * Voeg toe voor een ander element
     */
    public void insertBefore(Object o, Object before) {
        Node newNode = new Node();
        newNode.data = o;


        /**
         * Opzoek naar de juiste node
         */
        if (first == null){
            System.out.println("Geen nodes in gelinktlijst!");
            return;
        }

        Node tempNode = first;
        while (tempNode.data != before) {
            if (tempNode.next == null){
                System.out.println("Before niet gevonden!");
                return;
            }
            tempNode = tempNode.next;
        }
        /**
         * als de nieuwe node voor de huidige eerste wordt gezet, ook 'first' updaten
         */
        if(tempNode == first)
        {
            first = newNode;
        }

        /**
         * Zetten op de juiste plek
         */
        newNode.next = tempNode;
        newNode.previous = tempNode.previous;
        tempNode.previous = newNode;


    }

    /**
     * Voeg toe na een ander element
     */
    public void insertAfter(Object o, Object after) {
        Node newNode = new Node();
        newNode.data = o;


        /**
         * Opzoek naar de juiste node
         */
        if (first == null){
            System.out.println("Geen nodes in gelinktlijst!");
            return;
        }

        Node tempNode = first;
        while (tempNode.data != after) {
            if (tempNode.next == null){
                System.out.println("after niet gevonden!");
                return;
            }
            tempNode = tempNode.next;
        }
        /**
         * als de nieuwe node voor de huidige eerste wordt gezet, ook 'first' updaten
         */
        if(tempNode == last)
        {
            last = newNode;
        }

        /**
         * Zetten op de juiste plek
         */
        newNode.next = tempNode;
        newNode.previous = tempNode.next;
        tempNode.next = newNode;

    }


    /**
     * Verwijder een element
     *
     * @param data
     */
    public void remove(Object data) {
        Node tempNode = first;
        while (tempNode.data != data) {
            if (tempNode.next == null){
                System.out.println("data niet gevonden!");
                return;
            }
            tempNode = tempNode.next;
        }

        if(tempNode == first){
            first.data = null;
            return;
        }

        tempNode.previous.next = tempNode.next;
        tempNode.next.previous = tempNode.previous;


    }

    /**
     * Het aantal elementen in de gelinkte lijst
     *
     * @return
     */
    public int getSize() {
        int size = 0;
        if(first != null){
            Node tempNode = first;
            size++;
            while (tempNode.next != null) {

                size++;
                tempNode = tempNode.next;
            }
        }
        return size;
    }
}
