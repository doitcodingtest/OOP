public class Main {
    public static void main(String[] args) {
        Animal bird = new Animal("Bird");
        Animal cat = new Animal("Cat");
        Animal dog = new Animal("Dog");

        SpeakAnimal speakAnimal = new SpeakAnimal();
        speakAnimal.speak(bird);
        speakAnimal.speak(cat);
        speakAnimal.speak(dog);
    }
}