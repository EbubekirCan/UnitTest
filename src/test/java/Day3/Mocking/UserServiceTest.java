package Day3.Mocking;

import Day3.Mocking.Sample1.UserManager;
import Day3.Mocking.Sample1.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Test
    public void testGetUserName(){

        // Mock ( fake ) UserManager olusturuyoruz
        UserManager userManager = mock(UserManager.class);

        //USerManager objemize ait metoddan donecek degeri setliyoruz
        when(userManager.getUserName(1)).thenReturn("Fatih Deniz");

        UserService userService = new UserService(userManager);

        String userName = userService.getUserName(1);
        assertEquals("Fatih Deniz sonuc", userName);

    }
}
