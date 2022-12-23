package p888wh;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;
import p746qh.C19120a;
import p792sh.C19461a;
import p864vh.C20141d;
import p888wh.C20335b;

/* renamed from: wh.f */
public final class C20341f extends C20334a {
    public C20341f(C20141d dVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(dVar, hashSet, jSONObject, j);
    }

    /* renamed from: a */
    public final void onPostExecute(String str) {
        C19120a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = C19120a.f48607c) != null) {
            for (T t : Collections.unmodifiableCollection(aVar.f48608a)) {
                if (this.f51496c.contains(t.f47717h)) {
                    t.f47714e.mo44188c(str, this.f51498e);
                }
            }
        }
        super.onPostExecute(str);
    }

    public final Object doInBackground(Object[] objArr) {
        if (C19461a.m46862d(this.f51497d, ((C20141d) this.f51500b).f51116a)) {
            return null;
        }
        C20335b.C20337b bVar = this.f51500b;
        JSONObject jSONObject = this.f51497d;
        ((C20141d) bVar).f51116a = jSONObject;
        return jSONObject.toString();
    }
}
