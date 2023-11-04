package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Set<String>> entry: projects.entrySet()){
            if(entry.getValue().contains(developer))
                result.add(entry.getKey());
        }
        Collections.sort(result, String.CASE_INSENSITIVE_ORDER);
        Collections.reverse(result);
        result.sort(Comparator.comparingInt(String::length).reversed());
        return result;
    }
}
