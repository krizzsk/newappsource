package p372at;

import a90.C7520c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import ce0.C21100e;
import com.facebook.appevents.C2342l;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.history.model.TripPlanHistoryItem;
import com.moovit.app.itinerary.C15053i;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.surveys.recorder.events.SurveySuggestedRoutesEvent;
import com.moovit.app.wondo.tickets.model.WondoOffer;
import com.moovit.app.wondo.tickets.model.WondoOfferDisplayInfo;
import com.moovit.app.wondo.tickets.model.WondoOfferPrice;
import com.moovit.app.wondo.tickets.offers.WondoOfferDetailsActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.AlertMessageView;
import com.moovit.env.EnvironmentProvider;
import com.moovit.image.ImageProviderFragment;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import com.moovit.payment.account.external.C25651a;
import com.moovit.payment.account.external.employee.EmployeeAccountActivity;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountProfile;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.account.profile.PaymentAccountEditProfileActivity;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.util.CurrencyAmount;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k00.C17988b;
import l30.C5577i;
import m60.C18341a;
import p310x5.C7158c;
import p316y.C7219n;
import p372at.C13516c;
import p394br.C13659e;
import p543hq.C17474b;
import p583jk.C17884p;
import p690nw.C18641a;
import p732pq.C18950k;
import p824tp.C19721a;
import p824tp.C19722a0;
import p824tp.C19731i;
import p853uu.C19995e;
import p977zz.C20930c;
import p977zz.C20941h;
import p977zz.C20944i0;
import p977zz.C20962r0;
import p977zz.C20964s0;
import q50.C19083d;
import q50.C19085e;
import t30.C6562d;
import v40.C25750e;
import v40.C25754i;
import w40.C25761d;
import z00.C20795a;
import z60.C20810a;
import z60.C20811b;

