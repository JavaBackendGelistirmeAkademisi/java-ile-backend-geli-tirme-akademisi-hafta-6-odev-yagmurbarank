package com.javabackendakademisi.freelancerMatchingPlatform.controller;

import com.javabackendakademisi.freelancerMatchingPlatform.model.Bid;
import com.javabackendakademisi.freelancerMatchingPlatform.model.Project;
import com.javabackendakademisi.freelancerMatchingPlatform.model.request.ProjectRequestDTO;
import com.javabackendakademisi.freelancerMatchingPlatform.repository.ProjectRepository;
import com.javabackendakademisi.freelancerMatchingPlatform.service.ProjectService;
import com.javabackendakademisi.freelancerMatchingPlatform.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private BidService bidService;

    @PostMapping
    public ResponseEntity<Project> createProject(@RequestBody ProjectRequestDTO projectRequestDTO){
        Project project= new Project();
        project.setTitle(projectRequestDTO.getTitle());
       project.setBudget(projectRequestDTO.getBudget());
       project.setDescription(projectRequestDTO.getDescription());
      return new ResponseEntity<>(project, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Project>> getAllProjects(){
        List<Project> projects= projectService.getAllProjects();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }
    @GetMapping("/{Id}")
    public ResponseEntity<Bid> getBidById(@PathVariable Long Id){
        Bid bid= bidService.getBidById(Id);
        return new ResponseEntity<>(bid, HttpStatus.OK);
    }

}
