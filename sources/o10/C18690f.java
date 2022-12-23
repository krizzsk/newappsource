package o10;

import android.content.Context;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.home.stops.search.SearchStopItem;
import com.moovit.network.model.ServerId;
import ja0.C12797f;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o00.C18663a;
import o10.C18692g;
import p453dw.C16740o;
import p669mz.C18487d;
import p739px.C19037a;
import p824tp.C19735m;
import p824tp.C19742t;
import p824tp.C19746x;
import s00.C19391d;
import u00.C19838j;

/* renamed from: o10.f */
public class C18690f extends C18663a<C12797f> {

    /* renamed from: j */
    public final C18691a f47578j = new C18691a();

    /* renamed from: k */
    public final C19037a f47579k = new C19037a(this, 4);

    /* renamed from: l */
    public final C16740o f47580l = new C16740o(this, 10);

    /* renamed from: m */
    public int f47581m = -1;

    /* renamed from: n */
    public int f47582n = -1;

    /* renamed from: o */
    public int f47583o = -1;

    /* renamed from: p */
    public int f47584p = -1;

    /* renamed from: q */
    public C19391d f47585q = null;

    /* renamed from: r */
    public List<SearchStopItem> f47586r = Collections.emptyList();

    /* renamed from: s */
    public boolean f47587s = false;

    /* renamed from: o10.f$a */
    public class C18691a implements C18487d.C18488a<ServerId> {
        public C18691a() {
        }

        /* renamed from: a */
        public final void mo23774a(C18487d<ServerId> dVar) {
            int size = C18690f.this.f47586r.size();
            HashSet hashSet = new HashSet(dVar.mo40647e());
            Iterator<SearchStopItem> it = C18690f.this.f47586r.iterator();
            while (it.hasNext()) {
                if (!hashSet.contains(it.next().getServerId())) {
                    it.remove();
                }
            }
            if (C18690f.this.f47586r.size() != size) {
                C18690f.this.notifyDataSetChanged();
            }
        }
    }

    public final int getItemCount() {
        if (this.f47585q == null) {
            return 0;
        }
        int itemCount = super.getItemCount();
        if (!this.f47586r.isEmpty()) {
            return itemCount + this.f47586r.size() + 2;
        }
        return itemCount;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        boolean z = false;
        if (!mo51060n(i)) {
            if ((!this.f47586r.isEmpty()) && i == this.f47586r.size() + 1) {
                z = true;
            }
            if (z) {
                return 1;
            }
            int l = mo51058l(i);
            if (l == mo51046k(l).getCount() - 1) {
                return 3;
            }
            return 2;
        } else if (i == 0) {
            return 0;
        } else {
            if (i - 1 == this.f47586r.size() - 1) {
                return 3;
            }
            return 2;
        }
    }

    /* renamed from: l */
    public final int mo51058l(int i) {
        int i2;
        if (!mo51060n(i)) {
            if (this.f47586r.isEmpty()) {
                i2 = 0;
            } else {
                i2 = this.f47586r.size() + 2;
            }
            return i - i2;
        }
        throw new IllegalStateException("The position represent recent item.");
    }

    /* renamed from: m */
    public final SearchStopItem mo51059m(int i) {
        if (!mo51060n(i)) {
            boolean z = true;
            if (!(!this.f47586r.isEmpty()) || i != this.f47586r.size() + 1) {
                z = false;
            }
            if (!z) {
                return C19838j.m47305j(mo51046k(mo51058l(i)), this.f47581m, this.f47582n, this.f47583o, this.f47584p);
            }
            throw new IllegalStateException("The position represent stops header instead of search stop item");
        } else if (i != 0) {
            return this.f47586r.get(i - 1);
        } else {
            throw new IllegalStateException("The position represent recent header instead of search stop item");
        }
    }

    /* renamed from: n */
    public final boolean mo51060n(int i) {
        return !this.f47586r.isEmpty() && i <= this.f47586r.size();
    }

    /* renamed from: o */
    public final void mo51061o(Context context, C18692g.C18693a aVar) {
        if (aVar == null) {
            this.f47585q = null;
            this.f47586r = Collections.emptyList();
            mo51045j((Cursor) null);
            if (this.f47587s) {
                C18688d f = C18688d.m45685f(context);
                f.mo51499b();
                f.f48438c.mo50904b(this.f47578j);
                this.f47587s = false;
                return;
            }
            return;
        }
        this.f47585q = aVar.f47593b;
        this.f47586r = aVar.f47594c;
        mo51045j(aVar.f47595d);
        if (!this.f47587s) {
            C18688d f2 = C18688d.m45685f(context);
            f2.mo51499b();
            f2.f48438c.mo50903a(this.f47578j);
            this.f47587s = true;
        }
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        C12797f fVar = (C12797f) a0Var;
        int itemViewType = fVar.getItemViewType();
        if (itemViewType == 0) {
            ((ListItemView) fVar.itemView).getAccessoryView().setOnClickListener(this.f47580l);
        } else if (itemViewType == 1) {
        } else {
            if (itemViewType == 2 || itemViewType == 3) {
                SearchStopItem m = mo51059m(i);
                ListItemView listItemView = (ListItemView) fVar.itemView;
                listItemView.setTag(fVar);
                listItemView.setOnClickListener(this.f47579k);
                listItemView.setIcon(m.f41691e);
                listItemView.setTitle((CharSequence) m.f41689c);
                listItemView.setSubtitle((CharSequence) m.f41690d);
                return;
            }
            throw new IllegalStateException(C16759e.m42349e("Unknown view type: ", itemViewType));
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ListItemView listItemView;
        if (i == 0) {
            listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, C19735m.listItemSectionHeaderStyle);
            listItemView.setTitle(C19746x.search_recent_section_title);
            listItemView.setAccessoryIgnoreHorizontalPadding(true);
            listItemView.setAccessoryView(C19742t.section_header_accessory_overflow_button);
        } else if (i == 1) {
            listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, C19735m.listItemSectionHeaderStyle);
            listItemView.setTitle(C19746x.all);
        } else if (i == 2 || i == 3) {
            listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, C19735m.transitLineListItemStyle);
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown view type: ", i));
        }
        listItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new C12797f(listItemView);
    }
}
