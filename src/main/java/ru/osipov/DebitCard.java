package ru.osipov;

public class DebitCard extends BankCard {
    public DebitCard(int startBalance) {
        setTotalBalance(startBalance);
        System.out.println("Поздравляем, Вам выдана новая дебетовая карта!\nЕе баланс: " + startBalance);
    }

    @Override
    public boolean toPay(int amount) {
        if (super.toPay(amount)) {
            setTotalBalance(getTotalBalance() - amount);
            System.out.println("Оплата успешно произведена!");
            return true;
        }
        return false;
    }

    @Override
    public String getInfoAvailableMeans() {
        return "-------------Ваша дебетовая карта.-------------\n     Наличие средств: " + getTotalBalance() + "\n";
    }

    @Override
    public boolean topUpCard(int amount) {//Пополнить карту
        if (super.topUpCard(amount)) {
            setTotalBalance(getTotalBalance() + amount);
            System.out.println("Карта пополнена на " + amount + " рублей");
            return true;
        }
        return false;
    }
}
