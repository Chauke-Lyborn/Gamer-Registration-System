/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vut.data;

/**
 *
 * @author chauk
 */
public abstract class Gamer implements ProcessGamers {

    private String id, name, code;
    private int age;

    public Gamer() {
    }

    public Gamer(String id, String name, int age) {
        setId(id);
        setName(name);
        setAge(age);
    }

    private void setId(String id) {
        if (id.length() == 6) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Invalid Gamer ID entered: " + id);
        }
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getAge() {
        return age;
    }

    @Override
    public abstract String genCode();

    @Override
    public abstract int calculateDiscount(int fee);

    @Override
    public String toString() {
        return  code + '\t' + id + '\t' + name ;
    }

}
