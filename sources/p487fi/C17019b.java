package p487fi;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import com.google.android.play.core.appupdate.C14226d;
import com.google.android.play.core.assetpacks.C14343z0;
import com.iab.omid.library.vungle.walking.C14651c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p361ai.C13465a;
import p361ai.C13468c;
import p386bi.C13627a;
import p386bi.C13629b;
import p386bi.C13630c;
import p407ci.C13836a;
import p407ci.C13837b;
import p487fi.C17024c;
import p511gi.C17195c;
import p511gi.C17196d;
import p511gi.C17197e;
import p511gi.C17198f;

/* renamed from: fi.b */
public final class C17019b implements C13627a.C13628a {

    /* renamed from: g */
    public static C17019b f44140g = new C17019b();

    /* renamed from: h */
    public static Handler f44141h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    public static Handler f44142i = null;

    /* renamed from: j */
    public static final C17020a f44143j = new C17020a();

    /* renamed from: k */
    public static final C17021b f44144k = new C17021b();

    /* renamed from: a */
    public ArrayList f44145a = new ArrayList();

    /* renamed from: b */
    public int f44146b;

    /* renamed from: c */
    public C14343z0 f44147c = new C14343z0();

    /* renamed from: d */
    public C17024c f44148d = new C17024c();

    /* renamed from: e */
    public C17026d f44149e = new C17026d(new C17195c());

    /* renamed from: f */
    public long f44150f;

