package geometries;
/**
 * The RadialGeometry abstract class represents a geometry with a radial characteristic,
 * such as a sphere or cylinder, that is defined by a radius value.
 */
abstract class RadialGeometry implements Geometry{
    /** The radius value of the geometry. */
    protected double radios;
    /**
     * Constructs a new RadialGeometry object with the specified radius.
     * @param radius the radius value of the geometry
     */
    public RadialGeometry(double radios) {

        this.radios = radios;
    }
}
