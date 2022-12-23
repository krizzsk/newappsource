package p368ap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import mf0.C24362h;
import p605ki.C18061o;
import p605ki.C18063q;
import p701oj.C18763g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lap/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: ap.a */
public final class C13502a extends Fragment {

    /* renamed from: b */
    public C18763g f33413b;

    /* renamed from: c */
    public String f33414c;

    /* renamed from: d */
    public String f33415d;

    /* renamed from: e */
    public int f33416e;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("CARD_TYPE");
            if (string != null) {
                this.f33414c = string;
                String string2 = arguments.getString("MASKED_PAN");
                if (string2 != null) {
                    this.f33415d = string2;
                    this.f33416e = arguments.getInt("INDEX");
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C18063q.fragment_payment_card_info, viewGroup, false);
        int i = C18061o.cardIconImageView;
        ImageView imageView = (ImageView) inflate.findViewById(i);
        if (imageView != null) {
            i = C18061o.cardInfoTextView;
            TextView textView = (TextView) inflate.findViewById(i);
            if (textView != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                this.f33413b = new C18763g(linearLayout, imageView, textView);
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f33413b = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            mf0.C24362h.m61211f(r7, r0)
            super.onViewCreated(r7, r8)
            oj.g r7 = r6.f33413b
            mf0.C24362h.m61208c(r7)
            android.widget.TextView r7 = r7.f47743b
            java.lang.String r8 = "binding.cardInfoTextView"
            mf0.C24362h.m61210e(r7, r8)
            android.content.res.Resources r0 = r6.getResources()
            int r1 = p605ki.C18066t.f46213xc24cee90
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r6.f33415d
            r4 = 0
            if (r3 == 0) goto L_0x0135
            r5 = 0
            r2[r5] = r3
            java.lang.String r0 = r0.getString(r1, r2)
            java.lang.String r1 = "resources.getString(\n   …      maskedPan\n        )"
            mf0.C24362h.m61210e(r0, r1)
            r7.setText(r0)
            oj.g r7 = r6.f33413b
            mf0.C24362h.m61208c(r7)
            android.widget.TextView r7 = r7.f47743b
            mf0.C24362h.m61210e(r7, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "CardInfoTextView_"
            r8.append(r0)
            int r0 = r6.f33416e
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.setTag(r8)
            oj.g r7 = r6.f33413b
            mf0.C24362h.m61208c(r7)
            android.widget.ImageView r7 = r7.f47742a
            java.lang.String r8 = "binding.cardIconImageView"
            mf0.C24362h.m61210e(r7, r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CardIconImageView_"
            r0.append(r1)
            int r1 = r6.f33416e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.setTag(r0)
            java.lang.String r7 = r6.f33414c
            java.lang.String r0 = "cardType"
            if (r7 == 0) goto L_0x0131
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "Locale.getDefault()"
            mf0.C24362h.m61210e(r1, r2)
            java.lang.String r7 = r7.toLowerCase(r1)
            java.lang.String r1 = "(this as java.lang.String).toLowerCase(locale)"
            mf0.C24362h.m61210e(r7, r1)
            int r1 = r7.hashCode()
            switch(r1) {
                case -2038717326: goto L_0x00de;
                case -1331704771: goto L_0x00cf;
                case 105033: goto L_0x00c0;
                case 2997727: goto L_0x00b1;
                case 3619905: goto L_0x00a2;
                case 273184745: goto L_0x0093;
                default: goto L_0x0092;
            }
        L_0x0092:
            goto L_0x00ed
        L_0x0093:
            java.lang.String r1 = "discover"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x00ed
            int r7 = p605ki.C18060n.com_masabi_justride_sdk_card_discover
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00ee
        L_0x00a2:
            java.lang.String r1 = "visa"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x00ed
            int r7 = p605ki.C18060n.com_masabi_justride_sdk_card_visa
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00ee
        L_0x00b1:
            java.lang.String r1 = "amex"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x00ed
            int r7 = p605ki.C18060n.com_masabi_justride_sdk_card_amex
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00ee
        L_0x00c0:
            java.lang.String r1 = "jcb"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x00ed
            int r7 = p605ki.C18060n.com_masabi_justride_sdk_card_jcb
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00ee
        L_0x00cf:
            java.lang.String r1 = "diners"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x00ed
            int r7 = p605ki.C18060n.com_masabi_justride_sdk_card_diners_club
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00ee
        L_0x00de:
            java.lang.String r1 = "mastercard"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x00ed
            int r7 = p605ki.C18060n.com_masabi_justride_sdk_card_mastercard
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00ee
        L_0x00ed:
            r7 = r4
        L_0x00ee:
            if (r7 == 0) goto L_0x0121
            oj.g r1 = r6.f33413b
            mf0.C24362h.m61208c(r1)
            android.widget.ImageView r1 = r1.f47742a
            int r7 = r7.intValue()
            r1.setImageResource(r7)
            oj.g r7 = r6.f33413b
            mf0.C24362h.m61208c(r7)
            android.widget.ImageView r7 = r7.f47742a
            mf0.C24362h.m61210e(r7, r8)
            r7.setVisibility(r5)
            oj.g r7 = r6.f33413b
            mf0.C24362h.m61208c(r7)
            android.widget.ImageView r7 = r7.f47742a
            mf0.C24362h.m61210e(r7, r8)
            java.lang.String r8 = r6.f33414c
            if (r8 == 0) goto L_0x011d
            r7.setContentDescription(r8)
            goto L_0x0130
        L_0x011d:
            mf0.C24362h.m61217l(r0)
            throw r4
        L_0x0121:
            oj.g r7 = r6.f33413b
            mf0.C24362h.m61208c(r7)
            android.widget.ImageView r7 = r7.f47742a
            mf0.C24362h.m61210e(r7, r8)
            r8 = 8
            r7.setVisibility(r8)
        L_0x0130:
            return
        L_0x0131:
            mf0.C24362h.m61217l(r0)
            throw r4
        L_0x0135:
            java.lang.String r7 = "maskedPan"
            mf0.C24362h.m61217l(r7)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p368ap.C13502a.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
