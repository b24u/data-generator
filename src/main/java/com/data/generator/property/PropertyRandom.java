package com.data.generator.property;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

/**
 * Losowanie property z pliku jako napis
 * 
 * @author olszewskij
 *
 */
public class PropertyRandom extends PropertyGenerator<String> {


  public PropertyRandom(String filePath) {
    super(filePath, String.class);
  }



  @Override
  public void write(List<String> listElements) throws IOException, JAXBException {
    // TODO zapis do formatu csv
  }

  @Override
  public List<String> read() {
    // TODO pobieranie z pliku listy a formacie csv po sciezce pliku getFilePath() ponizej narazie
    // demo
    List<String> names = new ArrayList<>();
    names.add("Janek");
    names.add("Marek");
    return names;
  }



}
