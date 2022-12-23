package com.moovit.app.carpool.center;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.moovit.app.carpool.CarpoolRideStateView;
import com.moovit.carpool.CarpoolRideRequest;
import com.moovit.carpool.HasCarpoolRide;
import com.moovit.carpool.RideRequestStatus;
import com.moovit.design.view.list.ListItemView;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import ja0.C12797f;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import p073e7.C4583a;
import p146k6.C5509n;
import p472er.C16865g;
import p496fr.C17064a;
import p496fr.C17065b;
import p583jk.C17884p;
import p977zz.C20944i0;
import p977zz.C20964s0;
import p977zz.C20975x0;
import r10.C19220d;

/* renamed from: com.moovit.app.carpool.center.a */
public final class C14797a extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public C20944i0<String, String> f37693g;

    /* renamed from: h */
    public C14799b f37694h;

    /* renamed from: i */
    public final ArrayList f37695i = new ArrayList();

    /* renamed from: j */
    public CurrencyAmount f37696j = null;

    /* renamed from: com.moovit.app.carpool.center.a$b */
    public interface C14799b {
    }

    public final int getItemCount() {
        int i;
        if (this.f37693g != null) {
            i = 1;
        } else {
            i = 0;
        }
        ArrayList arrayList = this.f37695i;
        if (arrayList == null || arrayList.isEmpty()) {
            return i + 1;
        }
        return this.f37695i.size() + 1 + i;
    }

    public final int getItemViewType(int i) {
        int i2;
        if (i != 0) {
            if (i == 1) {
                if (this.f37695i.isEmpty()) {
                    return 3;
                }
                if (this.f37693g != null) {
                    return 1;
                }
            }
            ArrayList arrayList = this.f37695i;
            if (this.f37693g != null) {
                i2 = i - 2;
            } else {
                i2 = i - 1;
            }
            if (((C14798a) arrayList.get(i2)).f37698c != null) {
                return 2;
            }
            return 4;
        } else if (this.f37693g != null) {
            return 0;
        } else {
            if (this.f37695i.isEmpty()) {
                return 3;
            }
            return 1;
        }
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        int i7 = i;
        C12797f fVar = (C12797f) a0Var;
        int itemViewType = getItemViewType(i7);
        boolean z = true;
        if (itemViewType == 0) {
            C20944i0<String, String> i0Var = this.f37693g;
            if (i0Var != null) {
                ListItemView listItemView = (ListItemView) fVar.itemView;
                listItemView.setText((CharSequence) (String) i0Var.f52692a);
                C19220d<Drawable> w = C17884p.m44353X(listItemView.getContext()).mo10880p((String) i0Var.f52693b);
                w.getClass();
                ((C19220d) w.mo22741z(DownsampleStrategy.f7148a, new C5509n(), true)).mo10850T(listItemView.getIconView());
            }
        } else if (itemViewType == 1) {
            ((ListItemView) fVar.itemView).setTitle((int) R.string.carpool_center_rides_header);
        } else if (itemViewType == 2) {
            if (this.f37693g != null) {
                i2 = i7 - 2;
            } else {
                i2 = i7 - 1;
            }
            C14798a aVar = (C14798a) this.f37695i.get(i2);
            HasCarpoolRide hasCarpoolRide = aVar.f37698c;
            TextView textView = (TextView) fVar.mo39639f(R.id.time);
            textView.setText(C7925b.m18018f(textView.getContext(), hasCarpoolRide.mo46811a0().f40912d, true));
            C16865g.m42681d((ImageView) fVar.mo39639f(R.id.profile_picture), aVar.f37698c.mo46811a0().f40911c.f40881h);
            HasCarpoolRide hasCarpoolRide2 = aVar.f37698c;
            TextView textView2 = (TextView) fVar.mo39639f(R.id.drop_off);
            C20964s0.m49081B(textView2, textView2.getContext().getString(R.string.carpool_dropoff_label), R.attr.textAppearanceBodySmall, R.attr.colorOnSurfaceEmphasisMedium, hasCarpoolRide2.mo46811a0().f40915g.f40895c, R.attr.textAppearanceBody, R.attr.colorOnSurface, (String) null);
            ((CarpoolRideStateView) fVar.mo39639f(R.id.state)).mo44831g(aVar.f37698c);
            fVar.itemView.setOnClickListener(new C17064a(0, this, aVar));
        } else if (itemViewType == 3) {
            fVar.mo39639f(R.id.learn_more).setOnClickListener(new C4583a(this, 5));
        } else if (itemViewType == 4) {
            if (this.f37693g != null) {
                i3 = i7 - 2;
            } else {
                i3 = i7 - 1;
            }
            C14798a aVar2 = (C14798a) this.f37695i.get(i3);
            boolean equals = aVar2.f37699d.f40935i.equals(RideRequestStatus.WAITING);
            CarpoolRideRequest carpoolRideRequest = aVar2.f37699d;
            TextView textView3 = (TextView) fVar.mo39639f(R.id.time);
            Context context = textView3.getContext();
            long j = carpoolRideRequest.f40931e;
            long j2 = carpoolRideRequest.f40932f;
            SimpleDateFormat simpleDateFormat = C7925b.f23934a;
            textView3.setText(C7925b.m18017e(context, j) + ", " + C7925b.m18025m(context, j, j2));
            String str2 = aVar2.f37699d.f40930d.f23651f;
            TextView textView4 = (TextView) fVar.mo39639f(R.id.drop_off);
            String string = textView4.getContext().getString(R.string.carpool_dropoff_label);
            if (equals) {
                i4 = R.attr.textAppearanceBodyStrong;
            } else {
                i4 = R.attr.textAppearanceBody;
            }
            if (equals) {
                i5 = R.attr.colorOnSurface;
            } else {
                i5 = R.attr.colorOnSurfaceEmphasisMedium;
            }
            C20964s0.m49081B(textView4, string, R.attr.textAppearanceBodySmall, R.attr.colorOnSurfaceEmphasisMedium, str2, i4, i5, (String) null);
            ((CarpoolRideStateView) fVar.mo39639f(R.id.state)).mo44829e(aVar2.f37699d);
            TextView textView5 = (TextView) fVar.mo39639f(R.id.price_range);
            TextView textView6 = (TextView) fVar.mo39639f(R.id.coupon);
            TextView textView7 = (TextView) fVar.mo39639f(R.id.no_ride_found_message);
            if (equals) {
                textView7.setVisibility(8);
                CarpoolRideRequest carpoolRideRequest2 = aVar2.f37699d;
                textView5.setVisibility(0);
                String string2 = textView5.getContext().getString(R.string.carpool_passenger_price_label);
                CurrencyAmount currencyAmount = carpoolRideRequest2.f40934h;
                CurrencyAmount currencyAmount2 = this.f37696j;
                if (currencyAmount2 == null || currencyAmount2.f23845c.movePointRight(2).longValue() < currencyAmount.f23845c.movePointRight(2).longValue()) {
                    z = false;
                }
                if (z) {
                    str = textView5.getContext().getString(R.string.carpool_free_ride);
                } else {
                    str = carpoolRideRequest2.f40934h.toString();
                }
                C20964s0.m49081B(textView5, string2, R.attr.textAppearanceBodySmall, R.attr.colorOnSurfaceEmphasisMedium, str, R.attr.textAppearanceBodyStrong, R.attr.colorOnSurface, (String) null);
                i6 = 0;
            } else {
                textView5.setVisibility(8);
                textView6.setVisibility(8);
                i6 = 0;
                textView7.setVisibility(0);
            }
            fVar.itemView.setOnClickListener(new C17065b(i6, this, aVar2));
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C12797f(C13715c.m34239e(viewGroup, R.layout.carpool_attribute_bar, viewGroup, false));
        }
        if (i == 1) {
            ListItemView listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, R.attr.listItemSectionHeaderStyle);
            listItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new C12797f(listItemView);
        } else if (i == 2) {
            return new C12797f(C13715c.m34239e(viewGroup, R.layout.carpool_center_ride_view, viewGroup, false));
        } else {
            if (i == 3) {
                return new C12797f(C13715c.m34239e(viewGroup, R.layout.carpool_center_empty_view, viewGroup, false));
            }
            if (i == 4) {
                return new C12797f(C13715c.m34239e(viewGroup, R.layout.carpool_center_ride_request_layout, viewGroup, false));
            }
            throw new IllegalStateException(C16759e.m42349e("Unknown view type: ", i));
        }
    }

    /* renamed from: com.moovit.app.carpool.center.a$a */
    public class C14798a implements Comparable<C14798a> {

        /* renamed from: b */
        public long f37697b;

        /* renamed from: c */
        public final HasCarpoolRide f37698c;

        /* renamed from: d */
        public final CarpoolRideRequest f37699d;

        public C14798a(HasCarpoolRide hasCarpoolRide) {
            C21100e.m49373x(hasCarpoolRide, "ride");
            this.f37698c = hasCarpoolRide;
            this.f37699d = null;
            this.f37697b = hasCarpoolRide.mo46811a0().f40912d;
        }

        public final int compareTo(Object obj) {
            return C20975x0.m49115b(this.f37697b, ((C14798a) obj).f37697b);
        }

        public C14798a(CarpoolRideRequest carpoolRideRequest) {
            this.f37698c = null;
            C21100e.m49373x(carpoolRideRequest, "rideRequest");
            this.f37699d = carpoolRideRequest;
            this.f37697b = carpoolRideRequest.f40931e;
        }
    }
}
