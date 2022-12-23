package com.moovit.app.wondo.tickets.offers;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.wondo.tickets.model.WondoOffer;
import com.moovit.app.wondo.tickets.model.WondoOfferDisplayInfo;
import com.moovit.commons.utils.UiUtils;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.usebutton.sdk.internal.events.Events;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.List;
import p543hq.C17474b;
import p583jk.C17884p;
import p977zz.C20941h;
import p977zz.C20944i0;

/* renamed from: com.moovit.app.wondo.tickets.offers.a */
public final class C15668a extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final C15669a f40762g = new C15669a();

    /* renamed from: h */
    public final WondoOffersActivity f40763h;

    /* renamed from: i */
    public final List<C15670b> f40764i;

    /* renamed from: com.moovit.app.wondo.tickets.offers.a$a */
    public class C15669a implements View.OnClickListener {
        public C15669a() {
        }

        public final void onClick(View view) {
            WondoOffer wondoOffer = (WondoOffer) view.getTag();
            if (wondoOffer != null) {
                WondoOffersActivity wondoOffersActivity = C15668a.this.f40763h;
                wondoOffersActivity.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_offer_item_clicked");
                aVar.mo49937e(AnalyticsAttributeKey.ID, wondoOffer.f40716c);
                wondoOffersActivity.mo44545v2(aVar.mo49933a());
                ServerId serverId = wondoOffer.f40716c;
                Intent intent = new Intent(wondoOffersActivity, WondoOfferDetailsActivity.class);
                C21100e.m49373x(serverId, "offerId");
                intent.putExtra(Events.PROPERTY_OFFER_ID, serverId);
                wondoOffersActivity.startActivity(intent);
            }
        }
    }

    /* renamed from: com.moovit.app.wondo.tickets.offers.a$b */
    public static class C15670b {

        /* renamed from: a */
        public final int f40766a;

        /* renamed from: b */
        public final WondoOffer f40767b;

        /* renamed from: c */
        public final C20944i0<String, String> f40768c;

        public C15670b(int i, WondoOffer wondoOffer, C20944i0<String, String> i0Var) {
            this.f40766a = i;
            this.f40767b = wondoOffer;
            this.f40768c = i0Var;
        }
    }

    public C15668a(WondoOffersActivity wondoOffersActivity, ArrayList arrayList) {
        this.f40763h = wondoOffersActivity;
        this.f40764i = arrayList;
    }

    public final int getItemCount() {
        return this.f40764i.size();
    }

    public final int getItemViewType(int i) {
        return this.f40764i.get(i).f40766a;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        int i2;
        C12797f fVar = (C12797f) a0Var;
        C15670b bVar = this.f40764i.get(i);
        int itemViewType = fVar.getItemViewType();
        if (itemViewType == 1) {
            C20944i0<String, String> i0Var = bVar.f40768c;
            View view = fVar.itemView;
            UiUtils.m40234B((TextView) view.findViewById(R.id.title), (CharSequence) i0Var.f52692a);
            UiUtils.m40234B((TextView) view.findViewById(R.id.subtitle), (CharSequence) i0Var.f52693b);
        } else if (itemViewType == 2) {
            WondoOffer wondoOffer = bVar.f40767b;
            View view2 = fVar.itemView;
            view2.setTag(wondoOffer);
            view2.setOnClickListener(this.f40762g);
            WondoOfferDisplayInfo wondoOfferDisplayInfo = wondoOffer.f40718e;
            ImageView imageView = (ImageView) fVar.mo39639f(R.id.icon);
            C17884p.m44354Y(imageView).mo51642v(wondoOfferDisplayInfo.f40723c).mo51628o0(wondoOfferDisplayInfo.f40723c).mo10850T(imageView);
            ((TextView) fVar.mo39639f(R.id.title)).setText(wondoOfferDisplayInfo.f40724d);
            if (wondoOfferDisplayInfo.f40729i) {
                i2 = R.attr.colorPrimary;
            } else {
                i2 = R.attr.colorOnSurfaceEmphasisHigh;
            }
            TextView textView = (TextView) fVar.mo39639f(R.id.description);
            textView.setText(wondoOfferDisplayInfo.f40725e);
            textView.setTextColor(C20941h.m49043f(i2, textView.getContext()));
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if (i == 1) {
            view = C13715c.m34239e(viewGroup, R.layout.wondo_offer_explanation_view, viewGroup, false);
        } else if (i == 2) {
            view = C13715c.m34239e(viewGroup, R.layout.wondo_offer_regular_list_item, viewGroup, false);
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown view type: ", i));
        }
        return new C12797f(view);
    }
}
