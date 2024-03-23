package com.practicamarvelapi.demo.controller.ComicResponse;

import java.util.List;

import lombok.Getter;

@Getter
public class DataResponse {
    
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<ResultsResponse> results;
}
