package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> mas = new ArrayList<>();
        for(int i=0;i<n; i++) {
            mas.add(scanner.nextInt());
        }
        int count = 0;
        for(int i=0; i< mas.size()-2; i++) {
            if(mas.get(i) == mas.get(i+1) && (mas.get(i+1) == mas.get(i+2))) {
                int e = mas.get(i);
                while(i<mas.size()) {
                    if(mas.get(i) == e) {
                        mas.remove(i);
                        count++;
                    } else break;
                }
                i = -1;
            }
        }
        System.out.println(count);

    }
}
