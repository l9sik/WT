package lab1.task13;

import lab1.task12.Book;

public class ProgrammerBook extends Book {

    private String language;
    private int level;

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!super.equals(obj)) {
            return false;
        }

        ProgrammerBook that = (ProgrammerBook) obj;
        return that.language.equals(this.language) && level == that.level;
    }

    @Override
    public int hashCode() {
        final int value = 21;
        int outcome = super.hashCode();
        outcome = value * outcome + (language == null ? 0 : language.hashCode());
        outcome = value * outcome + (int) (level ^ (level >> 10));
        return outcome;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Language: %s, Level: %d", language, level);
    }

}
