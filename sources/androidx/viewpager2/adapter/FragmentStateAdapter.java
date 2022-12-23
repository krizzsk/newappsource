package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.C0972v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.Iterator;
import java.util.WeakHashMap;
import mf0.C24361g;
import p001a0.C0016g;
import p001a0.C0017h;
import p241s0.C6304d;
import p241s0.C6305e;
import p241s0.C6307g;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p389bl.C13637c;

public abstract class FragmentStateAdapter extends RecyclerView.Adapter<C1353f> implements C1354g {

    /* renamed from: g */
    public final Lifecycle f5036g;

    /* renamed from: h */
    public final FragmentManager f5037h;

    /* renamed from: i */
    public final C6305e<Fragment> f5038i = new C6305e<>();

    /* renamed from: j */
    public final C6305e<Fragment.SavedState> f5039j = new C6305e<>();

    /* renamed from: k */
    public final C6305e<Integer> f5040k = new C6305e<>();

    /* renamed from: l */
    public C1347b f5041l;

    /* renamed from: m */
    public boolean f5042m = false;

    /* renamed from: n */
    public boolean f5043n = false;

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    public static abstract class C1346a extends RecyclerView.C1125g {
        public C1346a(int i) {
        }

        /* renamed from: a */
        public abstract void mo4765a();

        /* renamed from: b */
        public final void mo4766b(int i, int i2) {
            mo4765a();
        }

        /* renamed from: c */
        public final void mo4767c(int i, int i2, Object obj) {
            mo4765a();
        }

        /* renamed from: d */
        public final void mo4768d(int i, int i2) {
            mo4765a();
        }

        /* renamed from: e */
        public final void mo4769e(int i, int i2) {
            mo4765a();
        }

        /* renamed from: f */
        public final void mo4770f(int i, int i2) {
            mo4765a();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    public class C1347b {

        /* renamed from: a */
        public C1351d f5048a;

        /* renamed from: b */
        public C1352e f5049b;

        /* renamed from: c */
        public C1025n f5050c;

        /* renamed from: d */
        public ViewPager2 f5051d;

        /* renamed from: e */
        public long f5052e = -1;

        public C1347b() {
        }

        /* renamed from: a */
        public static ViewPager2 m3662a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* renamed from: b */
        public final void mo5600b(boolean z) {
            boolean z2;
            int currentItem;
            boolean z3;
            if (!FragmentStateAdapter.this.f5037h.mo3933N() && this.f5051d.getScrollState() == 0) {
                if (FragmentStateAdapter.this.f5038i.mo22333m() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && FragmentStateAdapter.this.getItemCount() != 0 && (currentItem = this.f5051d.getCurrentItem()) < FragmentStateAdapter.this.getItemCount()) {
                    long itemId = FragmentStateAdapter.this.getItemId(currentItem);
                    if (itemId != this.f5052e || z) {
                        Fragment fragment = null;
                        Fragment fragment2 = (Fragment) FragmentStateAdapter.this.f5038i.mo22329i(itemId, (Long) null);
                        if (fragment2 != null && fragment2.isAdded()) {
                            this.f5052e = itemId;
                            FragmentManager fragmentManager = FragmentStateAdapter.this.f5037h;
                            C0909a K = C0017h.m54K(fragmentManager, fragmentManager);
                            for (int i = 0; i < FragmentStateAdapter.this.f5038i.mo22333m(); i++) {
                                long j = FragmentStateAdapter.this.f5038i.mo22330j(i);
                                Fragment o = FragmentStateAdapter.this.f5038i.mo22334o(i);
                                if (o.isAdded()) {
                                    if (j != this.f5052e) {
                                        K.mo4051q(o, Lifecycle.State.STARTED);
                                    } else {
                                        fragment = o;
                                    }
                                    if (j == this.f5052e) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    o.setMenuVisibility(z3);
                                }
                            }
                            if (fragment != null) {
                                K.mo4051q(fragment, Lifecycle.State.RESUMED);
                            }
                            if (!K.f3771a.isEmpty()) {
                                K.mo4045k();
                            }
                        }
                    }
                }
            }
        }
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        this.f5037h = fragmentManager;
        this.f5036g = lifecycle;
        super.setHasStableIds(true);
    }

    /* renamed from: j */
    public static void m3645j(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    /* renamed from: a */
    public final Bundle mo5592a() {
        Bundle bundle = new Bundle(this.f5039j.mo22333m() + this.f5038i.mo22333m());
        for (int i = 0; i < this.f5038i.mo22333m(); i++) {
            long j = this.f5038i.mo22330j(i);
            Fragment fragment = (Fragment) this.f5038i.mo22329i(j, (Long) null);
            if (fragment != null && fragment.isAdded()) {
                this.f5037h.mo3942W(bundle, C0016g.m29l("f#", j), fragment);
            }
        }
        for (int i2 = 0; i2 < this.f5039j.mo22333m(); i2++) {
            long j2 = this.f5039j.mo22330j(i2);
            if (mo5594k(j2)) {
                bundle.putParcelable(C0016g.m29l("s#", j2), (Parcelable) this.f5039j.mo22329i(j2, (Long) null));
            }
        }
        return bundle;
    }

    /* renamed from: g */
    public final void mo5593g(Parcelable parcelable) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (this.f5039j.mo22333m() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f5038i.mo22333m() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String next : bundle.keySet()) {
                    if (!next.startsWith("f#") || next.length() <= 2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        this.f5038i.mo22331k(Long.parseLong(next.substring(2)), this.f5037h.mo3927E(bundle, next));
                    } else {
                        if (!next.startsWith("s#") || next.length() <= 2) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (z4) {
                            long parseLong = Long.parseLong(next.substring(2));
                            Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(next);
                            if (mo5594k(parseLong)) {
                                this.f5039j.mo22331k(parseLong, savedState);
                            }
                        } else {
                            throw new IllegalArgumentException(C25541a.m63881k("Unexpected key in savedState: ", next));
                        }
                    }
                }
                if (this.f5038i.mo22333m() == 0) {
                    z5 = true;
                }
                if (!z5) {
                    this.f5043n = true;
                    this.f5042m = true;
                    mo5596m();
                    final Handler handler = new Handler(Looper.getMainLooper());
                    final C1350c cVar = new C1350c(this);
                    this.f5036g.mo4224a(new C1025n() {
                        /* renamed from: f */
                        public final void mo740f(C1033p pVar, Lifecycle.Event event) {
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                handler.removeCallbacks(cVar);
                                pVar.getLifecycle().mo4226c(this);
                            }
                        }
                    });
                    handler.postDelayed(cVar, 10000);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: k */
    public boolean mo5594k(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    /* renamed from: l */
    public abstract Fragment mo5595l(int i);

    /* renamed from: m */
    public final void mo5596m() {
        boolean z;
        Fragment fragment;
        View view;
        if (this.f5043n && !this.f5037h.mo3933N()) {
            C6304d dVar = new C6304d();
            for (int i = 0; i < this.f5038i.mo22333m(); i++) {
                long j = this.f5038i.mo22330j(i);
                if (!mo5594k(j)) {
                    dVar.add(Long.valueOf(j));
                    this.f5040k.mo22332l(j);
                }
            }
            if (!this.f5042m) {
                this.f5043n = false;
                for (int i2 = 0; i2 < this.f5038i.mo22333m(); i2++) {
                    long j2 = this.f5038i.mo22330j(i2);
                    C6305e<Integer> eVar = this.f5040k;
                    if (eVar.f19944b) {
                        eVar.mo22328h();
                    }
                    boolean z2 = true;
                    if (C13637c.m34068g(eVar.f19945c, eVar.f19947e, j2) >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && ((fragment = (Fragment) this.f5038i.mo22329i(j2, (Long) null)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                        z2 = false;
                    }
                    if (!z2) {
                        dVar.add(Long.valueOf(j2));
                    }
                }
            }
            Iterator it = dVar.iterator();
            while (true) {
                C6307g.C6308a aVar = (C6307g.C6308a) it;
                if (aVar.hasNext()) {
                    mo5599p(((Long) aVar.next()).longValue());
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: n */
    public final Long mo5597n(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f5040k.mo22333m(); i2++) {
            if (this.f5040k.mo22334o(i2).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.f5040k.mo22330j(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    /* renamed from: o */
    public final void mo5598o(final C1353f fVar) {
        Fragment fragment = (Fragment) this.f5038i.mo22329i(fVar.getItemId(), (Long) null);
        if (fragment != null) {
            FrameLayout frameLayout = (FrameLayout) fVar.itemView;
            View view = fragment.getView();
            if (!fragment.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (fragment.isAdded() && view == null) {
                this.f5037h.f3635n.f3860a.add(new C0972v.C0973a(new C1349b(this, fragment, frameLayout), false));
            } else if (!fragment.isAdded() || view.getParent() == null) {
                if (fragment.isAdded()) {
                    m3645j(view, frameLayout);
                } else if (!this.f5037h.mo3933N()) {
                    this.f5037h.f3635n.f3860a.add(new C0972v.C0973a(new C1349b(this, fragment, frameLayout), false));
                    FragmentManager fragmentManager = this.f5037h;
                    C0909a K = C0017h.m54K(fragmentManager, fragmentManager);
                    StringBuilder k = C13555b.m33972k(InneractiveMediationDefs.GENDER_FEMALE);
                    k.append(fVar.getItemId());
                    K.mo4041e(0, fragment, k.toString(), 1);
                    K.mo4051q(fragment, Lifecycle.State.STARTED);
                    K.mo4045k();
                    this.f5041l.mo5600b(false);
                } else if (!this.f5037h.f3615I) {
                    this.f5036g.mo4224a(new C1025n() {
                        /* renamed from: f */
                        public final void mo740f(C1033p pVar, Lifecycle.Event event) {
                            if (!FragmentStateAdapter.this.f5037h.mo3933N()) {
                                pVar.getLifecycle().mo4226c(this);
                                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                                if (C6333d0.C6340g.m15075b((FrameLayout) fVar.itemView)) {
                                    FragmentStateAdapter.this.mo5598o(fVar);
                                }
                            }
                        }
                    });
                }
            } else if (view.getParent() != frameLayout) {
                m3645j(view, frameLayout);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        if (this.f5041l == null) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61175n(z);
        C1347b bVar = new C1347b();
        this.f5041l = bVar;
        bVar.f5051d = C1347b.m3662a(recyclerView);
        C1351d dVar = new C1351d(bVar);
        bVar.f5048a = dVar;
        bVar.f5051d.f5067d.f5104a.add(dVar);
        C1352e eVar = new C1352e(bVar);
        bVar.f5049b = eVar;
        registerAdapterDataObserver(eVar);
        FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(bVar);
        bVar.f5050c = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;
        this.f5036g.mo4224a(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3);
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        boolean z;
        C1353f fVar = (C1353f) a0Var;
        long itemId = fVar.getItemId();
        int id = ((FrameLayout) fVar.itemView).getId();
        Long n = mo5597n(id);
        if (!(n == null || n.longValue() == itemId)) {
            mo5599p(n.longValue());
            this.f5040k.mo22332l(n.longValue());
        }
        this.f5040k.mo22331k(itemId, Integer.valueOf(id));
        long itemId2 = getItemId(i);
        C6305e<Fragment> eVar = this.f5038i;
        if (eVar.f19944b) {
            eVar.mo22328h();
        }
        if (C13637c.m34068g(eVar.f19945c, eVar.f19947e, itemId2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Fragment l = mo5595l(i);
            l.setInitialSavedState((Fragment.SavedState) this.f5039j.mo22329i(itemId2, (Long) null));
            this.f5038i.mo22331k(itemId2, l);
        }
        FrameLayout frameLayout = (FrameLayout) fVar.itemView;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6340g.m15075b(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new C1348a(this, frameLayout, fVar));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        mo5596m();
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C1353f.f5064d;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        frameLayout.setId(C6333d0.C6338e.m15060a());
        frameLayout.setSaveEnabled(false);
        return new C1353f(frameLayout);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C1347b bVar = this.f5041l;
        bVar.getClass();
        ViewPager2 a = C1347b.m3662a(recyclerView);
        a.f5067d.f5104a.remove(bVar.f5048a);
        FragmentStateAdapter.this.unregisterAdapterDataObserver(bVar.f5049b);
        FragmentStateAdapter.this.f5036g.mo4226c(bVar.f5050c);
        bVar.f5051d = null;
        this.f5041l = null;
    }

    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(RecyclerView.C1119a0 a0Var) {
        C1353f fVar = (C1353f) a0Var;
        return true;
    }

    public final void onViewAttachedToWindow(RecyclerView.C1119a0 a0Var) {
        mo5598o((C1353f) a0Var);
        mo5596m();
    }

    public final void onViewRecycled(RecyclerView.C1119a0 a0Var) {
        Long n = mo5597n(((FrameLayout) ((C1353f) a0Var).itemView).getId());
        if (n != null) {
            mo5599p(n.longValue());
            this.f5040k.mo22332l(n.longValue());
        }
    }

    /* renamed from: p */
    public final void mo5599p(long j) {
        ViewParent parent;
        Fragment fragment = (Fragment) this.f5038i.mo22329i(j, (Long) null);
        if (fragment != null) {
            if (!(fragment.getView() == null || (parent = fragment.getView().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!mo5594k(j)) {
                this.f5039j.mo22332l(j);
            }
            if (!fragment.isAdded()) {
                this.f5038i.mo22332l(j);
            } else if (this.f5037h.mo3933N()) {
                this.f5043n = true;
            } else {
                if (fragment.isAdded() && mo5594k(j)) {
                    this.f5039j.mo22331k(j, this.f5037h.mo3949b0(fragment));
                }
                FragmentManager fragmentManager = this.f5037h;
                fragmentManager.getClass();
                C0909a aVar = new C0909a(fragmentManager);
                aVar.mo4050p(fragment);
                aVar.mo4045k();
                this.f5038i.mo22332l(j);
            }
        }
    }

    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}
