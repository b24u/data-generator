package com.data.generator.property.random;

public class NumberRandom extends Random<Integer> {

  public NumberRandom(Integer from, Integer to) {
    super(from, to);
  }

  private static final long serialVersionUID = 1L;

  @Override
  public Integer get() {
    return nextInt((to - from) + 1) + from;
  }

}
