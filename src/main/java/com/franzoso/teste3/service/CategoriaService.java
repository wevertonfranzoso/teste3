package com.franzoso.teste3.service;

import com.franzoso.teste3.domain.Categoria;
import com.franzoso.teste3.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    public CategoriaRepository categoriaRepository;


    public Categoria salvar(Categoria categoria) {
        Categoria categoriaSalva = categoriaRepository.save(categoria);
        return categoria;

    }


    public List<Categoria> listar() {
        List<Categoria> categoriaListada = categoriaRepository.findAll();
        return categoriaListada;

    }


    public Categoria editar(Categoria categoria) {
        Categoria categoriaEditada = categoriaRepository.save(categoria);
        return categoria;

    }


    public Categoria buscar(Long id) {
        Optional<Categoria> categoriaEncontrada = categoriaRepository.findById(id);
        Categoria retorno = categoriaEncontrada.get();
        return retorno;

    }


    public Categoria excluir(Long id) {
        Optional<Categoria> categoriaExcluida = categoriaRepository.findById(id);
        categoriaRepository.delete(categoriaExcluida.get());
        Categoria resultado = categoriaExcluida.get();
        return resultado;

    }


}
