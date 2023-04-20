package com.geely.design.principle.demeter;


/**
 * @author gaozebin
 * @date 2023/4/15 22:41
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }
}
