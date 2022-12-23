package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import uh0.C25081h;

public enum RenderingFormat {
    ;

    public static final class HTML extends RenderingFormat {
        public HTML() {
            super("HTML", 1, (DefaultConstructorMarker) null);
        }

        public final String escape(String str) {
            C24362h.m61211f(str, "string");
            return C25081h.m62833D(C25081h.m62833D(str, "<", "&lt;", false), ">", "&gt;", false);
        }
    }

    public static final class PLAIN extends RenderingFormat {
        public PLAIN() {
            super("PLAIN", 0, (DefaultConstructorMarker) null);
        }

        public final String escape(String str) {
            C24362h.m61211f(str, "string");
            return str;
        }
    }

    public abstract String escape(String str);
}
