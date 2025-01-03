class SpeakAnimal {
    void speak(Animal animal) {
        if (animal.name.equals("Bird")) {
            System.out.println("짹짹");
        } else if (animal.name.equals("Cat")) {
            System.out.println("야옹");
        } else if (animal.name.equals("Dog")) {
            System.out.println("멍멍");
        }
    }
}