package com.data.generator.property;

import java.util.List;

import com.data.generator.IGenerator;
import com.data.generator.IOData;
import com.data.generator.property.random.NumberRandom;
import com.data.generator.xml.XMLData;

/**
 * Generator property - pobieranie elementu wylosowanego z pliku
 * 
 * @author olszewskij
 *
 * @param <T>
 */
public abstract class PropertyGenerator<T> extends IOData<T> implements IGenerator<T> {

  private NumberRandom randomNumber;

  public PropertyGenerator(String filePath) {
    super(filePath);
    createData();
    randomNumber = new NumberRandom(0, data.size());
  }

  List<T> data;

  public T getValue() {
    return data.get(randomNumber.get());
  };

  @Override
  public void createData() {
    loadData(getFilePath());
  }

  protected List<T> getData() {
    return data;
  }

  protected void setData(List<T> data) {
    this.data = data;
  }

  /**
   * Wczytanie danych wymaganych do losowania elemntow
   * 
   * @param pathFile
   */
  void loadData(String filePath) {
    XMLData<T> xmlData = new XMLData<>(filePath);
    List<T> properties = xmlData.read();
    setData(properties);
  }

}
