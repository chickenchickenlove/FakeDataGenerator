package org.hello.chickenchickenlove.fakeDataGenerator.factory;

import com.github.javafaker.Faker;
import com.github.javafaker.Internet;
import com.github.javafaker.Number;

import java.security.PublicKey;

public class FakerNumberFactory {

    private final Faker faker = new Faker();
    private final Number factory = faker.number();

    public Integer age() {
        return factory.numberBetween(0, 100);
    }

    public Double price() {
        return factory.randomDouble(2, 0, 100000);
    }

    public Long largeLongNumber() {
        return factory.numberBetween(0L, 9876543210L);
    }

    public Double largeDoubleNumber() {
        return factory.randomDouble(2, 0L, 9876543210L);
    }
}
