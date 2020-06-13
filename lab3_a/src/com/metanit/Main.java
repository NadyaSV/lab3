package com.metanit;
import java.util.Date;

/**
 *Создать класс Student.
 * Определить конструкторы и методы setТип(), getТип(), toString(). Определить дополнительно методы в классе, создающем массив объектов.
 * Задать критерий выбора данных и вывести эти данные на консоль.
 * В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 *
 * @author Надя
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        student[] stu = new student[4];
        stu[0] = new student(1, "Витязь", "Юлия", "Владимировна", new Date(2000, 8, 28), "Стариновская", 375298087, "Механико-математический", 2, "6");
        stu[1] = new student(2, "Сапьяник", "Надежда", "Васильевна", new Date(2000, 8, 29), "50 лет Победы", 375295592, "Механико-математический", 2, "6");
        stu[2] = new student(3, "Нечай", "Ольга", "Николаевна", new Date(1999, 2, 24), "Понамарева", 375295631, "Биологический", 3, "5");
        stu[3] = new student(4, "Полякевич", "Никита", "Валентинович", new Date(2000, 9, 22), "Руссианова", 375297823, "Журналистики", 3, "8");

        Date p=new Date(1999, 2, 24);
        System.out.printf("%2s %12s %11s %15s %17s %10s %11s %15s %17s %8s", "Id", "Surname", "Name",
                "MiddleName", "DateOfBirthday", "Address", "Telephone", "Fac", "Course", "Group");

        System.out.println();
        System.out.println();

        for (int i = 0; i <= 3; i++) {
            stu[i].show();
        }
//вывод на экран
        System.out.println();
        System.out.println("Список студентов заданного факультета:");
        for (int i = 0; i <= 3; i++) {
            stu[i].fakultet();
        }
        System.out.println();
        System.out.println("Списки студентов для каждого факультета и курса:");
        for (int i = 0; i <= 3; i++) {
            stu[i].fakkurs();
        }
        System.out.println();
        System.out.println("Список студентов, родившихся после заданного года:");
        for (int i = 0; i <= 3; i++) {
            stu[i].date_roj(p);
        }
        System.out.println();
        System.out.println("Список учебной группы:");
        for (int i = 0; i <= 3; i++) {
            stu[i].group();
        }





    }
}
// создаем класс
class student {

    public int id;
    public String surname;
    public String name;
    public String otchestvo;
    public Date data_rojdeniya;
    public String adres;
    public int telefone;
    public String fakultet;
    public int kurs;
    public String gruppa;

    public student() {
    }

    public student(int id, String surname, String name, String otchestvo, Date data_rojdeniya, String adres, int telefone, String fakultet, int kurs, String gruppa) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.otchestvo = otchestvo;
        this.data_rojdeniya = data_rojdeniya;
        this.adres = adres;
        this.telefone = telefone;
        this.fakultet = fakultet;
        this.kurs = kurs;
        this.gruppa = gruppa;
    }

    public String getAdres() {
        return adres;
    }

    public Date getData_rojdeniya() {
        return data_rojdeniya;
    }

    public String getFakultet() {
        return fakultet;
    }

    public String getGruppa() {
        return gruppa;
    }

    public int getId() {
        return id;
    }

    public int getKurs() {
        return kurs;
    }

    public String getName() {
        return name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public String getSurname() {
        return surname;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setData_rojdeniya(Date data_rojdeniya) {
        this.data_rojdeniya = new Date(1999, 2, 24);
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public void setGruppa(String gruppa) {
        this.gruppa = gruppa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void show() {
        System.out.printf("%2s %12s %10s %14s %14s %14s %10s %25s %5s %8s", getId(), getSurname(), getName(),
                getOtchestvo(), getData_rojdeniya().getYear()+"."+getData_rojdeniya().getMonth()+"."+getData_rojdeniya().getDay(), getAdres(), getTelefone(), getFakultet(), getKurs(), getGruppa());
        System.out.println();
    }
    /*public void show() {
        System.out.println("id: " + getId());
        System.out.println("Familya: " + getSurname());
        System.out.println("Imya: " + getName());
        System.out.println("Otchestvo: " + getOtchestvo());
        System.out.println("data rojdeniya: " + getData_rojdeniya().getYear()+"."+getData_rojdeniya().getMonth()+"."+getData_rojdeniya().getDay());
        System.out.println("adres: " + getAdres());
        System.out.println("telefone: " + getTelefone());
        System.out.println("fakultet: " + getFakultet());
        System.out.println("kurs: " + getKurs());
        System.out.println("gruppa: " + getGruppa());
    }

     */
    //список студентов заданного факультета
    public void fakultet() {
        if ((this.getFakultet()).equals("Механико-математический")) {
            System.out.println("id: " + getId());
            System.out.println("Familya: " + getSurname());
            System.out.println("Imya: " + getName());
            System.out.println("Otchestvo: " + getOtchestvo());
            System.out.println("fakultet: " + getFakultet());

        }

    }
    //списки студентов для каждого факультета и курса
    public void fakkurs() {
        if (((this.getFakultet()).equals("Биологический")) && (this.getKurs() == 3)) {
            System.out.println("id: " + getId());
            System.out.println("Familya: " + getSurname());
            System.out.println("Imya: " + getName());
            System.out.println("Otchestvo: " + getOtchestvo());
            System.out.println("fakultet: " + getFakultet());
            System.out.println("kurs: " + getKurs());
        }
    }
    //список студентов, родившихся после заданного года
    public void date_roj(Date p){
        if ((this.getData_rojdeniya().getYear()) > (p.getYear())){
            System.out.println("id: " + getId());
            System.out.println("Familya: " + getSurname());
            System.out.println("Imya: " + getName());
            System.out.println("Otchestvo: " + getOtchestvo());
            System.out.println("data rojdeniya: " + getData_rojdeniya().getYear());
        }
    }
    // список учебной группы
    public void group(){
        if (this.getGruppa().equals("6")){
            System.out.println("id: " + getId());
            System.out.println("Familya: " + getSurname());
            System.out.println("Imya: " + getName());
            System.out.println("Otchestvo: " + getOtchestvo());
            System.out.println("gruppa: " + getGruppa());

        }
    }
}