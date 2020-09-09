package edu.chl.hajo;

import static java.lang.System.out;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
    
     This is a test class (for some other class, in this case the List class)

 */
public class TestList {

    @Test
    public void testAdd() {
        List<Integer> l = new List<Integer>();
        l.add(1);                        // Call method to test
        assertTrue(l.getLength() == 1);  // The logical check
    }

    @Test
    public void testRemove() {
        List<Integer> l = new List<Integer>();
        l.add(5);
        l.add(10);
        int len = l.getLength();
        int n = l.remove();
        assertTrue(n == 10);
        assertTrue(l.getLength() == (len-1));
    }

    @Test
    public void testGet() {
        List<Integer> l = new List<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        assertTrue(l.get(4) == 5);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetBadIndex() {
        List<Integer> list = new List<Integer>();
        list.get(-1); // Exception!!!
    }

    @Test
    public void testCopy() {
        List<Integer> l = new List<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        List<Integer> newL = l.copy();
        assertFalse(newL.equals(l));
    }

}
