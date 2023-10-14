package com.catalogo.Auth.domain.product

@JvmRecord
data class ProductResponseDTO(val id: String, val name: String, val price: Int) {
    constructor(product: Product) : this(product.id!!, product.name, product.price)
}

