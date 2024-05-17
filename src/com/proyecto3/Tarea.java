package com.proyecto3;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea {

    //Creacion de atributos
    private ArrayList<ListaDeTarea> tareas; //Va a contener una lista de todas las tareas con su repectivo nombre y si esta completada o
    // no por eso es lo estamos guardando en un ArrayList y la referencia es tareas

    private  Scanner sc; // Tambien se esta creando una referecnia de la clase Scanner porque queremos
    // usar ese input

    // en el constructor le estamos pasando una referencia de la clase scaner y
    // que la tareas va hacer un nuevo ArrayList del tipo ListaDeTarea cada que vez que
    // creamos un nuevo objeto de la clase Tarea se creara un ArrayList automaticamente y
    // ademas el input que le estamos pasando va haver e¿igual a la variable de instancia.
    public Tarea(Scanner sc) {
        tareas = new ArrayList<ListaDeTarea>();
        this.sc = sc;
    }

    //Metodos

    // En el primer metodo [mostrarTarea()] vamos a mostrar todas las tareas que esten disponibles. pero antes de
    // mostrar la lista de tarea primero se tiene que realizar una condicion en donde la lista debe ser mayor a 0
    // porque si es igual eso quiere decir que no hay tareas para mostrar. pero si es lo contrario mostrara todas
    // las tareas que esten en el programa.

    public void mostrarTareas(){
        if (tareas.size() == 0){
            System.out.println("No hay tareas en la lista");
        }else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println(i + ". " + tareas.get(i).toString());
            }
        }
    }

    //Con el siguiente metodo [agregarTarea()] lo que vamos a realizar es agregar una nueva tarea, se le va a pedir
    // al usuario que ingrese la tarea que desea agregar, despues se creara un objeto de la clase (ListaDeTarea)
    // en donde va a verificar que contiene el constructor para poder agregarla y se le pasa como parametro la tarea
    // que ingreso el usuario. para poder agregarla se utiliza el metodo [add()] que nos ayuda agregar la tarea a
    // la lista y se le pasa como parametro la variable del nuevo objeto que se creeo.

    public void agregarTarea(){
        System.out.println("Ingrese el nombre de la tarea: ");
        Scanner sc = new Scanner(System.in);
        String descripcion = sc.nextLine();
        ListaDeTarea listaDeTarea = new ListaDeTarea(descripcion);
        tareas.add(listaDeTarea);
        System.out.println("Tarea agregada correctamente.");

    }

    //Con el siguiente metodo [editarTarea()] vamos a editar una tarea por medio del indice que ingrese el usuario
    // Antes de editar una tarea, lo que vamos hacer es una condicion en donde se va a verificar si el indice
    // de la tarea esta en el rango es decir: "Si esta en el rango entre 0 y la longitud del ArrayList", despues de
    // verificar si el indice de la tarea que desea modificar se encuentra, se le preguntara al usuario que ingrese
    // el nuevo nombre de la tarea y se deben de llamar como el objeto de listaDeTarea y pasarle el indice que ingreso
    // el usuario, tambien se llaman metodos como [setNombre()] que nos ayuda a modificar el nombre de la tarea
    // que teniamos anteriormente y como parametro se le debe de pasar la variable que la nueva tarea que ingreso
    // el usuario.

    public void editarTarea(){
        System.out.println("Ingrese el indice que desea editar: ");
        int indice = sc.nextInt();
        sc.nextLine(); //consume el salto de linea

        if (indice >= 0 && indice < tareas.size()){
            System.out.println("Ingrese el nuevo nombre de la tarea: ");
            String nuevaDescripcion = sc.nextLine();
            ListaDeTarea listaDeTarea = tareas.get(indice);
            listaDeTarea.setNombre(nuevaDescripcion);
            System.out.println("Tarea editada correctamente.");
        }else {
            System.out.println("El indice es incorrecto.");
        }
    }

    //Con el siguiente metodo lo que vamos hacer es eliminar dicha tarea por medio del indice que ingrese el usuario
    //Lo vamos a realizar con el metodo remove(), pero antes de utilizarlo debemos verificar o realizar una codicion
    //En donde se va a verificar si el indice de la tarea se encuentra o no.

    public void eliminarTarea(){
        System.out.println("Ingrese el indice de la tarea que desea eliminar: ");
        int indice = sc.nextInt();
        if (indice >= 0 && indice < tareas.size()){
            tareas.remove(indice);
            System.out.println("Tarea eliminada correctamente.");
        }else {
            System.out.println("El indice es incorrecto.");
        }
    }

    public void marcarTareaComoCompletada(){
        System.out.println("Escribe el indice de la tarea que quieres marcar como completada: ");
        int indice = sc.nextInt();
        sc.nextLine();
        if (indice >= 0 && indice < tareas.size()){
            ListaDeTarea listaDeTarea = tareas.get(indice);
            listaDeTarea.setCompletada(true);
            System.out.println("Tarea marcada como completada. ");
        }else {
            System.out.println("Indice invalido. ");
        }
    }

}
