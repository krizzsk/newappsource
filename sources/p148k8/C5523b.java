package p148k8;

import com.facebook.appevents.p047ml.ModelManager;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.C23826d;
import mf0.C24362h;
import p262t8.C6606a;
import p583jk.C17884p;

/* renamed from: k8.b */
public final class C5523b {

    /* renamed from: m */
    public static final HashMap f18089m = C23826d.m58532W(new Pair("embedding.weight", "embed.weight"), new Pair("dense1.weight", "fc1.weight"), new Pair("dense2.weight", "fc2.weight"), new Pair("dense3.weight", "fc3.weight"), new Pair("dense1.bias", "fc1.bias"), new Pair("dense2.bias", "fc2.bias"), new Pair("dense3.bias", "fc3.bias"));

    /* renamed from: a */
    public final C5521a f18090a;

    /* renamed from: b */
    public final C5521a f18091b;

    /* renamed from: c */
    public final C5521a f18092c;

    /* renamed from: d */
    public final C5521a f18093d;

    /* renamed from: e */
    public final C5521a f18094e;

    /* renamed from: f */
    public final C5521a f18095f;

    /* renamed from: g */
    public final C5521a f18096g;

    /* renamed from: h */
    public final C5521a f18097h;

    /* renamed from: i */
    public final C5521a f18098i;

    /* renamed from: j */
    public final C5521a f18099j;

    /* renamed from: k */
    public final C5521a f18100k;

    /* renamed from: l */
    public final HashMap f18101l;

    public C5523b() {
        throw null;
    }

    public C5523b(HashMap hashMap) {
        Object obj = hashMap.get("embed.weight");
        if (obj != null) {
            this.f18090a = (C5521a) obj;
            int i = C5525d.f18103a;
            Object obj2 = hashMap.get("convs.0.weight");
            if (obj2 != null) {
                this.f18091b = C5525d.m13743l((C5521a) obj2);
                Object obj3 = hashMap.get("convs.1.weight");
                if (obj3 != null) {
                    this.f18092c = C5525d.m13743l((C5521a) obj3);
                    Object obj4 = hashMap.get("convs.2.weight");
                    if (obj4 != null) {
                        this.f18093d = C5525d.m13743l((C5521a) obj4);
                        Object obj5 = hashMap.get("convs.0.bias");
                        if (obj5 != null) {
                            this.f18094e = (C5521a) obj5;
                            Object obj6 = hashMap.get("convs.1.bias");
                            if (obj6 != null) {
                                this.f18095f = (C5521a) obj6;
                                Object obj7 = hashMap.get("convs.2.bias");
                                if (obj7 != null) {
                                    this.f18096g = (C5521a) obj7;
                                    Object obj8 = hashMap.get("fc1.weight");
                                    if (obj8 != null) {
                                        this.f18097h = C5525d.m13742k((C5521a) obj8);
                                        Object obj9 = hashMap.get("fc2.weight");
                                        if (obj9 != null) {
                                            this.f18098i = C5525d.m13742k((C5521a) obj9);
                                            Object obj10 = hashMap.get("fc1.bias");
                                            if (obj10 != null) {
                                                this.f18099j = (C5521a) obj10;
                                                Object obj11 = hashMap.get("fc2.bias");
                                                if (obj11 != null) {
                                                    this.f18100k = (C5521a) obj11;
                                                    this.f18101l = new HashMap();
                                                    for (String str : C17884p.m44349T(ModelManager.Task.MTML_INTEGRITY_DETECT.toKey(), ModelManager.Task.MTML_APP_EVENT_PREDICTION.toKey())) {
                                                        String k = C24362h.m61216k(".weight", str);
                                                        String k2 = C24362h.m61216k(".bias", str);
                                                        C5521a aVar = (C5521a) hashMap.get(k);
                                                        C5521a aVar2 = (C5521a) hashMap.get(k2);
                                                        if (aVar != null) {
                                                            this.f18101l.put(k, C5525d.m13742k(aVar));
                                                        }
                                                        if (aVar2 != null) {
                                                            this.f18101l.put(k2, aVar2);
                                                        }
                                                    }
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.".toString());
                                            }
                                            throw new IllegalStateException("Required value was null.".toString());
                                        }
                                        throw new IllegalStateException("Required value was null.".toString());
                                    }
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: a */
    public final C5521a mo21390a(C5521a aVar, String[] strArr, String str) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            C24362h.m61211f(str, "task");
            int i = C5525d.f18103a;
            C5521a c = C5525d.m13734c(C5525d.m13736e(strArr, this.f18090a), this.f18091b);
            C5525d.m13732a(c, this.f18094e);
            C5525d.m13740i(c);
            C5521a c2 = C5525d.m13734c(c, this.f18092c);
            C5525d.m13732a(c2, this.f18095f);
            C5525d.m13740i(c2);
            C5521a g = C5525d.m13738g(c2, 2);
            C5521a c3 = C5525d.m13734c(g, this.f18093d);
            C5525d.m13732a(c3, this.f18096g);
            C5525d.m13740i(c3);
            C5521a g2 = C5525d.m13738g(c, c.f18086a[1]);
            C5521a g3 = C5525d.m13738g(g, g.f18086a[1]);
            C5521a g4 = C5525d.m13738g(c3, c3.f18086a[1]);
            C5525d.m13737f(g2);
            C5525d.m13737f(g3);
            C5525d.m13737f(g4);
            C5521a d = C5525d.m13735d(C5525d.m13733b(new C5521a[]{g2, g3, g4, aVar}), this.f18097h, this.f18099j);
            C5525d.m13740i(d);
            C5521a d2 = C5525d.m13735d(d, this.f18098i, this.f18100k);
            C5525d.m13740i(d2);
            C5521a aVar2 = (C5521a) this.f18101l.get(C24362h.m61216k(".weight", str));
            C5521a aVar3 = (C5521a) this.f18101l.get(C24362h.m61216k(".bias", str));
            if (aVar2 != null) {
                if (aVar3 != null) {
                    C5521a d3 = C5525d.m13735d(d2, aVar2, aVar3);
                    C5525d.m13741j(d3);
                    return d3;
                }
            }
            return null;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }
}
