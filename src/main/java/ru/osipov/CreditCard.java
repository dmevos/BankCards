package ru.osipov;

public class CreditCard extends BankCard {
    final private int creditLimit;
    private int creditFunds; //кредитные средства
    private int ownFunds; //собственные средства

    public CreditCard(int creditLimit) {
        this.creditLimit = creditLimit;
        this.creditFunds = creditLimit;
        this.ownFunds = 0;
        setTotalBalance(creditFunds + ownFunds);
        System.out.println("\nПоздравляем, Вам выдана новая кредитная карта c кредитным лимитом = " + creditLimit + "!\nЕе баланс: " + getTotalBalance());
    }


    @Override
    public boolean toPay(int amount) {
        if (super.toPay(amount)) {
            if (amount <= ownFunds) {
                ownFunds -= amount;
            } else {
                creditFunds -= amount += ownFunds;
                ownFunds = 0;
            }
            System.out.println("Оплата успешно произведена!");
            setTotalBalance(creditFunds + ownFunds);
            return true;
        }
        return false;
    }

    @Override
    public String getInfoAvailableMeans() {
        return "-------------Ваша кредитная карта-------------\nКредитный лимит: " + creditLimit + ".\n" +
                "     Общий баланс: " + getTotalBalance() + ". Из них\n" +
                "       Кредитные средства: " + creditFunds + ".\n" +
                "       Собственные средства: " + ownFunds + ".\n";
    }

    @Override
    public boolean topUpCard(int amount) {//Пополнить карту
        if (super.topUpCard(amount)) {
            if (creditFunds + amount <= creditLimit) {
                creditFunds += amount;
            } else {
                ownFunds = creditFunds - creditLimit + amount;
                creditFunds = creditLimit;
            }
            System.out.println("Карта пополнена на " + amount + " рублей");
            setTotalBalance(creditFunds + ownFunds);
            return true;
        }
        return false;
    }
}