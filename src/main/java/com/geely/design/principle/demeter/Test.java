package com.geely.design.principle.demeter;

/**
 * @author gaozebin
 * @date 2023/4/17 20:47
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
