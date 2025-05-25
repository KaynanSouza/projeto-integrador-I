package br.com.rocket.projeto_integrador.modules.products.useCases;

import br.com.rocket.projeto_integrador.modules.products.entity.ProductsEntity;
import br.com.rocket.projeto_integrador.modules.products.repository.ProductRepository;
import br.com.rocket.projeto_integrador.modules.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateProductUseCase {

    @Autowired
    private ProductRepository productRepository;

    public ProductsEntity create(ProductsEntity productsEntity) {
        return this.productRepository.save(productsEntity);
    }
}
