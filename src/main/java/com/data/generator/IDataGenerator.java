package com.data.generator;

import java.util.List;

public interface IDataGenerator<T> extends IGenerator<T> {

  /**
   * Pobranie danych
   * 
   * @return
   */
  List<T> getData();
}
