package TongTongTyping;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileManagement {
    Confirm con = new Confirm();
    Scanner scan = new Scanner(System.in);

    void save(String address, String[] str) {
        int num = 0;
        try {
            FileOutputStream output = new FileOutputStream(address);
            for(int i = 0; i< str.length; i++) {
                num = (int)(Math.random() * ((str.length) + 1));
                String text =str[num];
                byte[] by=text.getBytes();
                output.write(by);
            } output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
void Longsave(String address, String[] str) {
        int num = 0;
        try {
            FileOutputStream output = new FileOutputStream(address);
            for(int i = 0; i< str.length; i++) {
                String text =str[i];
                byte[] by=text.getBytes();
                output.write(by);
            } output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    void showfile(String address) {
        int num = 0;
        String userchat;
        String[] stringline = {""};
        try {
            File file = new File(address);
            FileReader filereader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";

            while((line = bufReader.readLine())!=null) {
                System.out.println("-"+line);
                System.out.printf("-");
                userchat = scan.nextLine();
            }
            bufReader.close();
        }catch(FileNotFoundException e) {
            //TOO: handle exception
        }catch(IOException e) {
            System.out.println(e);
        }
    }
}