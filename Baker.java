import pizzaHelper.CS331Pizza;
import pizzaHelper.CS331Toppings;

public class Baker 
{
    private int numPizzas;

    public Baker()
    {
        this.numPizzas = 0;
    }
    
    public CS331Pizza makeMushroom()
    {
        CS331Pizza pizza = new CS331Pizza();
        pizza.addMushrooms();
        numPizzas++;
        return pizza;
    }

    public CS331Pizza makePineapple()
    {
        CS331Pizza pizza = new CS331Pizza();
        pizza.addPineapple();
        numPizzas++;
        return pizza;
    }

    public CS331Pizza makeSpinach()
    {
        CS331Pizza pizza = new CS331Pizza();
        pizza.addSpinach();
        numPizzas++;
        return pizza;
    }

    
    public String workUpdate()
    {
        return "The baker has made " + numPizzas + " pizzas";
    }
    
}
