package com.data.generator;

import java.util.HashMap;
import java.util.Map;

import com.data.generator.property.IProperty;
import com.data.generator.property.Property;
import com.data.generator.property.PropertyRandom;
import com.data.utils.generatoFileUtils;

/**
 * Generowanie danych i ich zapis
 * 
 * @author olszewskij
 *
 * @param <T>
 */
public class DataGenerator implements IDataGenerator {

  Map<Property, IProperty> propertiesRandom;

  @Override
  public String getProperty(Property property) {
    return propertiesRandom.get(property).getValue().toString();
  }

  /**
   * Here add new property
   */
  private void init() {
    addPropertyRandom(Property.NAME, generatoFileUtils.PROPERTY_NAME_PATH);
  }

  public DataGenerator() {
    this.propertiesRandom = new HashMap<>();
    init();
  }

  public void addPropertyRandom(Property property, String filepath) {
    propertiesRandom.put(Property.NAME, new PropertyRandom(generatoFileUtils.getResourcePath(filepath)));
  }

}
