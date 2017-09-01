package com.cn.build.factory.abstractF.example.pizza.ingredient;

import com.cn.build.factory.abstractF.example.pizza.ingredient.sausage.Pepperoni;
import com.cn.build.factory.abstractF.example.pizza.ingredient.sausage.SlicedPepperoni;
import com.cn.build.factory.abstractF.example.pizza.ingredient.cheese.Cheese;
import com.cn.build.factory.abstractF.example.pizza.ingredient.cheese.ReggianoCheese;
import com.cn.build.factory.abstractF.example.pizza.ingredient.clams.Clams;
import com.cn.build.factory.abstractF.example.pizza.ingredient.clams.FreshClams;
import com.cn.build.factory.abstractF.example.pizza.ingredient.dough.Dough;
import com.cn.build.factory.abstractF.example.pizza.ingredient.dough.ThinCrustDough;
import com.cn.build.factory.abstractF.example.pizza.ingredient.sauce.MarinaraSauce;
import com.cn.build.factory.abstractF.example.pizza.ingredient.sauce.Sauce;
import com.cn.build.factory.abstractF.example.pizza.ingredient.vegetable.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
