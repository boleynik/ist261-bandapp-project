import models.*;

public class ModelClassTest {
    public static void main(String[] args) {
        Director director = new Director("Jack", "Smith");
        System.out.println(director);

        System.out.println();
        Uniform uniform1 = new Uniform(true, true, true, true, true, true, true);
        BandInstrument instrument1 = new BandInstrument("Mellophone", "Conn", 17);
        Member member1 = new Instrumentalist(001, "Ben", "Oleynik", 2,
                "C3", true, uniform1, 100, 100, instrument1);
        System.out.println(member1);
        System.out.println();
        System.out.println();
        System.out.println(instrument1);
        System.out.println();
        System.out.println();

        Uniform uniform2 = new Uniform(true, true, true, true, true, true, true);
        Prop prop1 = new Prop("Baton", 01);
        Member member2 = new Bandfront(18, "Jess", "Twirl", 1, "A2",
                false, uniform2, 100, 100, prop1);
        System.out.println(member2);
        System.out.println();
        System.out.println();
        System.out.println(prop1);
        System.out.println();
        System.out.println();

        System.out.println(uniform1);


    }
}
