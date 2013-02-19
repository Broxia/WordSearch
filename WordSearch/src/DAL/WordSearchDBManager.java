/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author DennisList
 */
public class WordSearchDBManager
{
    public ArrayList getList() throws Exception
    {
       BufferedReader br = new BufferedReader(new FileReader("brit-a-z.txt"));
       ArrayList list = new ArrayList();
       while(br.ready())
       {
           String word = br.readLine();  
           list.add(word);
       }
       br.close();
       return list;
    }
}
