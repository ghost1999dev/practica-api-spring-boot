package com.practicamarvelapi.demo.controller.ComicFindByIdResponse;

import lombok.Getter;

@Getter
public class ComicsFindByIdResponse {
    private String copyright;
    private String attributionHTML;
    private String attributionText;
    private DataResponseFindById data;

}
