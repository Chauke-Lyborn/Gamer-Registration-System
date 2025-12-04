/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vut.data;

/**
 *
 * @author chauk
 */
public class AmGamer extends Gamer {

    private int category;

    public AmGamer() {
    }

    public AmGamer(String id, String name, int age, int category) {
        super(id, name, age);
        setCategory(category);
        setCode(genCode());
    }

    private void setCategory(int category) {
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    @Override
    public String genCode() {

        String code;
        code = "A" + getId() + "-" + category;

        return code;
    }

    @Override
    public int calculateDiscount(int fee) {
        int discount = 0;
        if (fee >= 0) {
            switch (category) {
                case 1:
                    if (getAge() < 16) {
                        discount = (int) (fee * 0.40);
                    } else if (getAge() >= 16) {
                        discount = (int) (fee * 0.30);
                    }
                    break;
                case 2:
                    discount = (int) (fee * 0.20);
                    break;
                case 3:
                    discount = 0;
                    break;
                default:
                    break;
            }

        } else {
            throw new IllegalArgumentException("Invalid registration fee entered:" + fee);
        }

        return discount;
    }

    @Override
    public String toString() {
        return super.toString() + '\t' + category ;
    }

}
