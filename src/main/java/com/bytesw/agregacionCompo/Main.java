package com.bytesw.agregacionCompo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria(2200,"Generica");
        SmarthPhone smarthPhone = new SmarthPhone("Samsung",bateria);

        Chip chip = new Chip("Claro","957242941");
        Chip chip2 = new Chip("Movistar","958563254");
        Chip chip3 = new Chip("Claro","968536215");

        smarthPhone.agregarChip(chip);
        smarthPhone.agregarChip(chip2);
        smarthPhone.agregarChip(chip3);

        //System.out.println(smarthPhone.toString());
        //smarthPhone.mostratChips();

        smarthPhone.getChipByOperador("Claro");

       /* for (Chip chipf: smarthPhone.getChipsByName("Claro")){
            System.out.println(chipf);
        }
        */
       /* smarthPhone.agregarChipv2(chip);
        smarthPhone.agregarChipv2(chip2);
        System.out.println(smarthPhone.toString());*/

    }
}
