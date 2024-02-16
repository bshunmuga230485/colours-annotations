package com.learnsb.coloursannotations.services.impl;

import com.learnsb.coloursannotations.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {

  @Override
  public String print() {
    return "red";
  }
}
