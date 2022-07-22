/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package RetoSemana6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static RetoSemana6.TipoEmpleado.*;

/**
 *
 * @author fmunoz
 */
public class EmpleadoBRTest  {

    public EmpleadoBRTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of calculaSalarioNeto method, of class EmpleadoBR.
     */
    @Test
    public void testCalculaSalarioNeto() {

        System.out.println("Prueba Calcula salario Neto 1");
        float salarioBruto = 2000;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = 1640;

        float resultado = empleado.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado, 0.0);
    }

    @Test
    public void testCalculaSalarioNeto2() {

        System.out.println("Prueba Calcula salario Neto 2");
        float salarioBruto = 1500;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = 1230;

        float resultado = empleado.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado, 0.0);
    }

    @Test
    public void testCalculaSalarioNeto3() {

        System.out.println("Prueba Calcula salario Neto 3");
        float salarioBruto = (float) 1499.99;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = (float) 1259.9916;

        float resultado = empleado.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado, 0.0);
    }

    @Test
    public void testCalculaSalarioNeto4() {

        System.out.println("Prueba Calcula salario Neto 4");
        float salarioBruto = 1250;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = 1050;

        float resultado = empleado.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado, 0.0);
    }

    @Test
    public void testCalculaSalarioNeto5() {

        System.out.println("Prueba Calcula salario Neto 5");
        float salarioBruto = 1000;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = 840;

        float resultado = empleado.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado, 0.0);
    }

    @Test
    public void testCalculaSalarioNeto6() {

        System.out.println("Prueba Calcula salario Neto 6");
        float salarioBruto = (float) 999.99;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = (float) 999.99;

        float resultado = empleado.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado, 0.0);
    }

    @Test
    public void testCalculaSalarioNeto7() {

        System.out.println("Prueba Calcula salario Neto 7");
        float salarioBruto = (float) 500;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = (float) 500;

        float resultado = empleado.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado, 0.0);
    }

    @Test
    public void testCalculaSalarioNeto8() {

        System.out.println("Prueba Calcula salario Neto 8");
        float salarioBruto = (float) 0;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = (float) 0;

        float resultado = empleado.calculaSalarioNeto(salarioBruto);
        assertEquals(esperado, resultado, 0.0);
    }

//    @Test
//    public void testCalculaSalarioNeto9() {
//        
//        System.out.println("Prueba Calcula salario Neto 9");
//        float salarioBruto =  -1;
//        EmpleadoBR empleado = new EmpleadoBR();
//        float esperado = (float) BRException;        
//
//        float resultado = empleado.calculaSalarioNeto(salarioBruto);
//        assertEquals(esperado, resultado, 0.0);
//    }
    /**
     * Test of calculaSalarioBruto method, of class EmpleadoBR.
     */
    @Test
    public void testCalculaSalarioBruto() {
        System.out.println("Prueba Calcula salario bruto");

        float ventasMes = 2000;
        float horasExtras = 8;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = 1360;

        double resultado = empleado.calculaSalarioBruto(vendedor, ventasMes, horasExtras);
        assertEquals(esperado, resultado, 0.0);
    }

    @Test
    public void testCalculaSalarioBruto2() {
        System.out.println("Prueba Calcula salario bruto 2");

        float ventasMes = 1500;
        float horasExtras = 3;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = 1160;

        double resultado = empleado.calculaSalarioBruto(vendedor, ventasMes, horasExtras);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalculaSalarioBruto3() {
        System.out.println("Prueba Calcula salario bruto 3");

        float ventasMes = (float) 1499.99;
        float horasExtras = 0;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = 1100;

        double resultado = empleado.calculaSalarioBruto(vendedor, ventasMes, horasExtras);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalculaSalarioBruto4() {
        System.out.println("Prueba Calcula salario bruto 4");

        float ventasMes = (float) 1499.99;
        float horasExtras = 0;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = 1100;

        double resultado = empleado.calculaSalarioBruto(vendedor, ventasMes, horasExtras);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalculaSalarioBruto5() {
        System.out.println("Prueba Calcula salario bruto 5");

        float ventasMes = 1250;
        float horasExtras = 8;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = 1760;

        double resultado = empleado.calculaSalarioBruto(encargado, ventasMes, horasExtras);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalculaSalarioBruto6() {
        System.out.println("Prueba Calcula salario bruto 6");

        float ventasMes = 1000;
        float horasExtras = 0;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = 1600;

        double resultado = empleado.calculaSalarioBruto(encargado, ventasMes, horasExtras);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalculaSalarioBruto7() {
        System.out.println("Prueba Calcula salario bruto 7");

        float ventasMes = (float) 999.99;
        float horasExtras = 3;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = 1560;

        double resultado = empleado.calculaSalarioBruto(encargado, ventasMes, horasExtras);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalculaSalarioBruto8() {
        System.out.println("Prueba Calcula salario bruto 8");

        float ventasMes = 500;
        float horasExtras = 0;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = 1500;

        double resultado = empleado.calculaSalarioBruto(encargado, ventasMes, horasExtras);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalculaSalarioBruto9() {
        System.out.println("Prueba Calcula salario bruto 9");

        float ventasMes = 0;
        float horasExtras = 8;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = 1660;

        double resultado = empleado.calculaSalarioBruto(encargado, ventasMes, horasExtras);
        assertEquals(esperado, resultado, 0.0);
    }
    
    
    @Test
    public void testCalculaSalarioBruto10() {
        System.out.println("Prueba Calcula salario bruto 10");

        float ventasMes = 0;
        float horasExtras = 8;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = 1660;

        double resultado = empleado.calculaSalarioBruto(encargado, ventasMes, horasExtras);
        assertEquals(esperado, resultado, 0.0);
    }
    
    
    @Test
    public void testCalculaSalarioBruto11() {
        System.out.println("Prueba Calcula salario bruto 11");

        float ventasMes = -1;
        float horasExtras = 8;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = BRException;

        double resultado = empleado.calculaSalarioBruto(vendedor, ventasMes, horasExtras);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalculaSalarioBruto12() {
        System.out.println("Prueba Calcula salario bruto 12");

        float ventasMes = 1500;
        float horasExtras = -1;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = BRException;

        double resultado = empleado.calculaSalarioBruto(vendedor, ventasMes, horasExtras);
        assertEquals(esperado, resultado, 0.0);
    }
    
    @Test
    public void testCalculaSalarioBruto13() {
        System.out.println("Prueba Calcula salario bruto 13");
        float ventasMes = 1500;
        float horasExtras = -1;
        EmpleadoBR empleado = new EmpleadoBR();
        float esperado = BRException();

        double resultado = empleado.calculaSalarioBruto(null, ventasMes, horasExtras);
        assertEquals(esperado, resultado, 0.0);
    }
    
    


}
