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

    public WordSearchManager()
    {
        db = new WordSearchDBManager();
    }

    public ArrayList getList() throws Exception
    {
        return db.getList();
    }

    public ArrayList beginsWith(String letters, boolean caseSensitive) throws Exception
    {
        return db.beginsWith(letters, caseSensitive);
    }

    public ArrayList contains(String letters, boolean caseSensitive) throws Exception
    {
        return db.contains(letters, caseSensitive);
    }

    public ArrayList endsWith(String letters, boolean caseSensitive) throws Exception
    {
        return db.endsWith(letters, caseSensitive);
    }

    public ArrayList exact(String letters, boolean caseSensitive) throws Exception
    {
        return db.exact(letters, caseSensitive);
    }
}
