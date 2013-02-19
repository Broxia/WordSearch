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
}
