package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo59060d2 = {"Lcom/facebook/internal/SmartLoginOption;", "", "", "value", "J", "getValue", "()J", "<init>", "(Ljava/lang/String;IJ)V", "Companion", "a", "None", "Enabled", "RequireConfirm", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    /* access modifiers changed from: private */
    public static final EnumSet<SmartLoginOption> ALL = null;
    public static final C2372a Companion = null;
    private final long value;

    /* renamed from: com.facebook.internal.SmartLoginOption$a */
    public static final class C2372a {
        /* renamed from: a */
        public static EnumSet m6266a(long j) {
            EnumSet<E> noneOf = EnumSet.noneOf(SmartLoginOption.class);
            Iterator it = SmartLoginOption.ALL.iterator();
            while (it.hasNext()) {
                SmartLoginOption smartLoginOption = (SmartLoginOption) it.next();
                if ((smartLoginOption.getValue() & j) != 0) {
                    noneOf.add(smartLoginOption);
                }
            }
            C24362h.m61210e(noneOf, "result");
            return noneOf;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C2372a();
        EnumSet<SmartLoginOption> allOf = EnumSet.allOf(SmartLoginOption.class);
        C24362h.m61210e(allOf, "allOf(SmartLoginOption::class.java)");
        ALL = allOf;
    }

    private SmartLoginOption(long j) {
        this.value = j;
    }

    public static final EnumSet<SmartLoginOption> parseOptions(long j) {
        Companion.getClass();
        return C2372a.m6266a(j);
    }

    public final long getValue() {
        return this.value;
    }
}
