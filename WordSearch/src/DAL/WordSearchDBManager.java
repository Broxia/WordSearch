package DAL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class WordSearchDBManager
{

    private static WordSearchDBManager instance = null;

    private WordSearchDBManager()
    {
    }
    
    public static WordSearchDBManager getInstance()
    {
        if(instance == null)
        {
            instance = new WordSearchDBManager(); 
        }
        return instance;
    }
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
}

