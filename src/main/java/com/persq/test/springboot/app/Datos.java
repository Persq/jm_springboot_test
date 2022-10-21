package com.persq.test.springboot.app;

import com.persq.test.springboot.app.models.Banco;
import com.persq.test.springboot.app.models.Cuenta;

import java.math.BigDecimal;
import java.util.Optional;

public class Datos {
    public static Optional<Cuenta> crearCuenta001() {
        return Optional.of(new Cuenta(1L, "Andrés", new BigDecimal("1000")));
    }

    public static Optional<Cuenta> crearCuenta002() {
        return Optional.of(new Cuenta(2L, "Jhon", new BigDecimal("2000")));
    }

    public static Optional<Banco> crearBanco() {
        return Optional.of(new Banco(1L, "El banco financiero", 0));
    }
}
