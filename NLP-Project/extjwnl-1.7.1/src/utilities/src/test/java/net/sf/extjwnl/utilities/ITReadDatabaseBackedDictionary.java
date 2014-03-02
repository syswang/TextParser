package net.sf.extjwnl.utilities;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.dictionary.Dictionary;
import net.sf.extjwnl.dictionary.DictionaryReadTester;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.IOException;

/**
 * Creates a DatabaseBackedDictionary and runs all the test cases.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class ITReadDatabaseBackedDictionary extends DictionaryReadTester {

    @BeforeClass
    public static void initDictionary() throws IOException, JWNLException {
        dictionary = Dictionary.getInstance(
                ITReadDatabaseBackedDictionary.class.getResourceAsStream("/test_h2_properties.xml"));
    }

    @AfterClass
    public static void freeDictionary() {
        dictionary = null;
    }
}