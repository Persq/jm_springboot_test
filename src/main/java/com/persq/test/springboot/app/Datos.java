package com.persq.test.springboot.app;

import com.persq.test.springboot.app.models.Banco;
import com.persq.test.springboot.app.models.Cuenta;

import java.math.BigDecimal;

public class Datos {
    public static Cuenta crearCuenta001() {
        return new Cuenta(1L, "Andrés", new BigDecimal("1000"));
    }

    public static Cuenta crearCuenta002() {
        return new Cuenta(2L, "Jhon", new BigDecimal("2000"));
    }

    public static Banco crearBanco() {
        return new Banco(1L, "El banco financiero", 0);
    }
}
