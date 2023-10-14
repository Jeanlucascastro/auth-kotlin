package com.catalogo.Auth.domain.product

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

@JvmRecord
data class ProductRequestDTO(val name: @NotBlank String?, val price: @NotNull Int?)
