package com.arquitetura.architecturemanagement.domain.user.Enum;

public enum Role {
    ARCHITECT("architect"),
    CLIENT("client");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole(){
        return this.role;
    }
}
