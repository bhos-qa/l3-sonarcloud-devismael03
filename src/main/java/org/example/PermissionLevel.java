package org.example;

public enum PermissionLevel {
    ADMIN("Admin"),
    DEVELOPER("Developer"),
    USER("User");

    private String _permissionLevelName;
    private PermissionLevel(String permissionLevelName) {
        this._permissionLevelName = permissionLevelName;
    }

    @Override
    public String toString(){
        return this._permissionLevelName;
    }
}
