package org.dneprojek;


public class Service {
    Customers[] customer = new Customers[100];
    static Shoes[] shoes = new Shoes[1000];
    BuyInfo[] buy = new BuyInfo[100000];

    public static int totalNumberShoes() {
        int totalNumber = 0;
        for (; totalNumber < shoes.length; ++totalNumber) {
            if (shoes != null) {
                break;
            }
        }
        return totalNumber;
    }

}

