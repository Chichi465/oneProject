package com.example.projectone.activities;

public class FatimaData {

public static final String TABLE = "FatimaData";
public static final String KEY_PersonName = "PersonName";

    public static final String KEY_EatNo = "EatNo";
    public static final String KEY_EatYes = "EatYes";
    public static final String KEY_FoodMaybe = "FoodMaybe";
    public static final String KEY_FoodNo = "FoodNo";
    public static final String KEY_FoodYes = "FoodYes";
    public static final String KEY_MealTwo = "MealTwo";
    public static final String KEY_MealThree = "MealThree";
    public static final String KEY_MealOne = "MealOne";
    public static final String KEY_MealBlue = "MealBlue";
    public static final String KEY_MealMore = "MealMore";
    public static final String KEY_DrinkNo = "DrinkNo";
    public static final String KEY_DrinkYes = "DrinkYes";
    public static final String KEY_MeatBeef = "MeatBeef";
    public static final String KEY_MeatSeafood = "MeatSeafood";
    public static final String KEY_MeatChicken = "MeatChicken";
    public static final String KEY_MeatPork = "MeatPork";
    public static final String KEY_FavoriteMealAnswer = "FavoriteMealAnswer";

    private int personName;
    private int eatNo;
    private int eatYes;
    private int foodMaybe;
    private int foodNo;
    private int foodYes;
    private int mealTwo;
    private int mealThree;
    private int mealOne;
    private int mealBlue;
    private int mealMore;
    private int drinkNo;
    private int drinkYes;
    private int meatBeef;
    private int meatSeafood;
    private int meatChicken;
    private int meatPork;
    private String favoriteMealAnswer;

    public FatimaData(int name) {
        personName = name;
        favoriteMealAnswer = "";
        eatNo = "0";
        eatYes = "0";
        foodMaybe = "0";
        foodNo = "0";
        foodYes = "0";
        mealTwo = "0";
        mealThree = "0";
        mealOne = "0";
        mealBlue = "0";
        mealMore = "0";
        drinkNo = "0";
        drinkYes = "0";
        meatBeef = "0";
        meatSeafood = "0";
        meatChicken = "0";
        meatPork = "0";
    }
    public int getPersonName() {return personName;}
    public void setPersonName (int s) {personName = s;}

    public String getFavoriteMealAnswer() {return favoriteMealAnswer;}
    public void setFavoriteMealAnswer (String s) {favoriteMealAnswer = s;}

    public int getEatNo() {return eatNo;}
    public void setEatNo(int b) {eatNo =b; }

    public int getEatYes() {return eatYes;}
    public void setEatYes(int b) {eatYes =b; }

    public int getFoodMaybe() {return foodMaybe;}
    public void setFoodMaybe(int b) {foodMaybe =b; }

    public int getFoodNo() {return foodNo;}
    public void setFoodNo(int b) {foodNo =b; }

    public int getFoodYes() {return foodYes;}
    public void setFoodYes(int b) {foodYes =b; }

    public int getMealTwo() {return mealTwo;}
    public void setMealTwo(int b) {mealTwo =b; }

    public int getMealThree() {return mealThree;}
    public void setMealThree(int b) {mealThree =b; }

    public int getMealOne() {return mealOne;}
    public void setMealOne(int b) {mealOne =b; }

    public int getMealBlue() {return mealBlue;}
    public void setMealBlue(int b) {mealBlue =b; }

    public int getMealMore() {return mealMore;}
    public void setMealMore(int b) {mealMore =b; }

    public int getDrinkNo() {return drinkNo;}
    public void setDrinkNo(int b) {drinkNo =b; }

    public int getDrinkYes() {return drinkYes;}
    public void setDrinkYes(int b) {drinkYes =b; }

    public int getMeatBeef() {return meatBeef;}
    public void setMeatBeef(int b) {meatBeef =b; }

    public int getMeatSeafood() {return meatSeafood;}
    public void setMeatSeafood(int b) {meatSeafood =b; }

    public int getMeatChicken() {return meatChicken;}
    public void setMeatChicken(int b) {meatChicken =b; }

    public int getMeatPork() {return meatPork;}
    public void setMeatPork(int b) {meatPork =b; }
}
