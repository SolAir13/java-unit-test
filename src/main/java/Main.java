import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food food = new Meat(5, 100);
        Food redApple = new Apple(10, 50, Colour.RED);
        Food greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] foods = new Food[3];
        foods[0] = redApple;
        foods[1] = greenApple;
        foods[2] = food;

        ShoppingCart cart = new ShoppingCart(foods);
        System.out.println(cart.getSumWhithDis());
        System.out.println(cart.getSumWhithOutDis());
        System.out.println(cart.getSumVegProd());


    }
}
