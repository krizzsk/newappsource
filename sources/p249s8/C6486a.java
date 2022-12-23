package p249s8;

import ce0.C21100e;
import com.appboy.Constants;
import com.appboy.support.AppboyFileUtils;
import com.facebook.internal.C2397f0;
import com.facebook.internal.instrument.InstrumentData;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C23825c;
import mf0.C24362h;
import org.json.JSONArray;
import p220q5.C6179a;
import p223q8.C6212a;
import p223q8.C6213b;
import p584jl.C17885a;
import rf0.C24805g;
import uh0.C25081h;

/* renamed from: s8.a */
public final class C6486a implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    public static final C6487a f20227b = new C6487a();

    /* renamed from: c */
    public static C6486a f20228c;

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f20229a;

    /* renamed from: s8.a$a */
    public static final class C6487a {
        /* renamed from: a */
        public static void m15372a() {
            File[] fileArr;
            if (!C2397f0.m6331y()) {
                File V = C17885a.m44425V();
                if (V == null) {
                    fileArr = new File[0];
                } else {
                    fileArr = V.listFiles(new C6213b());
                    if (fileArr == null) {
                        fileArr = new File[0];
                    }
                }
                ArrayList arrayList = new ArrayList(fileArr.length);
                for (File file : fileArr) {
                    C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
                    arrayList.add(new InstrumentData(file));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((InstrumentData) next).mo12558b()) {
                        arrayList2.add(next);
                    }
                }
                List H0 = C23825c.m58496H0(arrayList2, new C6179a(1));
                JSONArray jSONArray = new JSONArray();
                C24805g p = C17885a.m44393C0(0, Math.min(H0.size(), 5)).iterator();
                while (p.f62733d) {
                    jSONArray.put(H0.get(p.nextInt()));
                }
                C17885a.m44463t0("crash_reports", jSONArray, new C6212a(H0, 1));
            }
        }
    }

    static {
        Class<C6486a> cls = C6486a.class;
    }

    public C6486a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f20229a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        int i;
        C24362h.m61211f(thread, Constants.APPBOY_PUSH_TITLE_KEY);
        C24362h.m61211f(th, "e");
        Throwable th2 = null;
        Throwable th3 = th;
        loop0:
        while (true) {
            i = 0;
            if (th3 == null || th3 == th2) {
                break;
            }
            StackTraceElement[] stackTrace = th3.getStackTrace();
            C24362h.m61210e(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            while (i < length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                i++;
                String className = stackTraceElement.getClassName();
                C24362h.m61210e(className, "element.className");
                if (C25081h.m62835F(className, "com.facebook")) {
                    i = 1;
                    break loop0;
                }
            }
            th2 = th3;
            th3 = th3.getCause();
        }
        if (i != 0) {
            C21100e.m49323R(th);
            InstrumentData.Type type = InstrumentData.Type.CrashReport;
            C24362h.m61211f(type, Constants.APPBOY_PUSH_TITLE_KEY);
            new InstrumentData(th, type).mo12559c();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f20229a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
