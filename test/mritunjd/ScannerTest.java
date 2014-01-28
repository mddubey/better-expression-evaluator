package mritunjd;

import mritunj.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class ScannerTest {
    @Test
    public void testGivesTheNextCharacterOfString() throws Exception{
        Scanner sc = new Scanner("Dard");

        Assert.assertEquals('D',sc.next());
        Assert.assertEquals('a',sc.next());
        Assert.assertEquals('r',sc.next());
        Assert.assertEquals('d',sc.next());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testThrowsExceptionWhenNextIsNotPresent() throws Exception{
        Scanner sc = new Scanner("");

        sc.next();
    }

    @Test
    public void testIgnoreWhiteSpaces() throws Exception{
        Scanner sc = new Scanner(" a");

        Assert.assertEquals('a',sc.next());
    }

    @Test
    public void testIgnoresWhiteSpacesBetweenCharacters() throws Exception{
        Scanner sc = new Scanner("b a");

        Assert.assertEquals('b',sc.next());
        Assert.assertEquals('a',sc.next());
    }

    @Test
    public void testIgnoreMultipleWhiteSpaces() throws Exception{
        Scanner sc = new Scanner("b      a");

        Assert.assertEquals('b',sc.next());
        Assert.assertEquals('a',sc.next());
    }
}