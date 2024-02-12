package com.student.service;
import com.student.entities.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient(url = "http://localhost:9191", value = "RESULT-CLIENT")
public interface ResultClient {

   @GetMapping("/result/student/{studentId}")
   List<Result> getStudentResultsById(@PathVariable Long studentId);

}
