package p511gi;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;
import p361ai.C13465a;
import p407ci.C13836a;
import p487fi.C17026d;
import p511gi.C17192b;

/* renamed from: gi.f */
public final class C17198f extends C17191a {
    public C17198f(C17026d dVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(dVar, hashSet, jSONObject, j);
    }

    /* renamed from: a */
    public final void onPostExecute(String str) {
        C13465a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = C13465a.f33332c) != null) {
            for (T t : Collections.unmodifiableCollection(aVar.f33333a)) {
                if (this.f44434c.contains(t.f52597h)) {
                    t.f52594e.mo44200b(str, this.f44436e);
                }
            }
        }
        super.onPostExecute(str);
    }

    public final Object doInBackground(Object[] objArr) {
        if (C13836a.m34521d(this.f44435d, ((C17026d) this.f44438b).f44159a)) {
            return null;
        }
        C17192b.C17194b bVar = this.f44438b;
        JSONObject jSONObject = this.f44435d;
        ((C17026d) bVar).f44159a = jSONObject;
        return jSONObject.toString();
    }
}
