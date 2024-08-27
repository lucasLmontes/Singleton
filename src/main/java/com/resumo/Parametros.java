package com.resumo;

public class Parametros {

    private Parametros(){}

    private static Parametros instance = new Parametros();
    public static Parametros getInstance(){
        return instance;
    }

    private int validadorBiometrico;

    public int getValidadorBiometrico() {
        return validadorBiometrico;
    }

    public void setValidadorBiometrico(int validadorBiometrico) {
        if(validadorBiometrico == 0 || validadorBiometrico == 1){
            this.validadorBiometrico = validadorBiometrico;
        } else{
            throw new IllegalArgumentException("Valor inválido! Use 0 ou 1.");
        }
    }

    public boolean getBiometriaValida(){
        return this.validadorBiometrico == 1;
    }
}
