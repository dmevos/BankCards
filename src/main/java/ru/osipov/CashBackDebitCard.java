package ru.osipov;

public class CashBackDebitCard extends DebitCard {
    public CashBackDebitCard(int startBalance) {
        super(startBalance);
        System.out.println("С этой картой реализован потенциальный кэшбэк. При условии трат от 5000 - кэшбэк 5%");
    }

    @Override
    public boolean toPay(int amount) {
        if (amount >= 5000) setTotalBalance(getTotalBalance() + (int) (amount * 0.05));
        return super.toPay(amount);
    }
}
