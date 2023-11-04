package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();

        for(Map.Entry<String, Integer> source: sourceMap.entrySet()){
            if(result.containsKey(source.getKey().length())){
                Set<String> currentSet = new HashSet<>(result.get(source.getKey().length()));
                currentSet.add(source.getKey());
                result.put(source.getKey().length(), currentSet);
            }
            else {
                Set<String> setter = new HashSet<>();
                setter.add(source.getKey());
                result.put(source.getKey().length(), setter);
            }

        }

        return result;
    }
}
