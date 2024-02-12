package com.resultService.controller;


import com.resultService.entities.Result;
import com.resultService.service.ResultService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/result")
public class ResultController {

    ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping
    List<Result> getAllResults()
    {
        return this.resultService.getAllResults();
    }

    @PostMapping
    Result addResult(@RequestBody Result result)
    {
        return this.resultService.addResult(result);
    }

    @GetMapping("/student/{studentId}")
    List<Result> getResultByStudentId(@PathVariable  Long studentId)
    {
        return this.resultService.findResultsByStudentId(studentId);
    }


    @GetMapping("/{id}")
    Result getOne(@PathVariable  Long id)
    {
        return this.resultService.getOne(id);
    }

}
