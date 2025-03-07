package main.java.cafe.view;

import main.java.cafe.model.Beverage;

import java.util.Scanner;

public class OutputView {
    public String printOrder(Beverage beverage) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("고객님께서 주문하신 주문 내역입니다.");
            System.out.println();
            System.out.println("음료 : " + beverage.getName());
            System.out.println("가격 : " + beverage.getPrice());
            System.out.println("주문 내역이 맞나요? (Y/N)");
            System.out.print(">> ");
            String check = sc.nextLine().strip().toUpperCase();
            if (!check.equals("Y") && !check.equals("N")) {
                System.out.println("Y, N 둘 중 하나만 입력해주세요.");
            } else {
                return check;
            }
        }
    }
}
