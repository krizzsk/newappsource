package p888wh;

import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;
import p746qh.C19120a;
import p864vh.C20141d;

/* renamed from: wh.e */
public final class C20340e extends C20334a {
    public C20340e(C20141d dVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(dVar, hashSet, jSONObject, j);
    }

    /* renamed from: a */
    public final void onPostExecute(String str) {
        C19120a aVar = C19120a.f48607c;
        if (aVar != null) {
            for (T t : Collections.unmodifiableCollection(aVar.f48608a)) {
                if (this.f51496c.contains(t.f47717h)) {
                    t.f47714e.mo44192g(this.f51498e, str);
                }
            }
        }
        super.onPostExecute(str);
    }

    public final Object doInBackground(Object[] objArr) {
        return this.f51497d.toString();
    }
}
