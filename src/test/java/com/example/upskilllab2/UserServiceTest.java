package com.example.upskilllab2;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Test
    public void getUserByIdTest() {
        UserService mockService = Mockito.mock(UserService.class);

        User user = new User();
        when(mockService.getUserById(1L)).thenReturn(user);

        User result = mockService.getUserById(1L);

        assertEquals(user, result);
    }

    @Test
    public void testVerify(){
        UserService mockService = Mockito.mock(UserService.class);
        User user = new User();
        when(mockService.getUserById(1L)).thenReturn(user);

        User result=mockService.getUserById(1L);
        verify(mockService).getUserById(1L);
    }
}