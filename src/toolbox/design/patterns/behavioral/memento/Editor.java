package toolbox.design.patterns.behavioral.memento;

/**
 * Originator. Creates a memento containing a snapshot of its current internal
 * state and uses the memento to restore its internal state whenever necessary.
 *
 * @author billy
 *
 */
public class Editor {

    private String state;

    public Editor() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public EditorState saveToMemento() {
        return new EditorState(state);
    }

    public void restoreFromMemento(EditorState memento) {
        state = memento.getSavedState();
    }

    /**
     * Memento. Stores internal state of the originator object. It is protected
     * so that no object can access that state other than the origator itself.
     *
     * @author billy
     *
     */
    public static class EditorState {
        private final String state;

        private EditorState(String stateToSave) {
            state = stateToSave;
        }

        private String getSavedState() {
            return state;
        }
    }
}
