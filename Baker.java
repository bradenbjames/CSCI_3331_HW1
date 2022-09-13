import pizzaHelper.CS331Pizza;
import pizzaHelper.CS331Toppings;

public class Baker 
{

    /*public Baker()
    {
        this.numPizzas = 0;
    }
    */
    
    public CS331Pizza makeMushroom()
    {
        CS331Pizza pizza = new CS331Pizza();
        pizza.addMushrooms();

        return pizza;
    }

    public CS331Pizza makePineapple()
    {
        CS331Pizza pizza = new CS331Pizza();
        pizza.addPineapple();
        return pizza;
    }

    public CS331Pizza makeSpinach()
    {
        CS331Pizza pizza = new CS331Pizza();
        pizza.addSpinach();
        return pizza;
    }

    /*
    public String bakerUpdate()
    {
        //return "Baker's Pizza Count: " + numPizzas;
    }
    */
}
