public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("owczarek");
        for(int i = 0; i < 5; i++) {
            animal.feed();
            animal.takeForAWalk();
        }

    }
}