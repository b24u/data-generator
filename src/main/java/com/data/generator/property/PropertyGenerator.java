package com.data.generator.property;

import java.util.List;

import com.data.generator.IOData;
import com.data.generator.property.random.NumberRandom;

/**
 * Generator property - pobieranie wygenerowanego objektu PESEL,imie itp
 * 
 * @author olszewskij
 *
 * @param <T>
 */
public abstract class PropertyGenerator<T> extends IOData<T> implements IProperty<T> {

  private NumberRandom randomNumber;

  public PropertyGenerator(String filePath, Class<T> dataInstance) {
    super(filePath, dataInstance);
    setData(read());
    randomNumber = new NumberRandom(0, data.size() - 1);
  }

  List<T> data;

  public T getValue() {
    return data.get(randomNumber.get());
  };


  protected List<T> getData() {
    return data;
  }

  protected void setData(List<T> data) {
    this.data = data;
  }


}
