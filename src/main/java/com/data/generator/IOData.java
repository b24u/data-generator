package com.data.generator;

import java.util.List;

public abstract class IOData<T> {

  public IOData(String filePath) {
    super();
    setFilePath(filePath);
  }

  private String filePath;

  abstract public void write(List<T> listElements);

  abstract public List<T> read();

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

}
