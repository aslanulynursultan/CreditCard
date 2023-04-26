public class CreditCard {
        // declare fields
        private Money balance;
        private  Money creditLimit;
        private  Person owner;

        public CreditCard(Person newCardHolder, Money limit)
        {
            owner = newCardHolder;
            creditLimit = new Money(limit);
            balance = new Money(0);
        }

        public Money getBalance()
        {
            return new Money(balance);
        }

        public Money getCreditLimit()
        {
            return new Money(creditLimit);
        }

        public String getPersonals()
        {
            return owner.toString();
        }

        public void charge(Money amount)
        {
            Money money1 = new Money(balance.add(amount));
            if(money1.compareTo(creditLimit) > 0)
            {
                System.out.println("Exceeds credit limit");
            }
            else
            {
                balance = money1;
                System.out.println("Charge: " + amount);
            }
        }

        public void payment(Money amount)
        {
            Money temp = new Money(balance.subtract(amount));
            System.out.println("Payment: " + amount);
            balance = temp;
        }
}
