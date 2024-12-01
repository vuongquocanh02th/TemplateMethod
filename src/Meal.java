public abstract class Meal {
    //template method
    public final void doMeal(){
        prepareIngredients();
        cook();
        eat();
        cleanUp();
    }
    public abstract void prepareIngredients();
    public abstract void cook();
    public void eat(){
        System.out.println("So delicious!");
    }
    public abstract void cleanUp();
}
