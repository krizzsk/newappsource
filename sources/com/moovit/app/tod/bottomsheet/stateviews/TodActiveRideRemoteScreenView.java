package com.moovit.app.tod.bottomsheet.stateviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0194b;
import androidx.core.widget.NestedScrollView;
import c00.C13717b;
import c20.C13744a;
import com.airbnb.lottie.LottieAnimationView;
import com.moovit.app.tod.model.TodRide;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.tranzmate.R;
import java.util.List;
import p073e7.C4585c;
import p400bx.C13706b;
import p502fx.C17117b;
import p502fx.C17121f;
import p502fx.C17122g;
import p821tm.C19694a;
import p927xw.C20651r;
import p927xw.C20652s;
import p977zz.C20941h;
import p977zz.C20975x0;

public class TodActiveRideRemoteScreenView extends NestedScrollView implements C13706b {

    /* renamed from: O */
    public static final /* synthetic */ int f40118O = 0;

    /* renamed from: F */
    public final TextView f40119F;

    /* renamed from: G */
    public final TextView f40120G;

    /* renamed from: H */
    public final ImageView f40121H;

    /* renamed from: I */
    public final LottieAnimationView f40122I;

    /* renamed from: J */
    public final TextView f40123J;

    /* renamed from: K */
    public final TextView f40124K;

    /* renamed from: L */
    public final LinearLayout f40125L;

    /* renamed from: M */
    public final TextView f40126M;

    /* renamed from: N */
    public final Button f40127N;

    public TodActiveRideRemoteScreenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo40574a(TodRide todRide, C17122g gVar) {
        boolean z;
        C19694a aVar;
        int i;
        int i2;
        int i3;
        int e = (int) UiUtils.m40246e(getContext(), 42.0f);
        boolean z2 = true;
        if (gVar == null || gVar.f44320h == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            e = 0;
        }
        setPadding(0, 0, 0, e);
        if (gVar == null || (aVar = gVar.f44323k) == null) {
            UiUtils.m40238F(8, this.f40119F, this.f40120G, this.f40121H, this.f40122I, this.f40123J, this.f40124K, this.f40125L, this.f40127N, this.f40126M);
            return;
        }
        String str = (String) aVar.f50006c;
        UiUtils.m40234B(this.f40119F, str);
        String str2 = (String) aVar.f50007d;
        UiUtils.m40234B(this.f40120G, str2);
        if (!(str == null && str2 == null)) {
            z2 = false;
        }
        ImageView imageView = this.f40121H;
        if (z2) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        String str3 = (String) aVar.f50008e;
        LottieAnimationView lottieAnimationView = this.f40122I;
        if (!C20975x0.m49118e((String) lottieAnimationView.getTag(), str3)) {
            lottieAnimationView.setTag(str3);
            lottieAnimationView.setRepeatCount(0);
            lottieAnimationView.setFailureListener(new C20651r(lottieAnimationView));
            lottieAnimationView.setAnimationFromUrl(str3);
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.mo6697f();
        }
        UiUtils.m40234B(this.f40123J, (String) aVar.f50009f);
        UiUtils.m40234B(this.f40124K, (String) aVar.f50010g);
        List list = (List) aVar.f50011h;
        LinearLayout linearLayout = this.f40125L;
        if (C13717b.m34258e(list)) {
            linearLayout.removeAllViews();
            linearLayout.setVisibility(8);
        } else {
            int size = list.size();
            UiUtils.m40250i(linearLayout, R.layout.tod_ride_remote_screen_list_item_spec, 0, size);
            for (int i4 = 0; i4 < size; i4++) {
                TextView textView = (TextView) linearLayout.getChildAt(i4);
                C17121f fVar = (C17121f) list.get(i4);
                UiUtils.m40236D(textView, fVar.f44310a, 8);
                textView.setTextColor(C20941h.m49044g(fVar.f44311b.getColorAttrId(), textView.getContext()));
                Image image = fVar.f44312c;
                C13744a.m34299a(textView, UiUtils.Edge.LEFT, image);
                if (image == null) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                textView.setTextAlignment(i2);
                if (image == null) {
                    i3 = 17;
                } else {
                    i3 = 8388611;
                }
                textView.setGravity(i3);
            }
            linearLayout.setVisibility(0);
        }
        C17117b bVar = (C17117b) aVar.f50012i;
        if (bVar != null) {
            C20652s.m48546a(this.f40127N, this.f40126M, bVar);
        }
    }

    public /* bridge */ /* synthetic */ int getPeekHeight() {
        return -1;
    }

    /* renamed from: h */
    public final View mo40576h() {
        return this;
    }

    public /* bridge */ /* synthetic */ void setSlideOffset(float f) {
    }

    public TodActiveRideRemoteScreenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFillViewport(true);
        LayoutInflater.from(context).inflate(R.layout.tod_active_ride_remote_screen_view, this, true);
        this.f40119F = (TextView) findViewById(R.id.title);
        this.f40120G = (TextView) findViewById(R.id.subtitle);
        this.f40121H = (ImageView) findViewById(R.id.divider);
        this.f40122I = (LottieAnimationView) findViewById(R.id.image);
        this.f40123J = (TextView) findViewById(R.id.image_subtitle);
        this.f40124K = (TextView) findViewById(R.id.list_items_title);
        this.f40125L = (LinearLayout) findViewById(R.id.list_items_container);
        this.f40126M = (TextView) findViewById(R.id.action_instructions);
        Button button = (Button) findViewById(R.id.tod_autonomous_ride_action_button);
        this.f40127N = button;
        button.setOnClickListener(new C4585c(this, 28));
        post(new C0194b(this, 11));
    }
}
