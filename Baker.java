import pizzaHelper.CS331Pizza;
import pizzaHelper.CS331Toppings;

public class Baker 
{
    private int numPizzas;

    public Baker()
    {
        numPizzas = 0;
    }

    public CS331Pizza makeMushroom()
    {
        CS331Pizza pizzaBaker = new CS331Pizza();
        pizzaBaker.addMushrooms();
        numPizzas++;
        return pizzaBaker;
    }

    public CS331Pizza makePineapple()
    {
        CS331Pizza pizzaBaker = new CS331Pizza();
        pizzaBaker.addPineapple();
        numPizzas++;
        return pizzaBaker;
    }

    public CS331Pizza makeSpinach()
    {
        CS331Pizza pizzaBaker = new CS331Pizza();
        pizzaBaker.addSpinach();
        numPizzas++;
        return pizzaBaker;
    }

    public String bakerUpdate()
    {
        return "Baker's Pizza Count: " + this.numPizzas;
    }
}
