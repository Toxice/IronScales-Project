package tests.Java;

import Java.Removal;
import org.testng.annotations.Test;
import utilities.Verifications;
public class RemoveJava {
    @Test
    public void test01_hello_world(){
        Verifications.verifyRemove(" hello world!  " , "hello world!");
        // 1 space in beginning, 2 spaces in the end
    }

    @Test
    public void test02_IronScales(){
        Verifications.verifyRemove("  Welcome to IronScales  " , "Welcome to IronScales");
        // 2 spaces in the beginning, 2 spaces in the end
    }

    @Test
    public void test03_supposed_to_fail(){
        Verifications.verifyRemove("    This test supposed to fail!    " , "    This test supposed to fail!    ");
        // the expected string is the same as the actual one, so this test is going to fail (as asked by the job test)
    }

}
