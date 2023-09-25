package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel;

    public PermissionManager() {
        mCurrentLevel = PermissionLevel.USER;
    }

    public void setmCurrentLevel(PermissionLevel permissionLevel){
        mCurrentLevel = permissionLevel;
    }

    public PermissionLevel getmCurrentLevel(){
        return this.mCurrentLevel;
    }

    public String getLevelNameFromEnum(PermissionLevel permissionLevel){
        return permissionLevel.toString();
    }
}
