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

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés
 */
public final class UtilesEntrada {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final double obtener(String msgUsr, String msgErr) {
        //Numero a devolver
        double numero = 0;
        boolean valido;
        //Proceso de entrada
        do {
            System.out.print(msgUsr);
            try {

                numero = SCN.nextDouble();
                valido = true;

            } catch (Exception e) {
                System.out.println(msgErr);
                valido = false;
            } finally {
                SCN.nextLine();
            }
        } while (valido == false);

        return numero;
    }

    public static final int leerEntero(String msgUsr, String msgErr) {
        return (int) obtener(msgUsr, msgErr);
    }

}
