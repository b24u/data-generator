package com.data.generator.property.random;

/**
 * Generowanie obiektu T z zakresu
 * 
 * @author olszewskij
 *
 * @param <T>
 */
public abstract class Random<T> extends java.util.Random {

  protected T from;
  protected T to;

  public Random(T from, T to) {
    setFrom(from);
    setTo(to);
  }

  abstract T get();

  protected void setFrom(T from) {
    this.from = from;
  }

  protected void setTo(T to) {
    this.to = to;
  }



}
