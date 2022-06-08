package com.hillel.lesson2.task;

/**
 * Написать программу, которая предлагает пользователю внести сумму денежного вклада в гривнах,
 * процент годовых, которые выплачивает банк, длительность вклада (лет).
 * Вывести накопленную сумму денег за каждый год и начисленные проценты (проценты сложные с капитализацией каждый месяц).
 *
 * В задании 3 числа вводить через аргументы приложения
 *
 * Пример
 *
 * java DepositCalculator <сумма> <процент> <длительность_в_годах>
 */

public class DepositCalculator {

    public static void main(String[] args) {
        System.out.println("The money deposit in UAH: " + args[0]);
        double sumDeposit = Double.parseDouble(args[0]);
        System.out.println("The percent: " + args[1]);
        double percent = Double.parseDouble(args[1]);
        System.out.println("The duration of the deposit in years: " + args[2]);
        double durationOfYear = Double.parseDouble(args[2]);
        double degree = 12;

        for (int i = 1; i <= durationOfYear; i++) {
            double finalSum = sumDeposit * Math.pow(1.0 + percent * 0.01 / 12, (degree));
            System.out.println("Deposit per " + i + " of year " + finalSum);
            System.out.println("Percent per " + i + " year " + (finalSum - sumDeposit));
            sumDeposit = finalSum;


        }

    }
}
