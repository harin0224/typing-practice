package TongTongTyping;

import java.util.Scanner;

public class MiniGame {
    int level;
    double com=0;

    Confirm con=new Confirm();
    Scanner scan=new Scanner(System.in);
    ENTypingPrac en = new ENTypingPrac();
    KRTypingPrac kr = new KRTypingPrac();

    void choiceLevel(long start_time, long end_time) {
        System.out.println(" <���̵� ����>");
        System.out.println("1. ��\n   2. ��\n   3. ��\n");
        System.out.printf("�Է� >> ");
        String lev = scan.nextLine();
        con.start_time = System.currentTimeMillis();
        en.shortPhrase();
        con.end_time = System.currentTimeMillis();
        con.time_check(start_time, end_time);

        switch(lev) {
        case "1":{ 
            com=(int)((Math.random()*15)+55);//55~69
            System.out.println("��ǻ�� �Է½ð�: "+ com);
            if(con.accuracy>=com) {
                System.out.println("�¸��Ͽ����ϴ�.");
            }
            else {
                System.out.println("�й��Ͽ����ϴ�.");
            }
            con.inputid();
            con.inputRank(con.time);
        }//end of 1
        case "2":{ 
            com=(int)((Math.random()*6)+70);//70~84
            System.out.println("��ǻ�� �Է½ð�: "+ com);
            if(con.accuracy>=com) {
                System.out.println("�¸��Ͽ����ϴ�.");
            }
            else {
                System.out.println("�й��Ͽ����ϴ�.");
            }
            con.inputid();
            con.inputRank(con.time);
        }//end of 2
        case "3": {//5~7
            com=(int)((Math.random()*3)+5);//85~100
            System.out.println("��ǻ�� �Է½ð�: "+ com);
            if(con.accuracy>=com) {
                System.out.println("�¸��Ͽ����ϴ�.");
            }
            else {
                System.out.println("�й��Ͽ����ϴ�.");
            }
            con.inputid();
            con.inputRank(con.time);
        }//end of 3
        }
    }
}