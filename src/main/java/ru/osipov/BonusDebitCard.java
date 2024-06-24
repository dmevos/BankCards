package ru.osipov;

public class BonusDebitCard extends DebitCard
{
    private int bonusBall;
    public BonusDebitCard(int startBalance) {
        super(startBalance);
        System.out.println("С этой картой реализована бонусная программа. За каждую покупку Вы получаете бонусы, в размере 1% от покупок");
    }
    @Override
    public String getInfoAvailableMeans() {
        return super.getInfoAvailableMeans() + "     Количество баллов: " + bonusBall;
    }
    @Override
    public boolean toPay(int amount) {
        int temp = Math.min(amount, bonusBall);
        bonusBall = bonusBall - temp + (int) (amount * 0.01);
        return super.toPay(amount - temp);
    }
}
