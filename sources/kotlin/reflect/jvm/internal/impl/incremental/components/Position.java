package kotlin.reflect.jvm.internal.impl.incremental.components;

import java.io.Serializable;

public final class Position implements Serializable {

    /* renamed from: b */
    public static final Position f60544b = new Position();
    private final int column = -1;
    private final int line = -1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.line == position.line && this.column == position.column;
    }

    public final int hashCode() {
        return (this.line * 31) + this.column;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Position(line=");
        k.append(this.line);
        k.append(", column=");
        return C16530d.m42014g(k, this.column, ')');
    }
}
