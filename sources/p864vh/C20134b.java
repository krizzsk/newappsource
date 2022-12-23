package p864vh;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import ce0.C21100e;
import com.iab.omid.library.fyber.walking.C14649c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p247s6.C6478c;
import p746qh.C19120a;
import p746qh.C19123c;
import p768rh.C19273a;
import p768rh.C19275b;
import p768rh.C19276c;
import p792sh.C19461a;
import p792sh.C19462b;
import p864vh.C20139c;
import p888wh.C20338c;
import p888wh.C20339d;
import p888wh.C20340e;
import p888wh.C20341f;

/* renamed from: vh.b */
public final class C20134b implements C19273a.C19274a {

    /* renamed from: h */
    public static C20134b f51093h = new C20134b();

    /* renamed from: i */
    public static Handler f51094i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    public static Handler f51095j = null;

    /* renamed from: k */
    public static final C20135a f51096k = new C20135a();

    /* renamed from: l */
    public static final C20136b f51097l = new C20136b();

    /* renamed from: a */
    public ArrayList f51098a = new ArrayList();

    /* renamed from: b */
    public int f51099b;

    /* renamed from: c */
    public final ArrayList f51100c = new ArrayList();

    /* renamed from: d */
    public C6478c f51101d = new C6478c(2);

    /* renamed from: e */
    public C20139c f51102e = new C20139c();

    /* renamed from: f */
    public C20141d f51103f = new C20141d(new C20338c());

    /* renamed from: g */
    public long f51104g;

