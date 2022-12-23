package com.moovit.location;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.transit.LocationDescriptor;
import i20.C17539a;
import j20.C17706c;
import j20.C17708e;
import p358af.C13437d;
import p824tp.C19728f;
import p824tp.C19740r;
import p824tp.C19742t;
import p926xv.C20628i;

public class AddressFragment extends C15682c<MoovitActivity> {

    /* renamed from: r */
    public static final /* synthetic */ int f42184r = 0;

    /* renamed from: n */
    public int f42185n = 8388611;

    /* renamed from: o */
    public TextView f42186o;

    /* renamed from: p */
    public ProgressBar f42187p;

    /* renamed from: q */
    public LatLonE6 f42188q;

    /* renamed from: com.moovit.location.AddressFragment$a */
    public interface C16186a {
        /* renamed from: a */
        void mo48498a();
    }

    public AddressFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public final void mo48497m2() {
        this.f42187p.setVisibility(0);
        Tasks.call(MoovitExecutors.f37327IO, new C17708e(getContext(), C19728f.m47195a(getContext()), LocationDescriptor.m17771l(this.f42188q), true)).continueWith(MoovitExecutors.COMPUTATION, new C17706c()).addOnCompleteListener((Activity) getActivity(), new C20628i(this, 2));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f42185n = arguments.getInt("gravity", this.f42185n);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C19742t.address_fragment, viewGroup, false);
    }

    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842927});
        try {
            this.f42185n = obtainStyledAttributes.getInt(0, this.f42185n);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("displayedLocation", this.f42188q);
    }

    public final void onStart() {
        super.onStart();
        if (this.f42188q != null) {
            mo48497m2();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.f42188q = (LatLonE6) bundle.getParcelable("displayedLocation");
        }
        TextView textView = (TextView) view.findViewById(C19740r.address);
        this.f42186o = textView;
        textView.setOnClickListener(new C17539a(this));
        this.f42187p = (ProgressBar) mo46799l2(C19740r.progress_bar);
        if (this.f42186o != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i = this.f42185n;
            if (i == 8388611) {
                layoutParams.addRule(15);
                layoutParams.addRule(20);
            } else if (i == 17) {
                layoutParams.addRule(13);
            } else {
                throw new UnsupportedOperationException(C13437d.m33707l(C13555b.m33972k("Unsupported gravity = "), this.f42185n, " (support only {@link GravityCompat#START} or {@link Gravity#CENTER})"));
            }
            this.f42186o.setLayoutParams(layoutParams);
        }
    }
}
