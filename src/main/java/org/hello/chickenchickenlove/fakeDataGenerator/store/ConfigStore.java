package org.hello.chickenchickenlove.fakeDataGenerator.store;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConfigStore {


    private final ConcurrentHashMap<String, HashMap<String, String>> store = new ConcurrentHashMap<>();



    public HashMap<String, HashMap<String, String>> createCopyConfig() {

        HashMap<String, HashMap<String, String>> copiedConfigStore = new HashMap<>();

        for (Map.Entry<String, HashMap<String, String>> storeEntry : store.entrySet()) {
            String topicName = storeEntry.getKey();
            HashMap<String, String> fields = storeEntry.getValue();
            copiedConfigStore.put(topicName, fields);
        }

        return copiedConfigStore;
    }




}
