package com.wf.ms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wf.ms.model.Todo;

@RepositoryRestResource //(collectionResourceRel = "todos", itemResourceRel = "todo")
public interface TodoRepository extends JpaRepository<Todo, Integer> {

	List<Todo> findByUser(String user);
	
	List<Todo> findByDoneFalse();
}
