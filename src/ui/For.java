package ui;

import java.util.Scanner;

public class For{

    public static int[] memoria;
    public static String[] memoriaCadenas;
    public static Scanner reader;

    public static void main(String[] args){

        inicializarGlobales();
        menu();   

    }

    /**
     * Descripcion: Inicializa las variables globales
     * pos: El arreglo memoria queda inicializado
     * pos: El arreglo memoriaCadenas queda inicializado
     * pos: El Scanner reader queda inicializado
     *   
     */
    public static void inicializarGlobales(){
        reader = new Scanner(System.in);
        memoria = new int[5];
        memoriaCadenas = new String[5];
    }

    /**
     * Descripcion: Despliega y gestiona el menu del usuario
     */

    public static void menu(){
         boolean salir = false;
        do{

            System.out.println("MENU PRINCIPAL\nSelecciona la funcionalidad a realizar"+ 
                                "\n1. Imprimir un arreglo de enteros"+
                                "\n2. Escribir en un arreglo de cadenas y luego imprimir su contenido"+
                                "\n3. Salir");
            int opcion = reader.nextInt();

            switch(opcion){

                case 1:
                    imprimirArregloWhile(memoria); 
                    System.out.println("\n\nVolviendo al MENU PRINCIPAL");
                    System.out.println("...");
                    break;
                
                case 2: 
                    solicitarInformacion();
                    imprimirArregloFor(memoriaCadenas);
                    System.out.println("\n\nVolviendo al MENU PRINCIPAL");
                    System.out.println("...");
                    break;

                case 3: 
                    System.out.println("Adios");
                    salir = true;
                    break;
            }
   
        }while(!salir);
    }


     /**
     * Descripcion: Solicita la informacion (cadena de texto) al usuario
     * pre: El arreglo no puede ser nulo || El arreglo debe estar inicializado
     *   
     */
    public static void solicitarInformacion(){
        
        reader.nextLine();    //Limpieza del buffer
        int i=0;

        do{

            System.out.println("Digite una palabra");
            String valor = reader.nextLine();

            escribirArreglo(valor);
            i++;

        }while(i<memoriaCadenas.length);

      
        
    }




    /**
     * Descripcion: Permite guardar una cadena en el arreglo
     * pre: El arreglo no puede ser nulo || El arreglo debe estar inicializado
     * pos: El arreglo queda modificado con nuevo valor
     * @param valor String Cadena que queremos guardar en el arreglo
     *  
     */
    public static void escribirArreglo(String valor){

        for(int i=0;i<memoriaCadenas.length;i++){
            if(memoriaCadenas[i]==null){
                memoriaCadenas[i]=valor; 
                break;
            }
        }


    }

   /**
     * Descripcion: Permite imprimir el contenido del arreglo pasado como parametro (usando for)
     * pre: El arreglo no puede ser nulo || El arreglo debe estar inicializado
     * @param arreglo String[] El arreglo que queremos imprimir
     *  
     */
    public static void imprimirArregloFor(String[] arreglo){

        for(int i=0;i<arreglo.length;i++){
            
           //System.out.print("Entra aqui: "+arreglo[0]);

           if(arreglo[i]!=null){

                if(i<arreglo.length-1){
                    System.out.print(arreglo[i]+" ");
                }else{
                    System.out.print(arreglo[i]);
                }
          }
        }
    }

   /**
     * Descripcion: Permite imprimir el contenido del arreglo pasado como parametro (usando while)
     * pre: El arreglo no puede ser nulo || El arreglo debe estar inicializado
     * @param arreglo int[] El arreglo que queremos imprimir
     *  
     */
    public static void imprimirArregloWhile(int[] arreglo){

        int i=0;

        while(i<arreglo.length){
            if(i<arreglo.length-1){
                System.out.print(arreglo[i]+" , ");
            }else{
                System.out.print(arreglo[i]);
            }
            
            i++;
        }

    }


}






    







