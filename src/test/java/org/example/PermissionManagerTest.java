package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermissionManagerTest {

    @Test
    void setmCurrentLevel() {
        PermissionManager pManager = new PermissionManager();
        PermissionLevel initialLevel = pManager.getmCurrentLevel();
        pManager.setmCurrentLevel(PermissionLevel.DEVELOPER);
        PermissionLevel afterSetLevel = pManager.getmCurrentLevel();
        assertEquals(PermissionLevel.USER, initialLevel);
        assertEquals(PermissionLevel.DEVELOPER, afterSetLevel);
    }

    @Test
    void getLevelNameFromEnum() {
        PermissionManager pManager = new PermissionManager();
        assertEquals("User",pManager.getLevelNameFromEnum(PermissionLevel.USER));
    }
}