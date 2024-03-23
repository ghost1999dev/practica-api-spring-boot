package com.practicamarvelapi.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.practicamarvelapi.demo.controller.CharacterImageDescriptionResponse.CharacterImageDescriptionResponse;
import com.practicamarvelapi.demo.controller.CharacterResponse.CharacterResponse;
import com.practicamarvelapi.demo.controller.ComicFindByIdResponse.ComicsFindByIdResponse;
import com.practicamarvelapi.demo.controller.ComicResponse.ComicsResponse;

@FeignClient(name = "marvel", url = "${url.marvel}/v1/public")
public interface MarvelComicsClient {
    @GetMapping("/comics")
    public ComicsResponse getAll(@RequestParam(value = "ts") Long timeStamp,
            @RequestParam(value = "apikey") String publicKey,
            @RequestParam(value = "hash") String hashMD5);

            @GetMapping("/comics/{comicId}")
            public ComicsFindByIdResponse getComicById(@RequestParam(value = "ts") Long timeStamp,
                    @RequestParam(value = "apikey") String publicKey,
                    @RequestParam(value = "hash") String hashMD5,
                    @PathVariable("comicId")String comicId);

    @GetMapping("/comics/{comicId}/characters")
    public CharacterResponse getCharactersByComicId(@RequestParam(value = "ts") Long timeStamp,
            @RequestParam(value = "apikey") String publicKey,
            @RequestParam(value = "hash") String hashMD5,
            @PathVariable("comicId") String comicId);

            @GetMapping("/characters/{characterId}")
        public CharacterImageDescriptionResponse getImageDescriptionCharactersByCharactersId(@RequestParam(value = "ts") Long timeStamp,
                @RequestParam(value = "apikey") String publicKey,
                @RequestParam(value = "hash") String hashMD5,
                @PathVariable("characterId") String characterId);

}