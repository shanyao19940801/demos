package com.test;

import org.junit.Before;
import org.junit.Test;
import org.unitils.spring.annotation.SpringBeanByType;

import static org.junit.Assert.*;

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