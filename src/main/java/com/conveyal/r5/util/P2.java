package com.conveyal.r5.util;

import javafx.beans.NamedArg;
import javafx.util.Pair;

/**
 * Tuple of two elements with same type
 */
public class P2<E> {
    public final E a;

    public final E b;

    /**
     * Creates a new pair
     *
     * @param b   The key for this pair
     * @param b The value to use for this pair
     */
    public P2(
        E a,
        E b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return String.format("P2<%s %s>", a, b);
    }

    @Override
    public int hashCode() {
        return (a != null ? a.hashCode() : 0) +
                (b != null ? b.hashCode() * 31 : 0);
    }

    @Override
    public boolean equals(Object o) {
        if (a == null || b == null) return a == b;
        else return a.equals(b);
    }
}
