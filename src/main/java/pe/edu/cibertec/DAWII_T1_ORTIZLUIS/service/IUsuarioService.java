package pe.edu.cibertec.DAWII_T1_ORTIZLUIS.service;

import pe.edu.cibertec.DAWII_T1_ORTIZLUIS.model.bd.Usuario;

import java.util.List;

public interface IUsuarioService {
    Usuario buscarUsuarioXNomUsuario(String nomusuario);
    Usuario guardarUsuario(Usuario usuario);
    void actualizarUsuario(Usuario usuario);
    List<Usuario> listarUsuario();
    Usuario buscarUsuarioXIdUsuario(Integer idusuario);
}
