
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jovanadiaz
 */
public abstract class ClasePadre {
int c=0;
String nombre;
String artista;
String genero;
String album;
int age;
    public ClasePadre() {

    }

    public void PedirNombre() {
        System.out.println("Ingresa el nombre de la canción");
        Scanner s = new Scanner(System.in);
        nombre = s.nextLine();
    }

    public void PedirArtista() {
        System.out.println("Ingresa el nombre del artista");
        Scanner s = new Scanner(System.in);
        artista = s.nextLine();
    }

    public void PedirGenero() {
        System.out.println("Ingresa el nombre del genero");
        Scanner s = new Scanner(System.in);
        genero = s.nextLine();
    }

    public void PedirAlbum() {
        System.out.println("Ingresa el nombre del album");
        Scanner s = new Scanner(System.in);
        album = s.nextLine();
    }

    public void PedirAge() {
        System.out.println("Ingresa el año");
        Scanner s = new Scanner(System.in);
        age= s.nextInt();
    }
    
    public void MostrarDatos(){
    System.out.println("La cancion introducida fue: "+ nombre
            + "El artista introducido fue: "+ artista
            + "El genero introducido fue: "+genero
            + "El album introducido fue:"+album 
            + "El año ingresado fue: "+age);
    
    }
 
    
}
