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
public class ListaDobleEnlzada {

    private int lenght;
    private ListaDoblementeEnlazada raiz;
    private ListaDoblementeEnlazada cabeza;

    public ListaDobleEnlzada() {
        this.lenght = 0;
        this.cabeza = null;
        this.raiz = null;
    }

    public ListaDoblementeEnlazada getRaiz() {
        return raiz;
    }

    public ListaDoblementeEnlazada getCabeza() {
        return cabeza;
    }

    public int getLenght() {
        return lenght;
    }

    public boolean isEmty() {
        return (raiz == null);
    }
/**
 * 
 * @param dato de tipo Object para mayor felxibilidad, sera insertado al inicio de la lista
 */
    public void insertToBeginning(Object dato) {

        ListaDoblementeEnlazada nodoNuevo = new ListaDoblementeEnlazada(dato);

        if (isEmty()) {

            lenght++;
            cabeza = nodoNuevo;
            raiz = cabeza;
            raiz.setNext(cabeza);
            raiz.setBack(cabeza);

        } else {

            lenght++;

            nodoNuevo.setNext(raiz);
            raiz.setBack(nodoNuevo);
            raiz = nodoNuevo;

            raiz.setBack(cabeza);
            cabeza.setNext(raiz);
        }
        cabeza.setNext(raiz);
        raiz.setBack(cabeza);
    }
    /**
     * 
     * @param dato es de tipo Object, para mayor flexibilidad, el objeto sera insertado al final de la lista
     */

    public void insertToTheEnd(Object dato) {

        ListaDoblementeEnlazada nodoNuevo = new ListaDoblementeEnlazada(dato);
        // si esta bacia, se iguala la raiz y la cabeza al nuevoNodo
        if (isEmty()) {

            lenght++;
            raiz = nodoNuevo;
            cabeza = raiz;
            raiz.setNext(cabeza);
            raiz.setBack(cabeza);

        } else {

            lenght++;
            nodoNuevo.setBack(cabeza);
            nodoNuevo.setNext(cabeza);
            cabeza.setNext(nodoNuevo);
            cabeza = nodoNuevo;

        }
        cabeza.setNext(raiz);
        raiz.setBack(cabeza);
    }
/**
 * este metodo se encarga de listar los datos de la lista desde el inicio
 */
    public void listarDesdeElInicio() {

        if (!isEmty()) {
            ListaDoblementeEnlazada aux = raiz;
            int iterator = 0;
            do {
                iterator++;
                System.out.println(iterator + " Dato: " + aux.getDato());
                aux = aux.getNext();
            } while (aux != cabeza.getNext());
        } else {
            System.out.println("Lista vacia");
        }
    }
/**
 * Este metodo lista los datos de la lista desde el final al inicio
 */
    public void listarDesdeElFinal() {

        if (!isEmty()) {
            ListaDoblementeEnlazada aux = cabeza;
            int iterator = 0;

            do {
                iterator++;
                System.out.println(iterator + " Dato: " + aux.getDato());
                aux = aux.getBack();
            } while (aux != cabeza);
        } else {
            System.out.println("Lista vacia");
        }
    }
/**
 * borra toda la lista
 */
    public void delte() {
        this.cabeza = this.raiz = null;
    }
/**
 * 
 * @param dato el nuevo objeto a agregar
 * @param nodo el nodo anterior al nuevo nodo a crear 
 */
    public void insertEntreDosNodos(Object dato, ListaDoblementeEnlazada nodo) {

        if (nodo != null) {
            ListaDoblementeEnlazada nodoNuevo = new ListaDoblementeEnlazada(dato);

            nodoNuevo.setNext(nodo.getNext());
            nodo.getNext().setBack(nodoNuevo);
            nodoNuevo.setBack(nodo);
            nodo.setNext(nodoNuevo);

        } else {
            System.out.println("No se encotro el nodo");
        }
    }
/***
 * 
 * @param dato es un datos de tipo Object, que sera el dato a buscar en la lista
 * @return un dato de tipo ListaDoblementeEnlazada que es un nodo que contiene el dato encontrado
 */
    public ListaDoblementeEnlazada buscarNodo(Object dato) {

        if (!isEmty()) {
            ListaDoblementeEnlazada aux = cabeza;
            do {
                if (dato.equals(aux.getDato())) {
                    return aux;
                }
                aux = aux.getBack();
            } while (aux != cabeza);
        } else {
            return null;
        }
        return null;
    }
}
