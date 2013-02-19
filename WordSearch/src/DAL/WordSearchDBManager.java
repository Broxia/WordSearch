/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.FileReader;

/**
 *
 * @author DennisList
 */
public class WordSearchDBManager
{
    public String getList() throws Exception
    {
        try(FileReader fr = new FileReader("brit-a-z.txt"))
        {
            String list = fr.toString();
            return list;
        }
    }
}
