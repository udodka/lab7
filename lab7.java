package com.company;
import java.util.*;

public class lab7 {

    public class Fraction { //создание класса дробей
        public int denominator;//создаем свойства класса(знаменатель)
        public int numerator;//создаем свойства класса(числитель)

        public Fraction(int denominator, int numerator) {//создаем конструктор, который принимает два параметра
            this.denominator = denominator;
            this.numerator = numerator;
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public String toString() {
            return numerator + "/" + denominator;
        }

        private int nod(int a, int b) {
            return b == 0 ? a : nod(b, a % b);
        }

        private int nok(int a, int b) {
            return a / nod(a, b) * b;
        }

        public Fraction add(Fraction other) {
            Fraction result = new Fraction(1, 1);
            if (this.denominator == other.denominator) { //если знаменатели одинаковые
                result.denominator = this.denominator;
                result.numerator = this.numerator + other.numerator;
            } else {
                int nok = nok(this.denominator, other.denominator);
                result.denominator = nok;
                result.numerator = this.numerator * (nok / this.denominator) + other.numerator * (nok / other.denominator);
            }
            return result;
        }

        public Fraction multiply(Fraction other) {
            Fraction result = new Fraction(1, 1);
            result.denominator = this.denominator * other.denominator;
            result.numerator = this.numerator * other.numerator;
            return result;
        }
    }
            public class FractionTest {
                public static void main(String[] args) {

                    Scanner in = new Scanner(System.in);

                    System.out.print("input denominator1 :");
                    denominator = in.nextInt();

                    System.out.print("input numerator2:");
                    numerator = in.nextInt();

                    Fraction frac1 = new Fraction(denominator, numerator);

                    Fraction frac2 = new Fraction(denominator, numerator);

                    Main.Fraction sum = calculator.add(frac1, frac2);
                    System.out.println(frac1 + " + " + frac2 +" = " + sum);

                    Main.Fraction mult = calculator.multiply(frac1, frac2);
                    System.out.println(frac1 + " * " + frac2 +" = " + mult);

                }
                }
            }
