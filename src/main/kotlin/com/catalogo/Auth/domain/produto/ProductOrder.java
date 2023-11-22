package com.catalogo.Auth.domain.produto;

import com.catalogo.Auth.domain.GenericEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_order")
public class ProductOrder extends GenericEntity {
    private String code;
    private String name;
    private Float price;
    private String description;
}
