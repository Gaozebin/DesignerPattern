package com.geely.design.structural.flyweight;

/**
 * @author gaozebin
 * @date 2023/5/10 0:40
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    // 内部状态
    private String title = "部门经理";

    // 外部状态
    private String department;
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }
}
