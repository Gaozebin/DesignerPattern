package com.geely.design.structural.facade;

/**
 * @author gaozebin
 * @date 2023/5/4 0:04
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.giftExChange(pointsGift);
    }
}
