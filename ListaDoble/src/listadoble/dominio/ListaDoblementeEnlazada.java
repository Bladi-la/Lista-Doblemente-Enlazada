/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble.dominio;

/**
 *
 * @author Bladimir
 */
public class ListaDoblementeEnlazada {

    private ListaDoblementeEnlazada next;
    private ListaDoblementeEnlazada back;
    private Object dato;

    public ListaDoblementeEnlazada() {

        this.next = null;
        this.back = null;
        this.dato = null;
    }


    public ListaDoblementeEnlazada(Object dato) {
        this.dato = dato;
    }

    public ListaDoblementeEnlazada(ListaDoblementeEnlazada next, ListaDoblementeEnlazada back) {
        this.back = back;
        this.next = next;
    }

    public ListaDoblementeEnlazada getNext() {
        return next;
    }

    public void setNext(ListaDoblementeEnlazada next) {
        this.next = next;
    }

    public ListaDoblementeEnlazada getBack() {
        return back;
    }

    public void setBack(ListaDoblementeEnlazada back) {
        this.back = back;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
    @Override
    public String toString(){
        return dato.toString()+"\n";
    }

}
