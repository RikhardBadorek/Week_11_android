package com.badorek.viikko_11_muisti_app;

import java.io.Serializable;

public class Item implements Serializable {
    protected String Information;



    public Item(String Information) {
        this.Information = Information;

    }

    public String getInformation() {

        return Information;
    }
}
