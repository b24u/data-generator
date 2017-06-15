package com.data.generator;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

public abstract class IOData<T> {

  Class<T> dataInstance;

  public IOData(String filePath, Class<T> dataInstance) {
    super();
    setFilePath(filePath);
    setDataInstance(dataInstance);
  }

  private String filePath;

  abstract public void write(List<T> listElements) throws IOException, JAXBException;

  abstract public List<T> read();

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  protected Class<T> getDataInstance() {
    return dataInstance;
  }

  protected void setDataInstance(Class<T> dataInstance) {
    this.dataInstance = dataInstance;
  }

}
