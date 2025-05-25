package br.com.rocket.projeto_integrador.modules.products.controller;

import br.com.rocket.projeto_integrador.modules.products.entity.ProductsEntity;
import br.com.rocket.projeto_integrador.modules.products.useCases.CreateProductUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private CreateProductUseCase createProductUseCase;

    @PostMapping("/")
    public ProductsEntity create(@Valid @RequestBody ProductsEntity productsEntity) {
        return this.createProductUseCase.create(productsEntity);
    }
}