    /* renamed from: fi.b$a */
    public static class C17020a implements Runnable {
        public final void run() {
            boolean z;
            String str;
            C17019b bVar = C17019b.f44140g;
            bVar.f44146b = 0;
            bVar.f44150f = System.nanoTime();
            C17024c cVar = bVar.f44148d;
            cVar.getClass();
            C13465a aVar = C13465a.f33332c;
            if (aVar != null) {
                for (T t : Collections.unmodifiableCollection(aVar.f33334b)) {
                    View view = (View) t.f52593d.get();
                    if (!t.f52595f || t.f52596g) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        String str2 = t.f52597h;
                        if (view != null) {
                            if (!view.hasWindowFocus()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view2 = view;
                                while (true) {
                                    if (view2 == null) {
                                        cVar.f44154d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String a = C13837b.m34522a(view2);
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
                            }
                            if (str == null) {
                                cVar.f44155e.add(str2);
                                cVar.f44151a.put(view, str2);
                                Iterator it = t.f52592c.iterator();
                                if (it.hasNext()) {
                                    ((C13468c) it.next()).getClass();
                                    throw null;
                                }
                            } else {
                                cVar.f44156f.add(str2);
                                cVar.f44153c.put(str2, view);
                                cVar.f44157g.put(str2, str);
                            }
                        } else {
                            cVar.f44156f.add(str2);
                            cVar.f44157g.put(str2, "noAdView");
                        }
                    }
                }
            }
            long nanoTime = System.nanoTime();
            C13629b bVar2 = (C13629b) bVar.f44147c.f36141c;
            if (bVar.f44148d.f44156f.size() > 0) {
                Iterator<String> it2 = bVar.f44148d.f44156f.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    bVar2.getClass();
                    JSONObject a2 = C13836a.m34518a(0, 0, 0, 0);
                    View view3 = bVar.f44148d.f44153c.get(next);
                    C13630c cVar2 = (C13630c) bVar.f44147c.f36140b;
                    String str3 = bVar.f44148d.f44157g.get(next);
                    if (str3 != null) {
                        JSONObject a3 = cVar2.mo40519a(view3);
                        try {
                            a3.put("adSessionId", next);
                        } catch (JSONException unused) {
                            C14226d.m35347m0("Error with setting ad session id");
                        }
                        try {
                            a3.put("notVisibleReason", str3);
                        } catch (JSONException unused2) {
                            C14226d.m35347m0("Error with setting not visible reason");
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
                    C13836a.m34519b(a2);
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(next);
                    C17026d dVar = bVar.f44149e;
                    C17195c cVar3 = dVar.f44160b;
                    C17197e eVar = new C17197e(dVar, hashSet2, a2, nanoTime);
                    cVar3.getClass();
                    eVar.f44437a = cVar3;
                    cVar3.f44440b.add(eVar);
                    if (cVar3.f44441c == null) {
                        cVar3.mo49776a();
                    }
                }
            }
            if (bVar.f44148d.f44155e.size() > 0) {
                bVar2.getClass();
                JSONObject a4 = C13836a.m34518a(0, 0, 0, 0);
                C14651c cVar4 = C14651c.PARENT_VIEW;
                bVar2.mo40520a((View) null, a4, bVar, true);
                C13836a.m34519b(a4);
                C17026d dVar2 = bVar.f44149e;
                HashSet<String> hashSet3 = bVar.f44148d.f44155e;
                C17195c cVar5 = dVar2.f44160b;
                C17198f fVar = new C17198f(dVar2, hashSet3, a4, nanoTime);
                cVar5.getClass();
                fVar.f44437a = cVar5;
                cVar5.f44440b.add(fVar);
                if (cVar5.f44441c == null) {
                    cVar5.mo49776a();
                }
            } else {
                C17026d dVar3 = bVar.f44149e;
                C17195c cVar6 = dVar3.f44160b;
                C17196d dVar4 = new C17196d(dVar3);
                cVar6.getClass();
                dVar4.f44437a = cVar6;
                cVar6.f44440b.add(dVar4);
                if (cVar6.f44441c == null) {
                    cVar6.mo49776a();
                }
            }
            C17024c cVar7 = bVar.f44148d;
            cVar7.f44151a.clear();
            cVar7.f44152b.clear();
            cVar7.f44153c.clear();
            cVar7.f44154d.clear();
            cVar7.f44155e.clear();
            cVar7.f44156f.clear();
            cVar7.f44157g.clear();
            cVar7.f44158h = false;
            long nanoTime2 = System.nanoTime() - bVar.f44150f;
            if (bVar.f44145a.size() > 0) {
                Iterator it3 = bVar.f44145a.iterator();
                while (it3.hasNext()) {
                    C17023d dVar5 = (C17023d) it3.next();
                    TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                    dVar5.mo49643a();
                    if (dVar5 instanceof C17022c) {
                        ((C17022c) dVar5).mo49642b();
                    }
                }
            }
        }
    }

    /* renamed from: fi.b$b */
    public static class C17021b implements Runnable {
        public final void run() {
            Handler handler = C17019b.f44142i;
            if (handler != null) {
                handler.post(C17019b.f44143j);
                C17019b.f44142i.postDelayed(C17019b.f44144k, 200);
            }
        }
    }

    /* renamed from: fi.b$c */
    public interface C17022c extends C17023d {
        /* renamed from: b */
        void mo49642b();
    }

    /* renamed from: fi.b$d */
    public interface C17023d {
        /* renamed from: a */
        void mo49643a();
    }

    /* renamed from: a */
    public static void m42874a() {
        if (f44142i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f44142i = handler;
            handler.post(f44143j);
            f44142i.postDelayed(f44144k, 200);
        }
    }

    /* renamed from: b */
    public final void mo49639b(View view, C13627a aVar, JSONObject jSONObject) {
        boolean z;
        C14651c cVar;
        String str;
        boolean z2;
        boolean z3 = false;
        if (C13837b.m34522a(view) == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C17024c cVar2 = this.f44148d;
            if (cVar2.f44154d.contains(view)) {
                cVar = C14651c.PARENT_VIEW;
            } else if (cVar2.f44158h) {
                cVar = C14651c.OBSTRUCTION_VIEW;
            } else {
                cVar = C14651c.UNDERLYING_VIEW;
            }
            if (cVar != C14651c.UNDERLYING_VIEW) {
                JSONObject a = aVar.mo40519a(view);
                WindowManager windowManager = C13836a.f34047a;
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
                C17024c cVar3 = this.f44148d;
                if (cVar3.f44151a.size() == 0) {
                    str = null;
                } else {
                    str = cVar3.f44151a.get(view);
                    if (str != null) {
                        cVar3.f44151a.remove(view);
                    }
                }
                if (str != null) {
                    try {
                        a.put("adSessionId", str);
                    } catch (JSONException unused) {
                        C14226d.m35347m0("Error with setting ad session id");
                    }
                    this.f44148d.f44158h = true;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    C17024c cVar4 = this.f44148d;
                    C17024c.C17025a aVar2 = cVar4.f44152b.get(view);
                    if (aVar2 != null) {
                        cVar4.f44152b.remove(view);
                    }
                    if (aVar2 == null) {
                        if (cVar == C14651c.PARENT_VIEW) {
                            z3 = true;
                        }
                        aVar.mo40520a(view, a, this, z3);
                    } else {
                        new JSONArray();
                        throw null;
                    }
                }
                this.f44146b++;
            }
        }
    }
}
