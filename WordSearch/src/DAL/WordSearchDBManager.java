package DAL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class WordSearchDBManager
{

    /**
     * Returns the entire text document as an ArrayList
     *
     * @param path the path of the file it reads from
     * @return ArrayList list
     * @throws Exception
     */
    public ArrayList getList(String path) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader(path));
        ArrayList list = new ArrayList();
        while (br.ready())
        {
            String word = br.readLine();
            list.add(word);
        }
        br.close();
        return list;
    }

    /**
     * Returns an ArrayList where the letters and caseSensitve parameters have
     * been taken into account
     *
     * @param path the path of the file it reads from
     * @param letters The letters a word begins with
     * @param caseSensitive If the word is case sensitive or not
     * @return an ArrayList containing words beginning with specified letters
     * @throws Exception
     */
    public ArrayList beginsWith(String letters, boolean caseSensitive, String path) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader(path));
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

    /**
     * Returns an ArrayList where the letters and caseSensitve parameters have
     * been taken into account
     *
     * @param path the path of the file it reads from
     * @param letters The letters a word contains
     * @param caseSensitive If the word is case sensitive or not
     * @return an ArrayList with words containing the specified letters
     * @throws Exception
     */
    public ArrayList contains(String letters, boolean caseSensitive, String path) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader(path));
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

    /**
     * Returns an ArrayList where the letters and caseSensitve parameters have
     * been taken into account
     *
     * @param path the path of the file it reads from
     * @param letters The letters a word ends with
     * @param caseSensitive If the word is case sensitive or not
     * @return an ArrayList containing words ending with the specified letters
     * @throws Exception
     */
    public ArrayList endsWith(String letters, boolean caseSensitive, String path) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader(path));
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

    /**
     * Returns an ArrayList where the letters and caseSensitve parameters have
     * been taken into account
     *
     * @param path the path of the file it reads from
     * @param letters The exact letters a word contains
     * @param caseSensitive If the word is case sensitive or not
     * @return an ArrayList with words containing the exact letters specified
     * @throws Exception
     */
    public ArrayList exact(String letters, boolean caseSensitive, String path) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader(path));
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
