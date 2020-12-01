package com.crud.taskss.repository;

import com.crud.taskss.domain.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//@Repository
//@Transactional
public interface TaskRepository extends CrudRepository<Task, Long> {
    @Override
    List<Task> findAll();

    @Override
    Optional<Task> findById(Long taskId);

    @Override
    Task save(Task task);

    @Override
    void deleteById(Long taskId);

    @Override
    long count();
}
