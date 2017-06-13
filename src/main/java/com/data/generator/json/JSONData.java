package com.data.generator.json;

import java.util.List;

import com.data.generator.IOData;

public class JSONData<T> extends IOData<T> {

  public JSONData(String filePath) {
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
