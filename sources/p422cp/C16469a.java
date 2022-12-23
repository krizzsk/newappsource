package p422cp;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1044w;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import com.masabi.justride.sdk.exception.MissingArgumentException;
import com.masabi.justride.sdk.internal.models.ticket.TicketDisplayConfiguration;
import com.masabi.justride.sdk.p415ui.features.universalticket.details.trip.Trip;
import kotlin.Metadata;
import kotlin.text.C24179b;
import mf0.C24362h;
import p604kh.C18045d;
import p605ki.C18060n;
import p605ki.C18061o;
import p605ki.C18063q;
import p605ki.C18066t;
import p701oj.C18766j;
import p871vo.C20193i;
import p891wk.C20364s;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcp/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: cp.a */
public final class C16469a extends Fragment {

    /* renamed from: b */
    public C18766j f43060b;

    /* renamed from: c */
    public String f43061c;

    /* renamed from: d */
    public C18045d f43062d;

    /* renamed from: cp.a$a */
    public static final class C16470a<T> implements C1044w<C20364s> {

        /* renamed from: a */
        public final /* synthetic */ C16469a f43063a;

        public C16470a(C16469a aVar) {
            this.f43063a = aVar;
        }

        public final void onChanged(Object obj) {
            C20364s sVar = (C20364s) obj;
            C18045d dVar = this.f43063a.f43062d;
            Boolean bool = null;
            if (dVar != null) {
                C24362h.m61210e(sVar, "it");
                dVar.f46170d = sVar.f51631i;
                C16469a aVar = this.f43063a;
                C18766j jVar = aVar.f43060b;
                C24362h.m61208c(jVar);
                TextView textView = jVar.f47756i;
                C24362h.m61210e(textView, "binding.productPriceTextView");
                C18045d dVar2 = aVar.f43062d;
                if (dVar2 != null) {
                    TicketDisplayConfiguration ticketDisplayConfiguration = (TicketDisplayConfiguration) dVar2.f46170d;
                    if (ticketDisplayConfiguration != null) {
                        bool = Boolean.valueOf(ticketDisplayConfiguration.f37098o);
                    }
                    int i = 0;
                    if (bool != null && !bool.booleanValue()) {
                        i = 8;
                    }
                    textView.setVisibility(i);
                    return;
                }
                C24362h.m61217l("presenter");
                throw null;
            }
            C24362h.m61217l("presenter");
            throw null;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("TICKET_ID_KEY");
            if (string != null) {
                this.f43061c = string;
                Trip trip = (Trip) arguments.getParcelable("TRIP");
                if (trip != null) {
                    Resources resources = getResources();
                    C24362h.m61210e(resources, "resources");
                    this.f43062d = new C18045d(trip, resources);
                    return;
                }
                throw new JustRideSdkException("Cannot load fragment without trip.");
            }
            throw new MissingArgumentException("Cannot load fragment without ticket id.");
        }
        throw new JustRideSdkException("Cannot load fragment with null arguments.");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C18063q.fragment_trip, viewGroup, false);
        int i = C18061o.destinationIconImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(i);
        if (appCompatImageView != null) {
            i = C18061o.destinationLayout;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(i);
            if (linearLayout != null) {
                i = C18061o.destinationNameTextView;
                TextView textView = (TextView) inflate.findViewById(i);
                if (textView != null) {
                    i = C18061o.originIconImageView;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) inflate.findViewById(i);
                    if (appCompatImageView2 != null) {
                        i = C18061o.originLayout;
                        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(i);
                        if (linearLayout2 != null) {
                            i = C18061o.originNameTextView;
                            TextView textView2 = (TextView) inflate.findViewById(i);
                            if (textView2 != null) {
                                i = C18061o.productLayout;
                                if (((LinearLayout) inflate.findViewById(i)) != null) {
                                    i = C18061o.productNameTextView;
                                    TextView textView3 = (TextView) inflate.findViewById(i);
                                    if (textView3 != null) {
                                        i = C18061o.productPriceTextView;
                                        TextView textView4 = (TextView) inflate.findViewById(i);
                                        if (textView4 != null) {
                                            LinearLayout linearLayout3 = (LinearLayout) inflate;
                                            this.f43060b = new C18766j(linearLayout3, appCompatImageView, linearLayout, textView, appCompatImageView2, linearLayout2, textView2, textView3, textView4);
                                            return linearLayout3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f43060b = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C1026n0 n0Var = new C1026n0(requireActivity());
        String str3 = this.f43061c;
        if (str3 != null) {
            C1019k0 b = n0Var.mo4314b(C20193i.class, str3);
            C24362h.m61210e(b, "ViewModelProvider(requir…ketViewModel::class.java)");
            ((C20193i) b).f51229b.observe(getViewLifecycleOwner(), new C16470a(this));
            C18766j jVar = this.f43060b;
            C24362h.m61208c(jVar);
            LinearLayout linearLayout = jVar.f47748a;
            C24362h.m61210e(linearLayout, "binding.root");
            C18045d dVar = this.f43062d;
            if (dVar != null) {
                String str4 = "";
                if (dVar.mo50521c()) {
                    Resources resources = (Resources) dVar.f46169c;
                    int i = C18066t.f46207x9d9bc262;
                    Object[] objArr = new Object[4];
                    objArr[0] = dVar.mo50520b();
                    Object obj = dVar.f46168b;
                    objArr[1] = ((Trip) obj).f37247h;
                    String str5 = ((Trip) obj).f37243d;
                    if (str5 == null) {
                        str5 = str4;
                    }
                    objArr[2] = str5;
                    if (((Trip) obj).f37245f == null || ((Trip) obj).f37242c == null) {
                        str2 = ((Resources) dVar.f46169c).getString(C18066t.f46203xd70962ef, new Object[]{((Trip) obj).f37244e, ((Trip) obj).f37241b});
                        C24362h.m61210e(str2, "resources.getString(\n   …inationName\n            )");
                    } else {
                        str2 = ((Resources) dVar.f46169c).getString(C18066t.f46204xd2ed4f61, new Object[]{((Trip) obj).f37244e, ((Trip) obj).f37245f, ((Trip) obj).f37241b, ((Trip) obj).f37242c});
                        C24362h.m61210e(str2, "resources.getString(\n   …ationZoneId\n            )");
                    }
                    objArr[3] = str2;
                    str = resources.getString(i, objArr);
                    C24362h.m61210e(str, "resources.getString(\n   … getRoute()\n            )");
                } else {
                    Resources resources2 = (Resources) dVar.f46169c;
                    int i2 = C18066t.f46206x4bbc5b92;
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = dVar.mo50520b();
                    Object obj2 = dVar.f46168b;
                    objArr2[1] = ((Trip) obj2).f37247h;
                    String str6 = ((Trip) obj2).f37243d;
                    if (str6 == null) {
                        str6 = str4;
                    }
                    objArr2[2] = str6;
                    str = resources2.getString(i2, objArr2);
                    C24362h.m61210e(str, "resources.getString(\n   …mattedPrice\n            )");
                }
                linearLayout.setContentDescription(str);
                C18766j jVar2 = this.f43060b;
                C24362h.m61208c(jVar2);
                TextView textView = jVar2.f47755h;
                C24362h.m61210e(textView, "binding.productNameTextView");
                C18045d dVar2 = this.f43062d;
                if (dVar2 != null) {
                    textView.setText(dVar2.mo50520b());
                    C18766j jVar3 = this.f43060b;
                    C24362h.m61208c(jVar3);
                    TextView textView2 = jVar3.f47756i;
                    C24362h.m61210e(textView2, "binding.productPriceTextView");
                    C18045d dVar3 = this.f43062d;
                    if (dVar3 != null) {
                        String str7 = ((Trip) dVar3.f46168b).f37243d;
                        if (str7 != null) {
                            str4 = str7;
                        }
                        textView2.setText(str4);
                        C18045d dVar4 = this.f43062d;
                        if (dVar4 == null) {
                            C24362h.m61217l("presenter");
                            throw null;
                        } else if (dVar4.mo50521c()) {
                            C18766j jVar4 = this.f43060b;
                            C24362h.m61208c(jVar4);
                            TextView textView3 = jVar4.f47751d;
                            C24362h.m61210e(textView3, "binding.destinationNameTextView");
                            C18045d dVar5 = this.f43062d;
                            if (dVar5 != null) {
                                String str8 = ((Trip) dVar5.f46168b).f37241b + ' ' + ((Trip) dVar5.f46168b).f37242c;
                                if (str8 != null) {
                                    textView3.setText(C24179b.m60585g0(str8).toString());
                                    C18766j jVar5 = this.f43060b;
                                    C24362h.m61208c(jVar5);
                                    TextView textView4 = jVar5.f47754g;
                                    C24362h.m61210e(textView4, "binding.originNameTextView");
                                    C18045d dVar6 = this.f43062d;
                                    if (dVar6 != null) {
                                        String str9 = ((Trip) dVar6.f46168b).f37244e + ' ' + ((Trip) dVar6.f46168b).f37245f;
                                        if (str9 != null) {
                                            textView4.setText(C24179b.m60585g0(str9).toString());
                                            C18766j jVar6 = this.f43060b;
                                            C24362h.m61208c(jVar6);
                                            AppCompatImageView appCompatImageView = jVar6.f47749b;
                                            int i3 = C18060n.com_masabi_justride_sdk_travel;
                                            appCompatImageView.setImageResource(i3);
                                            C18766j jVar7 = this.f43060b;
                                            C24362h.m61208c(jVar7);
                                            jVar7.f47752e.setImageResource(i3);
                                            C18766j jVar8 = this.f43060b;
                                            C24362h.m61208c(jVar8);
                                            LinearLayout linearLayout2 = jVar8.f47750c;
                                            C24362h.m61210e(linearLayout2, "binding.destinationLayout");
                                            linearLayout2.setVisibility(0);
                                            C18766j jVar9 = this.f43060b;
                                            C24362h.m61208c(jVar9);
                                            LinearLayout linearLayout3 = jVar9.f47753f;
                                            C24362h.m61210e(linearLayout3, "binding.originLayout");
                                            linearLayout3.setVisibility(0);
                                            return;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                                    }
                                    C24362h.m61217l("presenter");
                                    throw null;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                            C24362h.m61217l("presenter");
                            throw null;
                        } else {
                            C18766j jVar10 = this.f43060b;
                            C24362h.m61208c(jVar10);
                            LinearLayout linearLayout4 = jVar10.f47750c;
                            C24362h.m61210e(linearLayout4, "binding.destinationLayout");
                            linearLayout4.setVisibility(8);
                            C18766j jVar11 = this.f43060b;
                            C24362h.m61208c(jVar11);
                            LinearLayout linearLayout5 = jVar11.f47753f;
                            C24362h.m61210e(linearLayout5, "binding.originLayout");
                            linearLayout5.setVisibility(8);
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
            C24362h.m61217l("ticketId");
            throw null;
        }
    }
}
