package p009a8;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.GraphRequest;
import com.facebook.internal.C2397f0;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mf0.C24362h;
import p001a0.C0016g;
import p262t8.C6606a;

/* renamed from: a8.s */
public final class C0120s extends AsyncTask<Void, Void, List<? extends C0124u>> {

    /* renamed from: a */
    public final HttpURLConnection f355a = null;

    /* renamed from: b */
    public final C0121t f356b;

    /* renamed from: c */
    public Exception f357c;

    static {
        Class<C0120s> cls = C0120s.class;
    }

    public C0120s(C0121t tVar) {
        C24362h.m61211f(tVar, "requests");
        this.f356b = tVar;
    }

    /* renamed from: a */
    public final ArrayList mo262a(Void... voidArr) {
        ArrayList arrayList;
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            if (C6606a.m15601b(this)) {
                return null;
            }
            C24362h.m61211f(voidArr, "params");
            try {
                HttpURLConnection httpURLConnection = this.f355a;
                if (httpURLConnection == null) {
                    C0121t tVar = this.f356b;
                    tVar.getClass();
                    String str = GraphRequest.f8425j;
                    arrayList = GraphRequest.C2281c.m6133c(tVar);
                } else {
                    String str2 = GraphRequest.f8425j;
                    arrayList = GraphRequest.C2281c.m6134d(this.f356b, httpURLConnection);
                }
                return arrayList;
            } catch (Exception e) {
                this.f357c = e;
                return null;
            }
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo263b(List<C0124u> list) {
        if (!C6606a.m15601b(this)) {
            try {
                if (!C6606a.m15601b(this)) {
                    C24362h.m61211f(list, "result");
                    super.onPostExecute(list);
                    Exception exc = this.f357c;
                    if (exc != null) {
                        C2397f0 f0Var = C2397f0.f8630a;
                        C24362h.m61210e(String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)), "java.lang.String.format(format, *args)");
                        C0115o oVar = C0115o.f331a;
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            if (C6606a.m15601b(this)) {
                return null;
            }
            return mo262a((Void[]) objArr);
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (!C6606a.m15601b(this)) {
            try {
                if (!C6606a.m15601b(this)) {
                    mo263b((List) obj);
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    public final void onPreExecute() {
        Handler handler;
        if (!C6606a.m15601b(this)) {
            try {
                if (!C6606a.m15601b(this)) {
                    super.onPreExecute();
                    C0115o oVar = C0115o.f331a;
                    if (this.f356b.f359b == null) {
                        if (Thread.currentThread() instanceof HandlerThread) {
                            handler = new Handler();
                        } else {
                            handler = new Handler(Looper.getMainLooper());
                        }
                        this.f356b.f359b = handler;
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    public final String toString() {
        StringBuilder t = C0016g.m36t("{RequestAsyncTask: ", " connection: ");
        t.append(this.f355a);
        t.append(", requests: ");
        t.append(this.f356b);
        t.append("}");
        String sb = t.toString();
        C24362h.m61210e(sb, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return sb;
    }
}
