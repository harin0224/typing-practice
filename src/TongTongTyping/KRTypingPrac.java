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
        System.out.println("<<�� �� ����>>\n");
        System.out.println("1. �� ��� ��\n 2. û�꺰��\n");
        System.out.printf("�Է� >> ");
        choice = scan.nextLine();
        switch(choice) {
        case "1":
            kr.showLong_1();
            super.choicestate();
        case "2":
            kr.showLong_2();
            super.choicestate();
        default:
            System.out.println("��ȣ�� �ٽ� �Է��ϼ���");
        }

    }
}