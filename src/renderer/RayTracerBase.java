package renderer;

import scene.Scene;
import primitives.Color;
import primitives.Ray;

/**
 * RayTracerBase is an abstract class that represents a ray tracer base.
 */
public abstract class RayTracerBase {
    protected Scene scene;


    /**
     * The delta for the shadow rays.
     */
    protected int rayNumReflection = 1;

    protected double rayAngle = 0;

    protected int rayNumRefraction = 1;
    protected int rayNumAntiAliasing = 1;

    /**
     * Sets the amount of rays.
     * @param amountOfRays The amount of rays.
     * @return The RayTracerBasic object.
     */
    abstract protected RayTracerBasic setRayNumReflection(int amountOfRays);

    /**
     * Sets the amount of rays.
     * @param amountOfRays The amount of rays.
     * @return The RayTracerBasic object.
     */
    abstract protected RayTracerBasic setRayNumRefraction(int amountOfRays);

    /**
     * Sets the amount of rays.
     * @param amountOfRays The amount of rays.
     * @return The RayTracerBasic object.
     */
    abstract protected RayTracerBasic setRayNumAntiAliasing(int amountOfRays);

    abstract protected RayTracerBasic setAngle(double angle);

    /**
     * Constructor for RayTracerBase class.
     * @param myScene the scene
     */
    public RayTracerBase(Scene myScene) {
        this.scene = myScene;
    }

    /**
     * Trace ray.
     * @param ray the ray
     * @return the color
     */
    public abstract Color traceRay(Ray ray);

}
