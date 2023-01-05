package com.proyectoisw.salvavaro.dao;

import com.proyectoisw.salvavaro.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

    //Elementos necesarios para realizar consultas
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query="FROM Usuario"; //Se refiere a la clase
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void registrar(Usuario usuario) {
        entityManager.merge(usuario);

    }
}
