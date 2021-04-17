package _01_sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("spongebob");
	SeaCreature patrick = new SeaCreature("patrick");
	SeaCreature squidward = new SeaCreature("squidward");
	spongebob.getName();
	spongebob.eat();
	spongebob.laugh();
	patrick.getName();
	patrick.eat();
	patrick.laugh();
	squidward.getName();
	squidward.eat();
	squidward.laugh();
}
}
