package p888wh;

import android.os.AsyncTask;

/* renamed from: wh.b */
public abstract class C20335b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    public C20336a f51499a;

    /* renamed from: b */
    public final C20337b f51500b;

    /* renamed from: wh.b$a */
    public interface C20336a {
    }

    /* renamed from: wh.b$b */
    public interface C20337b {
    }

    public C20335b(C20337b bVar) {
        this.f51500b = bVar;
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        C20336a aVar = this.f51499a;
        if (aVar != null) {
            C20338c cVar = (C20338c) aVar;
            cVar.f51503c = null;
            cVar.mo52549a();
        }
    }
}
