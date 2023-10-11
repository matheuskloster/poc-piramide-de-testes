package com.kloster.pocpiramidedetestes.integration;

import com.kloster.pocpiramidedetestes.domain.Produto;
import com.kloster.pocpiramidedetestes.repository.ProdutoRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ProdutoRepositoryIntegrationTest {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Test
    public void whenFindByNome_thenReturnProduto() {
        // Crie um objeto Produto e persista-o no banco de dados de teste.
        Produto produto = new Produto();
        produto.setId(1L);
        produto.setNome("Exemplo de Produto");
        produto.setPreco(99.99);
        produtoRepository.save(produto);

        // Realize a operação de consulta no repositório.
        Produto produtoEncontrado = produtoRepository.findByNome("Exemplo de Produto");

        // Verifique se o produto encontrado é igual ao produto criado.
        assertThat(produtoEncontrado.getNome()).isEqualTo(produto.getNome());
    }
}
