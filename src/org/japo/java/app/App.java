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
package org.japo.java.app;

import org.japo.java.app.libraries.UtilesPrimitivos;

/**
 *
 * @author Manu Portolés
 */
public final class App {

    //Análisis DNI
    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static final int DNI_NUM = 1;
    public static final char DNI_CTR = 'T';

    public final void launchApp() {
        
        System.out.println("VALIDACIÓN DE DNI");
        System.out.println("=================");
        System.out.printf("%s %d%c", "DNI ......:", DNI_NUM, DNI_CTR);
        System.out.println("---");
       
        
        boolean dniOK = UtilesPrimitivos.validar(DNI_NUM, DNI_CTR);

        
        System.out.printf("Validez ..: %s%n", dniOK ? "Correcto" : "Incorrecto");
    }

}
