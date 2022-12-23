package com.moovit.app.carpool.history;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.p052ui.C4054t;
import com.moovit.app.carpool.CarpoolRidePriceView;
import com.moovit.carpool.CarpoolRide;
import com.moovit.carpool.HistoricalCarpoolRide;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.List;
import p472er.C16865g;

/* renamed from: com.moovit.app.carpool.history.a */
public final class C14812a extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public List<HistoricalCarpoolRide> f37784g;

    /* renamed from: h */
    public C14813a f37785h;

    /* renamed from: com.moovit.app.carpool.history.a$a */
    public interface C14813a {
    }

    public final int getItemCount() {
        List<HistoricalCarpoolRide> list = this.f37784g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        int i2;
        C12797f fVar = (C12797f) a0Var;
        HistoricalCarpoolRide historicalCarpoolRide = this.f37784g.get(i);
        TextView textView = (TextView) fVar.mo39639f(R.id.time);
        textView.setText(C7925b.m18018f(textView.getContext(), historicalCarpoolRide.f40942b.f40912d, true));
        C16865g.m42681d((ImageView) fVar.mo39639f(R.id.profile_picture), historicalCarpoolRide.f40942b.f40911c.f40881h);
        ((TextView) fVar.mo39639f(R.id.drop_off)).setText(historicalCarpoolRide.f40942b.f40915g.f40895c);
        CarpoolRidePriceView carpoolRidePriceView = (CarpoolRidePriceView) fVar.mo39639f(R.id.ride_price);
        carpoolRidePriceView.getClass();
        if (historicalCarpoolRide.f40943c) {
            i2 = R.attr.colorOnSurfaceEmphasisLow;
        } else {
            i2 = R.attr.colorOnSurfaceEmphasisHigh;
        }
        carpoolRidePriceView.setPriceTextThemeColor(i2);
        CarpoolRide carpoolRide = historicalCarpoolRide.f40942b;
        carpoolRidePriceView.mo24682a(carpoolRide.f40917i, carpoolRide.f40918j, (String) null);
        fVar.itemView.setOnClickListener(new C4054t(1, this, historicalCarpoolRide));
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C12797f(C13715c.m34239e(viewGroup, R.layout.carpool_history_ride_view, viewGroup, false));
    }
}
