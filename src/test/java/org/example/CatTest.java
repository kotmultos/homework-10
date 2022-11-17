package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.awt.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @ParameterizedTest
    @EnumSource(value = DaysOfWeek.class, names = {"MON", "WED", "FRI"})
    void testGetActivity_sleep(DaysOfWeek day) {
        Cat cat = new Cat(3.5, Color.DARK_GRAY, "breed1");
        assertEquals("sleep", cat.getActivity(day));
    }

    @ParameterizedTest
    @EnumSource(value = DaysOfWeek.class, names = {"TUE", "THU", "SUN"})
    void testGetActivity_eat(DaysOfWeek day) {
        Cat cat = new Cat(3.5, Color.DARK_GRAY, "breed1");
        assertEquals("eat", cat.getActivity(day));
    }

    @ParameterizedTest
    @EnumSource(value = DaysOfWeek.class, names = {"SAT"})
    void testGetActivity_tigidik(DaysOfWeek day) {
        Cat cat = new Cat(3.5, Color.DARK_GRAY, "breed1");
        assertEquals("tigidik", cat.getActivity(day));
    }

    @Test
    void areCatsEqual_equalSimmetrity() {
        Cat cat1 = new Cat(3.5, Color.DARK_GRAY, "breed1");
        Cat cat2 = new Cat(3.5, Color.DARK_GRAY, "breed1");
        assertEquals(cat1, cat2);
        assertEquals(cat2, cat1);
    }

    @Test
    void areCatsEqual_notEqualSimmetrity() {
        Cat cat1 = new Cat(3.5, Color.DARK_GRAY, "breed1");
        Cat cat2 = new Cat(13, Color.DARK_GRAY, "breed1");
        assertNotEquals(cat1, cat2);
        assertNotEquals(cat2, cat1);
    }

    @Test
    void areCatsEqual_equalReflectivity() {
        Cat cat1 = new Cat(3.5, Color.DARK_GRAY, "breed1");
        assertEquals(cat1, cat1);
    }

    @Test
    void areCatsEqual_equalTransitivity() {
        Cat cat1 = new Cat(3.5, Color.DARK_GRAY, "breed1");
        Cat cat2 = new Cat(3.5, Color.DARK_GRAY, "breed1");
        Cat cat3 = new Cat(3.5, Color.DARK_GRAY, "breed1");
        assertEquals(cat1, cat2);
        assertEquals(cat2, cat3);
        assertEquals(cat1, cat3);
    }

    @Test
    void areCatsEqual_null() {
        Cat cat1 = new Cat(3.5, Color.DARK_GRAY, "breed1");
        assertEquals(false, cat1.equals(null));
    }

}