package com.wanfadger.todo.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.wanfadger.todo.TodoGwtpRestDispatch";
    }

    public void testSandbox() {
        assertTrue(true);
    }
}