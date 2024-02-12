package com.resultService.service;

import com.resultService.entities.Result;

import java.util.List;

public interface ResultService {

    List<Result> getAllResults();

    Result addResult(Result result);

    Result getOne(Long id);

    List<Result> findResultsByStudentId(Long studentId);
}
