package module2;

public abstract class Quadrilateral {
    private Integer base;
    private Integer height;

    public Quadrilateral() {
        base = 0;
        height = 0;
    }

    public Quadrilateral(Integer base, Integer height) {
        this.base = base;
        this.height = height;
    }   

    public Integer getHeight() {
        return height;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer area() {
        return base * height;
    }
}