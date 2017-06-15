package com.data.generator.property.random;

public class LongRandom extends Random<Long> {

  @Override
  public Long get() {
    Long value = nextLong();
    while (value < from || value > to) {
      value = nextLong();
    }
    return value;
  }

  public LongRandom(Long from, Long to) {
    super(from, to);
  }

  private static final long serialVersionUID = 1L;



}
