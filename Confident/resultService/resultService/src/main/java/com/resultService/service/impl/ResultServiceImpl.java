package com.resultService.service.impl;

import com.resultService.entities.Result;
import com.resultService.repo.ResultRepository;
import com.resultService.service.ResultService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ResultServiceImpl implements ResultService {

    private ResultRepository resultRepository;

    public ResultServiceImpl(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public List<Result> getAllResults() {
        return this.resultRepository.findAll();
    }

    @Override
    public Result addResult(Result result) {
        return this.resultRepository.save(result);
    }

    @Override
    public Result getOne(Long id) {
        return this.resultRepository.findById(id).orElseThrow(()->new RuntimeException("SOME EXCEPTION!!!"));
    }

    @Override
    public List<Result> findResultsByStudentId(Long studentId) {
        return this.resultRepository.findAllByStudentId(studentId);
    }
}
