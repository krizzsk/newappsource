package kotlin.reflect.jvm.internal.impl.load.java;

public enum ReportLevel {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    
    public static final C23919a Companion = null;
    private final String description;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.ReportLevel$a */
    public static final class C23919a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C23919a();
    }

    private ReportLevel(String str) {
        this.description = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
