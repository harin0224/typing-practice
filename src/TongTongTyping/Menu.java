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
		
    	System.out.println("<<<통통타자 연습>>>\n\n     1. 시작\n\n     2. 종료\n");
    	System.out.printf("입력 >> ");
    	String start = scan.nextLine();
    	switch(start) {
    	case "1":
    		LanguageMenu();
    	case "2":
    		System.out.println("\n<<<타자연습을 종료합니다>>>");
    		break;
    	default:
        	System.out.println("번호를 다시 입력하세요");
    	
    	}
    }

    public void LanguageMenu() {
    	System.out.println("\n    <<<언어선택>>>");
    	System.out.println("\n    1. 한글 연습\n\n    2. 영어 연습\n");
    	System.out.printf("입력 >> ");
    	userinput = scan.nextLine();
    	switch(userinput) {
    	case"1":
    		System.out.println("\n  <한글 타자연습>");
            System.out.println("\n   1. 자리연습\n   2. 짧은글 연습\n   3. 긴글연습\n   4. 미니게임\n   5. 랭킹\n   6. 종료\n");
            System.out.printf("입력 >> ");
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
                System.out.println("\\n<<<타자연습을 종료합니다>>>");
                break;
            default:
            	System.out.println("번호를 다시 입력하세요");
            }
            break;
        case"2":
        	System.out.println("\n   영어 타자연습");
            System.out.println("\n   1. 자리연습\n   2. 짧은글 연습\n   3. 긴글연습\n   4. 미니게임\n   5. 랭킹\n   6. 종료\n");
            System.out.printf("입력 >> ");
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
                System.out.println("타자연습을 종료합니다.");
                break;
            default:
            	System.out.println("번호를 다시 입력하세요");
            }
            break;
    	default:
    		System.out.println("번호를 다시 입력하세요");
    	}
    }
    
    

}