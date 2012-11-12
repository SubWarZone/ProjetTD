/**
 * Created with IntelliJ IDEA.
 * User: hugo
 * Date: 05/11/12
 * Time: 17:46
 */
public class Money {
    private int fAmount;
    private String fCurrency;


    public Money(int fAmount, String fCurrency) {
        this.fAmount = fAmount;
        this.fCurrency = fCurrency;

        assert fAmount >= 0:"le montant doit etre positif";
        assert fCurrency.equals("EUR") || fCurrency.equals("USD")
                || fCurrency.equals("CHF") || fCurrency.equals("GBP"):"la Currency donnee n est pas autoriser";
    }

    public int amount(){
        return this.fAmount;
    }
    public String currency(){
        return this.fCurrency;
    }


    /*
    *       1 Euro = 1.2839 U.S. dollars
    *       1 U.S. dollar = 0.77887686 Euros
    *
    *       1 euro = 1.21 franc suisse
    *       1 franc suisse = 0.8286 euro
    *
    *       1 euro = 0.7989 livre sterling
    *       1 livre sterling =  1.25 euro
    *       ghfhf
    *       hjhjhj
    *       j
    * */
    public Money add(Money money){

        if(money.fCurrency.equals(this.fCurrency)){
            this.fAmount+=money.fAmount;
        }
        else{
            System.out.println("ce n est pas la meme currency");
        }
        return this;
    }

    public Money add (int nAmount, String nCurrency){   // nAmount negatif possible



        return new Money(1,"fe");
    }

}
