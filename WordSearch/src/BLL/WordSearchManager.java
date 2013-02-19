/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.WordSearchDBManager;

/**
 *
 * @author DennisList
 */
public class WordSearchManager
{
    private WordSearchDBManager db;
    public String getList() throws Exception
    {
        return db.getList();
    }
}
