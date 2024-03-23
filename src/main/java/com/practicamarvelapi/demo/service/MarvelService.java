package com.practicamarvelapi.demo.service;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.apache.commons.codec.digest.DigestUtils;


import com.practicamarvelapi.demo.Entity.User;
import com.practicamarvelapi.demo.Entity.UserRepository;
import com.practicamarvelapi.demo.client.MarvelComicsClient;
import com.practicamarvelapi.demo.controller.CharacterImageDescriptionResponse.CharacterImageDescriptionResponse;
import com.practicamarvelapi.demo.controller.CharacterResponse.CharacterItemsResponse;
import com.practicamarvelapi.demo.controller.CharacterResponse.CharacterResponse;
import com.practicamarvelapi.demo.controller.ComicFindByIdResponse.ComicsFindByIdResponse;
import com.practicamarvelapi.demo.controller.ComicResponse.ComicsResponse;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MarvelService {
    private static final String PUBLIC_KEY = "66b57a61fbd8c7513e27f1057641a863";
    private static final String PRIVATE_KEY = "4bca9a2c14ee389adc4a2150e22b530799a74b91";

    private MarvelComicsClient client;
    private final UserRepository userRepository;
   
    public ComicsResponse findAll() {
        Long timeStamp = new Date().getTime();
        return client.getAll(timeStamp, PUBLIC_KEY, buildHash(timeStamp));
    }
    public ComicsFindByIdResponse findById(String comicId) {
        Long timeStamp = new Date().getTime();
        return client.getComicById(timeStamp, PUBLIC_KEY, buildHash(timeStamp),comicId);
    }

    public CharacterResponse getCharactersByComicId(String comicId) {
        Long timeStamp = new Date().getTime();
        return client.getCharactersByComicId(timeStamp, PUBLIC_KEY, buildHash(timeStamp), comicId);
    }

    public CharacterImageDescriptionResponse getCharactersByCharacterId(String characterId) {
        Long timeStamp = new Date().getTime();
        return client.getImageDescriptionCharactersByCharactersId(timeStamp, PUBLIC_KEY, buildHash(timeStamp), characterId);
    }

    public void createUser(User user){
        userRepository.save(user);
    }

    

    private String buildHash(Long timeStamp) {
        return DigestUtils.md5Hex(timeStamp + PRIVATE_KEY + PUBLIC_KEY);

    }
}
