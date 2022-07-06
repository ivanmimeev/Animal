abstract class Animal {
    public String name;
    abstract void eat ();
    abstract void sleep();
    public Animal (String name){
        this.name = name;
    }

}
abstract class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }
    
    @Override
        void sleep() {
        System.out.println("Vsegda interesno smotret kak spyat ribi");

        }
        abstract void swim();
}

    abstract class Bird extends Animal implements Speakable{
    public Bird (String name){
        super(name);
    }
    abstract void fly();

        @Override
        public void speak() {
            System.out.println(this.name + "Sing");
        }
    }

    abstract class Mammal extends Animal implements Speakable {
    public Mammal (String name){
        super(name);
    }
    abstract void run ();
    }


        class Mechenosec extends Fish{
        public Mechenosec (String name){
            super(name);
        }
        public void swim(){
            System.out.println("Mechenosec krasivaya riba kotoraya bistro plavaet");
        }
        public void eat(){
            System.out.println("Mechenosec ne xishnaya riba i est obichni korm");
        }
        }
        class Pingvin extends Bird{

    public Pingvin (String name){
        super(name);
    }
        public void eat(){
        System.out.println("Pingvini lybit est riby");
        }

            public void sleep(){
                System.out.println("Pingvini spyat prizavsi ldug k drugu");
            }

            public void fly(){
                System.out.println("Pingvini ne ymeut letat");
            }

            public void speak(){
                System.out.println("Pingvini ne ymeut govorit");
            }

        }

        class Lev extends Mammal {
        public Lev (String name){
            super(name);
        }
        public void eat(){
            System.out.println("Lev kak i lyboi zishnik lybit myaso");
        }
            public void sleep(){
                System.out.println("Bolshya chast dnya lev spit");
            }
            public void run(){
                System.out.println("Lev eto samaya bistraya koshka");
            }

        }


interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}

        class TestAnimal{
            public static void main(String[] args) {
                Mechenosec mech = new Mechenosec("Mechenosec");
                System.out.println(mech.name);
                mech.swim();
                mech.eat();
                mech.sleep();
                System.out.println();
                Speakable sp = new Pingvin("Pingvin");
                sp.speak();
                System.out.println();
                Animal lev = new Lev("Lev");
                System.out.println(lev.name);
                lev.eat();
                lev.sleep();
                System.out.println();
                Mammal lev2 = new Lev("Lev2");
                System.out.println(lev2.name);
                lev2.run();
                lev2.eat();
                lev2.sleep();
                lev2.speak();
            }
        }


