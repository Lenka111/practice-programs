//Voinu Elena
package Voinu_Elena.hw3;

abstract class ShapeBase implements Shape {
    protected int id;
    protected String type;
    protected double area;
    protected double dimensions;

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setId(int id) {
    }

    @Override
    public int getId() {
        return id;
    }

    public double getDimensions() {
        return dimensions;
    }


   public boolean equals(Object otherObject) {
        if (otherObject == this) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (otherObject instanceof ShapeBase)
        {
            ShapeBase other = (ShapeBase) otherObject;

                    return
                            other.getArea() == getArea() &&
                            other.getDimensions() == getDimensions() &&
                            other.getType()==getType();

        } else {
            return false;
        }
    }

        public String toString ()
        {
            return getType() + "(ID: " + getId() + ")";
        }
    }





