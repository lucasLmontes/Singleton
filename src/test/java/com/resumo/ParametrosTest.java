package com.resumo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParametrosTest {

    @Test
    public void testarInstanciaUnicaSingleton(){
        Parametros instancia1 = Parametros.getInstance();
        Parametros instancia2 = Parametros.getInstance();

        assertEquals(instancia1, instancia2);
    }

    @Test
    public void testarDefinirEObterValorBiometrico(){
        Parametros instancia = Parametros.getInstance();
        instancia.setValidadorBiometrico(1);

        assertEquals(1, instancia.getValidadorBiometrico());
    }

    @Test
    public void testarValidacaoBiometrica(){
        Parametros instancia = Parametros.getInstance();
        instancia.setValidadorBiometrico(1);

        assertEquals(true, instancia.getBiometriaValida());

        instancia.setValidadorBiometrico(0);

        assertEquals(false, instancia.getBiometriaValida());
    }

    @Test
    public void testarExcecaoParaValorBiometricoInvalido(){
        Parametros instancia = Parametros.getInstance();

        try{
            instancia.setValidadorBiometrico(-1);
            fail();
        } catch(IllegalArgumentException e){
            assertEquals("Valor inválido! Use 0 ou 1.", e.getMessage());
        }
    }
}