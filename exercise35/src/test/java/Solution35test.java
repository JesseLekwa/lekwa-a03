

import baseline.Solution35;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test
{
    Solution35 test = new Solution35();

    @Test
    void winner()
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("Michelle");
        names.add("Mike");
        names.add("Cain");
        names.add("Domingo");
        names.add("Ryan");
        names.add("Alex");

        for(int i=0; i<100; i++)
        {
            assertTrue(names.contains(test.winner(names, 3)));
        }
    }

};