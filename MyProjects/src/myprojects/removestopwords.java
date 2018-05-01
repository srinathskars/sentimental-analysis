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
import java.util.Arrays;
import java.util.List;
import static myprojects.MyProjects.list_stopwords;

/**
 *
 * @author SRINIVASAN
 */
public class removestopwords extends MyProjects{
    //removing stopwords
    void removestopwords() throws IOException,FileNotFoundException
    {
    //ArrayList<String> words=new ArrayList<>();
    File dir = new File("Dataset");
    String line8;
    File[] file = dir.listFiles();
    List<File> dataset = Arrays.asList(file);
        for (File f : dataset) {
            if(f.isFile()) {
                FileOutputStream out = new FileOutputStream("OUTPUT//STOPWORDS//"+f.getName());
                PrintStream p = new PrintStream(out);
                BufferedReader b8=new BufferedReader(new FileReader(f));
    while((line8=b8.readLine())!=null)
    {
        String[] tokens = line8.toLowerCase().split("[^a-zA-Z0-9]");
        for(String token:tokens)
        {
            if(token.isEmpty())
            {}
            else
            {
                for(int i=0;i<list_stopwords.size();i++)
            {
                if(token.equals(list_stopwords.get(i)))
                {
                    flag=1;
                }
                
            }
                if(flag==0)
                    p.print(token+" ");
            }
        flag=0;
        }
    }
    }
    }
    }
    
}
