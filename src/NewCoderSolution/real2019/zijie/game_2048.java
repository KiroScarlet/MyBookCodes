package NewCoderSolution.real2019.zijie;

import java.util.Scanner;

public class game_2048 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        if (v == 1) {
            moveUp(arr);
        }
        if (v == 2) {
            moveDown(arr);
        }
        if (v == 3) {
            moveLeft(arr);
        }
        if (v == 4) {
            moveRight(arr);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void moveUp(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for(int j = 0;j < m;j++){
            //归并
            for(int i = 0;i < n-1;i++){
                if(arr[i][j] == arr[i+1][j]){
                    arr[i][j] *= 2;
                    arr[i+1][j] = 0;
                }
            }
            //上移
            for(int i = 0;i < n;i++){
                if(arr[i][j] == 0){
                    for(int k = i+1;k < n;k++){
                        if(arr[k][j] != 0){
                            arr[i][j] = arr[k][j];
                            arr[k][j] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void moveDown(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for(int j = 0;j < m;j++){
            //归并
            for(int i = n-1;i > 0;i--){
                if(arr[i][j] == arr[i-1][j]){
                    arr[i][j] *= 2;
                    arr[i-1][j] = 0;
                }
            }
            //下移
            for(int i = n-1;i >= 0;i--){
                if(arr[i][j] == 0){
                    for(int k = i-1;k >= 0;k--){
                        if(arr[k][j] != 0){
                            arr[i][j] = arr[k][j];
                            arr[k][j] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void moveLeft(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0;i < n;i++){
            //归并
            for(int j = 0;j < m-1;j++){
                if(arr[i][j] == arr[i][j+1]){
                    arr[i][j] *= 2;
                    arr[i][j+1] = 0;
                }
            }
            //左移
            for(int j = 0;j < m;j++){
                if(arr[i][j] == 0){
                    for(int k = j+1;k < m;k++){
                        if(arr[i][k] != 0){
                            arr[i][j] = arr[i][k];
                            arr[i][k] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void moveRight(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0;i < n;i++){
            //归并
            for(int j = m-1;j > 0;j--){
                if(arr[i][j] == arr[i][j-1]){
                    arr[i][j] *= 2;
                    arr[i][j-1] = 0;
                }
            }
            //左移
            for(int j = m-1;j >= 0;j--){
                if(arr[i][j] == 0){
                    for(int k = j-1;k >= 0;k--){
                        if(arr[i][k] != 0){
                            arr[i][j] = arr[i][k];
                            arr[i][k] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }
}