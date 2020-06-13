package test;

import methods.AreComplanar;
import methods.IsOrthogonal;
import methods.VectorsIntersection;
import object.Vector;

public class Main {
/*Определить класс Вектор в R3. Реализовать методы для проверки векторов
на ортогональность, проверки пересечения неортогональных векторов,
сравнения векторов. Создать массив из m объектов. Определить компланарные векторы
 */
    public static void main(String[] args) {
        Vector a = new Vector(1,0,0);
        Vector b = new Vector(0,1,0);
        Vector c = new Vector(1,1,0);
        System.out.println("Проверка на компланарность: " + AreComplanar.areComlanar(a, b, c));
        System.out.println("Проверка на ортогональность: " + IsOrthogonal.isOrthogonal(a, b));
        System.out.println("Угол, образованный пересечением неортогональных векторов: " + VectorsIntersection.getAngle(a, c));
    }

}
