package com.catalogo.Auth.domain.product

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.EqualsAndHashCode
import lombok.Getter
import lombok.NoArgsConstructor

@Table(name = "product")
@Entity(name = "product")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = ["id"])
class Product(data: ProductRequestDTO) {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String? = null
    val name: String
    val price: Int

    init {
        price = data.price!!
        name = data.name.toString()
    }
}