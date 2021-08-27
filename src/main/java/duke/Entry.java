package duke;

public abstract class Entry {
    private final String ENTRY;

    private boolean isDone;

    Entry() {
        this.ENTRY = "";
        this.isDone = false;
    }

    Entry(String value) {
        this.ENTRY = value;
        this.isDone = false;
    }

    public void revertDone() {
        this.isDone = !this.isDone;
    }

    public boolean setDone() {
        if (this.isDone) {
            return false;
        } else {
            this.isDone = true;
            return true;
        }
    }

    public boolean isEmpty() {
        return this.ENTRY.length() < 1;
    }

    public String saveString() {
        String isDoneString = "0";
        if (this.isDone) {
            isDoneString = "1";
        }
        return "," + isDoneString + "," + this.ENTRY;
    }

    @Override
    public String toString() {
        char isDoneDisplay = this.isDone ? 'X' : ' ';
        return ("[" + isDoneDisplay + "] " + this.ENTRY);
    }
}