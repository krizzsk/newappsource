package o00;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1119a0;
import c00.C13730k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00.C18676l.C18679c;

/* renamed from: o00.l */
public abstract class C18676l<T, S extends C18679c<? extends T>, VH extends RecyclerView.C1119a0> extends RecyclerView.Adapter<VH> {

    /* renamed from: g */
    public int f47552g = 0;

    /* renamed from: h */
    public final ArrayList<Integer> f47553h = new ArrayList<>();

    /* renamed from: i */
    public final ArrayList<S> f47554i = new ArrayList<>();

    /* renamed from: o00.l$a */
    public class C18677a extends RecyclerView.C1125g {
        public C18677a() {
        }

        /* renamed from: a */
        public final void mo4765a() {
            C18676l.m45655j(C18676l.this);
        }

        /* renamed from: b */
        public final void mo4766b(int i, int i2) {
            C18676l.m45655j(C18676l.this);
        }

        /* renamed from: d */
        public final void mo4768d(int i, int i2) {
            C18676l.m45655j(C18676l.this);
        }

        /* renamed from: e */
        public final void mo4769e(int i, int i2) {
            C18676l.m45655j(C18676l.this);
        }

        /* renamed from: f */
        public final void mo4770f(int i, int i2) {
            C18676l.m45655j(C18676l.this);
        }
    }

    /* renamed from: o00.l$c */
    public interface C18679c<V> {
        /* renamed from: e */
        int mo40089e();

        V getItem(int i);

        CharSequence getName();
    }

    public C18676l() {
        registerAdapterDataObserver(new C18677a());
    }

    /* renamed from: j */
    public static void m45655j(C18676l lVar) {
        lVar.f47552g = 0;
        lVar.f47553h.clear();
        lVar.f47553h.ensureCapacity(lVar.f47554i.size());
        for (int i = 0; i < lVar.f47554i.size(); i++) {
            int e = ((C18679c) lVar.f47554i.get(i)).mo40089e();
            lVar.f47553h.add(Integer.valueOf(lVar.f47552g));
            lVar.f47552g = e + 1 + lVar.f47552g;
        }
    }

    public final int getItemCount() {
        return this.f47552g;
    }

    public final int getItemViewType(int i) {
        int o = mo51053o(i);
        int k = mo51050k(i, o);
        if (k == -1) {
            return mo23815p(o);
        }
        return mo40090m(o, k);
    }

    /* renamed from: k */
    public final int mo51050k(int i, int i2) {
        int intValue = i - this.f47553h.get(i2).intValue();
        if (intValue == 0) {
            return -1;
        }
        return intValue - 1;
    }

    /* renamed from: l */
    public final int mo51051l(int i, int i2) {
        return this.f47553h.get(i).intValue() + 1 + i2;
    }

    /* renamed from: m */
    public int mo40090m(int i, int i2) {
        if (i2 == mo51052n(i).mo40089e() - 1) {
            return 2;
        }
        return 1;
    }

    /* renamed from: n */
    public final S mo51052n(int i) {
        return (C18679c) this.f47554i.get(i);
    }

    /* renamed from: o */
    public final int mo51053o(int i) {
        int binarySearch = Collections.binarySearch(this.f47553h, Integer.valueOf(i));
        return binarySearch >= 0 ? binarySearch : (-binarySearch) - 2;
    }

    public final void onBindViewHolder(VH vh, int i) {
        int o = mo51053o(i);
        if (mo23816s(vh.getItemViewType())) {
            mo23818v(vh, o);
        } else {
            mo23817t(vh, o, mo51050k(i, o));
        }
    }

    public final VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (mo23816s(i)) {
            return mo23820x(viewGroup, i);
        }
        if (mo40091r(i)) {
            return mo23819w(viewGroup, i);
        }
        throw new IllegalStateException(C25541a.m63878h("Unknown view type, ", i, ", did you override isSectionViewType() / isRegularViewType() ?"));
    }

    /* renamed from: p */
    public int mo23815p(int i) {
        return 0;
    }

    /* renamed from: q */
    public final List<S> mo51054q() {
        return Collections.unmodifiableList(this.f47554i);
    }

    /* renamed from: r */
    public boolean mo40091r(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: s */
    public boolean mo23816s(int i) {
        return i == 0;
    }

    /* renamed from: t */
    public abstract void mo23817t(VH vh, int i, int i2);

    /* renamed from: v */
    public abstract void mo23818v(VH vh, int i);

    /* renamed from: w */
    public abstract VH mo23819w(ViewGroup viewGroup, int i);

    /* renamed from: x */
    public abstract VH mo23820x(ViewGroup viewGroup, int i);

    /* renamed from: y */
    public final void mo51055y(List<? extends S> list) {
        this.f47554i.clear();
        this.f47554i.ensureCapacity(list.size());
        this.f47554i.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: o00.l$b */
    public static class C18678b<V> extends C13730k<V> implements C18679c<V> {

        /* renamed from: c */
        public final CharSequence f47556c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18678b(CharSequence charSequence, List<V> list) {
            super(list == null ? new ArrayList<>() : list);
            this.f47556c = charSequence;
        }

        /* renamed from: e */
        public int mo40089e() {
            return size();
        }

        public V getItem(int i) {
            return get(i);
        }

        public final CharSequence getName() {
            return this.f47556c;
        }

        public C18678b() {
            this((CharSequence) null, (List) null);
        }
    }
}
