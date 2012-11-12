import junit.framework.Assert;
import org.junit.Test;

/**
* Created with IntelliJ IDEA.
* User: hugo
* Date: 05/11/12
* Time: 18:02
* To change this template use File | Settings | File Templates.
*/
public class MoneyTest {
    @Test
    public void testAmount() throws Exception {
        Money money =new Money(100,"EUR");
        assert money.amount() == 100:"il y a un probleme avec testAmount sur la valeur de fAmount";
    }

    @Test
    public void testCurrency() throws Exception {
        Money money =new Money(100,"EUR");
        assert money.currency().equals("EUR"):"il y a un probleme avec testAmount sur la valeur de fCurrency";

        Money money2 =new Money(100,"USD");
        assert money2.currency().equals("USD"):"il y a un probleme avec testAmount sur la valeur de fCurrency";

        Money money3 =new Money(100,"CHF");
        assert money3.currency().equals("CHF"):"il y a un probleme avec testAmount sur la valeur de fCurrency";

        Money money4 =new Money(100,"GBP");
        assert money4.currency().equals("GBP"):"il y a un probleme avec testAmount sur la valeur de fCurrency";

    }
    @Test
    public void testAdd(){


        Money money= new Money(100,"EUR");
        Money money2=new Money(100,"EUR");

        money.add(money2);

        assert money.amount() == 200:"erreur";

        }


    }




}
