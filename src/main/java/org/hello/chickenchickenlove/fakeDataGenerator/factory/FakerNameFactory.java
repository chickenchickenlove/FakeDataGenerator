package org.hello.chickenchickenlove.fakeDataGenerator.factory;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

public class FakerNameFactory implements FakerFactory{

    private final Faker faker = new Faker();
    private final Name factory = faker.name();

    public String firstName() {
        return factory.firstName();
    }

    public String lastName() {
        return factory.lastName();
    }

    public String username() {
        return factory.username();
    }

    public String name() {
        return factory.name();
    }

}
