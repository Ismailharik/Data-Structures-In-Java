package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stage {
    List<String> names = new ArrayList<String>();
    int numero;
    Stage next;







    public Stage() {

    }
    public Stage(List<String> names, int numero) {
        this.names = names;
        this.numero = numero;
    }

}