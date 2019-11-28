/*
 * Copyright 2019 Adrian Bueno Olmedo - adrian.bueno.alum@iescamp.es.
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

import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Adrián Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class App {

//       RANDOM
    public static int n1 = 10;
    public static int n2 = 50;
    public static int op = 0;

    public final void launchApp() {
        System.out.println("OPERACIÓN NUMERICA");
        System.out.println("==================");

        System.out.printf("Número 1 ........: %d%n", n1);

        System.out.printf("Número 2 ........: %d%n", n2);

        System.out.println("---");
        System.out.println(UtilesPrimitivos.operar(n1, n2, op));

    }
}
