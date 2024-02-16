package com.learnsb.coloursannotations.services.impl;

import com.learnsb.coloursannotations.services.BluePrinter;
import com.learnsb.coloursannotations.services.ColourPrinter;
import com.learnsb.coloursannotations.services.GreenPrinter;
import com.learnsb.coloursannotations.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {
  private final RedPrinter redPrinter;
  private final BluePrinter bluePrinter;
  private final GreenPrinter greenPrinter;

  public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
    this.redPrinter = redPrinter;
    this.bluePrinter = bluePrinter;
    this.greenPrinter = greenPrinter;
  }

  @Override
  public String print() {
    return String.join("---, ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
  }
}
