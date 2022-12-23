package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p201p.C6019a;
import p214q.C6119a;
import p214q.C6120b;
import p358af.C13437d;

/* renamed from: androidx.lifecycle.q */
public final class C1035q extends Lifecycle {

    /* renamed from: b */
    public C6119a<C1031o, C1036a> f3970b = new C6119a<>();

    /* renamed from: c */
    public Lifecycle.State f3971c;

    /* renamed from: d */
    public final WeakReference<C1033p> f3972d;

    /* renamed from: e */
    public int f3973e = 0;

    /* renamed from: f */
    public boolean f3974f = false;

    /* renamed from: g */
    public boolean f3975g = false;

    /* renamed from: h */
    public ArrayList<Lifecycle.State> f3976h = new ArrayList<>();

    /* renamed from: i */
    public final boolean f3977i;

    /* renamed from: androidx.lifecycle.q$a */
    public static class C1036a {

        /* renamed from: a */
        public Lifecycle.State f3978a;

        /* renamed from: b */
        public C1025n f3979b;

        public C1036a(C1031o oVar, Lifecycle.State state) {
            C1025n nVar;
            HashMap hashMap = C1039s.f3980a;
            boolean z = oVar instanceof C1025n;
            boolean z2 = oVar instanceof C1006f;
            if (z && z2) {
                nVar = new FullLifecycleObserverAdapter((C1006f) oVar, (C1025n) oVar);
            } else if (z2) {
                nVar = new FullLifecycleObserverAdapter((C1006f) oVar, (C1025n) null);
            } else if (z) {
                nVar = (C1025n) oVar;
            } else {
                Class<?> cls = oVar.getClass();
                if (C1039s.m2911c(cls) == 2) {
                    List list = (List) C1039s.f3981b.get(cls);
                    if (list.size() == 1) {
                        nVar = new SingleGeneratedAdapterObserver(C1039s.m2909a((Constructor) list.get(0), oVar));
                    } else {
                        C1008g[] gVarArr = new C1008g[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            gVarArr[i] = C1039s.m2909a((Constructor) list.get(i), oVar);
                        }
                        nVar = new CompositeGeneratedAdaptersObserver(gVarArr);
                    }
                } else {
                    nVar = new ReflectiveGenericLifecycleObserver(oVar);
                }
            }
            this.f3979b = nVar;
            this.f3978a = state;
        }

        /* renamed from: a */
        public final void mo4323a(C1033p pVar, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            Lifecycle.State state = this.f3978a;
            if (targetState != null && targetState.compareTo(state) < 0) {
                state = targetState;
            }
            this.f3978a = state;
            this.f3979b.mo740f(pVar, event);
            this.f3978a = targetState;
        }
    }

    public C1035q(C1033p pVar) {
        this.f3972d = new WeakReference<>(pVar);
        this.f3971c = Lifecycle.State.INITIALIZED;
        this.f3977i = true;
    }

    /* renamed from: a */
    public final void mo4224a(C1031o oVar) {
        C1033p pVar;
        boolean z;
        mo4318e("addObserver");
        Lifecycle.State state = this.f3971c;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        C1036a aVar = new C1036a(oVar, state2);
        if (this.f3970b.mo22080b(oVar, aVar) == null && (pVar = this.f3972d.get()) != null) {
            if (this.f3973e != 0 || this.f3974f) {
                z = true;
            } else {
                z = false;
            }
            Lifecycle.State d = mo4317d(oVar);
            this.f3973e++;
            while (aVar.f3978a.compareTo(d) < 0 && this.f3970b.f19471f.containsKey(oVar)) {
                this.f3976h.add(aVar.f3978a);
                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(aVar.f3978a);
                if (upFrom != null) {
                    aVar.mo4323a(pVar, upFrom);
                    ArrayList<Lifecycle.State> arrayList = this.f3976h;
                    arrayList.remove(arrayList.size() - 1);
                    d = mo4317d(oVar);
                } else {
                    StringBuilder k = C13555b.m33972k("no event up from ");
                    k.append(aVar.f3978a);
                    throw new IllegalStateException(k.toString());
                }
            }
            if (!z) {
                mo4322i();
            }
            this.f3973e--;
        }
    }

    /* renamed from: b */
    public final Lifecycle.State mo4225b() {
        return this.f3971c;
    }

    /* renamed from: c */
    public final void mo4226c(C1031o oVar) {
        mo4318e("removeObserver");
        this.f3970b.mo22081d(oVar);
    }

