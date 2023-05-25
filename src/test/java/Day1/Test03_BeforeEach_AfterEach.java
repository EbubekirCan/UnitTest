package Day1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_BeforeEach_AfterEach {

    String str ;

    @BeforeEach
    void beforeEach(){

        str = "JUnit5 is better than JUnit4";
        System.out.println("********** BeforeEach() calisti *************");

    }

    @AfterEach
    void afterEach(){
        str = null;
        System.out.println("********** AfterEach() calisti **************");
    }




    @Test
    void testSplit(TestInfo info){ // calisan testin ismini console da gormek icin TestInfo kullanildi

        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"JUnit5", "is", "better","than","JUnit4"};
        System.out.println(info.getDisplayName() + " calisti");

        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));

    }

    @Test
    void testStringLength(TestInfo info){

        int anlikDeger = str.length();
        int beklenenDeger = 28;
        System.out.println(info.getDisplayName() + " calisti");
        assertEquals(beklenenDeger,anlikDeger);
    }


    // !!! test methodlarinin calisma sirasini kendimiz belirlemek istiyorsak JUnit4 --> @FixMethodOrder
            // JUnit5 --> @TestMethodOrder
}
