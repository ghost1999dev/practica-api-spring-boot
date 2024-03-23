package com.practicamarvelapi.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.http.HttpStatus.OK;

import com.practicamarvelapi.demo.controller.CharacterImageDescriptionResponse.CharacterImageDescriptionResponse;
import com.practicamarvelapi.demo.controller.CharacterResponse.CharacterItemsResponse;
import com.practicamarvelapi.demo.controller.CharacterResponse.CharacterResponse;
import com.practicamarvelapi.demo.controller.ComicFindByIdResponse.ComicsFindByIdResponse;
import com.practicamarvelapi.demo.controller.ComicResponse.ComicsResponse;
import com.practicamarvelapi.demo.service.MarvelService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/marvel")
public class MarvelController {

    private MarvelService service;

    @ResponseStatus(OK)
    @GetMapping("/comics")
    public ComicsResponse findAll() {
        return service.findAll();
    }

    @ResponseStatus(OK)
    @GetMapping("/comics/{comicId}")
    public ComicsFindByIdResponse findAll(@PathVariable String comicId) {
        return service.findById(comicId);
    }


    @ResponseStatus(OK)
    @GetMapping("/comics/{comicId}/characters")
    public CharacterResponse findCharactersByComicId(@PathVariable String comicId) {
        return service.getCharactersByComicId(comicId);
    }
    @ResponseStatus(OK)
    @GetMapping("/characters/{characterId}")
    public CharacterImageDescriptionResponse findCharactersByCharacterId(@PathVariable String characterId) {
        return service.getCharactersByCharacterId(characterId);
    }

}
