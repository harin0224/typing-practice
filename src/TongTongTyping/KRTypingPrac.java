package TongTongTyping;

public class KRTypingPrac extends TypingPrac{
    KRPhrase kr = new KRPhrase();

    public void charPractice() {
        kr.showAlphabet();
        super.choicestate();
    }
    public void shortPhrase() {
        kr.showShort();
        super.choicestate();
    }
    public void longPhrase() {
        System.out.println("<<긴 글 선택>>\n");
        System.out.println("1. 별 헤는 밤\n 2. 청산별곡\n");
        System.out.printf("입력 >> ");
        choice = scan.nextLine();
        switch(choice) {
        case "1":
            kr.showLong_1();
            super.choicestate();
        case "2":
            kr.showLong_2();
            super.choicestate();
        default:
            System.out.println("번호를 다시 입력하세요");
        }

    }
}