    /* renamed from: vh.b$a */
    public static class C20135a implements Runnable {
        public final void run() {
            boolean z;
            String str;
            Boolean bool;
            C20134b bVar = C20134b.f51093h;
            bVar.f51099b = 0;
            bVar.f51100c.clear();
            for (T t : Collections.unmodifiableCollection(C19120a.f48607c.f48609b)) {
                t.getClass();
            }
            bVar.f51104g = System.nanoTime();
            C20139c cVar = bVar.f51102e;
            cVar.getClass();
            C19120a aVar = C19120a.f48607c;
            if (aVar != null) {
                for (T t2 : Collections.unmodifiableCollection(aVar.f48609b)) {
                    View view = (View) t2.f47713d.get();
                    if (!t2.f47715f || t2.f47716g) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        String str2 = t2.f47717h;
                        if (view != null) {
                            if (view.isAttachedToWindow()) {
                                if (view.hasWindowFocus()) {
                                    cVar.f51112h.remove(view);
                                    bool = Boolean.FALSE;
                                } else if (cVar.f51112h.containsKey(view)) {
                                    bool = (Boolean) cVar.f51112h.get(view);
                                } else {
                                    WeakHashMap weakHashMap = cVar.f51112h;
                                    Boolean bool2 = Boolean.FALSE;
                                    weakHashMap.put(view, bool2);
                                    bool = bool2;
                                }
                                if (!bool.booleanValue()) {
                                    HashSet hashSet = new HashSet();
                                    View view2 = view;
                                    while (true) {
                                        if (view2 == null) {
                                            cVar.f51108d.addAll(hashSet);
                                            str = null;
                                            break;
                                        }
                                        String a = C19462b.m46863a(view2);
                                        if (a != null) {
                                            str = a;
                                            break;
                                        }
                                        hashSet.add(view2);
                                        ViewParent parent = view2.getParent();
                                        if (parent instanceof View) {
                                            view2 = (View) parent;
                                        } else {
                                            view2 = null;
                                        }
                                    }
                                } else {
                                    str = "noWindowFocus";
                                }
                            } else {
                                str = "notAttached";
                            }
                            if (str == null) {
                                cVar.f51109e.add(str2);
                                cVar.f51105a.put(view, str2);
                                Iterator it = t2.f47712c.iterator();
                                while (it.hasNext()) {
                                    C19123c cVar2 = (C19123c) it.next();
                                    View view3 = (View) cVar2.f48614a.get();
                                    if (view3 != null) {
                                        C20139c.C20140a aVar2 = cVar.f51106b.get(view3);
                                        if (aVar2 != null) {
                                            aVar2.f51115b.add(t2.f47717h);
                                        } else {
                                            cVar.f51106b.put(view3, new C20139c.C20140a(cVar2, t2.f47717h));
                                        }
                                    }
                                }
                            } else if (str != "noWindowFocus") {
                                cVar.f51110f.add(str2);
                                cVar.f51107c.put(str2, view);
                                cVar.f51111g.put(str2, str);
                            }
                        } else {
                            cVar.f51110f.add(str2);
                            cVar.f51111g.put(str2, "noAdView");
                        }
                    }
                }
            }
            long nanoTime = System.nanoTime();
            C19275b bVar2 = (C19275b) bVar.f51101d.f20215b;
            if (bVar.f51102e.f51110f.size() > 0) {
                Iterator<String> it2 = bVar.f51102e.f51110f.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    bVar2.getClass();
                    JSONObject a2 = C19461a.m46859a(0, 0, 0, 0);
                    View view4 = bVar.f51102e.f51107c.get(next);
                    C19276c cVar3 = (C19276c) bVar.f51101d.f20214a;
                    String str3 = bVar.f51102e.f51111g.get(next);
                    if (str3 != null) {
                        JSONObject a3 = cVar3.mo51688a(view4);
                        try {
                            a3.put("adSessionId", next);
                        } catch (JSONException unused) {
                            C21100e.m49340g("Error with setting ad session id");
                        }
                        try {
                            a3.put("notVisibleReason", str3);
                        } catch (JSONException unused2) {
                            C21100e.m49340g("Error with setting not visible reason");
                        }
                        try {
                            JSONArray optJSONArray = a2.optJSONArray("childViews");
                            if (optJSONArray == null) {
                                optJSONArray = new JSONArray();
                                a2.put("childViews", optJSONArray);
                            }
                            optJSONArray.put(a3);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    C19461a.m46860b(a2);
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(next);
                    C20141d dVar = bVar.f51103f;
                    C20338c cVar4 = dVar.f51117b;
                    C20340e eVar = new C20340e(dVar, hashSet2, a2, nanoTime);
                    cVar4.getClass();
                    eVar.f51499a = cVar4;
                    cVar4.f51502b.add(eVar);
                    if (cVar4.f51503c == null) {
                        cVar4.mo52549a();
                    }
                }
            }
            if (bVar.f51102e.f51109e.size() > 0) {
                bVar2.getClass();
                JSONObject a4 = C19461a.m46859a(0, 0, 0, 0);
                C14649c cVar5 = C14649c.PARENT_VIEW;
                bVar2.mo51689a((View) null, a4, bVar, true, false);
                C19461a.m46860b(a4);
                C20141d dVar2 = bVar.f51103f;
                HashSet<String> hashSet3 = bVar.f51102e.f51109e;
                C20338c cVar6 = dVar2.f51117b;
                C20341f fVar = new C20341f(dVar2, hashSet3, a4, nanoTime);
                cVar6.getClass();
                fVar.f51499a = cVar6;
                cVar6.f51502b.add(fVar);
                if (cVar6.f51503c == null) {
                    cVar6.mo52549a();
                }
            } else {
                C20141d dVar3 = bVar.f51103f;
                C20338c cVar7 = dVar3.f51117b;
                C20339d dVar4 = new C20339d(dVar3);
                cVar7.getClass();
                dVar4.f51499a = cVar7;
                cVar7.f51502b.add(dVar4);
                if (cVar7.f51503c == null) {
                    cVar7.mo52549a();
                }
            }
            C20139c cVar8 = bVar.f51102e;
            cVar8.f51105a.clear();
            cVar8.f51106b.clear();
            cVar8.f51107c.clear();
            cVar8.f51108d.clear();
            cVar8.f51109e.clear();
            cVar8.f51110f.clear();
            cVar8.f51111g.clear();
            cVar8.f51113i = false;
            long nanoTime2 = System.nanoTime() - bVar.f51104g;
            if (bVar.f51098a.size() > 0) {
                Iterator it3 = bVar.f51098a.iterator();
                while (it3.hasNext()) {
                    C20138d dVar5 = (C20138d) it3.next();
                    TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                    dVar5.mo52383a();
                    if (dVar5 instanceof C20137c) {
                        ((C20137c) dVar5).mo52382b();
                    }
                }
            }
        }
    }

