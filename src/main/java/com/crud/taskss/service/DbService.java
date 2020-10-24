package com.crud.taskss.service;

import com.crud.taskss.domain.Task;
import com.crud.taskss.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {
    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }
    public Task getTask(Long taskId) {

      return repository.findById(taskId).get();
    }

}
