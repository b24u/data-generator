package com.data.generator;

import com.data.generator.property.Property;

public interface IDataGenerator {

  /**
   * Pobranie danych
   * 
   * @return
   */
  String getProperty(Property property);
}
