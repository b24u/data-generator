package com.data.generator.importer;

import java.util.List;

import com.data.generator.IOData;

public class ImportData<T> extends IOData<T> implements IImportData<T> {

  public ImportData(String filePath) {
    super(filePath);
  }

  @Override
  public List<T> csv() {
    // TODO Auto-generated method stub
    return null;
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
