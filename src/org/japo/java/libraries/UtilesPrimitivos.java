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
package org.japo.java.libraries;

/**
 *
 * @author Adrian Bueno Olmedo - adrian.bueno.alum@iescamp.es
 */
public class UtilesPrimitivos {

    public static final int OP_SUM = 0; // Suma
    public static final int OP_RES = 1; // Resta
    public static final int OP_MUL = 2; // Producto
    public static final int OP_DIV = 3; // Cociente
    public static final int OP_MOD = 4; // Resto
    public static final int OP_MED = 5; // Media
    public static final int OP_MAY = 6; // Mayor
    public static final int OP_MEN = 7; // Menor

    public static int N1;
    public static int N2;

    public static final String operar(double n1, double n2, int op) {
        double result;
        String cadena = "";

        switch (op) {
            case OP_SUM:
                result = n1 + n2;
                cadena = String.format("La Suma es ........: %d%n",
                        (int) result);
                break;
            case OP_RES:
                result = n1 - n2;
                cadena = String.format("La Resta es .......: %d%n",
                        (int) result);
                break;
            case OP_MUL:
                result = n1 * n2;
                cadena = String.format("El Producto es ....: %d%n",
                        (int) result);
                break;
            case OP_DIV:
                result = n1 / n2;
                cadena = String.format("El Cociente es ....: %d%n",
                        (int) result);
                break;
            case OP_MOD:
                result = n1 % n2;
                cadena = String.format("El Resto es ......: %d%n",
                        (int) result);
                break;
            case OP_MED:
                result = (n1 + n2) / 2;
                cadena = String.format("La Media es ......: %d%n",
                        (int) result);
                break;
            case OP_MAY:
                result = n1 > n2 ? n1 : n2;
                cadena = String.format("El Mayor es ......: %d%n",
                        (int) result);
                break;
            case OP_MEN:
                result = n1 < n2 ? n1 : n2;
                cadena = String.format("El Menor es ......: %d%n",
                        (int) result);
                break;
        }
        return cadena;
    }
}