/* renamed from: at.b */
public final /* synthetic */ class C13515b implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f33431b;

    /* renamed from: c */
    public final /* synthetic */ Object f33432c;

    public /* synthetic */ C13515b(Object obj, int i) {
        this.f33431b = i;
        this.f33432c = obj;
    }

    public final void onSuccess(Object obj) {
        int i;
        boolean z;
        int i2;
        String str;
        CharSequence charSequence;
        boolean z2 = false;
        CharSequence charSequence2 = null;
        switch (this.f33431b) {
            case 0:
                C13516c cVar = (C13516c) this.f33432c;
                cVar.getClass();
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    Iterator it = cVar.f33437e.iterator();
                    while (it.hasNext()) {
                        ((C13516c.C13517a) it.next()).mo40411m1(cVar);
                    }
                    return;
                }
                return;
            case 1:
                C19995e eVar = (C19995e) this.f33432c;
                List<MotActivation> list = (List) obj;
                eVar.f50838o = list;
                eVar.f50837n.setQrCodes(C13720d.m34273c(list, (C13722f) null, new C2342l(5)));
                MotActivation motActivation = list.get(0);
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_activation_qr_viewer_location_impression");
                aVar.mo49943k(AnalyticsAttributeKey.ID, motActivation.f38985b);
                aVar.mo49944l(AnalyticsAttributeKey.COUNT, Integer.valueOf(list.size()));
                aVar.mo49943k(AnalyticsAttributeKey.AGENCY_ID, motActivation.mo45526d());
                aVar.mo49945m(AnalyticsAttributeKey.AGENCY_NAME, motActivation.mo45529f());
                eVar.mo46797j2(aVar.mo49933a());
                return;
            case 2:
                TripPlanHistoryItem tripPlanHistoryItem = (TripPlanHistoryItem) this.f33432c;
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    C18641a.f47503b.mo51027a(new SurveySuggestedRoutesEvent(tripPlanHistoryItem.f38144c, tripPlanHistoryItem.f38143b));
                    return;
                }
                return;
            case 3:
                WondoOfferDetailsActivity wondoOfferDetailsActivity = (WondoOfferDetailsActivity) this.f33432c;
                WondoOffer wondoOffer = (WondoOffer) obj;
                int i3 = WondoOfferDetailsActivity.f40747Y;
                ImageView imageView = (ImageView) wondoOfferDetailsActivity.findViewById(R.id.image);
                C17884p.m44354Y(imageView).mo51642v(wondoOffer.f40718e.f40723c).mo51628o0(wondoOffer.f40718e.f40723c).mo22729l().mo10850T(imageView);
                WondoOfferDisplayInfo wondoOfferDisplayInfo = wondoOffer.f40718e;
                wondoOfferDetailsActivity.mo44549x2(R.id.long_description).setText(wondoOfferDisplayInfo.f40726f);
                wondoOfferDetailsActivity.mo44549x2(R.id.availability_description).setText(wondoOfferDisplayInfo.f40727g);
                List<WondoOfferPrice.Item> list2 = wondoOffer.f40719f.f40731b;
                LinearLayout linearLayout = (LinearLayout) wondoOfferDetailsActivity.findViewById(R.id.items_list);
                linearLayout.removeViews(0, linearLayout.getChildCount() - 2);
                for (WondoOfferPrice.Item next : list2) {
                    View inflate = wondoOfferDetailsActivity.getLayoutInflater().inflate(R.layout.wondo_offer_price_item, linearLayout, false);
                    if (BigDecimal.ZERO.compareTo(next.f40734c.f23845c) > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i2 = R.attr.textAppearanceBodyStrong;
                    } else {
                        i2 = R.attr.textAppearanceBody;
                    }
                    TextView textView = (TextView) inflate.findViewById(R.id.item_name);
                    textView.setText(next.f40733b);
                    C20964s0.m49107y(textView, i2, R.attr.colorOnSurfaceEmphasisHigh);
                    TextView textView2 = (TextView) inflate.findViewById(R.id.item_price);
                    textView2.setText(next.f40734c.toString());
                    C20964s0.m49107y(textView2, i2, R.attr.colorOnSurfaceEmphasisHigh);
                    linearLayout.addView(inflate, linearLayout.getChildCount() - 2);
                }
                View findViewById = linearLayout.findViewById(R.id.divider);
                if (list2.isEmpty()) {
                    i = 8;
                } else {
                    i = 0;
                }
                findViewById.setVisibility(i);
                CurrencyAmount currencyAmount = wondoOffer.f40719f.f40732c;
                View findViewById2 = linearLayout.findViewById(R.id.total_view);
                TextView textView3 = (TextView) findViewById2.findViewById(R.id.item_name);
                textView3.setTextColor(C20941h.m49043f(R.attr.colorPrimary, findViewById2.getContext()));
                textView3.setText(R.string.wondo_offer_details_offer_total_sum);
                TextView textView4 = (TextView) findViewById2.findViewById(R.id.item_price);
                textView4.setTextColor(C20941h.m49043f(R.attr.colorPrimary, textView4.getContext()));
                textView4.setText(currencyAmount.toString());
                wondoOfferDetailsActivity.findViewById(R.id.pay_button).setOnClickListener(new C7158c(5, wondoOfferDetailsActivity, wondoOffer));
                TextView textView5 = (TextView) wondoOfferDetailsActivity.findViewById(R.id.terms_and_conditions);
                String string = wondoOfferDetailsActivity.getString(R.string.wondo_offer_details_terms_and_conditions_link);
                textView5.setText(wondoOfferDetailsActivity.getString(R.string.wondo_offer_details_terms_and_conditions, new Object[]{string}));
                C7219n nVar = new C7219n(14, wondoOfferDetailsActivity, wondoOffer);
                String str2 = C20964s0.f52718a;
                C20964s0.m49104v(textView5, string, new C20962r0(nVar, true, 0), new Object[0]);
                TextView textView6 = (TextView) wondoOfferDetailsActivity.findViewById(R.id.instructions_title);
                TextView textView7 = (TextView) wondoOfferDetailsActivity.findViewById(R.id.instructions_subtitle);
                C20944i0<String, String> i0Var = wondoOffer.f40718e.f40730j;
                if (i0Var == null) {
                    UiUtils.m40238F(8, textView6, textView7);
                    return;
                }
                UiUtils.m40234B(textView6, (CharSequence) i0Var.f52692a);
                UiUtils.m40234B(textView7, (CharSequence) i0Var.f52693b);
                return;
            case 4:
                Void voidR = (Void) obj;
                Bitmap.CompressFormat compressFormat = ImageProviderFragment.f41701o;
                ((ImageProviderFragment) this.f33432c).mo48179s2();
                return;
            case 5:
                C6562d dVar = (C6562d) obj;
                C5577i iVar = C5577i.f18275d;
                ((C5577i) this.f33432c).getClass();
                C25761d.m64299a().mo83591f();
                return;
            case 6:
                MicroMobilityPurchaseActivity microMobilityPurchaseActivity = (MicroMobilityPurchaseActivity) this.f33432c;
                String str3 = (String) obj;
                int i4 = MicroMobilityPurchaseActivity.f14911Y;
                FragmentManager supportFragmentManager = microMobilityPurchaseActivity.getSupportFragmentManager();
                if (supportFragmentManager.mo3926D() > 0) {
                    supportFragmentManager.mo3938S(supportFragmentManager.mo3925C(0).getId());
                }
                ArrayList<T> c = C13723g.m34282c(supportFragmentManager.mo3930H(), new C15053i(5));
                if (!c.isEmpty()) {
                    C0909a aVar2 = new C0909a(supportFragmentManager);
                    for (T p : c) {
                        aVar2.mo4050p(p);
                    }
                    aVar2.mo4046l();
                }
                ((MicroMobilityPurchaseStep) microMobilityPurchaseActivity.f14912X.f20768b.mo4292b(str3)).mo19519b(microMobilityPurchaseActivity, str3);
                return;
            case 7:
                int i5 = C25651a.f63987s;
                ((C25651a) this.f33432c).mo83457n2((PaymentAccount) obj);
                return;
            case 8:
                EmployeeAccountActivity employeeAccountActivity = (EmployeeAccountActivity) this.f33432c;
                String str4 = (String) obj;
                int i6 = EmployeeAccountActivity.f63998U;
                employeeAccountActivity.getClass();
                C19721a aVar3 = C19731i.m47197a(employeeAccountActivity).f50171a;
                String str5 = ((C19722a0) employeeAccountActivity.getSystemService("user_context")).f50160a.f32925a;
                String languageTag = C20930c.m49020b(employeeAccountActivity).toLanguageTag();
                Locale locale = Locale.ENGLISH;
                int i7 = EmployeeAccountActivity.C25659a.f63999a[EnvironmentProvider.m40486a(employeeAccountActivity).ordinal()];
                if (i7 == 2) {
                    str = "https://stg-portal.moovit.com/mobile/employee/dashboard?userKey=%1$s&amp;appId=%2$d&amp;accessToken=%3$s&amp;lang=%4$s";
                } else if (i7 != 3) {
                    str = "https://portal.moovit.com/mobile/employee/dashboard?userKey=%1$s&amp;appId=%2$d&amp;accessToken=%3$s&amp;lang=%4$s";
                } else {
                    str = "https://portal.b2b.qa.moovit.com/mobile/employee/dashboard?userKey=%1$s&amp;appId=%2$d&amp;accessToken=%3$s&amp;lang=%4$s";
                }
                employeeAccountActivity.startActivity(WebViewActivity.m18168y2(employeeAccountActivity, String.format(locale, str, new Object[]{str5, Integer.valueOf(aVar3.f50158i), str4, languageTag}), employeeAccountActivity.getString(C25754i.employers_employees_dashboard_header)));
                return;
            case 9:
                PaymentAccountEditProfileActivity paymentAccountEditProfileActivity = (PaymentAccountEditProfileActivity) this.f33432c;
                int i8 = PaymentAccountEditProfileActivity.f64099l0;
                paymentAccountEditProfileActivity.getClass();
                PaymentAccountProfile paymentAccountProfile = (PaymentAccountProfile) C13723g.m34286g(((PaymentAccount) obj).f64017f, new C18950k(paymentAccountEditProfileActivity, 5));
                if (paymentAccountProfile == null) {
                    if (paymentAccountEditProfileActivity.mo44529n1(C25750e.documents_buttons_container) == null) {
                        z2 = true;
                    }
                    if (z2) {
                        paymentAccountEditProfileActivity.finish();
                        return;
                    } else {
                        Toast.makeText(paymentAccountEditProfileActivity, C25754i.general_error_title, 1).show();
                        return;
                    }
                } else {
                    paymentAccountEditProfileActivity.f64103Z = paymentAccountProfile;
                    C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_edit_profile_impression");
                    aVar4.mo49937e(AnalyticsAttributeKey.ID, paymentAccountEditProfileActivity.f64102Y);
                    aVar4.mo49938f(AnalyticsAttributeKey.STATUS, paymentAccountEditProfileActivity.f64103Z.f64035d);
                    paymentAccountEditProfileActivity.mo44545v2(aVar4.mo49933a());
                    paymentAccountEditProfileActivity.mo83551A2(true);
                    return;
                }
            case 10:
                C19083d dVar2 = (C19083d) this.f33432c;
                C20944i0 i0Var2 = (C20944i0) obj;
                int i9 = C19083d.f48510t;
                dVar2.getClass();
                String str6 = (String) i0Var2.f52692a;
                WebInstruction webInstruction = (WebInstruction) i0Var2.f52693b;
                if (dVar2.getView() != null) {
                    dVar2.f48513r.setWebChromeClient(new WebChromeClient());
                    dVar2.f48513r.setWebViewClient(new C19085e(dVar2, webInstruction));
                    dVar2.f48513r.loadUrl(str6);
                    return;
                }
                return;
            case 11:
                C18341a aVar5 = (C18341a) this.f33432c;
                aVar5.mo50794n2(aVar5.f46768n, (PaymentMethod) obj);
                return;
            case 12:
                C20811b bVar = (C20811b) this.f33432c;
                List list3 = (List) obj;
                int i11 = C20811b.f52529u;
                bVar.getClass();
                if (C13717b.m34258e(list3)) {
                    RecyclerView recyclerView = bVar.f52532p;
                    Context context = recyclerView.getContext();
                    C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
                    Drawable b = C17988b.m44611b(bVar.f52536t, context);
                    int i12 = bVar.f52534r;
                    if (i12 == 0) {
                        charSequence = null;
                    } else {
                        charSequence = context.getText(i12);
                    }
                    int i13 = bVar.f52535s;
                    if (i13 != 0) {
                        charSequence2 = context.getText(i13);
                    }
                    recyclerView.setAdapter(new C20795a(b, charSequence, charSequence2));
                    return;
                }
                bVar.f52532p.mo4627l0(new C20810a(bVar, list3));
                return;
            case 13:
                PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) this.f33432c;
                String str7 = (String) obj;
                int i14 = PurchaseTicketActivity.f23250Y;
                FragmentManager supportFragmentManager2 = purchaseTicketActivity.getSupportFragmentManager();
                if (supportFragmentManager2.mo3926D() > 0) {
                    supportFragmentManager2.mo3938S(supportFragmentManager2.mo3925C(0).getId());
                }
                ArrayList<T> c2 = C13723g.m34282c(supportFragmentManager2.mo3930H(), new C13659e(4));
                if (!c2.isEmpty()) {
                    C0909a aVar6 = new C0909a(supportFragmentManager2);
                    for (T p2 : c2) {
                        aVar6.mo4050p(p2);
                    }
                    aVar6.mo4046l();
                }
                ((PurchaseStep) purchaseTicketActivity.f23251X.f32739b.mo4292b(str7)).mo24015b(purchaseTicketActivity, str7);
                return;
            default:
                int i15 = 8;
                C7520c cVar2 = (C7520c) this.f33432c;
                List list4 = (List) obj;
                cVar2.f22992p.mo51055y(list4);
                RecyclerView.Adapter adapter = cVar2.f22994r.getAdapter();
                C7520c.C7521a aVar7 = cVar2.f22992p;
                if (adapter != aVar7) {
                    cVar2.f22994r.mo4627l0(aVar7);
                }
                boolean isEmpty = list4.isEmpty();
                AlertMessageView alertMessageView = cVar2.f22995s;
                if (isEmpty) {
                    i15 = 0;
                }
                alertMessageView.setVisibility(i15);
                UiUtils.m40265x(cVar2.f22995s, cVar2.f22994r);
                return;
        }
    }
}
