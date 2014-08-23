package com.codekata.cucumber;

import cucumber.api.java.zh_cn.假定;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;

import static org.junit.Assert.assertEquals;

/**
 * Created by ibagsoft
 */
public class Earnings {

    private Course course;

    @假定("^课程的单价是(\\d+)RMB$")
    public void 课程的单价是_RMB(int price) throws Throwable {
        course = new Course(price);
    }

    @当("^有(\\d+)个人报名的话$")
    public void 有_个人报名的话(int multiple) throws Throwable {
        course.times(multiple);
    }

    @那么("^我的课程收益为(\\d+)RMB$")
    public void 我的课程收益为_RMB(int total) throws Throwable {
        assertEquals(total,course.getAmount());
    }
}
