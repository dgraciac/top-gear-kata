package com.codurance.top_gear_kata.test;


import com.codurance.top_gear_kata.GearBox;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class GearBoxShould {

    private GearBox gearBox;

    @Before
    public void setUp() throws Exception {
        gearBox = new GearBox();
    }

    @Test
    public void return_gear_zero_when_0_rpm() {
        gearBox.doit(0);

        assertThat(gearBox.gear()).isEqualTo(0);
    }

    @Test public void
    dont_change_gear_when_negative_rpm() {
        gearBox.doit(-1);

        assertThat(gearBox.gear()).isEqualTo(0);
    }

    @Test public void
    shift_up_when_rpm_greater_than_2000() {
        gearBox.doit(2001);
        gearBox.doit(2001);
        gearBox.doit(2001);

        assertThat(gearBox.gear()).isEqualTo(3);
    }

    @Ignore
    @Test public void
    shift_down_when_rpm_lesser_than_500() {
        gearBox.doit(2001);
        gearBox.doit(2001);
        gearBox.doit(2001);

        gearBox.doit(499);

        assertThat(gearBox.gear()).isEqualTo(2);
    }

    @Test public void
    not_shift_upper_than_6() {
        gearBox.doit(2001);
        gearBox.doit(2001);
        gearBox.doit(2001);
        gearBox.doit(2001);
        gearBox.doit(2001);
        gearBox.doit(2001);

        gearBox.doit(2001);

        assertThat(gearBox.gear()).isEqualTo(6);
    }



}
