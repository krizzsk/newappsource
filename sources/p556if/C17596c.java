package p556if;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;
import p258t4.C6587a;
import p626lf.C18200a;
import p649mf.C18366a;
import p766rf.C19260d;
import p790sf.C19454b;
import p790sf.C19457d;

/* renamed from: if.c */
public final class C17596c extends FragmentManager.C0896l {

    /* renamed from: f */
    public static final C18200a f45262f = C18200a.m44901d();

    /* renamed from: a */
    public final WeakHashMap<Fragment, Trace> f45263a = new WeakHashMap<>();

    /* renamed from: b */
    public final C6587a f45264b;

    /* renamed from: c */
    public final C19260d f45265c;

    /* renamed from: d */
    public final C17592a f45266d;

    /* renamed from: e */
    public final C17597d f45267e;

    public C17596c(C6587a aVar, C19260d dVar, C17592a aVar2, C17597d dVar2) {
        this.f45264b = aVar;
        this.f45265c = dVar;
        this.f45266d = aVar2;
        this.f45267e = dVar2;
    }

    /* renamed from: a */
    public final void mo3998a(Fragment fragment) {
        C19454b bVar;
        C18200a aVar = f45262f;
        aVar.mo50611b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f45263a.containsKey(fragment)) {
            aVar.mo50615g("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f45263a.get(fragment);
        this.f45263a.remove(fragment);
        C17597d dVar = this.f45267e;
        if (!dVar.f45272d) {
            C17597d.f45268e.mo50610a();
            bVar = new C19454b();
        } else if (!dVar.f45271c.containsKey(fragment)) {
            C17597d.f45268e.mo50611b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            bVar = new C19454b();
        } else {
            C18366a remove = dVar.f45271c.remove(fragment);
            C19454b<C18366a> a = dVar.mo50071a();
            if (!a.mo51862b()) {
                C17597d.f45268e.mo50611b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                bVar = new C19454b();
            } else {
                C18366a a2 = a.mo51861a();
                bVar = new C19454b(new C18366a(a2.f46826a - remove.f46826a, a2.f46827b - remove.f46827b, a2.f46828c - remove.f46828c));
            }
        }
        if (!bVar.mo51862b()) {
            aVar.mo50615g("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
            return;
        }
        C19457d.m46854a(trace, (C18366a) bVar.mo51861a());
        trace.stop();
    }

    /* renamed from: b */
    public final void mo3999b(Fragment fragment) {
        String str;
        f45262f.mo50611b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        StringBuilder k = C13555b.m33972k("_st_");
        k.append(fragment.getClass().getSimpleName());
        Trace trace = new Trace(k.toString(), this.f45265c, this.f45264b, this.f45266d);
        trace.start();
        if (fragment.getParentFragment() == null) {
            str = "No parent";
        } else {
            str = fragment.getParentFragment().getClass().getSimpleName();
        }
        trace.putAttribute("Parent_fragment", str);
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f45263a.put(fragment, trace);
        C17597d dVar = this.f45267e;
        if (!dVar.f45272d) {
            C17597d.f45268e.mo50610a();
        } else if (dVar.f45271c.containsKey(fragment)) {
            C17597d.f45268e.mo50611b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
        } else {
            C19454b<C18366a> a = dVar.mo50071a();
            if (!a.mo51862b()) {
                C17597d.f45268e.mo50611b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                return;
            }
            dVar.f45271c.put(fragment, a.mo51861a());
        }
    }
}
