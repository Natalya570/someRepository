package ru.lab_4_core.hierarchy.operation;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<Operation> operations;

    public Journal() {
        operations = new ArrayList<Operation>();
    }
    public List<Operation> getOperations() {
        return operations;
    }

}
