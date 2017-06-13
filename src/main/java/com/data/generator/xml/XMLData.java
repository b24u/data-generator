package com.data.generator.xml;

import java.util.List;

import com.data.generator.IOData;

/**
 * Serializacja/Deserializacja do XML use JAXB
 * 
 * @author olszewskij
 *
 */
public class XMLData<T> extends IOData<T> {

  public XMLData(String filePath) {
    super(filePath);
  }

  @Override
  public void write(List<T> listElements) {
    // TODO Auto-generated method stub

  }

  @Override
  public List<T> read() {
    // TODO Auto-generated method stub
    return null;
  }



}
