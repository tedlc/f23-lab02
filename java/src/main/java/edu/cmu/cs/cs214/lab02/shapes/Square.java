package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    public double sideLen;

    private Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    public double getArea() {
        return sideLen * sideLen;
    }
}
