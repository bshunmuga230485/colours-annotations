package com.learnsb.coloursannotations.services.impl;

import com.learnsb.coloursannotations.services.GreenPrinter;
import org.springframework.stereotype.Component;

public class EnglishGreenPrinter implements GreenPrinter {

  @Override
  public String print() {
    return "green";
  }
}
