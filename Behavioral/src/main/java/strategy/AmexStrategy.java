package strategy;

public class AmexStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;

        isValid =
                creditCard.getNumber().startsWith("37") || creditCard.getNumber().startsWith("34");

        if (isValid) {
            isValid = creditCard.getNumber().length() == 15;
        }

        if (isValid) {
            isValid = passLuhn(creditCard.getNumber());
        }
        return isValid;
    }
}
