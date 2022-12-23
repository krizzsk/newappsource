package p511gi;

import android.os.AsyncTask;

/* renamed from: gi.b */
public abstract class C17192b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    public C17193a f44437a;

    /* renamed from: b */
    public final C17194b f44438b;

    /* renamed from: gi.b$a */
    public interface C17193a {
    }

    /* renamed from: gi.b$b */
    public interface C17194b {
    }

    public C17192b(C17194b bVar) {
        this.f44438b = bVar;
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        C17193a aVar = this.f44437a;
        if (aVar != null) {
            C17195c cVar = (C17195c) aVar;
            cVar.f44441c = null;
            cVar.mo49776a();
        }
    }
}
