import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
            System.out.println("Menu de opciones");
            System.out.println("1) Verificar si 2 matrices son iguales");
            System.out.println("2) Sumar 2 matrices");
            System.out.println("3) Generar una matriz de ceros");
            System.out.println("4) Obtener el inverso aditivo de una matriz");
            System.out.println("5) Restar 2 matrices");
            System.out.println("6) Multiplicar una matriz por un escalar");
            System.out.println("7) Multiplicar 2 matrices compatibles");
            System.out.println("8) Obtener una matriz identidad");
            System.out.println("9) Salir del programa");
            byte seleccionar = lector.nextByte();

        switch (seleccionar) {
            case 1:
    int filas = 0, columnas = 0;
    for (int intentos = 0; intentos < 3; intentos++) {
        System.out.print("Ingrese el número de filas: ");
        filas = lector.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        columnas = lector.nextInt();

        if (filas > 0 && columnas > 0) {
            break;
        } else {
            System.out.println("Las filas y las columnas no pueden ser cero.");
        }
    }
    if (filas <= 0 || columnas <= 0) {
        System.out.println("Se agotaron los intentos. Saliendo del programa.");
        return;
    }

    int[][] matrizA = new int[filas][columnas];
    int[][] matrizB = new int[filas][columnas];
    System.out.println("Ingrese los elementos de la matriz A:");
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.print("Ingrese el elemento en la fila [" + (i + 1) + "," + (j + 1) + "]: ");
            matrizA[i][j] = lector.nextInt();
        }
    }

    System.out.println("Ingrese los elementos de la matriz B:");
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.print("Ingrese el elemento en la fila [" + (i + 1) + "," + (j + 1) + "]: ");
            matrizB[i][j] = lector.nextInt();
        }
    }

    boolean sonIguales = true;
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            if (matrizA[i][j] != matrizB[i][j]) {
                sonIguales = false;
                break;
            }
        }
        if (!sonIguales) {
            break;
        }
    }

    if (sonIguales) {
        System.out.println("Las matrices son iguales.");
    } else {
        System.out.println("Las matrices no son iguales.");
    }
    break;
    case 2:
    int filasa = 0, columnasa = 0;
    for (int intentos = 0; intentos < 3; intentos++) {
    System.out.print("Ingrese el número de filas ");
     filasa = lector.nextInt();
    System.out.print("Ingrese el número de columnas ");
    columnasa = lector.nextInt();
    if (filasa > 0 && columnasa > 0) {
     break;
    } else {
     System.out.println("Las filas y las columnas deben ser mayores que cero.");
    }
    }
    if (filasa <= 0 || columnasa <= 0) {
    System.out.println("Se agotaron los intentos. Saliendo del programa.");
        return;
        }
        int[][] matrizAm = new int[filasa][columnasa];
        int[][] matrizBm = new int[filasa][columnasa];
        int[][] resultado = new int[filasa][columnasa];

        System.out.println("Ingrese los elementos de la matriz A:");
        for (int i = 0; i < filasa; i++) {
            for (int j = 0; j < columnasa; j++) {
        System.out.print("Elemento A[" + (i + 1) + "," + (j+1) + "]=");
                        matrizAm[i][j] = lector.nextInt();
                    }
                }

                System.out.println("Ingrese los elementos de la matriz B:");
                for (int i = 0; i < filasa; i++) {
                    for (int j = 0; j < columnasa; j++) {
                        System.out.print("Elemento B[" + (i + 1)  + "," + (j+1) +"]= ");
                        matrizBm[i][j] = lector.nextInt();
                    }
                }

                for (int i = 0; i < filasa; i++) {
                    for (int j = 0; j < columnasa; j++) {
                        resultado[i][j] = matrizAm[i][j] + matrizBm[i][j];
                    }
                }

                System.out.println("La matriz resultante es:");
                for (int i = 0; i < filasa; i++) {
                    for (int j = 0; j < columnasa; j++) {
                        System.out.print(resultado[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
              case 3:
              int filasb = 0, columnasb = 0;
                 for (int intentos = 0; intentos < 3; intentos++) {
                System.out.print("Ingrese el número de filas: ");
                filasb = lector.nextInt();
              System.out.print("Ingrese el número de columnas: ");
               columnasb = lector.nextInt();
    
                if (filasb > 0 && columnasb > 0) {
               break;
              } else {
             System.out.println("Las filas y las columnas no pueden ser cero.");
              }
                }
                 if (filasb <= 0 || columnasb <= 0) {
              System.out.println("Se agotaron los intentos. Saliendo del programa.");
                      return;
                          }

                     int[][] matrizCeros = new int[filasb][columnasb];
                         System.out.println("Matriz de ceros:");
                      for (int i = 0; i < filasb; i++) {
                      for (int j = 0; j < columnasb; j++) {
                          matrizCeros[i][j] = 0;
                      System.out.print(matrizCeros[i][j] + " ");
                          }
                             System.out.println();
  
                            }              
              break;
            case 4:
              filas = 0;
              columnas = 0;
                for (int intentos = 0; intentos < 3; intentos++) {
                    System.out.print("Ingrese el número de filas ");
                    filas = lector.nextInt();
                    System.out.print("Ingrese el número de columnas ");
                    columnas = lector.nextInt();

                    if (filas > 0 && columnas > 0) {
                        break;
                    } else {
                        System.out.println("Las filas y las columnas deben ser mayores que cero.");
                    }
                }
                if (filas <= 0 || columnas <= 0) {
                    System.out.println("Se agotaron los intentos. Saliendo del programa.");
                    return;
                }
                int[][] matriz = new int[filas][columnas];
                    System.out.println("Ingrese los elementos de la matriz:");
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                        System.out.print("Elemento en la fila [" + (i + 1) + "," + (j+1) +  "]: ");
                        matriz[i][j] = lector.nextInt();
                        }
                    }
                    int[][] inversoAditivo = new int[filas][columnas];
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            inversoAditivo[i][j] = -matriz[i][j];
                        }
                    }
                    System.out.println("El inverso aditivo de la matriz es:");
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                             System.out.print(inversoAditivo[i][j] + "  ");
                        }
                    System.out.println();
                    }
                    break;
                case 5:
                filas = 0;
                columnas = 0;
                for (int intentos = 0; intentos < 3; intentos++) {
                    System.out.print("Ingrese el número de filas ");
                    filas = lector.nextInt();
                    System.out.print("Ingrese el número de columnas ");
                    columnas = lector.nextInt();

                    if (filas > 0 && columnas > 0) {
                        break;
                    } else {
                        System.out.println("Las filas y las columnas no pueden ser cero.");
                    }
                }
                if (filas <= 0 || columnas <= 0) {
                    System.out.println("Se agotaron los intentos. Saliendo del programa.");
                    return;
                }
                int[][] matrizAi = new int[filas][columnas];
                        int[][] matrizBi = new int[filas][columnas];
                        System.out.println("Ingrese los elementos de la matriz A:");
                        for (int i = 0; i < filas; i++) {
                            for (int j = 0; j < columnas; j++) {
                                System.out.print("Elemento en la fila A=[" + (i + 1) + "," + (j+1)+  "]:");
                                matrizAi[i][j] = lector.nextInt();
                            }
                        }
                        System.out.println("Ingrese los elementos de la matriz B:");
                        for (int i = 0; i < filas; i++) {
                            for (int j = 0; j < columnas; j++) {
                                System.out.print("Elemento en la fila B=[" + (i + 1) + "," + (j+1) + "]:");
                                matrizBi[i][j] = lector.nextInt();
                            }
                        }
                        int[][] matrizResultado = new int[filas][columnas];
                        for (int i = 0; i < filas; i++) {
                            for (int j = 0; j < columnas; j++) {
                                matrizResultado[i][j] = matrizAi[i][j] - matrizBi[i][j];
                            }
                        }
                        System.out.println("La matriz resultante de la resta A - B es:");
                        for (int i = 0; i < filas; i++) {
                            for (int j = 0; j < columnas; j++) {
                                System.out.print(matrizResultado[i][j] + " ");
                            }
                            System.out.println();
                        }
                    break;
                case 6:
                filas = 0;
                columnas = 0;
                for (int intentos = 0; intentos < 3; intentos++) {
                    System.out.print("Ingrese el número de filas ");
                    filas = lector.nextInt();
                    System.out.print("Ingrese el número de columnas ");
                    columnas = lector.nextInt();

                    if (filas > 0 && columnas > 0) {
                        break;
                    } else {
                        System.out.println("Las filas y las columnas no pueden ser cero.");
                    }
                }
                if (filas <= 0 || columnas <= 0) {
                    System.out.println("Se agotaron los intentos. Saliendo del programa.");
                    return;
                }
                double [][] matrizi = new double[filas][columnas];
                System.out.println("Ingrese los elementos de la matriz:");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print("Elemento en la fila=[" + (i + 1) + "," + (j+1)+  "]:");
                        matrizi[i][j] = lector.nextDouble();
                    }
                }
                System.out.print("Ingrese el número real por el que desea multiplicar la matriz: ");
                double numeroReal = lector.nextDouble();
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        matrizi[i][j] *= numeroReal;
                    }
                }
                System.out.println("El producto de la matriz por el número real es:");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(matrizi[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 7:
        int filasA = 0;
        int columnasA = 0;
        for (int intentos = 0; intentos < 3; intentos++) {
            System.out.print("Ingrese el número de filas de la primera matriz: ");
            filasA = lector.nextInt();
            System.out.print("Ingrese el número de columnas de la primera matriz: ");
            columnasA = lector.nextInt();

            if (filasA > 0 && columnasA > 0) {
                break;
            } else {
                System.out.println("Las filas y las columnas no pueden ser cero.");
            }
        }
        if (filasA <= 0 || columnasA <= 0) {
            System.out.println("Se agotaron los intentos. Saliendo del programa.");
            return;
        }

        int filasB = 0;
        int columnasB = 0;
        for (int intentos = 0; intentos < 3; intentos++) {
            System.out.print("Ingrese el número de filas de la segunda matriz: ");
            filasB = lector.nextInt();
            System.out.print("Ingrese el número de columnas de la segunda matriz: ");
            columnasB = lector.nextInt();

            if (filasB > 0 && columnasB > 0) {
                break;
            } else {
                System.out.println("Las filas y las columnas no pueden ser cero.");
            }
        }
        if (filasB <= 0 || columnasB <= 0) {
            System.out.println("Se agotaron los intentos. Saliendo del programa.");
            return;
        }

        if (columnasA != filasB) {
            System.out.println("No se pueden multiplicar las matrices, no son compatibles.");
            return;
        }

        int[][] matrizAml = new int[filasA][columnasA];
        int[][] matrizBml = new int[filasB][columnasB];
        System.out.println("Ingrese los elementos de la matriz A:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print("Elemento A[" + (i + 1) + "," + (j + 1) + "]: ");
                matrizAml[i][j] = lector.nextInt();
            }
        }
        System.out.println("Ingrese los elementos de la matriz B:");
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print("Elemento B[" + (i + 1) + "," + (j + 1) + "]: ");
                matrizBml[i][j] = lector.nextInt();
            }
        }

        int[][] resultadol = new int[filasA][columnasB];
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultadol[i][j] += matrizAml[i][k] * matrizBml[k][j];
                }
            }
        }

        System.out.println("La matriz resultante es:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(resultadol[i][j] + "\t");
            }
            System.out.println();
        }
        break;
        case 8:
         System.out.print("Ingrese el tamaño de la matriz identidad: ");
         int tamano = lector.nextInt();
         if (tamano <= 0) {
         System.out.println("El tamaño de la matriz no puede ser cero.");
         return;
        }
        int[][] matrizIdentidad = new int[tamano][tamano];
        for (int i = 0; i < tamano; i++) {
        for (int j = 0; j < tamano; j++) {
            matrizIdentidad[i][j] = 0;
        }
        }
        for (int i = 0; i < tamano; i++) {
        matrizIdentidad[i][i] = 1;
         }
        System.out.println("La matriz identidad de tamaño " + tamano + " es:");
        for (int i = 0; i < tamano; i++) {
        for (int j = 0; j < tamano; j++) {
            System.out.print(matrizIdentidad[i][j] + " ");
        }
          System.out.println();
        }
        break;
            case 9:
            System.out.println("Saliendo del programa.");
    }
    }
}
    
