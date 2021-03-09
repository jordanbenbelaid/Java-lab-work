package data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import data.model.Demo;

@Repository
public interface DemoRepository extends JpaRepository<Demo, Integer>{

}
