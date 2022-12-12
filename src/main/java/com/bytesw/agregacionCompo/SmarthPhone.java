package com.bytesw.agregacionCompo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SmarthPhone {
    private String marca;
    private Bateria bateria;
    private ArrayList<Chip> chips;
    //private Chip[] chipsv2;
    private int numeroChip;

    public SmarthPhone(String marca, Bateria bateria) {
        this.marca = marca;
        this.bateria = bateria;
        this.chips= new ArrayList<>();
        //this.chipsv2 = new Chip[2];
    }

    public void agregarChip(Chip chip){
        System.out.println(numeroChip);
        if(numeroChip<=2){
            chips.add(chip);
            numeroChip++;
        }else{
            System.out.println("solo se puede 2 chips");
        }

    }

    /*public void agregarChipv2(Chip chip){
        if(numeroChip<2){
            chipsv2[numeroChip]=chip;
            numeroChip++;
        }
    }*/

    public void mostratChips(){
        for (Chip chip: chips){
            System.out.println(chip);
        }
    }

    public ArrayList<Chip> getChipsByName(String operadora) {
        ArrayList<Chip> chipsEncontrados = new ArrayList<>();
        int i=0;
        while (i < chips.size() ){
            if(chips.get(i).getOperadora().equals(operadora)){
                chipsEncontrados.add(chips.get(i));
            }
            i++;
        }
        return chipsEncontrados;
    }

    public void getChipByOperador(String operador){
        Chip chipEncontrado = null;
        int i=0;
        while(i<chips.size() && chipEncontrado==null){
            if(chips.get(i).getOperadora().equals(operador)){
                chipEncontrado = chips.get(i);
                System.out.println(chipEncontrado);
            }
            i++;
        }
    }

    @Override
    public String toString() {
        return "SmarthPhone{" +
                "marca='" + marca + '\'' +
                ", bateria=" + bateria +
                ", chips=" + chips +
                ", numeroChip=" + numeroChip +
                '}';
    }
}
