package com.moovit.app.home.dashboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.topup.C15574a;
import com.moovit.app.topup.TopUpCard;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.request.RequestOptions;
import com.moovit.util.CurrencyAmount;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import p011aa.C0141e;
import p543hq.C17474b;
import p567iq.C17635b;
import p760qx.C19197a;
import p760qx.C19198b;
import p760qx.C19199c;
import p760qx.C19200d;
import p874vr.C20199a;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20941h;
import q00.C19047a;

/* renamed from: com.moovit.app.home.dashboard.x */
public class C14990x extends C15682c<MoovitActivity> {

    /* renamed from: n */
    public final C14991a f38363n = new C14991a();

    /* renamed from: o */
    public C19199c f38364o = null;

    /* renamed from: p */
    public C15574a f38365p = null;

    /* renamed from: com.moovit.app.home.dashboard.x$a */
    public class C14991a extends C0141e {
        public C14991a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19200d dVar = (C19200d) cVar;
            View view = C14990x.this.getView();
            if (view != null && C14990x.this.mo46775H1()) {
                C14990x.this.mo45194o2(view);
            }
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19200d dVar = (C19200d) cVar;
            C14990x.this.f38365p = (C15574a) gVar;
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.x$b */
    public static /* synthetic */ class C14992b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38367a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.app.topup.TopUpCard$Type[] r0 = com.moovit.app.topup.TopUpCard.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38367a = r0
                com.moovit.app.topup.TopUpCard$Type r1 = com.moovit.app.topup.TopUpCard.Type.REGULAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38367a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.topup.TopUpCard$Type r1 = com.moovit.app.topup.TopUpCard.Type.BALANCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.C14990x.C14992b.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.x$c */
    public class C14993c implements View.OnClickListener {

        /* renamed from: b */
        public final String f38368b;

        /* renamed from: c */
        public final String f38369c;

        /* renamed from: d */
        public final boolean f38370d;

        /* renamed from: e */
        public final C17474b f38371e;

        public C14993c(String str, String str2, boolean z, C17474b bVar) {
            C21100e.m49373x(str, "name");
            this.f38368b = str;
            C21100e.m49373x(str2, "url");
            this.f38369c = str2;
            this.f38370d = z;
            this.f38371e = bVar;
        }

        public final void onClick(View view) {
            C14990x.this.mo46797j2(this.f38371e);
            C14990x xVar = C14990x.this;
            if (xVar.f40824e) {
                xVar.startActivityForResult(WebViewActivity.m18168y2(view.getContext(), this.f38369c, this.f38368b), 1001);
                if (this.f38370d) {
                    C17635b.m43779f(view.getContext()).f50172b.mo42913b(new C19197a(view.getContext()), false);
                }
            }
        }
    }

