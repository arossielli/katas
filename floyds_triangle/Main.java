package com.practicas.patronesdediseño;

public class Main {

    public static void main(String[] args) {
        int n=14;
        int p=1;
        for (int f=1; f<=n; f++){
            for(int i =f; i>0; i--){
                System.out.print(p+" ");
                p++;
            }
            System.out.print("\n");
        }
    }
}
