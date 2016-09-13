package edu.csumb.assignment2;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class DayOfWeekTest {
    @Test
    public void test() {
	assertThat(DayOfWeek.today(), anyOf(is("Monday"),
					    is("Tuesday"),
					    is("Wednesday"),
					    is("Thursday"),
					    is("Friday"),
					    is("Saturday"),
					    is("Sunday")));
    }
}
