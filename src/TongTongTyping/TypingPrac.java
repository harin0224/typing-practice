package TongTongTyping;

import java.util.Random;
import java.util.Scanner;

public abstract class TypingPrac {
    String choice;
    Random random = new Random();
    Confirm con = new Confirm();
    Scanner scan = new Scanner(System.in);
    Menu m = new Menu();

    public abstract void charPractice();
    public abstract void shortPhrase();
    public abstract void longPhrase();

    public void choicestate() {
        System.out.println(" 1. ����ȭ��\n 2. ����");
        choice = scan.nextLine();
        switch(choice) {
        case "1":
            m.startMenu();
            break;
        case "2":
            break;
        }
    }
}