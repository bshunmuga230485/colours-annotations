package com.learnsb.coloursannotations.services.impl;

import com.learnsb.coloursannotations.services.GreenPrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TamilGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "Patchai";
    }
}
