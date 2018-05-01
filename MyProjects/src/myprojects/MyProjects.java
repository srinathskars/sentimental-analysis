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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author SRINIVASAN
 */
public class MyProjects {
    /**
     * @param args the command line arguments
     */
    
    //Creating Array Variable
    static ArrayList<String> list_anger = new ArrayList<>();
    static ArrayList<String> list_disgust = new ArrayList<>();
    static ArrayList<String> list_sadness = new ArrayList<>();
    static ArrayList<String> list_joy = new ArrayList<>();
    static ArrayList<String> list_fear = new ArrayList<>();
    static ArrayList<String> list_surprise = new ArrayList<>();
    static ArrayList<String> list_stopwords = new ArrayList<>();
    static ArrayList<String> allwords=new ArrayList<>();
    static List<String> temparr=new ArrayList<>();
    static Map<String,Double> values=new HashMap<>();
    static ArrayList<String> stem=new ArrayList<>();
    static Set<String> hs = new HashSet<>();
    static String classval=null;
    static String stemword=null;
    static int flag=0;
    static int flag1=0;
    static int flag2=0;
    static int temps=0;
    static Double angerc = 0.0,disgustc=0.0,joyc=0.0,fearc=0.0,surprisec=0.0,sadnessc=0.0;
    static Double panger = 0.0,pdisgust=0.0,pjoy=0.0,pfear=0.0,psurprise=0.0,psadness=0.0;
 
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        //Creating Object For Our Class
        System.out.println("Adding Emotional words to List");
        System.out.println("Adding Stopwords To List");
        addemotion  emo=new addemotion();
        emo.addemotion();
        System.out.println("Emotions And Stopwords  Added To Arraylist Succesfully");
        System.out.println("Stopwords Removal Started");
        removestopwords stop=new removestopwords();
        stop.removestopwords();
        System.out.println("Stopwords Removal Successs");
        System.out.println("Stemming Started");
        stemming stem=new stemming();
        stem.stemming();
        System.out.println("Stemming Successs");
        System.out.println("Generation of unique words started");
        unique uni=new unique();
        uni.unique();
        System.out.println("Unique Words Generated");
        classify clas=new classify();
        clas.classify();
        System.out.println("Classification Completed");
    }
}