package p688nu;

import a00.C13382a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.design.view.list.ListItemView;
import com.moovit.util.time.C7925b;
import com.moovit.view.PriceView;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.List;
import java.util.Locale;
import p977zz.C20964s0;

/* renamed from: nu.a */
public final class C18627a extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final C4052r f47471g = new C4052r(this, 12);

    /* renamed from: h */
    public final String f47472h;

    /* renamed from: i */
    public final String f47473i;

    /* renamed from: j */
    public final String f47474j;

    /* renamed from: k */
    public final List<MotActivation> f47475k;

    /* renamed from: l */
    public C18629b f47476l;

    /* renamed from: nu.a$a */
    public static /* synthetic */ class C18628a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47477a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.app.mot.model.MotActivation$Status[] r0 = com.moovit.app.mot.model.MotActivation.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47477a = r0
                com.moovit.app.mot.model.MotActivation$Status r1 = com.moovit.app.mot.model.MotActivation.Status.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47477a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.mot.model.MotActivation$Status r1 = com.moovit.app.mot.model.MotActivation.Status.COMPLETED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47477a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.mot.model.MotActivation$Status r1 = com.moovit.app.mot.model.MotActivation.Status.HISTORICAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p688nu.C18627a.C18628a.<clinit>():void");
        }
    }

    /* renamed from: nu.a$b */
    public interface C18629b {
        /* renamed from: Q0 */
        void mo51015Q0(MotActivation motActivation);
    }

    public C18627a(Context context, List<MotActivation> list) {
        C21100e.m49373x(list, "activations");
        this.f47475k = list;
        this.f47472h = context.getString(R.string.voiceover_date);
        this.f47473i = context.getString(R.string.voiceover_time);
        this.f47474j = context.getString(R.string.voiceover_fare);
    }

    public final int getItemCount() {
        return this.f47475k.size();
    }

    public final int getItemViewType(int i) {
        MotActivation motActivation = this.f47475k.get(i);
        int i2 = C18628a.f47477a[motActivation.f38990g.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                StringBuilder k = C13555b.m33972k("Unknown status: ");
                k.append(motActivation.f38990g);
                throw new IllegalStateException(k.toString());
            }
        }
        return i3;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        C12797f fVar = (C12797f) a0Var;
        MotActivation motActivation = this.f47475k.get(i);
        int itemViewType = fVar.getItemViewType();
        if (itemViewType == 1) {
            ListItemView listItemView = (ListItemView) fVar.itemView;
            listItemView.setOnClickListener(this.f47471g);
            listItemView.setIcon(motActivation.mo45525c());
            listItemView.setTitle((CharSequence) motActivation.f38986c);
            listItemView.setSubtitle((int) R.string.payment_directions_mot_rides_permit);
        } else if (itemViewType == 2) {
            ListItemView listItemView2 = (ListItemView) fVar.itemView;
            listItemView2.setOnClickListener(this.f47471g);
            listItemView2.setIcon(motActivation.mo45525c());
            listItemView2.setTitle((CharSequence) motActivation.f38986c);
            listItemView2.setSubtitle((CharSequence) C7925b.m18023k(fVar.mo39638e(), motActivation.f38998o));
            String j = C7925b.m18022j(fVar.mo39638e(), motActivation.f38998o);
            String l = C7925b.m18024l(fVar.mo39638e(), motActivation.f38998o);
            String str = this.f47472h;
            Object[] objArr = {j};
            String str2 = C20964s0.f52718a;
            C13382a.m33674j(listItemView2, listItemView2.getTitle(), String.format((Locale) null, str, objArr), String.format((Locale) null, this.f47473i, new Object[]{l}));
        } else if (itemViewType == 3) {
            ListItemView listItemView3 = (ListItemView) fVar.itemView;
            listItemView3.setOnClickListener(this.f47471g);
            listItemView3.setIcon(motActivation.mo45525c());
            listItemView3.setTitle((CharSequence) motActivation.f38986c);
            listItemView3.setSubtitle((CharSequence) C7925b.m18023k(fVar.mo39638e(), motActivation.f38998o));
            MotActivationPrice motActivationPrice = motActivation.f38995l;
            PriceView priceView = (PriceView) listItemView3.getAccessoryView();
            if (motActivationPrice != null) {
                priceView.mo24682a(motActivationPrice.f39005b, motActivationPrice.f39006c, (String) null);
                priceView.setVisibility(0);
            } else {
                priceView.setVisibility(8);
            }
            String j2 = C7925b.m18022j(fVar.mo39638e(), motActivation.f38998o);
            String l2 = C7925b.m18024l(fVar.mo39638e(), motActivation.f38998o);
            String str3 = this.f47472h;
            Object[] objArr2 = {j2};
            String str4 = C20964s0.f52718a;
            C13382a.m33674j(listItemView3, listItemView3.getTitle(), String.format((Locale) null, str3, objArr2), String.format((Locale) null, this.f47473i, new Object[]{l2}), String.format((Locale) null, this.f47474j, new Object[]{priceView.getContentDescription()}));
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown view type: ", itemViewType));
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1 || i == 2) {
            view = from.inflate(R.layout.mot_current_activation_item, viewGroup, false);
        } else if (i == 3) {
            view = from.inflate(R.layout.mot_historical_activation_item, viewGroup, false);
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown view type: ", i));
        }
        C12797f fVar = new C12797f(view);
        fVar.itemView.setTag(fVar);
        return fVar;
    }
}
