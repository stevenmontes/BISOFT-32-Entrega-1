package com.cenfotec.test;

import com.cenfotec.logica.Fecha;

import static org.junit.jupiter.api.Assertions.*;

public class FechaTest {

    /**
     * Anos bisiestos son divisibles entre 400, o divisibles entre 4 pero no entre 100.
     * 2020 es divisible entre 4 pero no entre 100.
     */
    @org.junit.jupiter.api.Test
    void isLeapYear() {
        Fecha nDate = new Fecha();
        assertTrue(nDate.isLeapYear(2020));
    }

    /**
     * 1600 es divisible entre 400.
     */
    @org.junit.jupiter.api.Test
    void isLeapYear2() {
        Fecha nDate = new Fecha();
        assertTrue(nDate.isLeapYear(1600));
    }

    /**
     * 2019 no es divisible entre 400, por lo tanto no es bisiesto
     */
    @org.junit.jupiter.api.Test
    void isNotLeapYear() {
        Fecha nDate = new Fecha();
        assertFalse(nDate.isLeapYear(2019));
    }

    /**
     *  1800 es divisible entre 4 y 100, por lo tanto no es bisiesto.
     */
    @org.junit.jupiter.api.Test
    void isNotLeapYear2() {
        Fecha nDate = new Fecha();
        assertFalse(nDate.isLeapYear(1800));
    }

    @org.junit.jupiter.api.Test
    void validate() {
        Fecha Date = new Fecha();
        assertFalse(Date.validate(2019, 2, 29));
    }

    @org.junit.jupiter.api.Test
    void validate1() {
        Fecha Date = new Fecha();
        assertTrue(Date.validate(1600, 2, 29));
    }

    /**
     * Valida que la fecha acepta el dia 30.
     */
    @org.junit.jupiter.api.Test
    void validate2() {
        Fecha Date = new Fecha();
        assertTrue(Date.validate(1600, 6, 30));
    }

    /**
     * Una fecha de mes 6 tiene maximo 30 dias.
     * Valida que no se pase del dia maximo del mes 6
     */
    @org.junit.jupiter.api.Test
    void validate3() {
        Fecha Date = new Fecha();
        assertFalse(Date.validate(1600, 6, 31));
    }
}