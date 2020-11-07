package com.innatecoder.java_field;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class EnvMapTest
{
    
    @Test
    public void PrintShouldBeAssesible()
    {
        try {

            EnvMap.printEnv();
            assertTrue( true );

        } catch (Exception e) {
            
            assertTrue( false );
        }
                
        
    }
}
