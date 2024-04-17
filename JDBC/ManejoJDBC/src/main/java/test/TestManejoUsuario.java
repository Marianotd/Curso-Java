package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuario {

    public static void main(String[] args) {
        UsuarioJDBC usuarioDao = new UsuarioJDBC();

        // Insertando un nuevo objeto de tipo Usuario
//        Usuario usuarioNuevo = new Usuario("carlos.juarez", "123");
//        usuarioDao.insertar(usuarioNuevo);

        // Modificar un objeto de usuario existente
//        Usuario usuarioModificar = new Usuario(3, "carlos.juarez", "456");
//        usuarioDao.actualizar(usuarioModificar);
        
        // Elimianr un registro
        usuarioDao.eliminar(new Usuario(3));

        List<Usuario> usuarios = usuarioDao.select();
        usuarios.forEach(usuario -> {
            System.out.println("usuario = " + usuario);
        });
    }
}
