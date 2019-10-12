package com.cenfotec.test;

import com.cenfotec.logica.Fecha;

import static org.junit.jupiter.api.Assertions.*;

public class FechaTest {

    @org.junit.jupiter.api.Test
    void isLeapYear() {
        int year = 2020;
        Fecha nDate = new Fecha();
        assertTrue(nDate.isLeapYear(year));
    }

    @org.junit.jupiter.api.Test
    void isLeapYear2() {
        int year = 1600;
        Fecha nDate = new Fecha();
        assertTrue(nDate.isLeapYear(year));
    }

    @org.junit.jupiter.api.Test
    void isNotLeapYear() {
        int year = 2019;
        Fecha nDate = new Fecha();
        assertFalse(nDate.isLeapYear(year));
    }

    @org.junit.jupiter.api.Test
    void isNotLeapYear2() {
        int year = 1800;
        Fecha nDate = new Fecha();
        assertFalse(nDate.isLeapYear(year));
    }

    @org.junit.jupiter.api.Test
    void validate() {
        int year = 2019;
        int month = 2;
        int day = 29;
        Fecha Date = new Fecha();
        assertFalse(Date.validate(year, month, day));
    }

    @org.junit.jupiter.api.Test
    void validate1() {
        int year = 1600;
        int month = 2;
        int day = 29;
        Fecha Date = new Fecha();
        assertTrue(Date.validate(year, month, day));
    }

    @org.junit.jupiter.api.Test
    void validate2() {
        int year = 1600;
        int month = 6;
        int day = 30;
        Fecha Date = new Fecha();
        assertTrue(Date.validate(year, month, day));
    }

    @org.junit.jupiter.api.Test
    void validate3() {
        int year = 1600;
        int month = 6;
        int day = 31;
        Fecha Date = new Fecha();
        assertFalse(Date.validate(year, month, day));
    }
}