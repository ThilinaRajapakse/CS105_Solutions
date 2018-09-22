package pdn.scs.lab3_methods;

/**
 * Represents a Particle in 3-D Cartesian Coordinates
 * A particle has a x, y, and z values, and a distance to the particle from the origin(0, 0, 0).
 * It can move in any direction in 3D space.
 */
public class Particle
{
    double x;
    double y;
    double z;
    double distance;

    /**
     * Create a new Particle with random values.
     * x, y, and z will be between 0 and 100.
     */
    Particle()
    {
        this.x = Math.random() * 100;
        this.y = Math.random() * 100;
        this.z = Math.random() * 100;
        calcDistance();
    }

    /**
     * Create a new Particle with given x, y, and z values
     * @param x x-coordinate of the particle
     * @param y y-coordinate of the particle
     * @param z z-coordinate of the particle
     */
    Particle(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        calcDistance();
    }

    /**
     * Move a Particle
     * Moves a Particle along the axes x, y, and z by a given amount.
     * Updates the position(x, y, z coordinates) and distance from origin to the particle.
     * @param moveX
     * @param moveY
     * @param moveZ
     */
    void moveParticle(double moveX, double moveY, double moveZ)
    {
        this.x += moveX;
        this.y += moveY;
        this.z += moveZ;
        calcDistance();
    }

    /**
     * Move a Particle
     * Moves a Particle by a random distance along the axes x, y, and z.
     * Updates the position(x, y, z coordinates) and distance from origin to the particle.
     */
    void moveParticle()
    {
        this.x += Math.random() * 10;
        this.y += Math.random() * 10;
        this.z += Math.random() * 10;
        calcDistance();
    }

    /**
     * Print the current location and distance from origin to the particle.
     */
    void printParticle()
    {
        System.out.println("(" + this.x + ", " + this.y + ", " + this.z + ")" + "\t\tDistance from origin: " + this.distance);
    }

    /**
     * Calculate the distance from origin to the Particle and update the distance attribute.
     */
    void calcDistance()
    {
        this.distance = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }
}













