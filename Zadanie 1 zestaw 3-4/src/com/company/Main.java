package com.company;

public class Main {

    public static void main(String[] args) {
        var punkt = new Punkt3D[3];
        punkt[0] = new Punkt3D();
        punkt[1] = new Punkt3D(46,23,10);
        punkt[2] = new Punkt3D(246,233,1011);

        for(var p : punkt){
            System.out.println(p);
        }
    }
}

/* Przygotuj klasę Punkt3D pozwalającą na reprezentowanie punktów w
przestrzeni 3D. Współrzędne punktu to wartości rzeczywiste.
    -przygotuj konstruktor domyślny bezparametrowy ustalający wartości
punktu w początku układu współrzędnych (0,0,0);
    -przygotuj konstruktor z trzema parametrami wskazującymi
przesunięcie punktu względem początku układu współrzędnych;
    -do każdego pola klasy napisz gettery oraz settery;
    -napisz metodę pozwalającą wyznaczyć odległość punktu od
początku układu współrzędnych w metryce euklidesowej;
    -jw. ale przygotuj metodę dla metryki Manhattan. */
class Punkt3D{
    private int X, Y, Z;

    public Punkt3D(){
        X = 0;
        Y = 0;
        Z = 0;
    }
    public Punkt3D(int x, int y, int z){
        this.X = x;
        this.Y = y;
        this.Z = z;
    }

    public void setX(int x) {
        X = x;
    }
    public int getX() {
        return X;
    }

    public void setY(int y) {
        Y = y;
    }
    public int getY() {
        return Y;
    }

    public void setZ(int z) {
        Z = z;
    }
    public int getZ() {
        return Z;
    }

    public double MetrykaEuklidesowa(){
        return Math.sqrt(Math.pow((getX()-0), 2) + Math.pow((getY()-0), 2) + Math.pow((getZ()-0), 2));
    }

    public double MetrykaManhattan(){
        return Math.abs(getX() -0)+ Math.abs(getY()-0) + Math.abs(getZ()-0);
    }

    public String toString(){
        var ME = "Odleglosc w metryce Euklidesowej miedzy punktem 0, a zadanym wynosi: "+ MetrykaEuklidesowa();
        var MH = "Odleglosc w metryce Manhattan miedzy punktem 0, a zadanym wynosi: "+ MetrykaManhattan();
        return ME +"\n" + MH + "\n";
    }
}