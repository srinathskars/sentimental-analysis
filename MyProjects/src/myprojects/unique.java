/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprojects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collections;
import static myprojects.MyProjects.allwords;

/**
 *
 * @author SRINIVASAN
 */
public class unique extends MyProjects{
    //Generation Of Unique Words Code
    void unique() throws IOException,FileNotFoundException
    {
        allwords.removeAll(list_stopwords);
        hs.addAll(allwords);
        allwords.clear();
        allwords.addAll(hs);
        Collections.sort(allwords);
        for(int i=0;i<5;i++)
        { 
				if(allwords.get(i).isEmpty()) 
				{
					allwords.remove(i);
				}
        }
        FileOutputStream all = new FileOutputStream("OUTPUT//allwords.txt");
        PrintStream alls = new PrintStream(all);
		//Creating Text File with All Unique Words in The ARFF Format
        alls.println("@RELATION PROJECT");
        for(int i=0;i<allwords.size();i++)
        {
            alls.println("@ATTRIBUTE "+allwords.get(i)+" NUMERIC");
        }
        alls.println("@ATTRIBUTE classification{Joy,Surpries,Fear,Anger,Disguist,Sadness}");
        alls.println("@DATA");
    }

    }
