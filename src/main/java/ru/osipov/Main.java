package ru.osipov;

public class Main {
    public static void main(String[] args) {
//        //-------------Проверка работы дебетовой карты------------------------------
//                DebitCard debitCard = new DebitCard(3000);
//        debitCardOperation(debitCard);
//
//        //-------------Проверка работы кредитной карты------------------------------
//        CreditCard creditCard = new CreditCard(10000);
//        creditCardOperation(creditCard);
//
//        //-------------Проверка работы бонусной кредитной карты------------------------------
//        BonusCreditCard bonusCreditCard = new BonusCreditCard(100000);
//        bonusCreditCardOperation(bonusCreditCard);

//        //-------------Проверка работы бонусной дебетовой карты------------------------------
//        BonusDebitCard bonusDebitCard = new BonusDebitCard(100000);
//        bonusDebitCardOperation(bonusDebitCard);

//        //-------------Проверка работы дебетовой карты с кэшбэком------------------------------
//        CashBackDebitCard cashBackDebitCard = new CashBackDebitCard(100000);
//        cashBackDebitCardOperation(cashBackDebitCard);

//        //-------------Проверка работы дебетовой карты с накоплением------------------------------
        AccDebitCard accDebitCard = new AccDebitCard(100000);
        accDebitCardOperation(accDebitCard);
    }

    private static void accDebitCardOperation(AccDebitCard accDebitCard) {
        System.out.println(accDebitCard.getInfoAvailableMeans());
        if (accDebitCard.topUpCard(5000)) {
            System.out.println(accDebitCard.getInfoAvailableMeans());
        }
        if (accDebitCard.topUpCard(10000)) {
            System.out.println(accDebitCard.getInfoAvailableMeans());
        }
    }

    private static void cashBackDebitCardOperation(CashBackDebitCard cashBackDebitCard) {
        System.out.println(cashBackDebitCard.getInfoAvailableMeans());
        if (cashBackDebitCard.toPay(5000)) {
            System.out.println(cashBackDebitCard.getInfoAvailableMeans());
        }
        if (cashBackDebitCard.toPay(10000)) {
            System.out.println(cashBackDebitCard.getInfoAvailableMeans());
        }
    }

    private static void bonusCreditCardOperation(BonusCreditCard bonusCreditCard) {
        System.out.println(bonusCreditCard.getInfoAvailableMeans());
        if (bonusCreditCard.toPay(5000)) {
            System.out.println(bonusCreditCard.getInfoAvailableMeans());
        }
        if (bonusCreditCard.toPay(10000)) {
            System.out.println(bonusCreditCard.getInfoAvailableMeans());
        }
    }

    private static void bonusDebitCardOperation(BonusDebitCard bonusDebitCard) {
        System.out.println(bonusDebitCard.getInfoAvailableMeans());
        if (bonusDebitCard.toPay(5000)) {
            System.out.println(bonusDebitCard.getInfoAvailableMeans());
        }
        if (bonusDebitCard.toPay(10000)) {
            System.out.println(bonusDebitCard.getInfoAvailableMeans());
        }
    }

    private static void creditCardOperation(CreditCard creditCard) {
        if (creditCard.topUpCard(Integer.MAX_VALUE - 1000)) {
            System.out.println(creditCard.getInfoAvailableMeans());
        }

        if (creditCard.topUpCard(5000)) {
            System.out.println(creditCard.getInfoAvailableMeans());
        }

        if (creditCard.toPay(5000)) {
            System.out.println(creditCard.getInfoAvailableMeans());
        }

        if (creditCard.toPay(3000)) {
            System.out.println(creditCard.getInfoAvailableMeans());
        }
        if (creditCard.topUpCard(2000)) {
            System.out.println(creditCard.getInfoAvailableMeans());
        }
        if (creditCard.topUpCard(2000)) {
            System.out.println(creditCard.getInfoAvailableMeans());
        }
    }

    private static void debitCardOperation(DebitCard debitCard) {
        if (debitCard.topUpCard(Integer.MAX_VALUE - 100)) {
            System.out.println(debitCard.getInfoAvailableMeans());
        }

        if (debitCard.topUpCard(4000)) {
            System.out.println(debitCard.getInfoAvailableMeans());
        }

        if (debitCard.toPay(8000)) {
            System.out.println(debitCard.getInfoAvailableMeans());
        }

        if (debitCard.toPay(300)) {
            System.out.println(debitCard.getInfoAvailableMeans());
        }
    }
}