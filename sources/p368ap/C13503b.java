package p368ap;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import bf0.C21050d;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import com.masabi.justride.sdk.p415ui.features.universalticket.details.purchase.ParcelablePaymentCardInfo;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import p583jk.C17875h;
import p605ki.C18061o;
import p605ki.C18063q;
import p605ki.C18066t;
import p701oj.C18764h;
import p750ql.C19138d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lap/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: ap.b */
public final class C13503b extends Fragment {

    /* renamed from: b */
    public C18764h f33417b;

    /* renamed from: c */
    public C19138d f33418c;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Date date = new Date(arguments.getLong("PURCHASE_DATE"));
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("PAYMENT_CARD_INFO_LIST");
            Resources resources = getResources();
            C24362h.m61210e(resources, "resources");
            this.f33418c = new C19138d(parcelableArrayList, date, resources);
            return;
        }
        throw new JustRideSdkException("Cannot load fragment with null arguments.");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C18063q.fragment_purchase, viewGroup, false);
        int i = C18061o.purchaseDateTextView;
        TextView textView = (TextView) inflate.findViewById(i);
        if (textView != null) {
            i = C18061o.purchaseTitle;
            if (((TextView) inflate.findViewById(i)) != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                this.f33417b = new C18764h(linearLayout, textView);
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f33417b = null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C18764h hVar = this.f33417b;
        C24362h.m61208c(hVar);
        TextView textView = hVar.f47745b;
        C24362h.m61210e(textView, "binding.purchaseDateTextView");
        C19138d dVar = this.f33418c;
        if (dVar != null) {
            int i = C18066t.f46202xb2ee7a5a;
            boolean z4 = true;
            String format = DateFormat.getDateTimeInstance(2, 3).format((Date) dVar.f48657b);
            C24362h.m61210e(format, "dateFormat.format(purchaseDate)");
            int i2 = 0;
            String string = ((Resources) dVar.f48658c).getString(i, new Object[]{format});
            C24362h.m61210e(string, "resources.getString(\n   …chaseDate()\n            )");
            textView.setContentDescription(string);
            C18764h hVar2 = this.f33417b;
            C24362h.m61208c(hVar2);
            TextView textView2 = hVar2.f47745b;
            C24362h.m61210e(textView2, "binding.purchaseDateTextView");
            C19138d dVar2 = this.f33418c;
            if (dVar2 != null) {
                String format2 = DateFormat.getDateTimeInstance(2, 3).format((Date) dVar2.f48657b);
                C24362h.m61210e(format2, "dateFormat.format(purchaseDate)");
                textView2.setText(format2);
                C19138d dVar3 = this.f33418c;
                if (dVar3 != null) {
                    List list = (List) dVar3.f48656a;
                    if (list == null || !list.isEmpty()) {
                        List list2 = (List) dVar3.f48656a;
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            loop0:
                            while (true) {
                                z = true;
                                while (true) {
                                    if (!it.hasNext()) {
                                        break loop0;
                                    }
                                    ParcelablePaymentCardInfo parcelablePaymentCardInfo = (ParcelablePaymentCardInfo) it.next();
                                    if (parcelablePaymentCardInfo.f37239b.length() > 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        if (parcelablePaymentCardInfo.f37240c.length() > 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                        }
                                    }
                                    z = false;
                                }
                            }
                            z4 = z;
                        }
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        C19138d dVar4 = this.f33418c;
                        if (dVar4 != null) {
                            List list3 = (List) dVar4.f48656a;
                            if (list3 != null) {
                                for (Object next : list3) {
                                    int i3 = i2 + 1;
                                    if (i2 >= 0) {
                                        ParcelablePaymentCardInfo parcelablePaymentCardInfo2 = (ParcelablePaymentCardInfo) next;
                                        FragmentContainerView fragmentContainerView = new FragmentContainerView(requireContext());
                                        fragmentContainerView.setId(View.generateViewId());
                                        fragmentContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                        C18764h hVar3 = this.f33417b;
                                        C24362h.m61208c(hVar3);
                                        hVar3.f47744a.addView(fragmentContainerView);
                                        String str = parcelablePaymentCardInfo2.f37240c;
                                        String str2 = parcelablePaymentCardInfo2.f37239b;
                                        C24362h.m61211f(str, "cartType");
                                        C24362h.m61211f(str2, "maskedPan");
                                        C13502a aVar = new C13502a();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("CARD_TYPE", str);
                                        bundle2.putString("MASKED_PAN", str2);
                                        bundle2.putInt("INDEX", i2);
                                        C21050d dVar5 = C21050d.f52856a;
                                        aVar.setArguments(bundle2);
                                        FragmentManager childFragmentManager = getChildFragmentManager();
                                        childFragmentManager.getClass();
                                        C0909a aVar2 = new C0909a(childFragmentManager);
                                        aVar2.mo4111f(fragmentContainerView.getId(), aVar, (String) null);
                                        aVar2.mo4040d();
                                        i2 = i3;
                                    } else {
                                        C17875h.m44294U();
                                        throw null;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        C24362h.m61217l("presenter");
                        throw null;
                    }
                    return;
                }
                C24362h.m61217l("presenter");
                throw null;
            }
            C24362h.m61217l("presenter");
            throw null;
        }
        C24362h.m61217l("presenter");
        throw null;
    }
}
