/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble;

import listadoble.dominio.ListaDobleEnlzada;
import listadoble.dominio.ListaDoblementeEnlazada;

/**
 *
 * @author Bladimir
 */
public class ListaDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ListaDobleEnlzada ld = new ListaDobleEnlzada();

        System.out.println("Longitud de la lista: " + ld.getLenght());

        ld.insertToTheEnd("Mi nombre es Bladimir");
        ld.insertToTheEnd("Fui a la univeridad, mas no la termine");
        ld.insertToTheEnd("Tengo un deseo de ser programador fullstack en Java");
        ld.insertToTheEnd("Aprendi un poco de estructuras de datos el la U");
        ld.insertToTheEnd("Y tenia muchos decesos de volver a programar");
        ld.insertToTheEnd("Creo que he recordado como se implementan las listas doblemente enlazadas ");

        System.out.println("Logitud de la lista despues de insertar: " + ld.getLenght());

        System.out.println("\n\nListando la lista desde el inicio\n");
        ld.listarDesdeElInicio();
        System.out.println("\n\nListando la lista desde el final\n");
        ld.listarDesdeElFinal();

        System.out.println("\n\nBuscando objetos");
        ListaDoblementeEnlazada lde = ld.buscarNodo("Vive en Meanguera");
        System.out.println("Buscar a: " + lde.getDato());

        //insertar entre dos nodos de la lista
        ld.insertEntreDosNodos("Nodo nuevo", lde);
        lde = ld.buscarNodo("El nombre de mi mama es Luisa");
        ld.insertEntreDosNodos("-------Datos de mi mama--------" , lde);
        
        System.out.println("\nValor de nodo raiz siguiente "+ld.getRaiz().getNext());
        System.out.println("\nValor de nodo cabeza siguiente "+ld.getCabeza().getNext());
         System.out.println("\nValor de nodo raiz "+ld.getRaiz());
        System.out.println("\nValor de nodo cabeza "+ld.getCabeza());
        System.out.println("\n\nListando la lista desde el INICIO despues de insertar entre dos nodos\n");
        ld.listarDesdeElInicio();
        System.out.println("\n\nListando la lista desde el FINAL despues de insertar entre dos nodos\n");
        ld.listarDesdeElFinal();

    }

}
