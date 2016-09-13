package edu.csumb.cst438fa16hello;

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
