package org.hello.chickenchickenlove.fakeDataGenerator.store;

import lombok.Getter;
import org.hello.chickenchickenlove.fakeDataGenerator.factory.FakerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
public class FactoryStore {

    private final List<FakerFactory> factories;

    public FactoryStore(List<FakerFactory> factories) {
        this.factories = factories;
    }
}
