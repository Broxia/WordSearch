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
    
    public ArrayList beginsWith(String letters) throws Exception
    {
        return db.beginsWith(letters);
    }
    
    public ArrayList contains(String letters) throws Exception
    {
        return db.contains(letters);
    }
    
    public ArrayList endsWith(String letters) throws Exception
    {
        return db.endsWith(letters);
    }
    
    public ArrayList exact(String letters) throws Exception
    {
        return db.exact(letters);
    }
    
    public ArrayList beginsWithCS(String letters) throws Exception
    {
        return db.beginsWithCS(letters);
    }
    
    public ArrayList containsCS(String letters) throws Exception
    {
        return db.containsCS(letters);
    }
    
    public ArrayList endsWithCS(String letters) throws Exception
    {
        return db.endsWithCS(letters);
    }
    
    public ArrayList exactCS(String letters) throws Exception
    {
        return db.exactCS(letters);
    }
}
