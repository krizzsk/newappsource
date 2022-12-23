package p275u9;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import p275u9.C6738j;

/* renamed from: u9.s */
public abstract class C6751s {

    /* renamed from: u9.s$a */
    public static abstract class C6752a {
    }

    /* renamed from: a */
    public static C6738j.C6739a m15889a() {
        C6738j.C6739a aVar = new C6738j.C6739a();
        aVar.mo22917c(Priority.DEFAULT);
        return aVar;
    }

    /* renamed from: b */
    public abstract String mo22910b();

    /* renamed from: c */
    public abstract byte[] mo22911c();

    /* renamed from: d */
    public abstract Priority mo22912d();

    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = mo22910b();
        objArr[1] = mo22912d();
        if (mo22911c() == null) {
            str = "";
        } else {
            str = Base64.encodeToString(mo22911c(), 2);
        }
        objArr[2] = str;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
