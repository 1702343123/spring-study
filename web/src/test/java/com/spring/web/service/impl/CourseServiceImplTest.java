package com.spring.web.service.impl;

import com.spring.web.entity.CourseVO;
import com.spring.web.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/3/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring_mybatis.xml"})
public class CourseServiceImplTest {
    @Autowired
    private CourseService courseService;
    @Test
    public void selectCurrentCourses() throws Exception {
        List<CourseVO> courseVOList = courseService.selectCurrentCourses();
        courseVOList.forEach(courseVO -> System.out.println(courseVO));
    }

}