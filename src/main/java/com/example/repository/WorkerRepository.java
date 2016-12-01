package com.example.repository;
import java.util.List;
import com.example.services.Worker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends CrudRepository<Worker, Long> {

}