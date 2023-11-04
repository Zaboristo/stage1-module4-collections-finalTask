package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> result = new HashSet<>();
        for(Map.Entry<String, List<String>> day: timetable.entrySet()){
            Set<String> daySet = new HashSet<>();
            for(String lesson: day.getValue()){
                if(daySet.contains(lesson)){
                    result.remove(lesson);
                }
                else {
                    daySet.add(lesson);
                result.add(lesson);
            }
        }
    }
        return result;
}
}
