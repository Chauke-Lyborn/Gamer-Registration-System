/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vut.data;

/**
 *
 * @author chauk
 */
public class ProGamer extends Gamer {

    private int regYear;
    private int rank;

    public ProGamer() {
    }

    public ProGamer(String id, String name, int age, int regYear, int rank) {
        super(id, name, age);
        setRegYear(regYear);
        setRank(rank);
        setCode(genCode());
    }

    private void setRegYear(int regYear) {
        this.regYear = regYear;
    }

    private void setRank(int rank) {
        this.rank = rank;
    }

    public int getRegYear() {
        return regYear;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String genCode() {

        String code;
        code = "P" + String.format("%02d", rank) + getAge() + "-" + String.format("%02d", regYear);

        return code;
    }

    @Override
    public int calculateDiscount(int fee) {

        int discount = 0;

        if (fee >= 0) {
            if (regYear == 1) {
                discount = (int) (fee * 0.05);

            } else if (regYear == 2) {
                discount = (int) (fee * 0.10);

            } else if (regYear == 3) {
                discount = (int) (fee * 0.15);

            } else if (regYear == 4) {
                discount = (int) (fee * 0.20);

            } else if (regYear == 5) {
                discount = (int) (fee * 0.25);

            } else if (regYear == 6) {
                discount = (int) (fee * 0.30);

            } else if (regYear == 7) {
                discount = (int) (fee * 0.35);

            } else if (regYear == 8) {
                discount = (int) (fee * 0.40);

            } else if (regYear == 9) {
                discount = (int) (fee * 0.45);

            } else if (regYear >= 10) {
                discount = (int) (fee * 0.50);
            }
        } else {
            throw new IllegalArgumentException("Invalid registration fee entered:" + fee);
        }

        return discount;
    }

    @Override
    public String toString() {
        return  super.toString()+ '\t' + regYear + '\t' + rank ;
    }

}
/*

        double perc = 0.05;

        for (int i = 1; i < 10; i++) {

             if (regYear == i) {
                discount = (int) (fee * perc);
            }
            perc += 0.05;

        }
        
        if (regYear >= 10) {
                discount = (int) (fee * 0.50);

            }


"Code\t" + "ID number\t" + "Name\t\t" + "Category\n"

"Code\t" + "ID number\t" + "Name\t\t" + "Years\t" + "Rank\n"
                +
*/