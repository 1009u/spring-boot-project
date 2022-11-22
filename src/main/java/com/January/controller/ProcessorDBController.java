package com.January.controller;

import com.January.model.Processor;
import com.January.repository.ProcessorJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController   // annotation
public class ProcessorDBController {
    @Autowired
    ProcessorJpaRepository processorJpaRepository;

    //for add Processor Type
    @RequestMapping(value = "/add_processor",method = RequestMethod.POST)
    public Object addProcessors(@RequestBody Processor processor){
        return processorJpaRepository.save(processor);
    }
    // for get all data
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<Processor> getProcessor(){
        return processorJpaRepository.findAll();
    }
    //for update
    @RequestMapping(value = "/updateProcessors", method = RequestMethod.PUT)
    public Processor updateProcessor(@RequestBody Processor processor){
        return processorJpaRepository.save(processor);
    }
    // for Delete
    @RequestMapping(value = "/deleteProcessor",method = RequestMethod.DELETE)
    public void deleteProcessor(@RequestParam Long id){
        processorJpaRepository.deleteById(id);
    }
}
