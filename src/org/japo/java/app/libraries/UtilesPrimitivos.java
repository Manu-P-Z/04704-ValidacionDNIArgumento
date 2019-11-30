/*
 * Copyright 2019 Manu Portolés.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app.libraries;

import static org.japo.java.app.App.LETRAS;

/**
 *
 * @author Manu Portolés
 */
public final class UtilesPrimitivos {

    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    //Rangos
    public static final int RANGO = 0;
    public static final int FUERA_RANG_MAS = 1;
    public static final int FUERA_RANG_MEN = 2;

    //Operaciones
    public static final int OP_SUM = 0; // Suma
    public static final int OP_RES = 1; // Resta
    public static final int OP_MUL = 2; // Producto
    public static final int OP_DIV = 3; // Cociente
    public static final int OP_MOD = 4; // Resto
    public static final int OP_MED = 5; // Media
    public static final int OP_MAY = 6; // Mayor
    public static final int OP_MEN = 7; // Menor

    //Constantes Analisis
    public static final int AN_PAR = 0;
    public static final int AN_IMP = 1;
    public static final int AN_POS = 2;
    public static final int AN_NEG = 3;

    //Devuelve el número mayor
    public static final double operar(double n1, double n2, int op) {

        //Resultado
        double result = 0;

        switch (op) {
            case OP_SUM:
                result = n1 + n2;
                break;
            case OP_RES:
                result = n1 - n2;
                break;
            case OP_MUL:
                result = n1 * n2;
                break;
            case OP_DIV:
                result = n1 / n2;
                break;
            case OP_MOD:
                result = n1 % n2;
                break;
            case OP_MED:
                result = n1 + n2 / 2;
                break;
            case OP_MAY:
                result = n1 > n2 ? n1 : n2;
                break;
            case OP_MEN:
                result = n1 < n2 ? n1 : n2;
                break;
        }
        return result;
    }

    public static final boolean analizar(double n, int an) {
        boolean testOK = false;
        switch (an) {
            case AN_PAR:
                testOK = n % 2 == 0;
                break;
            case AN_IMP:
                testOK = n % 2 != 0;
                break;
            case AN_POS:
                testOK = n >= 0;
                break;
            case AN_NEG:
                testOK = n < 0;
        }
        return testOK;
    }

    public static final boolean validarPar(double n) {
        return analizar(n, AN_PAR);
    }

    public static final boolean validarPositivo(double n) {
        return analizar(n, AN_POS);
    }

    public static final int calcularRango(double num, double min, double max) {

        int n = 0;
        if (num >= min && num <= max) {
            n = 0;
        } else if (num > max) {
            n = 2;
        } else if (num < min) {
            n = 1;
        }

        return n;
    }

    public static final String analizarRango(double num, double min, double max,
            String msgden, String msgdeb, String msgenc) {

        int n;
        String msg = "-";
        n = UtilesPrimitivos.calcularRango(num, min, max);

        switch (n) {
            case RANGO:
                msg = msgden;
                break;
            case FUERA_RANG_MEN:
                msg = msgdeb;
                break;
            case FUERA_RANG_MAS:
                msg = msgenc;
        }
        return msg;

    }

    public static final char calcular(int num) {
        return LETRAS.charAt(num % 23);
    }

    public static final boolean validar(int num, char ctr) {
        return ctr == calcular(num);
    }

}
