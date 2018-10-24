package com.proto;

import org.junit.Before;
import org.junit.Test;

public class TestImportTest {

    TestImport testImport;
    @Before
    public void init() {
        testImport = new TestImport();
    }
    @Test
    public void searchM1() {
        testImport.searchM1();
    }

    @Test
    public void searchM2() {
        testImport.searchM2();
    }

    @Test
    public void searchM3() {
        testImport.searchM3();
    }
}