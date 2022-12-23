package com.moovit.payment.confirmation.summary;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.lifecycle.C1026n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.app.ads.C14759t;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.confirmation.options.PaymentOptions;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import ja0.C12790a;
import ja0.C12797f;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import mf0.C24361g;
import o00.C18665b;
import o00.C18670g;
import o00.C18671h;
import p028ba.C1510d;
import p304x.C7038d0;
import p304x.C7121y;
import p376ax.C13543e;
import p501fw.C17103b;
import p739px.C19037a;
import p977zz.C20930c;
import p977zz.C20964s0;
import v40.C25748c;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import w50.C20277a;
import w50.C20283g;
import y50.C20704b;

public class PaymentSummaryFragment extends C15682c<MoovitActivity> {

    /* renamed from: s */
    public static final /* synthetic */ int f42621s = 0;

    /* renamed from: n */
    public C20283g f42622n;

    /* renamed from: o */
    public RecyclerView f42623o;

    /* renamed from: p */
    public Button f42624p;

    /* renamed from: q */
    public ListItemView f42625q;

    /* renamed from: r */
    public ContentLoadingProgressBar f42626r;

    /* renamed from: com.moovit.payment.confirmation.summary.PaymentSummaryFragment$a */
    public class C16311a extends C12790a<C20704b> {

        /* renamed from: h */
        public final C16312a f42627h = new C16312a();

        /* renamed from: i */
        public final TextAppearanceSpan f42628i;

        /* renamed from: j */
        public final String f42629j;

        /* renamed from: k */
        public final String f42630k;

        /* renamed from: l */
        public final Locale f42631l;

        /* renamed from: com.moovit.payment.confirmation.summary.PaymentSummaryFragment$a$a */
        public class C16312a extends ClickableSpan {
            public C16312a() {
            }

            public final void onClick(View view) {
                C20704b bVar = (C20704b) view.getTag(C25750e.view_tag_param1);
                if (bVar != null) {
                    C20283g gVar = PaymentSummaryFragment.this.f42622n;
                    String str = bVar.f52286a;
                    List<String> list = bVar.f52287b;
                    PaymentGatewayInfo value = gVar.f51438l.getValue();
                    String value2 = gVar.f51435i.getValue();
                    if (value != null && str.equals(value2)) {
                        UUID a = gVar.mo52451a();
                        PaymentOptions d = gVar.mo52453d();
                        C20277a aVar = new C20277a(value.f42673b, gVar.f51436j.getValue(), value2, gVar.f51434h.getValue(), value.f42676e);
                        ExecutorService executorService = MoovitExecutors.COMPUTATION;
                        Tasks.call(executorService, new C17103b(gVar, 1)).onSuccessTask(executorService, new C1510d(3, aVar, list)).onSuccessTask(executorService, new C7038d0(d, 20)).addOnCompleteListener(MoovitExecutors.MAIN_THREAD, new C14759t(1, gVar, a));
                    }
                }
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        }

        public C16311a(Context context, List<C20704b> list) {
            super(list);
            this.f42628i = C20964s0.m49084b(context, C25748c.textAppearanceCaptionStrong, C25748c.colorOnSurface);
            this.f42629j = context.getString(C25754i.payment_discount_remove_action);
            this.f42630k = context.getString(C25754i.payment_discount_remove_action_plural);
            this.f42631l = C20930c.m49020b(context);
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            boolean z;
            String str;
            C12797f fVar = (C12797f) a0Var;
            C20704b bVar = (C20704b) mo39636j(i);
            if (bVar.f52287b.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = bVar.f52288c;
            String str2 = null;
            if (z && z2) {
                str2 = this.f42629j;
                str = "%1$s  |  %3$s";
            } else if (z) {
                str = "%1$s";
            } else if (z2) {
                str2 = this.f42630k;
                str = "%1$s x%2$d  |  %3$s";
            } else {
                str = "%1$s x%2$d";
            }
            TextView textView = (TextView) fVar.mo39639f(C25750e.label);
            textView.setTag(C25750e.view_tag_param1, bVar);
            textView.setText(String.format(this.f42631l, str, new Object[]{bVar.f52289d, Integer.valueOf(bVar.f52287b.size()), str2}));
            if (str2 != null) {
                C20964s0.m49104v(textView, str2, this.f42627h, this.f42628i);
            }
            TextView textView2 = (TextView) fVar.mo39639f(C25750e.amount);
            textView2.setText(bVar.f52290e.toString());
            textView2.setVisibility(0);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C25751f.payment_summary_list_item, viewGroup, false));
        }
    }

    /* renamed from: com.moovit.payment.confirmation.summary.PaymentSummaryFragment$b */
    public static class C16313b extends C18671h {

        /* renamed from: h */
        public final CurrencyAmount f42634h;

        public C16313b(CurrencyAmount currencyAmount) {
            super(C25751f.payment_summary_subtotal_list_item);
            C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
            this.f42634h = currencyAmount;
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            ((TextView) a0Var.itemView.findViewById(C25750e.amount)).setText(this.f42634h.toString());
        }
    }

    public PaymentSummaryFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static PaymentSummaryFragment m41613m2(String str, CurrencyAmount currencyAmount) {
        Bundle bundle = new Bundle();
        bundle.putString("discountContextId", str);
        bundle.putParcelable("itemPrice", currencyAmount);
        PaymentSummaryFragment paymentSummaryFragment = new PaymentSummaryFragment();
        paymentSummaryFragment.setArguments(bundle);
        return paymentSummaryFragment;
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C25750e.discounts);
        this.f42623o = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        this.f42623o.mo4593g(C18670g.m45652e(UiUtils.m40248g(view.getContext(), 12.0f)), -1);
        this.f42623o.mo4593g(C18665b.m45644e(UiUtils.m40248g(view.getContext(), 8.0f)), -1);
        this.f42625q = (ListItemView) view.findViewById(C25750e.total_view);
        this.f42626r = (ContentLoadingProgressBar) view.findViewById(C25750e.progress_bar);
        this.f42625q.setOnClickListener(new C19037a(this, 11));
        this.f42625q.setClickable(false);
        this.f42625q.setVisibility(8);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C20283g gVar = (C20283g) new C1026n0(requireActivity()).mo4313a(C20283g.class);
        this.f42622n = gVar;
        gVar.f51437k.observe(this, new C7121y(this, 8));
        C24361g.m61135E(this.f42622n.f51433g).observe(this, new C13543e(this, 4));
        Bundle arguments = getArguments();
        if (bundle == null && arguments != null) {
            this.f42622n.f51435i.postValue(arguments.getString("discountContextId"));
            this.f42622n.f51436j.postValue((CurrencyAmount) arguments.getParcelable("itemPrice"));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_summary_fragment, viewGroup, false);
        this.f42624p = (Button) inflate.findViewById(C25750e.add_voucher);
        return inflate;
    }
}
