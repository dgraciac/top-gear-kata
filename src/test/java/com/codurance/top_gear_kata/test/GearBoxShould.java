package com.codurance.top_gear_kata.test;


import com.codurance.top_gear_kata.GearBox;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class GearBoxShould {

    @Test
    public void return_gear_zero_when_0_rpm() {
        GearBox gearBox = new GearBox();

        gearBox.doit(0);

        assertThat(gearBox.gear()).isEqualTo(0);
    }

    @Test public void
    dont_change_gear_when_negative_rpm() {
        GearBox gearBox = new GearBox();

        gearBox.doit(-1);

        assertThat(gearBox.gear()).isEqualTo(0);
    }


}
