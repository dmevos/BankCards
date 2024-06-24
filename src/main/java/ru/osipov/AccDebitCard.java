package ru.osipov;

public class AccDebitCard extends DebitCard {
    public AccDebitCard(int startBalance) {
        super(startBalance);
        System.out.println("С этой картой реализовано накопление в размере 0,5% от суммы пополнений");
    }

    @Override
    public boolean topUpCard(int amount) {
        setTotalBalance(getTotalBalance() + (int) (amount * 0.005));
        return super.topUpCard(amount);
    }
}