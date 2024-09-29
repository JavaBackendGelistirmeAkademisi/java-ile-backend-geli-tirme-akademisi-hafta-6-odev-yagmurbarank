package com.javabackendakademisi.freelancerMatchingPlatform.service;

import com.javabackendakademisi.freelancerMatchingPlatform.model.Project;
import com.javabackendakademisi.freelancerMatchingPlatform.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
@Autowired
    private ProjectRepository projectRepository;
public Project createProject(Project project){
    return projectRepository.save(project);
}
public List<Project> getAllProjects(){
    return projectRepository.findAll();
}
    public Project getProjectById(Long id) {
        Optional<Project> project = projectRepository.findById(id);
        return project.orElse(null);
    }

}