    /* renamed from: d */
    public final Lifecycle.State mo4317d(C1031o oVar) {
        C6120b.C6123c<K, V> cVar;
        Lifecycle.State state;
        C6119a<C1031o, C1036a> aVar = this.f3970b;
        Lifecycle.State state2 = null;
        if (aVar.f19471f.containsKey(oVar)) {
            cVar = aVar.f19471f.get(oVar).f19479e;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            state = ((C1036a) cVar.f19477c).f3978a;
        } else {
            state = null;
        }
        if (!this.f3976h.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.f3976h;
            state2 = arrayList.get(arrayList.size() - 1);
        }
        Lifecycle.State state3 = this.f3971c;
        if (state == null || state.compareTo(state3) >= 0) {
            state = state3;
        }
        if (state2 == null || state2.compareTo(state) >= 0) {
            return state;
        }
        return state2;
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: e */
    public final void mo4318e(String str) {
        boolean z;
        if (this.f3977i) {
            C6019a.m14512w().f19241b.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException(C13437d.m33706k("Method ", str, " must be called on the main thread"));
            }
        }
    }

    /* renamed from: f */
    public final void mo4319f(Lifecycle.Event event) {
        mo4318e("handleLifecycleEvent");
        mo4320g(event.getTargetState());
    }

    /* renamed from: g */
    public final void mo4320g(Lifecycle.State state) {
        Lifecycle.State state2 = this.f3971c;
        if (state2 != state) {
            if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
                StringBuilder k = C13555b.m33972k("no event down from ");
                k.append(this.f3971c);
                throw new IllegalStateException(k.toString());
            }
            this.f3971c = state;
            if (this.f3974f || this.f3973e != 0) {
                this.f3975g = true;
                return;
            }
            this.f3974f = true;
            mo4322i();
            this.f3974f = false;
            if (this.f3971c == Lifecycle.State.DESTROYED) {
                this.f3970b = new C6119a<>();
            }
        }
    }

    /* renamed from: h */
    public final void mo4321h(Lifecycle.State state) {
        mo4318e("setCurrentState");
        mo4320g(state);
    }

    /* renamed from: i */
    public final void mo4322i() {
        Lifecycle.State state;
        C1033p pVar = this.f3972d.get();
        if (pVar != null) {
            while (true) {
                C6119a<C1031o, C1036a> aVar = this.f3970b;
                boolean z = true;
                if (!(aVar.f19475e == 0 || (((C1036a) aVar.f19472b.f19477c).f3978a == (state = ((C1036a) aVar.f19473c.f19477c).f3978a) && this.f3971c == state))) {
                    z = false;
                }
                if (!z) {
                    this.f3975g = false;
                    if (this.f3971c.compareTo(((C1036a) aVar.f19472b.f19477c).f3978a) < 0) {
                        C6119a<C1031o, C1036a> aVar2 = this.f3970b;
                        C6120b.C6122b bVar = new C6120b.C6122b(aVar2.f19473c, aVar2.f19472b);
                        aVar2.f19474d.put(bVar, Boolean.FALSE);
                        while (bVar.hasNext() && !this.f3975g) {
                            Map.Entry entry = (Map.Entry) bVar.next();
                            C1036a aVar3 = (C1036a) entry.getValue();
                            while (aVar3.f3978a.compareTo(this.f3971c) > 0 && !this.f3975g) {
                                if (!this.f3970b.f19471f.containsKey((C1031o) entry.getKey())) {
                                    continue;
                                    break;
                                }
                                Lifecycle.Event downFrom = Lifecycle.Event.downFrom(aVar3.f3978a);
                                if (downFrom != null) {
                                    this.f3976h.add(downFrom.getTargetState());
                                    aVar3.mo4323a(pVar, downFrom);
                                    ArrayList<Lifecycle.State> arrayList = this.f3976h;
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    StringBuilder k = C13555b.m33972k("no event down from ");
                                    k.append(aVar3.f3978a);
                                    throw new IllegalStateException(k.toString());
                                }
                            }
                        }
                    }
                    C6120b.C6123c<K, V> cVar = this.f3970b.f19473c;
                    if (!this.f3975g && cVar != null && this.f3971c.compareTo(((C1036a) cVar.f19477c).f3978a) > 0) {
                        C6119a<C1031o, C1036a> aVar4 = this.f3970b;
                        aVar4.getClass();
                        C6120b.C6124d dVar = new C6120b.C6124d();
                        aVar4.f19474d.put(dVar, Boolean.FALSE);
                        while (dVar.hasNext() && !this.f3975g) {
                            Map.Entry entry2 = (Map.Entry) dVar.next();
                            C1036a aVar5 = (C1036a) entry2.getValue();
                            while (aVar5.f3978a.compareTo(this.f3971c) < 0 && !this.f3975g) {
                                if (!this.f3970b.f19471f.containsKey((C1031o) entry2.getKey())) {
                                    continue;
                                    break;
                                }
                                this.f3976h.add(aVar5.f3978a);
                                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(aVar5.f3978a);
                                if (upFrom != null) {
                                    aVar5.mo4323a(pVar, upFrom);
                                    ArrayList<Lifecycle.State> arrayList2 = this.f3976h;
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    StringBuilder k2 = C13555b.m33972k("no event up from ");
                                    k2.append(aVar5.f3978a);
                                    throw new IllegalStateException(k2.toString());
                                }
                            }
                        }
                    }
                } else {
                    this.f3975g = false;
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
