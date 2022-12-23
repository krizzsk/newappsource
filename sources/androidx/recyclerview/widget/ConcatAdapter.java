package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C1176f;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import mf0.C24361g;
import p001a0.C0016g;

public final class ConcatAdapter extends RecyclerView.Adapter<RecyclerView.C1119a0> {

    /* renamed from: g */
    public final C1176f f4184g;

    public static final class Config {

        /* renamed from: b */
        public static final Config f4185b = new Config(StableIdMode.NO_STABLE_IDS);

        /* renamed from: a */
        public final StableIdMode f4186a;

        public enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        public Config(StableIdMode stableIdMode) {
            this.f4186a = stableIdMode;
        }
    }

    @SafeVarargs
    public ConcatAdapter(RecyclerView.Adapter<? extends RecyclerView.C1119a0>... adapterArr) {
        this(Config.f4185b, Arrays.asList(adapterArr));
    }

    public final int findRelativeAdapterPositionIn(RecyclerView.Adapter<? extends RecyclerView.C1119a0> adapter, RecyclerView.C1119a0 a0Var, int i) {
        C1176f fVar = this.f4184g;
        C1242v vVar = fVar.f4461d.get(a0Var);
        if (vVar == null) {
            return -1;
        }
        int b = i - fVar.mo5055b(vVar);
        int itemCount = vVar.f4693c.getItemCount();
        if (b >= 0 && b < itemCount) {
            return vVar.f4693c.findRelativeAdapterPositionIn(adapter, a0Var, b);
        }
        StringBuilder s = C0016g.m35s("Detected inconsistent adapter updates. The local position of the view holder maps to ", b, " which is out of bounds for the adapter with size ", itemCount, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        s.append(a0Var);
        s.append("adapter:");
        s.append(adapter);
        throw new IllegalStateException(s.toString());
    }

    public final int getItemCount() {
        Iterator it = this.f4184g.f4462e.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C1242v) it.next()).f4695e;
        }
        return i;
    }

    public final long getItemId(int i) {
        C1176f fVar = this.f4184g;
        C1176f.C1177a c = fVar.mo5056c(i);
        C1242v vVar = c.f4466a;
        long a = vVar.f4692b.mo5078a(vVar.f4693c.getItemId(c.f4467b));
        c.f4468c = false;
        c.f4466a = null;
        c.f4467b = -1;
        fVar.f4463f = c;
        return a;
    }

    public final int getItemViewType(int i) {
        C1176f fVar = this.f4184g;
        C1176f.C1177a c = fVar.mo5056c(i);
        C1242v vVar = c.f4466a;
        int b = vVar.f4691a.mo5095b(vVar.f4693c.getItemViewType(c.f4467b));
        c.f4468c = false;
        c.f4466a = null;
        c.f4467b = -1;
        fVar.f4463f = c;
        return b;
    }

    /* renamed from: j */
    public final void mo4440j(RecyclerView.Adapter adapter) {
        boolean z;
        C1242v vVar;
        C1176f fVar = this.f4184g;
        int size = fVar.f4462e.size();
        if (size < 0 || size > fVar.f4462e.size()) {
            StringBuilder k = C13555b.m33972k("Index must be between 0 and ");
            k.append(fVar.f4462e.size());
            k.append(". Given:");
            k.append(size);
            throw new IndexOutOfBoundsException(k.toString());
        }
        int i = 0;
        if (fVar.f4464g != Config.StableIdMode.NO_STABLE_IDS) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C24361g.m61177o(adapter.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else {
            adapter.hasStableIds();
        }
        int size2 = fVar.f4462e.size();
        while (true) {
            if (i >= size2) {
                i = -1;
                break;
            } else if (((C1242v) fVar.f4462e.get(i)).f4693c == adapter) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            vVar = null;
        } else {
            vVar = (C1242v) fVar.f4462e.get(i);
        }
        if (vVar == null) {
            C1242v vVar2 = new C1242v(adapter, fVar, fVar.f4459b, fVar.f4465h.mo5077a());
            fVar.f4462e.add(size, vVar2);
            Iterator it = fVar.f4460c.iterator();
            while (it.hasNext()) {
                RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
                if (recyclerView != null) {
                    adapter.onAttachedToRecyclerView(recyclerView);
                }
            }
            if (vVar2.f4695e > 0) {
                fVar.f4458a.notifyItemRangeInserted(fVar.mo5055b(vVar2), vVar2.f4695e);
            }
            fVar.mo5054a();
        }
    }

    /* renamed from: k */
    public final void mo4441k(RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        C1176f fVar = this.f4184g;
        Iterator it = fVar.f4460c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((WeakReference) it.next()).get() == recyclerView) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            fVar.f4460c.add(new WeakReference(recyclerView));
            Iterator it2 = fVar.f4462e.iterator();
            while (it2.hasNext()) {
                ((C1242v) it2.next()).f4693c.onAttachedToRecyclerView(recyclerView);
            }
        }
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        C1176f fVar = this.f4184g;
        C1176f.C1177a c = fVar.mo5056c(i);
        fVar.f4461d.put(a0Var, c.f4466a);
        C1242v vVar = c.f4466a;
        vVar.f4693c.bindViewHolder(a0Var, c.f4467b);
        c.f4468c = false;
        c.f4466a = null;
        c.f4467b = -1;
        fVar.f4463f = c;
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1242v vVar = this.f4184g.f4459b.f4543a.get(i);
        if (vVar != null) {
            return vVar.f4693c.onCreateViewHolder(viewGroup, vVar.f4691a.mo5094a(i));
        }
        throw new IllegalArgumentException(C16759e.m42349e("Cannot find the wrapper for global view type ", i));
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C1176f fVar = this.f4184g;
        int size = fVar.f4460c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) fVar.f4460c.get(size);
            if (weakReference.get() == null) {
                fVar.f4460c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                fVar.f4460c.remove(size);
                break;
            }
        }
        Iterator it = fVar.f4462e.iterator();
        while (it.hasNext()) {
            ((C1242v) it.next()).f4693c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public final boolean onFailedToRecycleView(RecyclerView.C1119a0 a0Var) {
        C1176f fVar = this.f4184g;
        C1242v vVar = fVar.f4461d.get(a0Var);
        if (vVar != null) {
            boolean onFailedToRecycleView = vVar.f4693c.onFailedToRecycleView(a0Var);
            fVar.f4461d.remove(a0Var);
            return onFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + a0Var + ", seems like it is not bound by this adapter: " + fVar);
    }

    public final void onViewAttachedToWindow(RecyclerView.C1119a0 a0Var) {
        this.f4184g.mo5057d(a0Var).f4693c.onViewAttachedToWindow(a0Var);
    }

    public final void onViewDetachedFromWindow(RecyclerView.C1119a0 a0Var) {
        this.f4184g.mo5057d(a0Var).f4693c.onViewDetachedFromWindow(a0Var);
    }

    public final void onViewRecycled(RecyclerView.C1119a0 a0Var) {
        C1176f fVar = this.f4184g;
        C1242v vVar = fVar.f4461d.get(a0Var);
        if (vVar != null) {
            vVar.f4693c.onViewRecycled(a0Var);
            fVar.f4461d.remove(a0Var);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + a0Var + ", seems like it is not bound by this adapter: " + fVar);
    }

    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    public final void setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    public ConcatAdapter(Config config, List<? extends RecyclerView.Adapter<? extends RecyclerView.C1119a0>> list) {
        this.f4184g = new C1176f(this, config);
        for (RecyclerView.Adapter j : list) {
            mo4440j(j);
        }
        super.setHasStableIds(this.f4184g.f4464g != Config.StableIdMode.NO_STABLE_IDS);
    }
}
