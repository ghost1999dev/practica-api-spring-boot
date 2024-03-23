package com.practicamarvelapi.demo.controller.CharacterResponse;

import lombok.Getter;

@Getter
public class ResultCharactersResponse {
    String id;
    String name;
    String description;
    String modified;
    DataThumbnailResponse thumbnail;
    
    
}
