package com.geely.design.structural.adapter;

/**
 * @author gaozebin
 * @date 2023/5/10 0:13
 */
public class PowerAdapter implements DC5{
    private AC220 ac220 = new AC220();
    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();

        // 变压器...
        int adapterOutput = adapterInput/44;

        System.out.println("使用PowerAdapter输入AC:"+adapterInput+"V 输出DC:"+adapterOutput+"V");
        return adapterOutput;
    }
}
