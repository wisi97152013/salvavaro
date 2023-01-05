package com.proyectoisw.salvavaro.dao;

import com.proyectoisw.salvavaro.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void registrar(Usuario usuario);
}
