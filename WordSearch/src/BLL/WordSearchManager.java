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

    private WordSearchDBManager db;

    /**
     * Creates an instance of the DAL layer
     */
    public WordSearchManager()
    {
        db = new WordSearchDBManager();
    }

    /**
     * Gets the total list of words
     * @return the list
     * @throws Exception
     */
    public ArrayList getList() throws Exception
    {
        return db.getList();
    }

    /**
     * Gets the list where only words beginning with the given letters
     * @param letters the given letters
     * @param caseSensitive a boolean that shows wether casesensitive is on or not
     * @return returns the list
     * @throws Exception
     */
    public ArrayList beginsWith(String letters, boolean caseSensitive) throws Exception
    {
        return db.beginsWith(letters, caseSensitive);
    }

    /**
     * Gets the list with only words containing the given letters
     * @param letters the given letters
     * @param caseSensitive a boolean that shows wehter casesensitive is on or not
     * @return returns the list
     * @throws Exception
     */
    public ArrayList contains(String letters, boolean caseSensitive) throws Exception
    {
        return db.contains(letters, caseSensitive);
    }

    /**
     * Gets the list where words ends with the given letters
     * @param letters a boolean that shows wehter casesensitive is on or not
     * @param caseSensitive a boolean that shows wehter casesensitive is on or not
     * @return returns the list
     * @throws Exception
     */
    public ArrayList endsWith(String letters, boolean caseSensitive) throws Exception
    {
        return db.endsWith(letters, caseSensitive);
    }

    /**
     * Gets the list where words are exactly the same as the given word
     * @param letters the given word
     * @param caseSensitive a boolean that shows wehter casesensitive is on or not
     * @return returns the list
     * @throws Exception
     */
    public ArrayList exact(String letters, boolean caseSensitive) throws Exception
    {
        return db.exact(letters, caseSensitive);
    }
}
