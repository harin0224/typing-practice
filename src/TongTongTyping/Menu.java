package TongTongTyping;

import java.util.Scanner;

public class Menu {
	MiniGame game = new MiniGame();
    Confirm con = new Confirm();
    Scanner scan = new Scanner(System.in);
    KRTypingPrac kr = new KRTypingPrac();
    ENTypingPrac en =new ENTypingPrac();
    String userinput;
	
	public void startMenu() {
		
    	System.out.println("<<<����Ÿ�� ����>>>\n\n     1. ����\n\n     2. ����\n");
    	System.out.printf("�Է� >> ");
    	String start = scan.nextLine();
    	switch(start) {
    	case "1":
    		LanguageMenu();
    	case "2":
    		System.out.println("\n<<<Ÿ�ڿ����� �����մϴ�>>>");
    		break;
    	default:
        	System.out.println("��ȣ�� �ٽ� �Է��ϼ���");
    	
    	}
    }

    public void LanguageMenu() {
    	System.out.println("\n    <<<����>>>");
    	System.out.println("\n    1. �ѱ� ����\n\n    2. ���� ����\n");
    	System.out.printf("�Է� >> ");
    	userinput = scan.nextLine();
    	switch(userinput) {
    	case"1":
    		System.out.println("\n  <�ѱ� Ÿ�ڿ���>");
            System.out.println("\n   1. �ڸ�����\n   2. ª���� ����\n   3. ��ۿ���\n   4. �̴ϰ���\n   5. ��ŷ\n   6. ����\n");
            System.out.printf("�Է� >> ");
            userinput = scan.nextLine();
            switch(userinput) {
            case"1":
                kr.charPractice();
                break;
            case"2":
                kr.shortPhrase();
                break;
            case"3":
                kr.longPhrase();
                break;
            case"4":
                game.choiceLevel(1,1);
                break;
            case"5":
                con.countRank();
                break;
            case"6":
                System.out.println("\\n<<<Ÿ�ڿ����� �����մϴ�>>>");
                break;
            default:
            	System.out.println("��ȣ�� �ٽ� �Է��ϼ���");
            }
            break;
        case"2":
        	System.out.println("\n   ���� Ÿ�ڿ���");
            System.out.println("\n   1. �ڸ�����\n   2. ª���� ����\n   3. ��ۿ���\n   4. �̴ϰ���\n   5. ��ŷ\n   6. ����\n");
            System.out.printf("�Է� >> ");
            userinput = scan.nextLine();
            switch(userinput) {
            case"1":
                en.charPractice();
                break;
            case"2":
            	en.shortPhrase();
                break;
            case"3":
                en.longPhrase();
                break;
            case"4":
                game.choiceLevel(1,1);
                break;
            case"5":
                con.countRank();
                break;
            case"6":
                System.out.println("Ÿ�ڿ����� �����մϴ�.");
                break;
            default:
            	System.out.println("��ȣ�� �ٽ� �Է��ϼ���");
            }
            break;
    	default:
    		System.out.println("��ȣ�� �ٽ� �Է��ϼ���");
    	}
    }
    
    

}