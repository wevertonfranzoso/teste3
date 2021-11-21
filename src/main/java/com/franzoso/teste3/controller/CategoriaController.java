package com.franzoso.teste3.controller;

import com.franzoso.teste3.domain.Categoria;
import com.franzoso.teste3.repository.CategoriaRepository;
import com.franzoso.teste3.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    public CategoriaService categoriaService;

    @PostMapping
    public Categoria salvar(@RequestBody Categoria categoria) {
        Categoria categoriaSalva = categoriaService.salvar(categoria);
        return categoria;

    }

    @GetMapping
    public List<Categoria> listar() {
     List<Categoria> categoriaListada = categoriaService.listar();
        return categoriaListada;

    }

    @PutMapping
    public Categoria editar(@RequestBody Categoria categoria) {
        Categoria categoriaEditada = categoriaService.editar(categoria);
        return categoria;

    }

    @GetMapping("/{id}")
    public Categoria buscar(@PathVariable Long id) {
    Categoria retorno = categoriaService.buscar(id);
        return retorno;

    }

    @DeleteMapping("/{id}")
    public Categoria excluir(@PathVariable Long id) {
        Categoria categoriaExcluida = categoriaService.excluir(id);
        return categoriaExcluida;

    }




}
