public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        voice(animal);
        voice(dog);
        voice(cat);
    }
    public static void voice(Animal animal){
        animal.talk();
    }
}