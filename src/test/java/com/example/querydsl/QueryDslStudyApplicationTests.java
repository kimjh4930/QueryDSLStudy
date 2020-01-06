package com.example.querydsl;

import com.example.querydsl.entity.Academy;
import com.example.querydsl.repository.AcademyRepository;
import com.example.querydsl.repository.AcademyRepositorySupport;
import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryDslStudyApplicationTests {

    @Autowired
    private AcademyRepository academyRepository;


    @After
    public void tearDown() throws Exception {
        academyRepository.deleteAllInBatch();
    }

    @Test
    public void querydsl_기본_기능_확인 (){
        //given
        String name = "junha";
        String address = "jhkim@abc.efg";

        academyRepository.save(new Academy(name, address));

        //when
        List<Academy> result = academyRepository.findByName(name);

        //then
        for(Academy academy : result){
            System.out.println(academy.toString());
        }
    }

}
