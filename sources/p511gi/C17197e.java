package p511gi;

import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;
import p361ai.C13465a;
import p487fi.C17026d;

/* renamed from: gi.e */
public final class C17197e extends C17191a {
    public C17197e(C17026d dVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(dVar, hashSet, jSONObject, j);
    }

    /* renamed from: a */
    public final void onPostExecute(String str) {
        C13465a aVar = C13465a.f33332c;
        if (aVar != null) {
            for (T t : Collections.unmodifiableCollection(aVar.f33333a)) {
                if (this.f44434c.contains(t.f52597h)) {
                    t.f52594e.mo44204f(this.f44436e, str);
                }
            }
        }
        super.onPostExecute(str);
    }

    public final Object doInBackground(Object[] objArr) {
        return this.f44435d.toString();
    }
}