    /* renamed from: vh.b$b */
    public static class C20136b implements Runnable {
        public final void run() {
            Handler handler = C20134b.f51095j;
            if (handler != null) {
                handler.post(C20134b.f51096k);
                C20134b.f51095j.postDelayed(C20134b.f51097l, 200);
            }
        }
    }

    /* renamed from: vh.b$c */
    public interface C20137c extends C20138d {
        /* renamed from: b */
        void mo52382b();
    }

    /* renamed from: vh.b$d */
    public interface C20138d {
        /* renamed from: a */
        void mo52383a();
    }

    /* renamed from: a */
    public static void m47732a() {
        if (f51095j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f51095j = handler;
            handler.post(f51096k);
            f51095j.postDelayed(f51097l, 200);
        }
    }

    /* renamed from: b */
    public final void mo52379b(View view, C19273a aVar, JSONObject jSONObject, boolean z) {
        boolean z2;
        C14649c cVar;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (C19462b.m46863a(view) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C20139c cVar2 = this.f51102e;
            if (cVar2.f51108d.contains(view)) {
                cVar = C14649c.PARENT_VIEW;
            } else if (cVar2.f51113i) {
                cVar = C14649c.OBSTRUCTION_VIEW;
            } else {
                cVar = C14649c.UNDERLYING_VIEW;
            }
            if (cVar != C14649c.UNDERLYING_VIEW) {
                JSONObject a = aVar.mo51688a(view);
                WindowManager windowManager = C19461a.f49487a;
                try {
                    JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
                    if (optJSONArray == null) {
                        optJSONArray = new JSONArray();
                        jSONObject.put("childViews", optJSONArray);
                    }
                    optJSONArray.put(a);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C20139c cVar3 = this.f51102e;
                if (cVar3.f51105a.size() == 0) {
                    str = null;
                } else {
                    String str2 = cVar3.f51105a.get(view);
                    if (str2 != null) {
                        cVar3.f51105a.remove(view);
                    }
                    str = str2;
                }
                if (str != null) {
                    try {
                        a.put("adSessionId", str);
                    } catch (JSONException unused) {
                        C21100e.m49340g("Error with setting ad session id");
                    }
                    C20139c cVar4 = this.f51102e;
                    if (cVar4.f51112h.containsKey(view)) {
                        cVar4.f51112h.put(view, Boolean.TRUE);
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    try {
                        a.put("hasWindowFocus", Boolean.valueOf(z7));
                    } catch (JSONException unused2) {
                        C21100e.m49340g("Error with setting not visible reason");
                    }
                    this.f51102e.f51113i = true;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    C20139c cVar5 = this.f51102e;
                    C20139c.C20140a aVar2 = cVar5.f51106b.get(view);
                    if (aVar2 != null) {
                        cVar5.f51106b.remove(view);
                    }
                    if (aVar2 != null) {
                        WindowManager windowManager2 = C19461a.f49487a;
                        C19123c cVar6 = aVar2.f51114a;
                        JSONArray jSONArray = new JSONArray();
                        Iterator<String> it = aVar2.f51115b.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next());
                        }
                        try {
                            a.put("isFriendlyObstructionFor", jSONArray);
                            a.put("friendlyObstructionClass", cVar6.f48615b);
                            a.put("friendlyObstructionPurpose", cVar6.f48616c);
                            a.put("friendlyObstructionReason", cVar6.f48617d);
                        } catch (JSONException unused3) {
                            C21100e.m49340g("Error with setting friendly obstruction");
                        }
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z || z4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (cVar == C14649c.PARENT_VIEW) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    aVar.mo51689a(view, a, this, z6, z5);
                }
                this.f51099b++;
            }
        }
    }
}
