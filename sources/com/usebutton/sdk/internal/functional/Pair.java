package com.usebutton.sdk.internal.functional;

public class Pair<First, Second> {
    private final First mFirst;
    private final Second mSecond;

    public Pair(First first, Second second) {
        this.mFirst = first;
        this.mSecond = second;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pair pair = (Pair) obj;
        First first = this.mFirst;
        if (first == null ? pair.mFirst != null : !first.equals(pair.mFirst)) {
            return false;
        }
        Second second = this.mSecond;
        Second second2 = pair.mSecond;
        if (second != null) {
            if (!second.equals(second2)) {
                return false;
            }
            return true;
        } else if (second2 == null) {
            return true;
        }
        return false;
    }

    public First first() {
        return this.mFirst;
    }

    public int hashCode() {
        int i;
        First first = this.mFirst;
        int i2 = 0;
        if (first != null) {
            i = first.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Second second = this.mSecond;
        if (second != null) {
            i2 = second.hashCode();
        }
        return i3 + i2;
    }

    public Second second() {
        return this.mSecond;
    }

    public String toString() {
        return String.format("Pair{mFirst=%s, mSecond=%s}", new Object[]{this.mFirst, this.mSecond});
    }
}
