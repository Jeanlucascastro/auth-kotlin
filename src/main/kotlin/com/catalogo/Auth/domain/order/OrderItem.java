package com.catalogo.Auth.domain.order;

import com.catalogo.Auth.domain.GenericEntity;
import com.catalogo.Auth.domain.produto.ProductOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "order_item")
public class OrderItem extends GenericEntity {
    @ManyToOne
    @JoinColumn(name = "order_requested_id")
    private OrderRequested orderRequested;

    @ManyToOne
    @JoinColumn(name = "product_order_id")
    private ProductOrder product;

    private int quantity;
}
