package org.example;

public class Main {
    public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
        public static int maxProfit(int[] prices) {
            int min = prices[0];
            int maxProfit = 0;
            for(int i = 0; i < prices.length; i++){
                if(prices[i] < min){
                    min = prices[i];
                }else{
                    int currentProfit = prices[i] - min;
                    if(currentProfit > maxProfit){
                        maxProfit = currentProfit;
                    }
                }
            }
            return maxProfit;
        }
    }
