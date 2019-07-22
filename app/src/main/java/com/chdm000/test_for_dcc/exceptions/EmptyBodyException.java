package com.chdm000.test_for_dcc.exceptions;

public final class EmptyBodyException extends IllegalStateException {
    public EmptyBodyException() {
        super("Body is empty");
    }
}
