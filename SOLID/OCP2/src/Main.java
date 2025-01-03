public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal cat = new Cat();
        Animal dog = new Dog();

        SpeakAnimal speakAnimal = new SpeakAnimal();
        speakAnimal.speak(bird);
        speakAnimal.speak(cat);
        speakAnimal.speak(dog);
    }
}