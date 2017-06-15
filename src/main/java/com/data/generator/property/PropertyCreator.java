package com.data.generator.property;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa po ktorej dziedziczymy gdy chcemy utworzyc generator np pesel
 * 
 * @author olszewskij
 *
 * @param <T>
 */
public abstract class PropertyCreator<T> implements IProperty<T> {

  private Option option;
  private List<T> createdProperty;

  public PropertyCreator() {
    this(Option.NOT_UNIQUE);
  }

  public PropertyCreator(Option option) {
    setOption(option);
    if (isUnique()) {
      createdProperty = new ArrayList<>();
    }
  }

  /**
   * Sprawdzenie unikalnosci utworzonego property
   * 
   * @param property
   * @return
   */
  protected boolean isUniqueProperty(T property) {
    return !createdProperty.contains(property);
  }

  private void addCreatedProperty(T property) {
    if (isUniqueProperty(property)) {
      createdProperty.add(property);
    }
  }

  protected Option getOption() {
    return option;
  }

  /**
   * Tworzenie unikalnej wartosci
   * 
   * @return
   */
  private boolean isUnique() {
    return option.equals(Option.UNIQUE);
  }

  protected void setOption(Option option) {
    this.option = option;
  }

  public T getValue() {
    T value = generateValue();
    if (isUnique()) {
      addCreatedProperty(value);

      while (!isUniqueProperty(value)) {
        value = generateValue();
      }
    }
    return value;
  }

  protected abstract T generateValue();
}
