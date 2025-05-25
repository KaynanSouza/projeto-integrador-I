package br.com.rocket.projeto_integrador.modules.products.repository;

import br.com.rocket.projeto_integrador.modules.products.entity.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductsEntity, UUID> {
}
