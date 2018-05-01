/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprojects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author SRINIVASAN
 */
public class addemotion extends MyProjects{
        //add emotions words to list
    void addemotion() throws IOException,FileNotFoundException
    {
    BufferedReader b1=new BufferedReader(new FileReader("emotionset//anger.txt"));
    String line1=null;
    while((line1=b1.readLine())!=null)
    {
        String[] tokens = line1.split("[^a-zA-Z0-9]");
        for(String token:tokens)
        {
            if(token.isEmpty())
            {}
            else
            {
                list_anger.add(token);
                //System.out.println(token);
            }
        }
    }
    b1.close();
    //add emotions words to list
    BufferedReader b2=new BufferedReader(new FileReader("emotionset//disgust.txt"));
    String line2=null;
    while((line2=b2.readLine())!=null)
    {
        String[] tokens = line2.split("[^a-zA-Z0-9]");
        for(String token:tokens)
        {
            if(token.isEmpty())
            {}
            else
            {
                list_disgust.add(token);
                //System.out.println(token);
            }
        }
    }
    b2.close();
    //add emotions words to list
    BufferedReader b3=new BufferedReader(new FileReader("emotionset//fear.txt"));
    String line3=null;
    while((line3=b3.readLine())!=null)
    {
        String[] tokens = line3.split("[^a-zA-Z0-9]");
        for(String token:tokens)
        {
            if(token.isEmpty())
            {}
            else
            {
                list_fear.add(token);
                //System.out.println(token);
            }
        }
    }
    b3.close();
    //add emotions words to list
    BufferedReader b4=new BufferedReader(new FileReader("emotionset//joy.txt"));
    String line4=null;
    while((line4=b4.readLine())!=null)
    {
        String[] tokens = line4.split("[^a-zA-Z0-9]");
        for(String token:tokens)
        {
            if(token.isEmpty())
            {}
            else
            {
                list_joy.add(token);
                //System.out.println(token);
            }
        }
    }
    b4.close();
    //add emotions words to list
    BufferedReader b5=new BufferedReader(new FileReader("emotionset//sadness.txt"));
    String line5=null;
    while((line5=b5.readLine())!=null)
    {
        String[] tokens = line5.split("[^a-zA-Z0-9]");
        for(String token:tokens)
        {
            if(token.isEmpty())
            {}
            else
            {
                list_sadness.add(token);
                //System.out.println(token);
            }
        }
    }
    b5.close();
    //add emotions words to list
    BufferedReader b6=new BufferedReader(new FileReader("emotionset//surprise.txt"));
    String line6=null;
    while((line6=b6.readLine())!=null)
    {
        String[] tokens = line6.split("[^a-zA-Z0-9]");
        for(String token:tokens)
        {
            if(token.isEmpty())
            {}
            else
            {
                list_surprise.add(token);
                //System.out.println(token);
            }
        }
    }
    b6.close();
    //add stopwords words to list
    BufferedReader b7=new BufferedReader(new FileReader("stopwords.txt"));
    String line7=null;
    while((line7=b7.readLine())!=null)
    {
        String[] tokens = line7.split("[^a-zA-Z0-9]");
        for(String token:tokens)
        {
            if(token.isEmpty())
            {}
            else
            {
                list_stopwords.add(token);
                //System.out.println(token);
            }
        }
    }
    b7.close();
    }
    
}
