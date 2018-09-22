package pdn.scs.lab3_methods;

public class CoordinateSystem
{
    public static void main(String[] args)
    {
        Particle particle1 = new Particle(43.1, 58.8, 11.3);
        Particle particle2 = new Particle();
        Particle particle3 = new Particle();

        particle1.printParticle();
        particle2.printParticle();
        particle3.printParticle();

        particle3.moveParticle(23.1, 57.2, 1.04);
        particle3.printParticle();

        particle1.moveParticle();
        particle1.printParticle();
    }
}
