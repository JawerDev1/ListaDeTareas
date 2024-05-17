package com.proyecto3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    ArrayList<String> lista;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tarea tarea = new Tarea(sc);

        while (true){
            System.out.println("MENU");
            System.out.println("[1]. Agregar tarea");
            System.out.println("[2]. Editar tarea");
            System.out.println("[3]. Eliminar tarea");
            System.out.println("[4]. Marcar tarea como completada");
            System.out.println("[5]. Ver lista de tareas");
            System.out.println("[0]. Salir");

            System.out.println("Ingresa una opcion del (1 - 5) o (0 para salir del programa): ");
            int opcion = sc.nextInt();
            sc.nextLine(); //consume el salto de linea
            switch (opcion){
                case 0:
                    System.out.println("Adios!");
                    System.exit(0);
                case 1:
                    tarea.agregarTarea();
                    break;
                case 2:
                    tarea.mostrarTareas();
                    tarea.editarTarea();
                    break;
                case 3:
                    tarea.mostrarTareas();
                    tarea.eliminarTarea();
                    break;
                case 4:
                    tarea.mostrarTareas();
                    tarea.marcarTareaComoCompletada();
                    break;
                case 5:
                    tarea.mostrarTareas();
                    break;
                default:
                    System.out.println("Opcion invalida, intenta de nuevo \n");
            }
        }
    }
}
