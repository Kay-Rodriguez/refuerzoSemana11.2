import javax.swing.*;
import java.awt.*;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       // ------------------------------------------------------------------------------------
        /*
         Profesor profesor1=new Profesor();
         profesor1.setCedula("123456789");
         profesor1.setNombre_completo("Jorge");
         profesor1.setEdad(40);
         profesor1.setDireccion("calle buena vida");
         profesor1.setTelefono("000000000");
         profesor1.setCorreo("americadchivas@gmail.com");
         profesor1.setMaterias_dictadas("matematicas");
         profesor1.setTipo_contrato("eventual");
         profesor1.setFacultad("SISTEMAS");
         profesor1.mostrarDatos();
        */
        // para instanciar la interfaz grafica

        JFrame frame = new JFrame("----------------- ESFOT -----------------");
        frame.setContentPane( new form1().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setPreferredSize(new Dimension(800, 600));
        // empaqueta todos lo documentos
        frame.pack();
        frame.setVisible(true);
        // para poner el color a nuestro gusto




    }
}

//no puiedo utiliza el this en esta parte parque sino estara llamando asi mismo
/*
ComunidadEPN miembroepn1=new ComunidadEPN();
        miembroepn1.setCedula("123456789");
        miembroepn1.setNombre_completo("Luis Oña");
        miembroepn1.setEdad(18);
        miembroepn1.setDireccion("calle buena esperanza");
        miembroepn1.setTelefono("123456789000");
        miembroepn1.setCorreo("zoonjluis@gmail.com");

        miembroepn1.mostrarDatos();
       */