package com.javapowertools.taxcalculator.domain;

public class TaxRate {
    private double minimumRevenue;
    private double maximumRevenue;
    private double rate;

    public TaxRate(double minimumRevenue, double maximumRevenue, double rate) {
        this.minimumRevenue = minimumRevenue;
        this.maximumRevenue = maximumRevenue;
        this.rate = rate;
    }

    public double getMinimumRevenue() {
        return minimumRevenue;
    }

    public double getMaximumRevenue() {
        return maximumRevenue;
    }

    public double getRate() {
        return rate;
    }

    private double getApplicableAmount(double totalRevenue) {
        double applicableAmount = 0.0;
        if (totalRevenue >= minimumRevenue) {
            applicableAmount = totalRevenue - minimumRevenue;
            if (maximumRevenue > 0) {
                if (totalRevenue > maximumRevenue) {
                    applicableAmount = maximumRevenue - minimumRevenue;
                }
            }
        }
        return  applicableAmount;
    }

    public double calculateTax(double totalRevenue) {
        return getApplicableAmount(totalRevenue) * rate;
    }
}
