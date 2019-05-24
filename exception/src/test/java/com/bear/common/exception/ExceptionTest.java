package com.bear.common.exception;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.text.MessageFormat;

/**
 * Unit test for exception.
 */
public class ExceptionTest
{


    @Test
    public void shouldAnswerWithTrue()
    {
        String message = MessageFormat.format("小{0},你{1}岁了吗?", "红",5);
        System.out.println(message);
        assertNotNull(message);
    }
}
