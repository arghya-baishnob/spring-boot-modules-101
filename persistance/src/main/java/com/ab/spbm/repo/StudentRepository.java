package com.ab.spbm.repo;

import com.ab.spbm.model.Student;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
@Slf4j
public class StudentRepository {
    public List<Student> getStudentsFromDb() {
        log.info("Fetching data from In memory DB ...");
        return Arrays.asList(
                Student.builder().id(1).name("A").city("KOL").build(),
                Student.builder().id(2).name("B").city("DEL").build(),
                Student.builder().id(3).name("C").city("MUM").build()
        );
    }
}
