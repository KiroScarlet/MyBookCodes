package NewCoderSolution.real2019;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-14  -22:23
 * @title Real2019007
 * @project MyBookCodes
 * @desc TODO
 */
public class Real2019007 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        int n=in.nextInt();

        int[] alarmClock=new int[n];
        for(int i=0;i<n;i++){
            int hour=in.nextInt();
            int min=in.nextInt();
            alarmClock[i]=hour*60+min;
        }
        int xTime=in.nextInt();
        int classTime=in.nextInt()*60+in.nextInt();
        int wakeTime=classTime-xTime;

        int time=Integer.MAX_VALUE;
        int result=0;
        for(int i=0;i<n;i++){
            if((wakeTime-alarmClock[i])<0){
                continue;
            }else{
                int tmpTime =wakeTime-alarmClock[i];
                if(tmpTime<time){
                    result=alarmClock[i];
                    time=tmpTime;
                }
            }
        }

        System.out.println(result/60+" "+result%60);

    }
}