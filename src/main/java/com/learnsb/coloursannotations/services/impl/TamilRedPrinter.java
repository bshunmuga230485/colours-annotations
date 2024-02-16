package com.learnsb.coloursannotations.services.impl;

import com.learnsb.coloursannotations.services.RedPrinter;
import org.springframework.stereotype.Component;


public class TamilRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "Sivappu";
    }
}
