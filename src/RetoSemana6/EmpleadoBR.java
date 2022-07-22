/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RetoSemana6;

/**
 *
 * @author fmunoz
 */
public class EmpleadoBR {

    public static double calculaSalarioBruto(int tipo, float ventasMes, float horasExtras) throws BRException {
        if (tipo != 0 && ventasMes >= 0.0 && horasExtras >= 0.0) {
            double valorHoraExtra = 20.0 * horasExtras;
            double prima = 0.0;
            double total = 0.0;
            if (ventasMes >= 1500) {
                prima = 200;
            }
            if (ventasMes >= 1000.0 && ventasMes <= 1500.0) {
                prima = 100;
            }
            switch (tipo) {
                case 1000:
                    total = tipo + valorHoraExtra + prima;

                    break;
                case 1500:
                    total = tipo + valorHoraExtra + prima;

                    break;
                default:
                    throw new BRException();
            }
            return total;

        } else {
            throw new BRException();
        }

    }

    public static float calculaSalarioNeto(float salarioBruto) {
        double resultado = 0.0;
        if (salarioBruto >= 1500) {
            resultado = salarioBruto - (salarioBruto * 0.18);
        }
        if (salarioBruto >= 1000 && salarioBruto < 1500.0) {
            resultado = salarioBruto - (salarioBruto * 0.16);
        }
        if (salarioBruto < 1000) {
            resultado = salarioBruto;
        }
        if (salarioBruto < 0.0) {
            throw new BRException();
        }
        return (float) resultado;
    }


}
