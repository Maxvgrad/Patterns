package org.study.utils;

public enum Role {
    ANONYMOUS("Anonymous"), KING("King"), KNIGHT("Knight"), TROLL("Troll");

    private String role;
    Role(String role) {
        this.role = role;
    }
    public String getRole() {
        return role;
    }
}
