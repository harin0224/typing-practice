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
        System.out.println("실행시간: "+time+"초");
    }

    void accuracy() {
        accuracy=(score/count)*100;
        System.out.println("정확도 : "+accuracy);
    }
    
	String[] inputid() { //랭킹 닉네임 입력 메소드
    	Menu m = new Menu();
    	MiniGame g = new MiniGame();
        for(int i=0; i<id.length;i++) {
            if(id[i]!=null) { //아이디 배열에 문자열이 있을 경우 false
                containNull = false;
                break;
            }
            if(containNull) { //배열이 비었을 경우(containNull=true) 배열 입력 가능
                System.out.printf("랭킹 등록을 위한 닉네임 입력: ");
                idd[i]=scan.nextLine();
                System.out.println("  1. 시작화면\n  2. 계속\n  3. 종료");
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

	public long[] inputRank(long time) { //미니게임 점수 저장 메소드
        for(int i=0; i<grade.length;i++) {
            if(id[i]!=null) { //점수 배열에 문자열이 있을 경우 false
                containNull2=false;
                break;
            }
            if(containNull2) { //배열이 비었을 경우(containNull=true) 배열 입력 가능
                graded[i]=time;     //미니게임 클래스 시간 저장
            }
        }
		return graded;
    }//end of inputRank()

    void countRank() { //랭크 출력 메소드
         for(int i=0 ; i<rank.length ; i++) {
                for(int j=i+1 ; j<grade.length ; j++) {
                    if(grade[i] < grade[j]){//다른 점수와 비교했을 때 적으면 카운트
                        rank[i]++; 
                        long temp;
                        String idtemp; 
                        //큰 점수와 작은 점수 교환
                        temp=grade[i];
                        grade[i]=grade[j];
                        grade[j]=temp;
                        //닉네임도 같이 교환
                        idtemp=id[i];
                        id[i]=id[j];
                        id[j]=idtemp;
                        } 
                    }
          } 

         System.out.println("======랭킹======");
             for(int i=0;i<id.length;i++) {
                System.out.println((i+1)+"위: "+id[i]+" "+grade[i]+"초");
             }
         System.out.println("===============");
    }//end of countRank()
}