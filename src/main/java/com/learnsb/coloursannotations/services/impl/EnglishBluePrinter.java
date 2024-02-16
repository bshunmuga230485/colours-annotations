package com.learnsb.coloursannotations.services.impl;

import com.learnsb.coloursannotations.services.BluePrinter;
import org.springframework.stereotype.Component;

public class EnglishBluePrinter implements BluePrinter {

  @Override
  public String print() {
    return "blue";
  }
}
