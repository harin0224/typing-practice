package TongTongTyping;

import java.util.Scanner;

class Confirm {
	public double accuracy;
    public long time, start_time, end_time=0;
    public int score, count;
    private String[] id=new String[5];
    private long[] grade=new long[5];
    public String[] idd = null;
    public long[] graded = null;
    public int[] rank=new int[5];
    boolean containNull=true;
    boolean containNull2=true;
    Scanner scan = new Scanner(System.in);
    
    public String[] getId() {
    	return id;    
    }
    
    public long[] getGrade() {
    	return grade;    
    }
    
    public void setID() {
    	id=idd;	
    }
    						
    public void setGrade() {
    	grade=graded;	
    }  
    
    public void time_check(long start_time, long end_time) {
        long time=(end_time-start_time)/1000;
        System.out.println("����ð�: "+time+"��");
    }

    void accuracy() {
        accuracy=(score/count)*100;
        System.out.println("��Ȯ�� : "+accuracy);
    }
    
	String[] inputid() { //��ŷ �г��� �Է� �޼ҵ�
    	Menu m = new Menu();
    	MiniGame g = new MiniGame();
        for(int i=0; i<id.length;i++) {
            if(id[i]!=null) { //���̵� �迭�� ���ڿ��� ���� ��� false
                containNull = false;
                break;
            }
            if(containNull) { //�迭�� ����� ���(containNull=true) �迭 �Է� ����
                System.out.printf("��ŷ ����� ���� �г��� �Է�: ");
                idd[i]=scan.nextLine();
                System.out.println("  1. ����ȭ��\n  2. ���\n  3. ����");
                String choice = scan.nextLine();
                switch(choice){
                case "1":
                	m.startMenu();
                case "2":
                	g.choiceLevel(1,1);
                case "3":
                	containNull = false;
                	break;
                }
            }
        }
		return idd;
    }//end

	public long[] inputRank(long time) { //�̴ϰ��� ���� ���� �޼ҵ�
        for(int i=0; i<grade.length;i++) {
            if(id[i]!=null) { //���� �迭�� ���ڿ��� ���� ��� false
                containNull2=false;
                break;
            }
            if(containNull2) { //�迭�� ����� ���(containNull=true) �迭 �Է� ����
                graded[i]=time;     //�̴ϰ��� Ŭ���� �ð� ����
            }
        }
		return graded;
    }//end of inputRank()

    void countRank() { //��ũ ��� �޼ҵ�
         for(int i=0 ; i<rank.length ; i++) {
                for(int j=i+1 ; j<grade.length ; j++) {
                    if(grade[i] < grade[j]){//�ٸ� ������ ������ �� ������ ī��Ʈ
                        rank[i]++; 
                        long temp;
                        String idtemp; 
                        //ū ������ ���� ���� ��ȯ
                        temp=grade[i];
                        grade[i]=grade[j];
                        grade[j]=temp;
                        //�г��ӵ� ���� ��ȯ
                        idtemp=id[i];
                        id[i]=id[j];
                        id[j]=idtemp;
                        } 
                    }
          } 

         System.out.println("======��ŷ======");
             for(int i=0;i<id.length;i++) {
                System.out.println((i+1)+"��: "+id[i]+" "+grade[i]+"��");
             }
         System.out.println("===============");
    }//end of countRank()
}