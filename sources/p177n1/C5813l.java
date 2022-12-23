package p177n1;

import android.os.Build;
import android.os.Trace;

@Deprecated
/* renamed from: n1.l */
public final class C5813l {

    /* renamed from: a */
    public static final /* synthetic */ int f18762a = 0;

    /* renamed from: n1.l$a */
    public static class C5814a {
        /* renamed from: a */
        public static void m14246a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        public static void m14247b() {
            Trace.endSection();
        }
    }

    static {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception unused) {
            }
        }
    }
}
