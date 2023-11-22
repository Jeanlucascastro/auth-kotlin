package com.catalogo.Auth.domain.order;

import com.catalogo.Auth.domain.GenericEntity;
import com.catalogo.Auth.domain.produto.ProductOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_order")
public class Order extends GenericEntity {
    private String code;
    private Date dataHora;
    private Long table;
    private List<ProductOrder> product;
}
