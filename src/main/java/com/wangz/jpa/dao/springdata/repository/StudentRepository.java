package com.wangz.jpa.dao.springdata.repository;

import com.wangz.jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>,JpaSpecificationExecutor<Student> {
}
