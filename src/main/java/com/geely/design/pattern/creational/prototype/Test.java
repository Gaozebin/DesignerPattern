package com.geely.design.pattern.creational.prototype;

/**
 * @author gaozebin
 * @date 2023/4/29 23:30
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail:" + mail);
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mail.setName("姓名" + i);
            mail.setEmailAddress("姓名" + i + "@imooc.com");
            mail.setContent("恭喜您，此次慕课网活动中将了");
            MailUtil.sendMail(mail);
            System.out.println("克隆的mailTemp:" + mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
