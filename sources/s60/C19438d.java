package s60;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import c00.C13717b;
import c00.C13723g;
import com.google.android.material.card.MaterialCardView;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n60.C18531b;
import p242s1.C6333d0;
import p372at.C13514a;
import p543hq.C17474b;
import p589jq.C17910b;
import p783rw.C19370b;
import v40.C25750e;
import v40.C25751f;

/* renamed from: s60.d */
public class C19438d extends C15682c<PaymentRegistrationActivity> {

    /* renamed from: x */
    public static final String f49441x = C19438d.class.getSimpleName();

    /* renamed from: n */
    public ArrayList f49442n;

    /* renamed from: o */
    public int f49443o;

    /* renamed from: p */
    public HashSet f49444p;

    /* renamed from: q */
    public Button f49445q;

    /* renamed from: r */
    public ColorStateList f49446r;

    /* renamed from: s */
    public MaterialCardView f49447s;

    /* renamed from: t */
    public ViewGroup f49448t;

    /* renamed from: u */
    public MaterialCardView f49449u;

    /* renamed from: v */
    public ViewGroup f49450v;

    /* renamed from: w */
    public ProgressBar f49451w;

    /* renamed from: s60.d$a */
    public interface C19439a {
        /* renamed from: t */
        void mo51847t(List<PaymentProfile> list);
    }

    public C19438d() {
        super(PaymentRegistrationActivity.class);
    }

    /* renamed from: m2 */
    public final void mo51851m2(ViewGroup viewGroup, ArrayList arrayList) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PaymentProfile paymentProfile = (PaymentProfile) it.next();
            ListItemView listItemView = (ListItemView) from.inflate(C25751f.profiles_list_item_view, viewGroup, false);
            listItemView.setTag(paymentProfile);
            listItemView.setTitle((CharSequence) paymentProfile.f42829c);
            listItemView.setSubtitle((CharSequence) paymentProfile.f42834h);
            listItemView.setChecked(this.f49444p.contains(paymentProfile.f42828b));
            listItemView.setOnClickListener(new C18531b(this, 2));
            viewGroup.addView(listItemView);
        }
    }

    /* renamed from: n2 */
    public final void mo51852n2() {
        boolean z;
        int childCount = this.f49448t.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            } else if (((ListItemView) this.f49448t.getChildAt(i)).isChecked()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f49447s.setActivated(true);
            this.f49449u.setActivated(false);
        } else if (this.f49444p.size() > 0) {
            this.f49447s.setActivated(false);
            this.f49449u.setActivated(true);
        } else {
            this.f49447s.setActivated(false);
            this.f49449u.setActivated(false);
        }
    }

    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        super.onCreate(bundle);
        Bundle Q1 = mo46782Q1();
        this.f49442n = Q1.getParcelableArrayList("profiles");
        this.f49443o = Q1.getInt("maxSelectionNumber");
        this.f49444p = new HashSet(this.f49443o);
        if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("selectedProfileIds")) != null) {
            this.f49444p.addAll(parcelableArrayList);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(C25751f.profile_selection_fragment, viewGroup, false);
        C6333d0.m15030r((TextView) inflate.findViewById(C25750e.title), true);
        this.f49447s = (MaterialCardView) inflate.findViewById(C25750e.default_profiles_card_view);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C25750e.default_profiles_container_view);
        this.f49448t = viewGroup2;
        viewGroup2.removeAllViews();
        mo51851m2(this.f49448t, C13723g.m34282c(this.f49442n, new C13514a(3)));
        this.f49449u = (MaterialCardView) inflate.findViewById(C25750e.special_profiles_card_view);
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(C25750e.special_profiles_container_view);
        this.f49450v = viewGroup3;
        viewGroup3.removeAllViews();
        mo51851m2(this.f49450v, C13723g.m34282c(this.f49442n, new C17910b(8)));
        Button button = (Button) inflate.findViewById(C25750e.continue_button);
        this.f49445q = button;
        button.setOnClickListener(new C19370b(this, 15));
        this.f49446r = this.f49445q.getTextColors();
        Button button2 = this.f49445q;
        if (this.f49444p.size() > 0) {
            z = true;
        }
        button2.setEnabled(z);
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(C25750e.progress_bar);
        this.f49451w = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(this.f49445q.getCurrentTextColor(), PorterDuff.Mode.SRC_IN);
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("selectedProfileIds", C13717b.m34264k(this.f49444p));
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "substep_profiles_selection");
        mo46797j2(aVar.mo49933a());
    }

    public final void onViewStateRestored(Bundle bundle) {
        boolean z;
        super.onViewStateRestored(bundle);
        mo51852n2();
        Button button = this.f49445q;
        if (this.f49444p.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        button.setEnabled(z);
    }
}
