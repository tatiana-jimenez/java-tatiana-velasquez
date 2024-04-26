package com.citas.java;

import com.citas.java.entidades.CitaEnfermeroo;
import com.citas.java.entidades.CitaMedicoo;
import com.citas.java.entidades.Enfermero;
import com.citas.java.entidades.Estado;
import com.citas.java.entidades.Medicoo;
import com.citas.java.entidades.Paciente;
import com.citas.java.entidades.Persona;
import com.citas.java.entidades.ProcedimientosEnfermeria;
import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;
import java.time.LocalDateTime;
import java.time.Month;
public class Main {
    public static void main(String[] args) {
        //medicos
        Medicoo m = new Medicoo(1,
        "valentina",
        "jhoanna",
        TipoDocumento.TI, 
        "1021345656",
        "1034567823",
        Especialidad.CARDIOLOGIA
        );
        System.out.println("nombre: " + Persona.getNombres() );
        Medicoo n = new Medicoo(2,
        "johanna",
        "ortiz",
        TipoDocumento.CC, 
        "1023877831",
        "1086547512",
        Especialidad.PEDRIATRIA
        );
        System.out.println("nombre: " + m.getNombres() );
        //pacientes
        Paciente b = new Paciente(1, 
        "stiven",
         "penagos", 
         TipoDocumento.TI, 
         "1014667757L", 
         "sogramo123@gmail.com",
          "3134106936", 
          "10-10-2010", 
          "1.45", 
          "90", 
          TipoSangre.A, 
          "positivo");
          Paciente v = new Paciente(2, 
        "sebastian ",
         "lopez", 
         TipoDocumento.TI, 
         "2834834823L", 
         "soro123@gmail.com",
          "31233406936", 
          "07-10-2010", 
          "1.15", 
          "535", 
          TipoSangre.A, 
          "negativo");
          Paciente c = new Paciente(3, 
        "sofia",
         "paez", 
         TipoDocumento.TI, 
         "10142245757L", 
         "sog3@gmail.com",
          "3124506936", 
          "10-08-2010", 
          "1.35", 
          "80", 
          TipoSangre.AB, 
          "positivo");
          Paciente x = new Paciente(4, 
        "carlos",
         "rosas", 
         TipoDocumento.TI, 
         "1015367757L", 
         "ramo123@gmail.com",
          "10492382834", 
          "03-10-2010", 
          "1.45", 
          "50", 
          TipoSangre.B, 
          "positivo");
          Paciente z = new Paciente(5, 
        "hellen",
         "solares", 
         TipoDocumento.TI, 
         "10124567757L", 
         "somo123@gmail.com",
          "3054675674", 
          "10-12-2010", 
          "1.25", 
          "91", 
          TipoSangre.A, 
          "negativo");
        //enfermeros
        Enfermero e = new Enfermero(2,
        "sara",
        "salas",
        TipoDocumento.TI,
        "105410268");
        Enfermero a = new Enfermero(3,
        "heidy",
        "salazas",
        TipoDocumento.TI,
        "1053450268");
        Enfermero s = new Enfermero(4,
        "Alberto",
        "Ali",
        TipoDocumento.TI,
        "333410268");
//citamedico
        CitaMedicoo cm1= new CitaMedicoo(1, LocalDateTime.of(2024,Month.OCTOBER,3,13,20,00), "gripa", "sofia", Estado.AGENDADA); 
        System.out.println("estado de la cita "+ cm1.getEstado());
        cm1.cancelarCita();
        System.out.println("estado de la cita despues de cancelar "+ cm1.getEstado());
        
        CitaMedicoo cm2= new CitaMedicoo(1, LocalDateTime.of(2024,Month.OCTOBER,3,13,20,00), "escopolaminado","El papu", Estado.AGENDADA); 
        //System.out.println("estado de la cita"+ cm1.getEstado());
        //System.out.println(cm1);
        System.out.println(cm2);

        //citaenfermero
CitaEnfermeroo ce1=new CitaEnfermeroo(1,LocalDateTime.of(2024, Month.APRIL, 3, 12, 40, 00), ProcedimientosEnfermeria.VACUNACION, "tatiana");
    System.out.println(ce1);
    CitaEnfermeroo ce2=new CitaEnfermeroo(2,LocalDateTime.of(2023, Month.APRIL, 3, 12, 40, 00), ProcedimientosEnfermeria.AMBULATORIOS, "Alberto");
    System.out.println(ce2);}


    
}
