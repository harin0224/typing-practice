package TongTongTyping;

public class ENTypingPrac extends TypingPrac{
    ENPhrase en = new ENPhrase();


    public void charPractice() {
        en.showAlphabet();
        super.choicestate();
    }
    public void shortPhrase() {
        en.showShort();
        super.choicestate();
    }
    public void longPhrase() {
        System.out.println("<<�� �� ����>>\n");
        System.out.println("1. �� ��� ��\n 2. û�꺰��\n");
        System.out.printf("�Է� >> ");
        choice = scan.nextLine();
        switch(choice) {
        case "1":
            en.showLong_1();
            super.choicestate();
        case "2":
            en.showLong_2();
            super.choicestate();
        default:
            System.out.println("��ȣ�� �ٽ� �Է��ϼ���");
        }

    }

}