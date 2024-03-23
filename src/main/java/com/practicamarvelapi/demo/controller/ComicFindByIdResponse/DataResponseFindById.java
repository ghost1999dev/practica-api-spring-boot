package com.practicamarvelapi.demo.controller.ComicFindByIdResponse;

import java.util.List;

import lombok.Getter;

@Getter
public class DataResponseFindById {
    
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<ResultsResponseFindById> results;
}
