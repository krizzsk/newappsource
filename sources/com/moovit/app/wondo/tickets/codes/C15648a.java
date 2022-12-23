package com.moovit.app.wondo.tickets.codes;

import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.wondo.tickets.model.WondoCode;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import ja0.C12797f;
import o00.C18676l;
import p543hq.C17474b;

/* renamed from: com.moovit.app.wondo.tickets.codes.a */
public final class C15648a extends C18676l<C15650b, C18676l.C18679c<C15650b>, C12797f> {

    /* renamed from: j */
    public final C15649a f40685j = new C15649a();

    /* renamed from: k */
    public final WondoCodesActivity f40686k;

    /* renamed from: com.moovit.app.wondo.tickets.codes.a$a */
    public class C15649a implements View.OnClickListener {
        public C15649a() {
        }

        public final void onClick(View view) {
            WondoCode wondoCode = (WondoCode) view.getTag(R.id.view_tag_param2);
            int itemViewType = ((C12797f) view.getTag(R.id.view_tag_param1)).getItemViewType();
            if (itemViewType == 1 || itemViewType == 2) {
                WondoCodesActivity wondoCodesActivity = C15648a.this.f40686k;
                wondoCodesActivity.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_code_item_clicked");
                aVar.mo49941i(AnalyticsAttributeKey.IS_VALID, wondoCode.f40699e);
                aVar.mo49939g(AnalyticsAttributeKey.TICKET, wondoCode.f40697c);
                wondoCodesActivity.mo44545v2(aVar.mo49933a());
                Intent intent = new Intent(wondoCodesActivity, WondoCodeDetailsActivity.class);
                intent.putExtra("wondoCode", wondoCode);
                wondoCodesActivity.startActivity(intent);
            } else if (itemViewType == 3) {
                C15648a.this.f40686k.mo46675z2("wondo_codes_purchase_link_clicked");
            }
        }
    }

    /* renamed from: com.moovit.app.wondo.tickets.codes.a$b */
    public static class C15650b {

        /* renamed from: a */
        public final int f40688a;

        /* renamed from: b */
        public final WondoCode f40689b;

        public C15650b(int i, WondoCode wondoCode) {
            this.f40688a = i;
            this.f40689b = wondoCode;
        }
    }

    public C15648a(WondoCodesActivity wondoCodesActivity) {
        this.f40686k = wondoCodesActivity;
    }

    /* renamed from: m */
    public final int mo40090m(int i, int i2) {
        return ((C15650b) mo51052n(i).getItem(i2)).f40688a;
    }

    /* renamed from: r */
    public final boolean mo40091r(int i) {
        return i == 1 || i == 2 || i == 3;
    }

    /* renamed from: t */
    public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
        C12797f fVar = (C12797f) a0Var;
        C15650b bVar = (C15650b) mo51052n(i).getItem(i2);
        int itemViewType = fVar.getItemViewType();
        if (itemViewType == 1 || itemViewType == 2) {
            WondoCode wondoCode = bVar.f40689b;
            ListItemView listItemView = (ListItemView) fVar.itemView;
            listItemView.setTag(R.id.view_tag_param2, wondoCode);
            listItemView.setIcon(wondoCode.f40698d.f40703d);
            listItemView.setTitle((CharSequence) wondoCode.f40698d.f40704e);
            listItemView.setSubtitle((CharSequence) wondoCode.f40698d.f40707h);
        }
        fVar.itemView.setOnClickListener(this.f40685j);
    }

    /* renamed from: v */
    public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
        ((ListItemView) ((C12797f) a0Var).itemView).setTitle(mo51052n(i).getName());
    }

    /* renamed from: w */
    public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            view = from.inflate(R.layout.wondo_code_available_list_item, viewGroup, false);
        } else if (i == 2) {
            view = from.inflate(R.layout.wondo_code_expired_list_item, viewGroup, false);
        } else if (i == 3) {
            view = from.inflate(R.layout.wondo_code_purchase_list_item, viewGroup, false);
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown view type:", i));
        }
        C12797f fVar = new C12797f(view);
        view.setTag(R.id.view_tag_param1, fVar);
        return fVar;
    }

    /* renamed from: x */
    public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
        ListItemView listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, R.attr.listItemSectionHeaderStyle);
        listItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new C12797f(listItemView);
    }
}
