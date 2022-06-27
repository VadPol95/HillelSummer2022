package com.hillel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CollectionImplTest {

    @Test
    void add() {
        CollectionImpl array = new CollectionImpl();
        assertEquals(0, array.size());
        array.add("Vadym");
        assertEquals(1, array.size());
        assertEquals("Vadym", array.get(0));
    }

    @Test
    void testAdd() {
        CollectionImpl array = new CollectionImpl();
        assertEquals(0, array.size());
        array.add(0, "Vadym");
        array.add(1, "Petr");
        array.add(2, "Ivan");
        array.add(3, "Vladimir");
        assertEquals(4, array.size());
        assertEquals("Vladimir", array.get(3));
    }

    @Test
    void delete() {
        CollectionImpl array = new CollectionImpl();
        assertEquals(0, array.size());
        array.add("Vadym");
        array.add("Petr");
        array.add("Ivan");
        array.add("Vladimir");
        array.delete("Petr");
        assertEquals("Ivan", array.get(1));
        assertEquals(3, array.size());
    }

    @Test
     void get() {
        CollectionImpl array = new CollectionImpl();
        array.add("Vadym");
        array.add("Petr");
        array.add("Ivan");
        array.add("Vladimir");
        array.delete("Petr");
        assertEquals("Ivan", array.get(1));
        assertEquals(3, array.size());
    }

    @Test
    void contain() {
        CollectionImpl array = new CollectionImpl();
        array.add("Vadym");
        array.add("Petr");
        array.add("Ivan");
        array.add("Vladimir");
        assertTrue(array.contain("Vadym"));
        assertFalse(array.contain("Вадим"));
    }

    @Test
    void testEquals() {
        CollectionImpl array = new CollectionImpl();
        CollectionImpl array1 = new CollectionImpl();
        CollectionImpl array2 = new CollectionImpl();
        array.add("Vadym");
        array.add("Vadym");
        array.add("Petr");
        array.add("Ivan");
        array.add("Vladimir");
        array1.add("Vadym");
        array1.add("Vadym");
        array1.add("Petr");
        array1.add("Ivan");
        array1.add("Vladimir");
        array2.add("Vadym");
        array2.add("Petr");
        array2.add("Ivan");
        array2.add("Vladislav");
        assertTrue(array.equals(array1));
        assertFalse(array.equals(array2));
        assertEquals(array.get(0),array.get(1));
        assertEquals(array.get(0),array.get(2));
    }

    @Test
    void clear() {
        CollectionImpl array = new CollectionImpl();
        assertEquals(0, array.size());
        array.add("Vadym");
        array.add("Petr");
        array.add("Ivan");
        array.add("Vladimir");
        assertEquals(4, array.size());
        array.clear();
        assertEquals(0, array.size());

    }

    @Test
    void size() {
        CollectionImpl array = new CollectionImpl();
        assertEquals(0, array.size());
        array.add("Vadym");
        array.add("Petr");
        array.add("Ivan");
        array.add("Vladimir");
        assertEquals(4, array.size());
        array.delete("Vladimir");
        assertEquals(3, array.size());
    }
}