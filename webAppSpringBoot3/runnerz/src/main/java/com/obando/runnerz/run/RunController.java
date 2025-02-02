package com.obando.runnerz.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RunController {

    private final RunRepository runRepository;

    public RunController(RunRepository runRepository){
        this.runRepository = runRepository;
    }

    @GetMapping("/home")
    public String home(){
        return "Hello World!";
    }

    @GetMapping("/runs")
    List<Run> findAll(){
        return runRepository.findAll();
    }

    @GetMapping("/runs/{id}")
    Run findById(){
        return runRepository
    }

}
