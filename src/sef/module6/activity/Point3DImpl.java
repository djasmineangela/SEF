package sef.module6.activity;

/**
 * @author Jasmine Angela Dela Rosa
 * 
 *         This class represents a point in 3D space. The coordinates are
 *         represented by a set of values x, y an z that represents the
 *         coordinates along each plane
 */
public class Point3DImpl extends Point2DImpl implements Point3D {
	private double z;

	/**
	 * Creates a Point3D object with the default coordinate of 0,0,0
	 *
	 */
	public Point3DImpl() {
		this.z = 0;

	}

	/**
	 * Creates a Point3D object at the specified coordinates
	 * 
	 * @param x
	 *            coordinate along the x axis
	 * @param y
	 *            coordinate along the y axis
	 * @param z
	 *            coordinate along the z axis
	 */
	public Point3DImpl(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#setZ(double)
	 */
	public final void setZ(double z) {
		this.z = z;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#getZ()
	 */
	public final double getY() {
		return super.getY();
	}

	public final void setY(double y) {
		super.setY(y);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#getZ()
	 */
	public final double getX() {
		return super.getX();
	}

	public final void setX(double x) {
		super.setX(x);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#getZ()
	 */
	public final double getZ() {
		return this.z;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#move(double, double, double)
	 */
	public void move(double x2, double y2, double z2) {
		setX(x2);
		setY(y2);
		this.z = z2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#translate(double, double, double)
	 */
	public void translate(double x2, double y2, double z2) {
		setX(getX()+x2);
		setY(getY()+y2);
//		this.x += x2;
		this.z += z2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#equals(double, double, double)
	 */
	public boolean equals(double x2, double y2, double z2) {
		if(getX() == x2 && getY() == y2 && getZ() == z2) {
			return true;
		}
		return false;
	}

	/**
	 * Compares if the coordinates are equal to the coordinates specified by the
	 * parameter
	 * 
	 * @param p
	 *            the coordinates to compare
	 * 
	 * @return true if the parameter is an instance of Point3D and contain the same
	 *         coordinates, false otherwise
	 */
	public boolean equals(Object p) {
		Point3D p2 = (Point3D) p;
		if(getX() == p2.getX() && getY() == p2.getY() && getZ() == p2.getZ()) {
			return true;
		}
		return false;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#getDistance(sef.module5.activity.Point3D)
	 */
	public double getDistance(Point3D p) {

		return Math.sqrt(
				Math.pow((p.getY() - getY()), 2) + Math.pow(p.getX() - getX(), 2) + Math.pow(p.getZ() - getZ(), 2));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sef.module5.activity.Point3D#getDistance(double, double, double)
	 */
	public double getDistance(double x2, double y2, double z2) {

		return Math.sqrt(Math.pow((y2 - getY()), 2) + Math.pow(x2 - getX(), 2) + Math.pow(z2 - getZ(), 2));

	}

}
