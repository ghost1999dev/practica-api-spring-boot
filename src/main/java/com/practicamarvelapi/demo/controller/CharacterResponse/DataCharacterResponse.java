package com.practicamarvelapi.demo.controller.CharacterResponse;

import java.util.List;

import lombok.Getter;
@Getter
public class DataCharacterResponse {
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<ResultCharactersResponse> results;
    
}
