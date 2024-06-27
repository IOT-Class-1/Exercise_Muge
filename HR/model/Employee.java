package com.example.HR.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // bu anatasyon, bu sınıfın veritabanı tablosuna karşılık geldiğini gösterir
public class Employee {
    @Id //bu id alanının birinci anahtar olduğunu gösterir
    @GeneratedValue (strategy = GenerationType.IDENTITY) //bu, id alanının otomatik olarak artılacağını belirtir

    private long id; //çalışanın unique kimliği
    private String name; //çalışanın adı
    private String position; //çalışanın pozisyonu


    //Getter ve Setter metotları
    //Getter, özel alanların değerini okumak için kullanılır.
    //Setter, özel alanların değerlerini ayarlamak için kullanılır.
    //generate ile getter and setter seçilerek yapılır.

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
