package com.cn.build.factory.abstractF.example.pizza.ingredient;

import com.cn.build.factory.abstractF.example.pizza.ingredient.sausage.Pepperoni;
import com.cn.build.factory.abstractF.example.pizza.ingredient.sausage.SlicedPepperoni;
import com.cn.build.factory.abstractF.example.pizza.ingredient.cheese.Cheese;
import com.cn.build.factory.abstractF.example.pizza.ingredient.cheese.MozzarellaCheese;
import com.cn.build.factory.abstractF.example.pizza.ingredient.clams.Clams;
import com.cn.build.factory.abstractF.example.pizza.ingredient.clams.FrozenClams;
import com.cn.build.factory.abstractF.example.pizza.ingredient.dough.Dough;
import com.cn.build.factory.abstractF.example.pizza.ingredient.dough.ThickCrustDough;
import com.cn.build.factory.abstractF.example.pizza.ingredient.sauce.PlumTomatoSauce;
import com.cn.build.factory.abstractF.example.pizza.ingredient.sauce.Sauce;
import com.cn.build.factory.abstractF.example.pizza.ingredient.vegetable.BlackOlives;
import com.cn.build.factory.abstractF.example.pizza.ingredient.vegetable.Eggplant;
import com.cn.build.factory.abstractF.example.pizza.ingredient.vegetable.Spinach;
import com.cn.build.factory.abstractF.example.pizza.ingredient.vegetable.Veggies;

public class ChicagoPizzaIngredientFactory
	implements PizzaIngredientFactory
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(),
		                      new Spinach(),
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
