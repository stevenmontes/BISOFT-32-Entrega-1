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

    /**
     * Fecha del día siguiente
     */
    @org.junit.jupiter.api.Test
    void nextDay() {
        Fecha Date = new Fecha();
        assertEquals(Date.nextDay(2019, 10, 13), "2019-10-14");
    }

    /**
     * Fecha del día siguiente
     * Valida que el resultado sea el primero del primer mes del siguiente año
     */
    @org.junit.jupiter.api.Test
    void nextDay3() {
        Fecha Date = new Fecha();
        assertEquals(Date.nextDay(2019, 12, 31), "2020-1-1");
    }

    /**
     * Fecha del día siguiente
     * Valida que el resultado sea el primero del siguiente mes
     */
    @org.junit.jupiter.api.Test
    void nextDay2() {
        Fecha Date = new Fecha();
        assertEquals(Date.nextDay(2019, 10, 31), "2019-11-1");
    }


    /**
     * Una fecha que cae en día Lunes
     */
    @org.junit.jupiter.api.Test
    void isMonday() {
        Fecha Date = new Fecha();
        assertEquals(Date.weekDay(1870, 11, 7), "Lunes");
    }

    /**
     * Una fecha que cae en día Lunes
     */
    @org.junit.jupiter.api.Test
    void isMonday2() {
        Fecha Date = new Fecha();
        assertEquals(Date.weekDay(2019, 10, 14), "Lunes");
    }

    /**
     * Una fecha que cae en día Martes
     */
    @org.junit.jupiter.api.Test
    void isTuesday() {
        Fecha Date = new Fecha();
        assertEquals(Date.weekDay(1848, 11, 7), "Martes");
    }

    /**
     * Una fecha que cae en día Martes
     */
    @org.junit.jupiter.api.Test
    void isTuesday2() {
        Fecha Date = new Fecha();
        assertEquals(Date.weekDay(2019, 10, 15), "Martes");
    }

    /**
     * Una fecha que cae en día Miércoles
     */
    @org.junit.jupiter.api.Test
    void isWednesday() {
        Fecha Date = new Fecha();
        assertEquals(Date.weekDay(1827, 11, 7), "Miércoles");
    }

    /**
     * Una fecha que cae en día Miércoles
     */
    @org.junit.jupiter.api.Test
    void isWednesday2() {
        Fecha Date = new Fecha();
        assertEquals(Date.weekDay(2019, 10, 16), "Miércoles");
    }

    /**
     * Una fecha que cae en día Jueves
     */
    @org.junit.jupiter.api.Test
    void isThursday() {
        Fecha Date = new Fecha();
        assertEquals(Date.weekDay(1805, 11, 7), "Jueves");
    }

    /**
     * Una fecha que cae en día Jueves
     */
    @org.junit.jupiter.api.Test
    void isThursday2() {
        Fecha Date = new Fecha();
        assertEquals(Date.weekDay(2019, 10, 17), "Jueves");
    }

    /**
     * Una fecha que cae en día Viernes
     */
    @org.junit.jupiter.api.Test
    void isFriday() {
        Fecha Date = new Fecha();
        assertEquals(Date.weekDay(1794, 11, 7), "Viernes");
    }

    /**
     * Una fecha que cae en día Viernes
     */
    @org.junit.jupiter.api.Test
    void isFriday2() {
        Fecha Date = new Fecha();
        assertEquals(Date.weekDay(2019, 10, 18), "Viernes");
    }

    /**
     * Una fecha que cae en día Sábado
     */
    @org.junit.jupiter.api.Test
    void isSaturday() {
        Fecha Date = new Fecha();
        assertEquals(Date.weekDay(1767, 11, 7), "Sábado");
    }

    /**
     * Una fecha que cae en día Sábado
     */
    @org.junit.jupiter.api.Test
    void isSaturday2() {
        Fecha Date = new Fecha();
        assertEquals(Date.weekDay(2019, 10, 19), "Sábado");
    }

    /**
     * Una fecha que cae en día Domingo
     */
    @org.junit.jupiter.api.Test
    void isSunday() {
        Fecha Date = new Fecha();
        assertEquals(Date.weekDay(1700, 11, 7), "Domingo");
    }

    /**
     * Una fecha que cae en día Domingo
     */
    @org.junit.jupiter.api.Test
    void isSunday2() {
        Fecha Date = new Fecha();
        assertEquals(Date.weekDay(2019, 10, 20), "Domingo");
    }
}
