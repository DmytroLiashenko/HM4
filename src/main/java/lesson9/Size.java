package lesson9;

public enum Size {
    SMALL("S", 12, 32), MEDIUM("M", 11, 67), LARGE("L", 45, 66), EXTRA_LARGE("XL", 55, 89);

    Size(String size, int width, int length) {
        this.size = size;
        this.width=width;
        this.length=length;
    }


    public String getSize() {
        return size;
    }

    private String size;

    public int getWidth() {
        return width;
    }

    private int width;

    public int getLength() {
        return length;
    }

    private int length;

    @Override
    public String toString() {
        return this.size + " or "+this.name() + " size: " +"width=" + this.width+ " length="+ this.length;
    }
}
