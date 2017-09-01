package com.cn.build.factory.abstractF.example.pizza.ingredient;

import com.cn.build.factory.abstractF.example.pizza.ingredient.sausage.Pepperoni;
import com.cn.build.factory.abstractF.example.pizza.ingredient.cheese.Cheese;
import com.cn.build.factory.abstractF.example.pizza.ingredient.clams.Clams;
import com.cn.build.factory.abstractF.example.pizza.ingredient.dough.Dough;
import com.cn.build.factory.abstractF.example.pizza.ingredient.sauce.Sauce;
import com.cn.build.factory.abstractF.example.pizza.ingredient.vegetable.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
