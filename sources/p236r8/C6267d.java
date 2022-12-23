package p236r8;

import com.appboy.support.AppboyFileUtils;
import com.facebook.internal.C2397f0;
import com.facebook.internal.instrument.InstrumentData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C23825c;
import mf0.C24362h;
import org.json.JSONArray;
import p009a8.C0118q;
import p223q8.C6214c;
import p262t8.C6606a;
import p584jl.C17885a;
import rf0.C24805g;

/* renamed from: r8.d */
public final class C6267d {

    /* renamed from: a */
    public static final AtomicBoolean f19738a = new AtomicBoolean(false);

    static {
        new C6267d();
    }

    /* renamed from: a */
    public static final void m14854a() {
        File[] fileArr;
        Class<C6267d> cls = C6267d.class;
        if (!C6606a.m15601b(cls)) {
            try {
                if (!C2397f0.m6331y()) {
                    File V = C17885a.m44425V();
                    if (V == null) {
                        fileArr = new File[0];
                    } else {
                        fileArr = V.listFiles(new C6214c(0));
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
                    List H0 = C23825c.m58496H0(arrayList2, new C6266c(0));
                    JSONArray jSONArray = new JSONArray();
                    C24805g p = C17885a.m44393C0(0, Math.min(H0.size(), 5)).iterator();
                    while (p.f62733d) {
                        jSONArray.put(H0.get(p.nextInt()));
                    }
                    C17885a.m44463t0("anr_reports", jSONArray, new C0118q(H0, 1));
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }
}
