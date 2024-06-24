package ru.osipov;

public abstract class BankCard {
    private int totalBalance;

    public int getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(int totalBalance) {
        this.totalBalance = totalBalance;
    }

    public boolean toPay(int amount) {
        System.out.println("Идет процесс оплаты. Сейчас с карты спишется " + amount + " рублей");
        if (amount > getTotalBalance()) {
            System.out.println("ОШИБКА! Недостаточно средств!");
            return false;
        }
        return true;
    }
    public abstract String getInfoAvailableMeans(); //информация о балансе, кредитном лимите и любых других средствах

    public boolean topUpCard(int amount) {
        System.out.println("Идет процесс пополнения карты на " + amount + " рублей");
        if (Integer.MAX_VALUE - amount < getTotalBalance()) {
            System.out.println("ВНИМАНИЕ. КАРТА НЕ ПОПОЛНЕНА!\n" +
                    "Когда я вижу столько денег - я себя не контролирую." +
                    "\nБоюсь, что вычту из общей суммы примерно " + Integer.MAX_VALUE +
                    " рублей. :)");
            return false;
        }
        return true;
    }
}
