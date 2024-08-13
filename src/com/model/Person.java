package com.model;

public class Person {

    /**
     * The person's Wallet
     */
    public Wallet wallet = new Wallet();

    /**
     * The method of calculation of the total bill
     * @param bills bills of people
     * @return total value of all bill
     */
    public int calcTotal(int[] bills) {
            int temp = 0;
        for(int bill : bills){
            temp +=bill;
        }
            System.out.println("this is total of bill: "+temp);
        return temp;
    }

    /**
     * The method of user pay
     * @param total value of all bill
     * @return pay status
     */
    public boolean payMoney(int total) {
        //Write code here
        return false;
    }

    /**
     * This is nested classes for person's wallet
     * @author Student name
     * @version 1.0
     */
    public static class Wallet {

        /**
         *
         * money in wallet
         */
        private int amount;
        /**
         * method add money to your wallet
         * @param amount money in wallet
         * @return status add money
         */
        public boolean setMoneyAmount(int amount) {
            this.amount=amount;
            return false;
        }
        /**
         * method check status money in wallet
         * @param amount money in wallet
         * @return pay status
         */
        public boolean acceptMoney(int amount,int totalBill) {
            if(amount<totalBill){
                System.out.println("You can't buy it");
            } else {
                System.out.println("You can buy it");
            }
            return false;
        }
    }
}
