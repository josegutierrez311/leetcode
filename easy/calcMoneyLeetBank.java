/**
 * Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
 * He starts by putting in $1 on Monday, the first day.
 * Every day from Tuesday to Sunday, he will put in $1 more than the day before.
 * On every subsequent Monday, he will put in $1 more than the previous Monday.
 * Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
 */





class Solution {
    public int totalMoney(int n) {
        int w = n / 7;
        int money = w * 28;
        money += (7 * w * (w - 1)) / 2;

        if (n % 7 != 0) {
            int extraDays = n % 7;
            int moneyToAdd = w + 1;
            for (int i = 0; i < extraDays; ++i) {
                money += moneyToAdd;
                moneyToAdd += 1;
            }
        }

        return money;
    }
}