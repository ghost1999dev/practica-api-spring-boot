package com.practicamarvelapi.demo.controller.CharacterImageDescriptionResponse;

import com.practicamarvelapi.demo.controller.CharacterResponse.DataCharacterResponse;

import lombok.Getter;

@Getter
public class CharacterImageDescriptionResponse {
    private String copyright;
    private String attributionHTML;
    private String attributionText;
    private DataCharacterImageDescripcionResponse data;
}
