/*
 * CodingAssignments Refactoring: GearBox
 *
 * This is a refactoring challenge where the candidate can look at a single-method
 * case, where the method is untested, needs refactoring, and is hard to read. Oh,
 * and contains bugs;-)
 *
 * The assignment is as follows:
 *
 * This is the code for our customer's new environmentally friendly electric car.
 * The car is very dependent on software for almost everything, and the part that we're
 * working on is the automatic gear box. The code you see is the automatic gear box, which
 * currently shifts up if the engine goes over 2000 rpm, and down if it goes under 500.
 *
 * For our this new car, it's been determined that the choice of gear can be much
 * more efficient if we could just set more specific ranges of rpm for each gear.
 * Future versions of the car could then use actual measurements of fuel consumption
 * to configure those ranges on the fly!
 * Your assignment is to make the gearbox accept a range of rpms for each gear (and
 * of course use that range to shift gears!)
 *
 */

package com.codurance.top_gear_kata;

public class GearBox {
    public static final int MAX_GEAR = 6;
    public static final int NEUTRAL_GEAR = 0;
    public static final int FIRST_GEAR = 1;
    private int gear = NEUTRAL_GEAR;
    private int e = 0;

    private Engine engine = new Engine();

    public void doit(int rpm) {
        if (isOverThreshold(rpm)) {
            shiftUp();
        }
        if (isBelowThreshold(rpm)) {
            shiftDown();
        }
        e = rpm;
    }

    private boolean isBelowThreshold(int rpm) {
        return engine.isBelowThreshold(rpm);
    }

    private boolean isOverThreshold(int rpm) {
        return engine.isOverThreshold(rpm);
    }

    private void shiftDown() {
        if (gear > FIRST_GEAR)
            gear--;
    }

    private void shiftUp() {
        if (gear < MAX_GEAR) {
            gear++;
        }
    }

    public int gear() {
        return gear;
    }
}
