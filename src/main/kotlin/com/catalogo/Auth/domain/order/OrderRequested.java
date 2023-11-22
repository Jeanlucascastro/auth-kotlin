package com.catalogo.Auth.domain.order;

import com.catalogo.Auth.domain.GenericEntity;
import jakarta.persistence.*;
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
@Table(name = "order_requested")
public class OrderRequested extends GenericEntity {
    private String code;
    private Date dataHora;
    private Long tableNumber;
    @OneToMany(mappedBy = "orderRequested")
    private List<OrderItem> items;
}