    public C14990x() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static CharSequence m37869m2(Context context, int i, CurrencyAmount currencyAmount, int i2) {
        String string = context.getString(i, new Object[]{currencyAmount});
        if (i2 == 0) {
            return string;
        }
        String currencyAmount2 = currencyAmount.toString();
        int indexOf = string.indexOf(currencyAmount2);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(C20941h.m49043f(i2, context)), indexOf, currencyAmount2.length() + indexOf, 33);
        return spannableString;
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        this.f38364o = (C19199c) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20199a.f51278h0);
        mo45194o2(view);
        if (this.f40824e) {
            mo45193n2(false);
        }
    }

    /* renamed from: n2 */
    public final void mo45193n2(boolean z) {
        C15574a aVar;
        boolean z2;
        if (this.f38364o != null) {
            if (!z && (aVar = this.f38365p) != null) {
                if (aVar.f40503n != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return;
                }
            }
            if (mo46785T1("CONFIGURATION")) {
                C19200d dVar = new C19200d(mo46783R1());
                String name = C19200d.class.getName();
                RequestOptions L1 = mo46777L1();
                L1.f42909f = true;
                mo46793f2(name, dVar, L1, this.f38363n);
            }
        }
    }

    /* renamed from: o2 */
    public final void mo45194o2(View view) {
        C15574a aVar;
        boolean z;
        TopUpCard topUpCard;
        int i;
        View view2 = view;
        ListItemView listItemView = (ListItemView) view2.findViewById(R.id.header);
        ListItemView listItemView2 = (ListItemView) view2.findViewById(R.id.item);
        UiUtils.m40238F(8, listItemView, listItemView2);
        C19199c cVar = this.f38364o;
        if (cVar != null && (aVar = this.f38365p) != null) {
            ArrayList arrayList = aVar.f40503n;
            if (arrayList != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                listItemView2.setIcon((int) R.drawable.ic_card_24_tertiary);
                listItemView2.setTitle((CharSequence) cVar.f48806a);
                listItemView2.setSubtitle((int) R.string.dashboard_top_up_text);
                String charSequence = listItemView.getTitle().toString();
                String str = aVar.f40502m;
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "top_up_clicked");
                listItemView2.setOnClickListener(new C14993c(charSequence, str, true, aVar2.mo49933a()));
                UiUtils.m40238F(0, listItemView, listItemView2);
            } else if (!C13717b.m34258e(arrayList) && (topUpCard = (TopUpCard) arrayList.get(0)) != null) {
                int i2 = C14992b.f38367a[topUpCard.f40497a.ordinal()];
                if (i2 == 1) {
                    String str2 = aVar.f40502m;
                    listItemView2.setIcon(topUpCard.f40500d);
                    listItemView2.setTitle((CharSequence) topUpCard.f40498b);
                    listItemView2.setSubtitle((int) R.string.dashboard_top_up_cta_text);
                    String charSequence2 = listItemView.getTitle().toString();
                    C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "top_up_clicked");
                    aVar3.mo49939g(AnalyticsAttributeKey.PUBLISHER, topUpCard.f40499c);
                    listItemView2.setOnClickListener(new C14993c(charSequence2, str2, false, aVar3.mo49933a()));
                    UiUtils.m40238F(0, listItemView, listItemView2);
                } else if (i2 == 2) {
                    String str3 = aVar.f40502m;
                    C19198b bVar = topUpCard.f40501e;
                    listItemView2.setIcon(topUpCard.f40500d);
                    CurrencyAmount currencyAmount = bVar.f48803a;
                    Context context = listItemView2.getContext();
                    if (bVar.f48805c) {
                        i = R.attr.colorCritical;
                    } else {
                        i = R.attr.colorOnSurface;
                    }
                    listItemView2.setTitle(m37869m2(context, R.string.dashboard_top_up_balance_label, currencyAmount, i));
                    CurrencyAmount currencyAmount2 = bVar.f48804b;
                    if (currencyAmount2 == null) {
                        currencyAmount2 = new CurrencyAmount(currencyAmount.f23844b, new BigDecimal(0));
                    }
                    listItemView2.setSubtitle(m37869m2(listItemView2.getContext(), R.string.dashboard_top_up_pending_label, currencyAmount2, R.attr.colorOnSurfaceEmphasisHigh));
                    String charSequence3 = listItemView.getTitle().toString();
                    C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "top_up_clicked");
                    aVar4.mo49939g(AnalyticsAttributeKey.PUBLISHER, topUpCard.f40499c);
                    aVar4.mo49939g(AnalyticsAttributeKey.BALANCE, currencyAmount.toString());
                    listItemView2.setOnClickListener(new C14993c(charSequence3, str3, false, aVar4.mo49933a()));
                    UiUtils.m40238F(0, listItemView, listItemView2);
                }
            }
            if (listItemView.getVisibility() == 0) {
                mo46797j2(new C17474b(AnalyticsEventKey.TOP_UP_SECTION_SHOWN));
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001) {
            mo45193n2(true);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.topup_section_fragment, viewGroup, false);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f38365p = null;
    }

    public final void onStart() {
        super.onStart();
        mo45193n2(false);
    }
}
