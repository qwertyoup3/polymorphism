public class overriding_overloading {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();

        animal.speak(); // Memanggil method versi kelas induk
        cat.speak();    // Memanggil method yang dioverride di kelas anak

        Math math = new Math();
        System.out.println("2 + 3 = " + math.add(2, 3));
        System.out.println("2 + 3 + 4 = " + math.add(2, 3, 4));
    }
}

class Animal {
    void speak() {
        System.out.println("Animal: Suara umum");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat: Meong");
    }
}

class Math {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
