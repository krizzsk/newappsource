package com.moovit.app.gcm.popup.rate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.tranzmate.R;
import java.util.TreeMap;
import p073e7.C4584b;
import p297w5.C6996c;

/* renamed from: com.moovit.app.gcm.popup.rate.e */
public class C14888e extends C14884a {

    /* renamed from: j */
    public static final /* synthetic */ int f38039j = 0;

    /* renamed from: h */
    public boolean f38040h = false;

    /* renamed from: i */
    public final TreeMap f38041i = new TreeMap();

    static {
        Class<C14888e> cls = C14888e.class;
    }

    /* renamed from: S1 */
    public final boolean mo44990S1() {
        return !this.f38040h;
    }

    /* renamed from: T1 */
    public final int mo44993T1(ViewGroup viewGroup, int i) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ("rate_bar".equals(childAt.getTag())) {
                i = mo44993T1((ViewGroup) childAt, i);
            } else if ("rate".equals(childAt.getTag())) {
                Button button = (Button) childAt;
                button.setTag(Integer.valueOf(i));
                button.setText(String.valueOf(i));
                button.setOnClickListener(new C4584b(this, 6));
                i++;
            }
        }
        return i;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2131952803);
        this.f38041i.clear();
        this.f38041i.put(0, RateUsCompletePresentationType.REQUEST_FEEDBACK);
        this.f38041i.put(7, RateUsCompletePresentationType.THANK_YOU);
        this.f38041i.put(9, RateUsCompletePresentationType.REQUEST_APP_STORE_REVIEW);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pop_up_rate_us, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.cancel_btn).setOnClickListener(new C6996c(this, 9));
        mo44993T1((ViewGroup) view.findViewById(R.id.rate_us_bar), 0);
    }
}
