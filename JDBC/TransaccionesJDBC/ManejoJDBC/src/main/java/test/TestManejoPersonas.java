package test;

import datos.*;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class TestManejoPersonas {

    public static void main(String[] args) {
//        PersonaJDBC personaDao = new PersonaJDBC();
//
//        // Insertando un nuevo objeto de tipo Persona
////        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "55446688");
////        personaDao.insertar(personaNueva);
//
//        // Modificar un objeto de persona existente
////        Persona personaModificar = new Persona(4, "Juan Carlos", "Esparza", "jcesparza@mail.com", "55446688");
////        personaDao.actualizar(personaModificar);
//
//        // Elimianr un registro
////        Persona personaEliminar = new Persona(4);
////        personaDao.eliminar(personaEliminar);
//
//        List<Persona> personas = personaDao.seleccionar();
//        personas.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });

        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaJDBC personaJdbc = new PersonaJDBC(conexion);

            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Karla Ivonne");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("kgomez@mail.com");
            cambioPersona.setTelefono("5566881133");
            personaJdbc.actualizar(cambioPersona);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
//            nuevaPersona.setApellido("Ramirez11111111111111111111111111111111111111111111111111111111111111");
            nuevaPersona.setApellido("Ramirez");
            personaJdbc.insertar(nuevaPersona);

            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex.printStackTrace(System.out);
            }
        }

    }
}
