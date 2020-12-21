package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public  void whenSunday() {
       String rls =  SwitchWeek.nameOfDay(7);
       assertThat(rls, is("Воскресенье"));
    }

    @Test
    public  void whenMonday() {
        String rls =  SwitchWeek.nameOfDay(1);
        assertThat(rls, is("Понедельник"));
    }

    @Test
    public  void whenDay8() {
        String rls =  SwitchWeek.nameOfDay(8);
        assertThat(rls, is("Каждый день пятница)"));
    }
}