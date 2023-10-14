package com.catalogo.Auth.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
