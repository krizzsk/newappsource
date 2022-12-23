package org.slf4j.helpers;

import p001a0.C0016g;

public abstract class MarkerIgnoringBase extends NamedLoggerBase {
    private static final long serialVersionUID = 9044267456635152283L;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("(");
        return C0016g.m31o(sb, mo61122a(), ")");
    }
}
