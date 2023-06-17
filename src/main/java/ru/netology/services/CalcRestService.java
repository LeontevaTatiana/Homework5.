package ru.netology.services;
public class CalcRestService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; //счетчик месяцев отдыха
        int money = 0; //денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}