/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprojects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static myprojects.MyProjects.stem;

/**
 *
 * @author SRINIVASAN
 */
public class stemming extends MyProjects{
    //stemming process
    void stemming() throws IOException,FileNotFoundException
    {
    BufferedReader brstem = new BufferedReader(new FileReader("stemming.txt"));
    String line10;
    while((line10=brstem.readLine())!=null)
    {
                if(line10.isEmpty()){}
                else{
                stem.add(line10); }
                //System.out.println(line10);
    }
    brstem.close();
    System.out.println("Adding of Stemming Set completed");
    //String s[]={"1","2","3","4","5","6","7","8","9","0"};
    ArrayList<String> number=new ArrayList<>();
    number.add("0");number.add("1");
    number.add("3");number.add("2");
    number.add("4");number.add("5");
    number.add("6");number.add("7");
    number.add("9");number.add("8");
    File dir2 = new File("OUTPUT//STOPWORDS");
    File[] file2 = dir2.listFiles();
    List<File> dataset2 = Arrays.asList(file2);
    String line11;
        for (File f2 : dataset2) {
            if(f2.isFile()) {
                //System.out.println("File Addded");
                FileOutputStream stemout = new FileOutputStream("OUTPUT//STEM//"+f2.getName());
                PrintStream stemp = new PrintStream(stemout);
                BufferedReader b11=new BufferedReader(new FileReader(f2));
        while((line11=b11.readLine())!=null)
        {
        String[] tokens = line11.split("[^a-zA-Z0-9]");
        for(String token:tokens)
        {
            if(token.isEmpty()){}
          else{
                    for(String num:number)
            {
                    if(token.contains(num))
                    { 
                        flag1=1;
                        break;
                    }
            }
                    if (flag1==1){
                        //System.out.println("number is present");
                    }
            else
              {
                  flag2=0;
                  for(String temp:stem)
                  {
                      String[] sam=temp.split(" ");
                      temparr = Arrays.asList(sam);
                  if(temparr.contains(token))
                  {
                      //stemword = temp.split(" ")[0];
                      stemword=temparr.get(0);
                      flag2= 1;
                      break;
                  }
                  }
                  if (flag2 == 1) {
                        allwords.add(stemword);
                        stemp.print(stemword+" ");
                    } else {
                        stemp.print(token+" ");
                        allwords.add(token);
                   }
                  temparr=null;
                  flag2=0;
                }
               flag1=0;
        }
        }
            //System.out.println("Sinle line comple");
    }
            //System.out.println("Single File Completed");
}
    }
    }
    //stemming function end
    
}
