/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import com.conceptosavanzados.tareano4.utilitarios.CalcularRangosDeTamano;
import com.conceptosavanzados.tareano4.utilitarios.OperacionesNumericas;
import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PERSONAL
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
      @Test 
    public void testCaso1()
    {
        LinkedList<Double> listadoDatosDePrueba = new LinkedList<Double>();
        
        listadoDatosDePrueba.add(6.0000);
        listadoDatosDePrueba.add(6.0000);
        listadoDatosDePrueba.add(8.3333);
        listadoDatosDePrueba.add(10.3333);
        listadoDatosDePrueba.add(12.3333);
        listadoDatosDePrueba.add(16.4000);
        listadoDatosDePrueba.add(20.5000);
        listadoDatosDePrueba.add(21.7500);
        listadoDatosDePrueba.add(22.2500);
        listadoDatosDePrueba.add(23.0000);
        listadoDatosDePrueba.add(28.3333);
        listadoDatosDePrueba.add(29.0000);
        listadoDatosDePrueba.add(55.8000);
        
        CalcularRangosDeTamano objetoPruebas = new CalcularRangosDeTamano();
        objetoPruebas.Calcular(listadoDatosDePrueba);
		
        assertEquals(4.3953D, objetoPruebas.getVS(), 0.01D);
        assertEquals(8.5081D, objetoPruebas.getS(), 0.01D);
        assertEquals(16.4696D, objetoPruebas.getM(), 0.01D);
        assertEquals(31.8811D, objetoPruebas.getL(), 0.01D);
        assertEquals(61.7137D, objetoPruebas.getVL(), 0.01D);
    }
    
    @Test 
    public void testCalcularSumatoriaIn()
    {
        LinkedList<Double> listadoDatosDePrueba = new LinkedList<Double>();
        listadoDatosDePrueba.add(6.0000);
        listadoDatosDePrueba.add(6.0000);
        listadoDatosDePrueba.add(8.3333);
        listadoDatosDePrueba.add(10.3333);
        listadoDatosDePrueba.add(12.3333);
        listadoDatosDePrueba.add(16.4000);
        listadoDatosDePrueba.add(20.5000);
        listadoDatosDePrueba.add(21.7500);
        listadoDatosDePrueba.add(22.2500);
        listadoDatosDePrueba.add(23.0000);
        listadoDatosDePrueba.add(28.3333);
        listadoDatosDePrueba.add(29.0000);
        listadoDatosDePrueba.add(55.8000);
        double AVG = OperacionesNumericas.calcularLn(listadoDatosDePrueba);
        assertEquals(36.4197D, AVG, 0.01D);
    }
    
    
    @Test 
    public void testCalcularMedia()
    {
        LinkedList<Double> valoresPrueba = new LinkedList<Double>();
        valoresPrueba.add(130.0);
        valoresPrueba.add(650.0);
        valoresPrueba.add(99.0);
        valoresPrueba.add(150.0);
        valoresPrueba.add(128.0);
        valoresPrueba.add(302.0);
        valoresPrueba.add(95.0);
        valoresPrueba.add(945.0);
        valoresPrueba.add(368.0);
        valoresPrueba.add(961.0);
        double media = OperacionesNumericas.calcularMedia(valoresPrueba);
        assertEquals(382.8D, media, 0.01D);
    }
    
    @Test 
    public void testCalcularSumatoria()
    {
        LinkedList<Double> valoresPrueba = new LinkedList<Double>();
        valoresPrueba.add(186.0);
        valoresPrueba.add(699.0);
        valoresPrueba.add(132.0);
        valoresPrueba.add(272.0);
        valoresPrueba.add(291.0);
        valoresPrueba.add(331.0);
        valoresPrueba.add(199.0);
        valoresPrueba.add(1890.0);
        valoresPrueba.add(788.0);
        valoresPrueba.add(1601.0);
        double sumatoria = OperacionesNumericas.calcularSumatoria(valoresPrueba);
        assertEquals(6389D, sumatoria, 0.01D);
    }
    
     @Test 
    public void testCalcularSumatoriaInAVG()
    {
        LinkedList<Double> listadoDatosDePrueba = new LinkedList<Double>();
        listadoDatosDePrueba.add(6.0000);
        listadoDatosDePrueba.add(6.0000);
        listadoDatosDePrueba.add(8.3333);
        listadoDatosDePrueba.add(10.3333);
        listadoDatosDePrueba.add(12.3333);
        listadoDatosDePrueba.add(16.4000);
        listadoDatosDePrueba.add(20.5000);
        listadoDatosDePrueba.add(21.7500);
        listadoDatosDePrueba.add(22.2500);
        listadoDatosDePrueba.add(23.0000);
        listadoDatosDePrueba.add(28.3333);
        listadoDatosDePrueba.add(29.0000);
        listadoDatosDePrueba.add(55.8000);
        double sumatoria = OperacionesNumericas.calcularLnAVG(listadoDatosDePrueba, 2.8015);
        assertEquals(5.2350D, sumatoria, 0.01D);
    }
}
