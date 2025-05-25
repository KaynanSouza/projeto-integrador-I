package br.com.rocket.projeto_integrador.modules.products.entity;

import br.com.rocket.projeto_integrador.modules.user.entity.UserEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity(name = "produtos")
public class ProductsEntity {

    @Id
    private UUID id;

    @NotBlank
    private String name;
    private String description;

    @NotBlank
    private float price;

    @NotBlank
    private int stock;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private UserEntity userEntity;

    @Column(name = "user_id")
    private UUID userId;
}
