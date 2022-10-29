package org.example.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> classicalSongs = new ArrayList<>();
    {
        classicalSongs.add("Ride of Valkyries");
        classicalSongs.add("Ave Maria");
    }
    @Override
    public List<String> getSong(){
        return classicalSongs;
    }
}
