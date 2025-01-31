package src;

import java.io.Serializable;

class Obj implements Serializable {
    private int a;
    private String b;

    public Obj(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}
