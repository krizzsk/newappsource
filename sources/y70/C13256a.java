package y70;

import android.content.Context;
import com.appboy.models.InAppMessageBase;
import f00.C16918f;
import f00.C16919g;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p081f3.C4669n;
import p389bl.C13641g;
import p583jk.C17884p;
import p786rz.C19387a;
import p810sz.C19584i;
import p810sz.C19589j;
import p810sz.C19610m;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: y70.a */
public final class C13256a {

    /* renamed from: c */
    public static volatile C13256a f32903c;

    /* renamed from: d */
    public static C16918f<Long> f32904d;

    /* renamed from: e */
    public static long f32905e;

    /* renamed from: f */
    public static C13258b f32906f = new C13258b();

    /* renamed from: a */
    public final ArrayList f32907a;

    /* renamed from: b */
    public Context f32908b;

    /* renamed from: y70.a$a */
    public class C13257a implements C19584i<JSONObject> {
        public final Object read(C19615p pVar) throws IOException {
            try {
                return new JSONObject(pVar.mo51947p());
            } catch (JSONException e) {
                e.printStackTrace();
                throw new RuntimeException("corrupt json string", e);
            }
        }

        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((JSONObject) obj).toString());
        }
    }

    /* renamed from: y70.a$b */
    public class C13258b implements C19589j<List<C13259c>> {
        public final Object read(C19615p pVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            do {
                try {
                    arrayList.add((C13259c) C13259c.f32909c.read(pVar));
                    continue;
                } catch (Exception unused) {
                    z = true;
                    continue;
                }
            } while (!z);
            return arrayList;
        }
    }

    /* renamed from: y70.a$c */
    public static class C13259c {

        /* renamed from: c */
        public static C13260a f32909c = new C13260a();

        /* renamed from: a */
        public final long f32910a;

        /* renamed from: b */
        public final JSONObject f32911b;

        /* renamed from: y70.a$c$a */
        public class C13260a extends C19619s<C13259c> {
            public C13260a() {
                super(0, C13259c.class);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                try {
                    return new C13259c(pVar.mo51925m(), new JSONObject(pVar.mo51947p()));
                } catch (JSONException e) {
                    e.printStackTrace();
                    throw new RuntimeException("corrupt json string", e);
                }
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                C13259c cVar = (C13259c) obj;
                qVar.mo51940m(cVar.f32910a);
                qVar.mo51954p(cVar.f32911b.toString());
            }
        }

        public C13259c(long j, JSONObject jSONObject) {
            this.f32910a = j;
            this.f32911b = jSONObject;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof C13259c) && this.f32910a == ((C13259c) obj).f32910a);
        }

        public final int hashCode() {
            return C17884p.m44334E(this.f32910a);
        }
    }

    static {
        new C13257a();
    }

    public C13256a(Context context) {
        ArrayList arrayList = new ArrayList();
        this.f32907a = arrayList;
        this.f32908b = context;
        C16918f<Long> fVar = new C16918f<>(context.getSharedPreferences("moovit_sdk_async_message", 0), new C16919g.C16925f("running_id", 0));
        f32904d = fVar;
        f32905e = fVar.mo49542a().longValue();
        if (this.f32908b.getFileStreamPath("moovit_sdk_async_message_version_store").exists()) {
            arrayList.addAll((Collection) C13641g.m34133v(this.f32908b, "moovit_sdk_async_message_version_store", f32906f));
        }
    }

    /* renamed from: b */
    public static C13256a m33377b(Context context) {
        if (f32903c == null) {
            synchronized (C13256a.class) {
                if (f32903c == null) {
                    f32903c = new C13256a(context.getApplicationContext());
                }
            }
        }
        return f32903c;
    }

    /* renamed from: a */
    public final synchronized void mo40132a(C4669n nVar) {
        long j = f32905e;
        f32905e = 1 + j;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("protocolVersion", "5.37.2.429");
            jSONObject.put(InAppMessageBase.MESSAGE, jSONObject2);
            jSONObject2.put(nVar.mo20188d(), nVar.mo20187c());
        } catch (Exception e) {
            e.toString();
        }
        C13259c cVar = new C13259c(j, jSONObject);
        f32904d.mo49544c(Long.valueOf(f32905e));
        this.f32907a.add(cVar);
        mo40133c(cVar);
    }

    /* renamed from: c */
    public final void mo40133c(C13259c cVar) {
        if (this.f32908b.getFileStreamPath("moovit_sdk_async_message_version_store").exists()) {
            Context context = this.f32908b;
            C13259c.C13260a aVar = C13259c.f32909c;
            BufferedOutputStream bufferedOutputStream = null;
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(context.openFileOutput("moovit_sdk_async_message_version_store", 32768));
                try {
                    aVar.write(cVar, new C19610m(bufferedOutputStream2));
                    C19387a.m46677i(bufferedOutputStream2);
                } catch (IOException unused) {
                    bufferedOutputStream = bufferedOutputStream2;
                    C19387a.m46677i(bufferedOutputStream);
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    C19387a.m46677i(bufferedOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                C19387a.m46677i(bufferedOutputStream);
            } catch (Throwable th2) {
                th = th2;
                C19387a.m46677i(bufferedOutputStream);
                throw th;
            }
        } else {
            C13641g.m34136y(this.f32908b, "moovit_sdk_async_message_version_store", cVar, C13259c.f32909c);
        }
    }
}
