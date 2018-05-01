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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static myprojects.MyProjects.list_anger;

/**
 *
 * @author SRINIVASAN
 */
public class classify extends MyProjects{
    //Classification Function For Classification of Each document
    void classify() throws IOException,FileNotFoundException
    {
        File dir3 = new File("OUTPUT//STEM//");
        File[] file3 = dir3.listFiles();
        List<File> stemset = Arrays.asList(file3);
        for (File f3 : stemset) {
            if(f3.isFile()) {
                //For frequency Count
                FileOutputStream out3 = new FileOutputStream("OUTPUT//FREQ//"+f3.getName());
                PrintStream p3 = new PrintStream(out3);
                BufferedReader brdoc = new BufferedReader(new FileReader("OUTPUT//STEM//"+f3.getName()));
                String line13=null;
                ArrayList<String> temp=new ArrayList<>();
                while((line13=brdoc.readLine())!=null)
                {
                    String lines[]=line13.split("[^a-zA-Z0-9]");
                    for(String line:lines)
                    {
                        if(line.isEmpty()){}
                        else
                        {
                        //System.out.println(line);
                        temp.add(line);
                        }
                    }
                }
                p3.println("********FREQUENCY COUNT*************");
                Set<String> set = new LinkedHashSet<>();
                set.addAll(temp);
                for (String sam : set) {
                    p3.println("");
                    p3.println(sam + " : " + Collections.frequency(temp, sam));
                }
                
                for(int i=0;i<temp.size();i++)
                {
                    if(list_anger.contains(temp.get(i)))
                    {
						angerc++;                    
					}
                    if(list_disgust.contains(temp.get(i)))
                    {
						disgustc++;                   
					}
                    if(list_fear.contains(temp.get(i)))
                    {
						fearc++;                    
					}
                    if(list_sadness.contains(temp.get(i)))
                    {
						sadnessc++;                    
					}
                    if(list_surprise.contains(temp.get(i)))
                    { 
						surprisec++; 
					}
                    if(list_joy.contains(temp.get(i)))
                    {
						joyc++;                   
					}
                }
                panger=(angerc/temp.size());
                values.put("Anger",panger);
                pdisgust=(disgustc/temp.size());
                values.put("Disguist",pdisgust);
                pfear=(fearc/temp.size());
                values.put("Fear",pfear);
                psadness=(sadnessc/temp.size());
                values.put("Sadness",psadness);
                psurprise=(surprisec/temp.size());
                values.put("Surpries",psurprise);
                pjoy=(joyc/temp.size());
                values.put("Joy",pjoy);
                classval=null;
                Double max=(Collections.max(values.values()));  // This will return max value in the Hashmap
				// Iterate through hashmap
                for (Map.Entry<String, Double> entry :values.entrySet()) 
				{
					
                    if (entry.getValue()==max)
						{
							//System.out.println(entry.getValue());     // Print the key with max value
							classval=entry.getKey();
                        }
				}
                FileOutputStream out4 = new FileOutputStream("OUTPUT//EMO//"+f3.getName());
                PrintStream p4 = new PrintStream(out4);
                p4.println("**************Emotion Words Count*********");
                p4.println();
                p4.println("Joy______"+joyc.intValue());
                p4.println("Fear_____"+fearc.intValue());
                p4.println("Sadness__"+sadnessc.intValue());
                p4.println("Disgust__"+disgustc.intValue());
                p4.println("Anger_____"+angerc.intValue());
                p4.println("Surprise__"+surprisec.intValue());
                angerc = 0.0;disgustc=0.0;joyc=0.0;fearc=0.0;surprisec=0.0;sadnessc=0.0;
                panger = 0.0;pdisgust=0.0;pjoy=0.0;pfear=0.0;psurprise=0.0;psadness=0.0;
                
                for(int i=0;i<allwords.size();i++)
               {
                   temps=0;
                   for(int j=0;j<temp.size();j++)
				   {
					if(allwords.get(i).equals(temp.get(j)))
						{
							temps=1;
						}
                   }
                   if(temps==1)	
				   {
                       System.out.print(1+",");
                   }
                   else
				   {
                       System.out.print(0+",");
					}
               }
                System.out.print(classval);
                values.clear();
                System.out.println();
		}
	}
}
    
}
