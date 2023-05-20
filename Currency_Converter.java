/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.currency_converter;

/**
 *
 * @author sanke
 */
import java.util.Scanner;

public class Currency_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount;

        System.out.print("Enter the amount to convert: ");
        amount = scanner.nextDouble();

        System.out.print("Enter the currency to convert from (USD, EUR, GBP): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the currency to convert to (USD, EUR, GBP): ");
        String toCurrency = scanner.next().toUpperCase();

        double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);
        System.out.println(amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);
    }

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        // Define conversion rates
        double usdToEur = 0.92;
        double usdToGbp = 0.72;
        double eurToUsd = 1.09;
        double eurToGbp = 0.81;
        double gbpToUsd = 1.39;
        double gbpToEur = 1.23;

        // Perform currency conversion
        if(fromCurrency.equals("USD")) {
            if (toCurrency.equals("EUR")) {
                return amount * usdToEur;
            } else if (toCurrency.equals("GBP")) {
                return amount * usdToGbp;
            }
        } else if (fromCurrency.equals("EUR")) {
            if (toCurrency.equals("USD")) {
                return amount * eurToUsd;
            } else if (toCurrency.equals("GBP")) {
                return amount * eurToGbp;
            }
        } else if (fromCurrency.equals("GBP")) {
            if (toCurrency.equals("USD")) {
                return amount * gbpToUsd;
            } else if (toCurrency.equals("EUR")) {
                return amount * gbpToEur;
            }
        }

        // If conversion is not supported, return -1
        return -1;
    }
}

