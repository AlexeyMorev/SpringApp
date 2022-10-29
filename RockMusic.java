package org.example.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class RockMusic implements Music{
    private List<String> rockSongs = new ArrayList<>();
    {
        rockSongs.add("Nothing else matters");
        rockSongs.add("Take a look around");
        rockSongs.add("House of the rising sun");
    }

    @Override
    public List<String> getSong(){
        return rockSongs;
    }
}
