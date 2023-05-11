package com.SpringbootWithMongodb.repository;

import com.SpringbootWithMongodb.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer> {


}
