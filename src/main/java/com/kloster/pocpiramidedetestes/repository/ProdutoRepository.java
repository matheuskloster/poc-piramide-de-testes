package com.kloster.pocpiramidedetestes.repository;

import com.kloster.pocpiramidedetestes.domain.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, Long> {

    Produto findByNome(String nome);

}
