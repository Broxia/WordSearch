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
        while (br.ready())
        {
            String word = br.readLine();
            list.add(word);
        }
        br.close();
        return list;
    }

    public ArrayList beginsWith(String letters, boolean caseSensitive) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("brit-a-z.txt"));
        ArrayList list = new ArrayList();
        while (br.ready())
        {
            String word = br.readLine();
            if (!caseSensitive)
            {
                if (word.toLowerCase().startsWith(letters.toLowerCase()))
                {
                    list.add(word);
                }
            }
            else
            {
                if (word.startsWith(letters))
                {
                    list.add(word);
                }
            }
        }
        br.close();
        return list;
    }

    public ArrayList contains(String letters, boolean caseSensitive) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("brit-a-z.txt"));
        ArrayList list = new ArrayList();
        while (br.ready())
        {
            String word = br.readLine();
            if (!caseSensitive)
            {
                if (word.toLowerCase().contains(letters.toLowerCase()))
                {
                    list.add(word);
                }
            }
            else
            {
                if (word.contains(letters))
                {
                    list.add(word);
                }
            }
        }
        br.close();
        return list;
    }

    public ArrayList endsWith(String letters, boolean caseSensitive) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("brit-a-z.txt"));
        ArrayList list = new ArrayList();
        while (br.ready())
        {
            String word = br.readLine();
            if (!caseSensitive)
            {
                if (word.toLowerCase().endsWith(letters.toLowerCase()))
                {
                    list.add(word);
                }
            }
            else
            {
                if (word.endsWith(letters))
                {
                    list.add(word);
                }
            }
        }
        br.close();
        return list;
    }

    public ArrayList exact(String letters, boolean caseSensitive) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("brit-a-z.txt"));
        ArrayList list = new ArrayList();
        while (br.ready())
        {
            String word = br.readLine();
            if (!caseSensitive)
            {
                if (word.toLowerCase().equals(letters.toLowerCase()))
                {
                    list.add(word);
                }
            }
            else
            {
                if (word.equals(letters))
                {
                    list.add(word);
                }
            }
        }
        br.close();
        return list;
    }
}
