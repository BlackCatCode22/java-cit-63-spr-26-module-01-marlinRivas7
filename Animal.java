
    public class Animal {
        public static void main(String [] args) {

            Cat myCat = new Cat();
            myCat.meow();
            myCat.name = "Stella";
            myCat.age = 8;

            System.out.println(Cat.MAX_LIVES);
            System.out.println(Cat.getCatCount());

        }
    }