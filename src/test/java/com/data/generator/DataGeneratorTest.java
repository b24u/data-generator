package com.data.generator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.data.generator.property.Property;

public class DataGeneratorTest {

  @Test
  public void generateAgeProperty() {

    IDataGenerator generator = new DataGenerator();
    System.out.println(generator.getProperty(Property.PESEL));


    assertTrue(true);

  }

}
