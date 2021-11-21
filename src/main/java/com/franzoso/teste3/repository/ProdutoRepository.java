package com.franzoso.teste3.repository;

import com.franzoso.teste3.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
