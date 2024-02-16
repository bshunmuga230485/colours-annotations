package com.learnsb.coloursannotations.services.impl;

import com.learnsb.coloursannotations.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class TamilBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "Neelam";
    }
}
