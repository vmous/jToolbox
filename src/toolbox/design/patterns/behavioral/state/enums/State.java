package toolbox.design.patterns.behavioral.state.enums;

/**
 * States enumeration.
 *
 * @author billy
 *
 */
public enum State {

    ON(1) {
        @Override
        public State turnOn() {
            System.out.println("Already On.");
            return ON;
        }

        @Override
        public State turnOff() {
            System.out.println("Turning Off.");
            return OFF;
        }
    },

    OFF(0) {
        @Override
        public State turnOn() {
            System.out.println("Turning On.");
            return ON;
        }

        @Override
        public State turnOff() {
            System.out.println("Already Off.");
            return OFF;
        }
    };

    private int val;

    private State(int val) {
        this.val = val;
    }

    public abstract State turnOn();

    public abstract State turnOff();

}
