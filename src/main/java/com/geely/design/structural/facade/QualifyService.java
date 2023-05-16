package com.geely.design.structural.facade;

/**
 * @author gaozebin
 * @date 2023/5/3 23:43
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName()+" 积分资格通过，库存通过");
        return true;
    }
}
