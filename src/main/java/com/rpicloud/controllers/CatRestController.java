package com.rpicloud.controllers;

import com.rpicloud.models.Cat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by kaspernissen on 01/03/2016.
 */
@RestController
public class CatRestController {

    @RequestMapping("/cats")
    public ResponseEntity<List<Cat>> getAllCats(){
        List<Cat> col = new ArrayList<>();
        col.add(new Cat("Mr. Meow", "http://25.media.tumblr.com/tumblr_lzrltrAZFC1rncb5fo1_400.gif", "2", "Meeow!"));
        col.add(new Cat("Mr. Purrr", "http://25.media.tumblr.com/tumblr_m3exc4YOR01r03eaxo1_400.gif", "2", "Meeow!"));
        col.add(new Cat("Mr. Meow2", "http://27.media.tumblr.com/tumblr_llngvqDxGp1qaw6efo1_500.gif", "2", "Meeow!"));
        col.add(new Cat("Kitten", "http://i.giphy.com/GxN4ics7OlvsA.gif", "4", "Meeow!"));
        col.add(new Cat("Mrs Daisy", "http://www.catgifpage.com/gifs/310.gif", "4", "Meeow!"));
        col.add(new Cat("Star Wars Cats", "http://i.giphy.com/9gISqB3tncMmY.gif", "4", "Star Cats!"));
        return new ResponseEntity<>(col, HttpStatus.OK);
    }

    @RequestMapping("/cats/version")
    public ResponseEntity<String> version(){
       return new ResponseEntity<>("v2", HttpStatus.OK);
    }
}
