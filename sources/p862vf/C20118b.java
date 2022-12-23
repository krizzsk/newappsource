package p862vf;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.C14535a;
import com.google.firebase.remoteconfig.internal.C14537b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p054d0.C4291k0;
import p250s9.C6489b;
import p358af.C13436c;
import p743qd.C19107d;
import p764rd.C19254b;
import p886wf.C20297c;
import p886wf.C20299d;
import p886wf.C20300e;
import p886wf.C20302g;

/* renamed from: vf.b */
public final class C20118b {

    /* renamed from: a */
    public final C19254b f51039a;

    /* renamed from: b */
    public final Executor f51040b;

    /* renamed from: c */
    public final C20297c f51041c;

    /* renamed from: d */
    public final C20297c f51042d;

    /* renamed from: e */
    public final C20297c f51043e;

    /* renamed from: f */
    public final C14535a f51044f;

    /* renamed from: g */
    public final C20302g f51045g;

    /* renamed from: h */
    public final C14537b f51046h;

    /* renamed from: i */
    public final C13436c f51047i;

    public C20118b(C13436c cVar, C19254b bVar, ExecutorService executorService, C20297c cVar2, C20297c cVar3, C20297c cVar4, C14535a aVar, C20302g gVar, C14537b bVar2) {
        this.f51047i = cVar;
        this.f51039a = bVar;
        this.f51040b = executorService;
        this.f51041c = cVar2;
        this.f51042d = cVar3;
        this.f51043e = cVar4;
        this.f51044f = aVar;
        this.f51045g = gVar;
        this.f51046h = bVar2;
    }

    /* renamed from: e */
    public static C20118b m47697e() {
        return ((C20122f) C19107d.m46265d().mo51536b(C20122f.class)).mo52366a("firebase");
    }

    /* renamed from: g */
    public static ArrayList m47698g(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Task<Boolean> mo52354a() {
        Task<C20299d> c = this.f51041c.mo52465c();
        Task<C20299d> c2 = this.f51042d.mo52465c();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{c, c2}).continueWithTask(this.f51040b, new C20117a(this, c, c2));
    }

    /* renamed from: b */
    public final Task<Boolean> mo52355b() {
        C14535a aVar = this.f51044f;
        return aVar.f36691f.mo52465c().continueWithTask(aVar.f36688c, new C20300e(aVar, aVar.f36693h.f36700a.getLong("minimum_fetch_interval_in_seconds", C14535a.f36684j))).onSuccessTask(new C6489b(9)).onSuccessTask(this.f51040b, new C4291k0(this, 5));
    }

    /* renamed from: c */
    public final HashMap mo52356c() {
        C20302g gVar = this.f51045g;
        gVar.getClass();
        HashSet hashSet = new HashSet();
        hashSet.addAll(C20302g.m47871c(gVar.f51484c));
        hashSet.addAll(C20302g.m47871c(gVar.f51485d));
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            hashMap.put(str, gVar.mo52470e(str));
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (p886wf.C20302g.f51481f.matcher(r0).matches() != false) goto L_0x005e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo52357d(java.lang.String r4) {
        /*
            r3 = this;
            wf.g r0 = r3.f51045g
            wf.c r1 = r0.f51484c
            java.lang.String r1 = p886wf.C20302g.m47872d(r1, r4)
            if (r1 == 0) goto L_0x0036
            java.util.regex.Pattern r2 = p886wf.C20302g.f51480e
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L_0x0020
            wf.c r1 = r0.f51484c
            wf.d r1 = p886wf.C20302g.m47870b(r1)
            r0.mo52469a(r1, r4)
            goto L_0x004a
        L_0x0020:
            java.util.regex.Pattern r2 = p886wf.C20302g.f51481f
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L_0x0036
            wf.c r1 = r0.f51484c
            wf.d r1 = p886wf.C20302g.m47870b(r1)
            r0.mo52469a(r1, r4)
            goto L_0x005e
        L_0x0036:
            wf.c r0 = r0.f51485d
            java.lang.String r0 = p886wf.C20302g.m47872d(r0, r4)
            if (r0 == 0) goto L_0x0059
            java.util.regex.Pattern r1 = p886wf.C20302g.f51480e
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L_0x004c
        L_0x004a:
            r4 = 1
            goto L_0x005f
        L_0x004c:
            java.util.regex.Pattern r1 = p886wf.C20302g.f51481f
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x0059
            goto L_0x005e
        L_0x0059:
            java.lang.String r0 = "Boolean"
            p886wf.C20302g.m47873f(r4, r0)
        L_0x005e:
            r4 = 0
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p862vf.C20118b.mo52357d(java.lang.String):boolean");
    }

    /* renamed from: f */
    public final String mo52358f(String str) {
        C20302g gVar = this.f51045g;
        String d = C20302g.m47872d(gVar.f51484c, str);
        if (d != null) {
            gVar.mo52469a(C20302g.m47870b(gVar.f51484c), str);
            return d;
        }
        String d2 = C20302g.m47872d(gVar.f51485d, str);
        if (d2 != null) {
            return d2;
        }
        C20302g.m47873f(str, "String");
        return "";
    }
}
