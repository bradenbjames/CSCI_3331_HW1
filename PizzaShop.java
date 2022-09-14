import pizzaHelper.CS331Pizza;
import pizzaHelper.CS331Toppings;
import pizzaHelper.PizzaShopHelper;

/**
 * This is our top-level class that represents a PizzaShop!
 */
public class PizzaShop extends PizzaShopHelper{
    
    // this declares our instance variable "toppings"
    private CS331Toppings toppings;

    /**
     * This is the constructor of the PizzaShop class. You should initialize all your instalce variables here,
     * and be sure to open shop!
     */
    private int numPizzas1;
    private int numPizzas2;
    private int numPizzas3;
    private int numPizzas4;
    
    

    public PizzaShop() 
    {
        super();
        //this initializes our instance variable "toppings"
        this.toppings = new CS331Toppings();
    }

    /**
     * This method is called automatically when the user clicks "Order 1". Check out
     * the Javadocs for more information.
     */

    @Override
    public void order1() 
    {
        Baker baker = new Baker();
        CS331Pizza pizza = baker.makeMushroom();
        displayPrice(pizza);
        numPizzas1++;   
        displayShopUpdate("Number of Pizzas: " + String.valueOf(numPizzas1));
    }

    /**
     * This method is called automatically when the user clicks "Order 2". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order2() 
    {
        Baker baker = new Baker();
        CS331Pizza pizza = baker.makePineapple();
        toppings.addPeppers(pizza);
        displayPrice(pizza);
        numPizzas2++;
        displayShopUpdate("Number of Pizzas: " + String.valueOf(numPizzas2));
    }

    /**
     * This method is called automatically when the user clicks "Order 3". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order3()
    {
        Baker baker = new Baker();
        CS331Pizza pizza = baker.makePineapple();
        toppings.addPeppers(pizza);
        toppings.addTomatoes(pizza);
        displayPrice(pizza);
        numPizzas3++;
        displayShopUpdate("Number of Pizzas: " + String.valueOf(numPizzas3));
    }

    /**
     * This method is called automatically when the user clicks "Order 4". Check out
     * the Javadocs for more information.
     */
    @Override
    public void order4() 
    {
        Baker baker = new Baker();
        CS331Pizza pizza = baker.makeSpinach();
        toppings.addPeppers(pizza);
        toppings.addTomatoes(pizza);
        displayPrice(pizza);
        numPizzas4++;
        displayShopUpdate("Number of Pizzas: " + String.valueOf(numPizzas4));
    }
}
