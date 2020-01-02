package com.home.web;

import com.home.service.DependencyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by liyang on 12/31/19.
 * liyang70@meituan.com;
 */
@RunWith(MockitoJUnitRunner.class)
public class UnderTestControllerTest {

    @InjectMocks
    private UnderTestController sut;
    @Mock
    private DependencyService dependencyService;

    @Test
    public void test() throws Exception {
        when(dependencyService.show()).thenReturn(2);
        assertEquals("jsp1",sut.pre());
    }
}