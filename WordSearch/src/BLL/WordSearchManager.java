/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.WordSearchDBManager;
import java.util.ArrayList;

/**
 *
 * @author DennisList
 */
public class WordSearchManager
{

    private ArrayList fullList;
    private WordSearchDBManager db;
    private static WordSearchManager instance = null;

    /**
     * Creates an instance of the DAL layer
     */
    private WordSearchManager()
    {
        db = WordSearchDBManager.getInstance();
        this.fullList = new ArrayList();
    }

    public static WordSearchManager getInstance()
    {
        if (instance == null)
        {
            instance = new WordSearchManager();
        }
        return instance;
    }

    /**
     * Gets the total list of words
     *
     * @param path the path of the file it reads from
     * @return the list
     * @throws Exception
     */
    public ArrayList getList(String path) throws Exception
    {
        fullList = db.getList(path);
        return fullList;

    }

    /**
     * Gets the list where only words beginning with the given letters
     *
     * @param path the path of the file it reads from
     * @param letters the given letters
     * @param caseSensitive a boolean that shows whether case sensitive is on or
     * not
     * @return returns the list
     * @throws Exception
     */
    public ArrayList beginsWith(String letters, boolean caseSensitive, String path) throws Exception
    {
        ArrayList list = new ArrayList();
        for (Object wordInList : fullList)
        {
            String word = wordInList.toString();
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
        return list;
    }

    /**
     * Gets the list with only words containing the given letters
     *
     * @param path the path of the file it reads from
     * @param letters the given letters
     * @param caseSensitive a boolean that shows whether case sensitive is on or
     * not
     * @return returns the list
     * @throws Exception
     */
    public ArrayList contains(String letters, boolean caseSensitive, String path) throws Exception
    {
        ArrayList list = new ArrayList();
        for (Object wordInList : fullList)
        {
            String word = wordInList.toString();
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
        return list;
    }

    /**
     * Gets the list where words ends with the given letters
     *
     * @param path the path of the file it reads from
     * @param letters the given letters
     * @param caseSensitive a boolean that shows whether case sensitive is on or
     * not
     * @return returns the list
     * @throws Exception
     */
    public ArrayList endsWith(String letters, boolean caseSensitive, String path) throws Exception
    {
        ArrayList list = new ArrayList();
        for (Object wordInList : fullList)
        {
            String word = wordInList.toString();
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
        return list;
    }

    /**
     * Gets the list where words are exactly the same as the given word
     *
     * @param path the path of the file it reads from
     * @param letters the given letters
     * @param caseSensitive a boolean that shows whether case sensitive is on or
     * not
     * @return returns the list
     * @throws Exception
     */
    public ArrayList exact(String letters, boolean caseSensitive, String path) throws Exception
    {
        ArrayList list = new ArrayList();
        for (Object wordInList : fullList)
        {
            String word = wordInList.toString();
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
        return list;
    }
}
