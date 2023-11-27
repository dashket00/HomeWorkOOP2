package interfaceHomeWork;

public class Main {
    public static void main(String[] args){
        Handmast handmast = new Handmast();
        Rabochiy rabochiy = new Rabochiy();
        Buhgalter buhgalter = new Buhgalter();

        testInterFace(handmast);
        testInterFace(rabochiy);
        testInterFace(buhgalter);

        handmast.Doljnost();
        rabochiy.Doljnost();
        buhgalter.Doljnost();

    }

    public static void testInterFace(Doljnost doljnost) {

    }


}
