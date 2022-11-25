package TongTongTyping;

public abstract class Phrase {
    FileManagement filem = new FileManagement();

    String[] alphabet;
    String[] shortP;
    String[] longP_1;
    String[] longP_2;

    String ad;

    abstract void saveAlphabet();
    abstract void saveShort();
    abstract void saveLong_1();
    abstract void saveLong_2();

    abstract void showAlphabet();
    abstract void showShort();
    abstract void showLong_1();
    abstract void showLong_2();

}