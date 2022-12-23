package p043ch.qos.logback.core.joran.action;

import p193o4.C5982h;
import p296w4.C6992h;

/* renamed from: ch.qos.logback.core.joran.action.ActionUtil */
public final class ActionUtil {

    /* renamed from: ch.qos.logback.core.joran.action.ActionUtil$Scope */
    public enum Scope {
        LOCAL,
        CONTEXT,
        SYSTEM
    }

    /* renamed from: ch.qos.logback.core.joran.action.ActionUtil$a */
    public static /* synthetic */ class C1846a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6384a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                ch.qos.logback.core.joran.action.ActionUtil$Scope[] r0 = p043ch.qos.logback.core.joran.action.ActionUtil.Scope.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6384a = r0
                ch.qos.logback.core.joran.action.ActionUtil$Scope r1 = p043ch.qos.logback.core.joran.action.ActionUtil.Scope.LOCAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6384a     // Catch:{ NoSuchFieldError -> 0x001d }
                ch.qos.logback.core.joran.action.ActionUtil$Scope r1 = p043ch.qos.logback.core.joran.action.ActionUtil.Scope.CONTEXT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6384a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ch.qos.logback.core.joran.action.ActionUtil$Scope r1 = p043ch.qos.logback.core.joran.action.ActionUtil.Scope.SYSTEM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p043ch.qos.logback.core.joran.action.ActionUtil.C1846a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m5216a(C5982h hVar, String str, String str2, Scope scope) {
        int i = C1846a.f6384a[scope.ordinal()];
        if (i == 1) {
            hVar.getClass();
            if (str != null && str2 != null) {
                hVar.f19132g.put(str, str2.trim());
            }
        } else if (i == 2) {
            hVar.f20771c.mo20061e(str, str2);
        } else if (i == 3) {
            C6992h.m16475d(hVar, str, str2);
        }
    }

    /* renamed from: b */
    public static Scope m5217b(String str) {
        Scope scope = Scope.SYSTEM;
        if (scope.toString().equalsIgnoreCase(str)) {
            return scope;
        }
        Scope scope2 = Scope.CONTEXT;
        return scope2.toString().equalsIgnoreCase(str) ? scope2 : Scope.LOCAL;
    }
}
