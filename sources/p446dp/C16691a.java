package p446dp;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.C0801k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1044w;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.masabi.justride.sdk.exception.MissingArgumentException;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import java.util.Date;
import kotlin.Metadata;
import mf0.C24362h;
import p584jl.C17885a;
import p605ki.C18061o;
import p605ki.C18063q;
import p605ki.C18066t;
import p605ki.C18067u;
import p701oj.C18774r;
import p752qn.C19150h;
import p871vo.C20193i;
import p891wk.C20364s;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Ldp/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: dp.a */
public final class C16691a extends Fragment {

    /* renamed from: b */
    public C18774r f43477b;

    /* renamed from: c */
    public C16694c f43478c;

    /* renamed from: dp.a$a */
    public static final class C16692a<T> implements C1044w<C20364s> {

        /* renamed from: a */
        public final /* synthetic */ C16691a f43479a;

        public C16692a(C16691a aVar) {
            this.f43479a = aVar;
        }

        public final void onChanged(Object obj) {
            String str;
            String str2;
            C20364s sVar = (C20364s) obj;
            C16691a aVar = this.f43479a;
            C24362h.m61210e(sVar, "it");
            TicketState ticketState = sVar.f51624b;
            C24362h.m61210e(ticketState, "it.ticketState");
            C19150h hVar = sVar.f51623a;
            C24362h.m61210e(hVar, "it.ticketDetails");
            Date D = C17885a.m44394D(hVar.f48710c);
            TicketDisplayConfiguration ticketDisplayConfiguration = sVar.f51631i;
            C24362h.m61210e(ticketDisplayConfiguration, "it.ticketDisplayConfiguration");
            int i = ticketDisplayConfiguration.f37088e;
            Resources resources = this.f43479a.getResources();
            C24362h.m61210e(resources, "resources");
            aVar.f43478c = new C16694c(ticketState, D, i, resources);
            C16691a aVar2 = this.f43479a;
            C18774r rVar = aVar2.f43477b;
            C24362h.m61208c(rVar);
            LinearLayout linearLayout = rVar.f47782c;
            C24362h.m61210e(linearLayout, "binding.rootView");
            C16694c cVar = aVar2.f43478c;
            if (cVar != null) {
                String b = cVar.mo49404b();
                int i2 = C16693b.f43481b[((TicketState) cVar.f43484c).ordinal()];
                if (i2 == 1) {
                    str = ((Resources) cVar.f43486e).getString(C18066t.f46209xd71b5668, new Object[]{b});
                    C24362h.m61210e(str, "resources.getString(\n   … expiryDate\n            )");
                } else if (i2 == 2) {
                    str = ((Resources) cVar.f43486e).getString(C18066t.f46212xad51333a, new Object[]{b});
                    C24362h.m61210e(str, "resources.getString(\n   … expiryDate\n            )");
                } else if (i2 == 3) {
                    str = ((Resources) cVar.f43486e).getString(C18066t.f46208x7819bd96, new Object[]{b});
                    C24362h.m61210e(str, "resources.getString(\n   … expiryDate\n            )");
                } else if (i2 != 4) {
                    str = ((Resources) cVar.f43486e).getString(C18066t.f46210xad4cf869, new Object[]{b, cVar.mo49405c()});
                    C24362h.m61210e(str, "resources.getString(\n   …yTimeLeft()\n            )");
                } else {
                    str = ((Resources) cVar.f43486e).getString(C18066t.f46211x553f2714, new Object[]{b});
                    C24362h.m61210e(str, "resources.getString(\n   … expiryDate\n            )");
                }
                linearLayout.setContentDescription(str);
                C18774r rVar2 = aVar2.f43477b;
                C24362h.m61208c(rVar2);
                TextView textView = rVar2.f47783d;
                C24362h.m61210e(textView, "binding.titleTextView");
                C16694c cVar2 = aVar2.f43478c;
                if (cVar2 != null) {
                    int i3 = C16693b.f43480a[((TicketState) cVar2.f43484c).ordinal()];
                    if (i3 == 1) {
                        str2 = ((Resources) cVar2.f43486e).getString(C18066t.f46219xf08f6465);
                        C24362h.m61210e(str2, "resources.getString(R.st…s_validity_title_expired)");
                    } else if (i3 == 2) {
                        str2 = ((Resources) cVar2.f43486e).getString(C18066t.f46221x5859367d);
                        C24362h.m61210e(str2, "resources.getString(R.st…ails_validity_title_used)");
                    } else if (i3 == 3) {
                        str2 = ((Resources) cVar2.f43486e).getString(C18066t.f46218x8d276f59);
                        C24362h.m61210e(str2, "resources.getString(R.st…_validity_title_canceled)");
                    } else if (i3 != 4) {
                        str2 = ((Resources) cVar2.f43486e).getString(C18066t.f46216x46bb7aa);
                        C24362h.m61210e(str2, "resources.getString(R.st…ls_ticket_validity_title)");
                    } else {
                        str2 = ((Resources) cVar2.f43486e).getString(C18066t.f46220x6a4cd8d7);
                        C24362h.m61210e(str2, "resources.getString(R.st…_validity_title_refunded)");
                    }
                    textView.setText(str2);
                    C18774r rVar3 = aVar2.f43477b;
                    C24362h.m61208c(rVar3);
                    TextView textView2 = rVar3.f47780a;
                    C24362h.m61210e(textView2, "binding.expiryDateTextView");
                    C16694c cVar3 = aVar2.f43478c;
                    if (cVar3 != null) {
                        textView2.setText(cVar3.mo49404b());
                        C18774r rVar4 = aVar2.f43477b;
                        C24362h.m61208c(rVar4);
                        TextView textView3 = rVar4.f47781b;
                        C24362h.m61210e(textView3, "binding.expiryTimeLeftTextView");
                        C16694c cVar4 = aVar2.f43478c;
                        if (cVar4 != null) {
                            textView3.setText(cVar4.mo49405c());
                            C16691a aVar3 = this.f43479a;
                            C16694c cVar5 = aVar3.f43478c;
                            if (cVar5 == null) {
                                C24362h.m61217l("presenter");
                                throw null;
                            } else if (((TicketState) cVar5.f43484c).isFinalized()) {
                                C18774r rVar5 = aVar3.f43477b;
                                C24362h.m61208c(rVar5);
                                TextView textView4 = rVar5.f47781b;
                                C24362h.m61210e(textView4, "binding.expiryTimeLeftTextView");
                                textView4.setVisibility(8);
                            } else {
                                C18774r rVar6 = aVar3.f43477b;
                                C24362h.m61208c(rVar6);
                                C0801k.m2424f(rVar6.f47781b, C18067u.JustRideSDKUniversalTicketDetailsInfoBox);
                                C18774r rVar7 = aVar3.f43477b;
                                C24362h.m61208c(rVar7);
                                TextView textView5 = rVar7.f47781b;
                                C24362h.m61210e(textView5, "binding.expiryTimeLeftTextView");
                                C16694c cVar6 = aVar3.f43478c;
                                if (cVar6 != null) {
                                    DisplayMetrics displayMetrics = ((Resources) cVar6.f43486e).getDisplayMetrics();
                                    C24362h.m61210e(displayMetrics, "resources.displayMetrics");
                                    int i4 = cVar6.f43482a;
                                    float L = C17885a.m44410L(displayMetrics, 2.0f);
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setShape(0);
                                    gradientDrawable.setColor(i4);
                                    gradientDrawable.setCornerRadius(L);
                                    textView5.setBackground(gradientDrawable);
                                    C18774r rVar8 = aVar3.f43477b;
                                    C24362h.m61208c(rVar8);
                                    TextView textView6 = rVar8.f47781b;
                                    C24362h.m61210e(textView6, "binding.expiryTimeLeftTextView");
                                    textView6.setVisibility(0);
                                    return;
                                }
                                C24362h.m61217l("presenter");
                                throw null;
                            }
                        } else {
                            C24362h.m61217l("presenter");
                            throw null;
                        }
                    } else {
                        C24362h.m61217l("presenter");
                        throw null;
                    }
                } else {
                    C24362h.m61217l("presenter");
                    throw null;
                }
            } else {
                C24362h.m61217l("presenter");
                throw null;
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C18063q.fragment_validity, viewGroup, false);
        int i = C18061o.expiryDateTextView;
        TextView textView = (TextView) inflate.findViewById(i);
        if (textView != null) {
            i = C18061o.expiryTimeLeftTextView;
            TextView textView2 = (TextView) inflate.findViewById(i);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                int i2 = C18061o.titleTextView;
                TextView textView3 = (TextView) inflate.findViewById(i2);
                if (textView3 != null) {
                    this.f43477b = new C18774r(linearLayout, textView, textView2, linearLayout, textView3);
                    return linearLayout;
                }
                i = i2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f43477b = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        FragmentActivity requireActivity = requireActivity();
        C24362h.m61210e(requireActivity, "requireActivity()");
        if (arguments != null) {
            String string = arguments.getString("TICKET_ID_KEY");
            if (string != null) {
                C1019k0 b = new C1026n0(requireActivity).mo4314b(C20193i.class, string);
                C24362h.m61210e(b, "ViewModelProvider(owner)…ketViewModel::class.java)");
                ((C20193i) b).f51229b.observe(getViewLifecycleOwner(), new C16692a(this));
                return;
            }
            throw new MissingArgumentException("Cannot load fragment without ticket id.");
        }
        throw new MissingArgumentException("Cannot load fragment with null bundle.");
    }
}
