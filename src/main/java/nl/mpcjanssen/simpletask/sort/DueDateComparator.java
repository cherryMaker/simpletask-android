package nl.mpcjanssen.simpletask.sort;

import com.google.common.collect.Ordering;

import org.jetbrains.annotations.NotNull;

import nl.mpcjanssen.simpletask.task.Task;

public class DueDateComparator extends Ordering<Task> {

    @Override
    public int compare(@NotNull Task a, @NotNull Task b) {
        int result;
        if (a.getDueDate() == null && b.getDueDate() == null) {
            result = 0;
        } else if (a.getDueDate() == null) {
            result = 1;
        } else if (b.getDueDate() == null) {
            result = -1;
        } else {
            result = a.getDueDate().compareTo(b.getDueDate());
        }
        return result;
    }
}
