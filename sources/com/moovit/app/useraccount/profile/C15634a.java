package com.moovit.app.useraccount.profile;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsFlowKey;
import com.tranzmate.R;
import p453dw.C16740o;
import p543hq.C17474b;
import p567iq.C17635b;
import p584jl.C17885a;
import p597jy.C17979a;

/* renamed from: com.moovit.app.useraccount.profile.a */
public class C15634a extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f40647h = 0;

    /* renamed from: com.moovit.app.useraccount.profile.a$a */
    public interface C15635a {
        /* renamed from: Z */
        void mo46637Z();

        /* renamed from: f0 */
        void mo46638f0();
    }

    public C15634a() {
        super(MoovitActivity.class);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C17635b.m43779f(getActivity()).f50173c.mo22850h(AnalyticsFlowKey.DISCONNECT_POPUP, bVar);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pop_up_disconnect, viewGroup, false);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C15635a) {
            ((C15635a) targetFragment).mo46637Z();
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof C15635a) {
            ((C15635a) activity).mo46637Z();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onPause() {
        super.onPause();
        FragmentActivity activity = getActivity();
        C17635b.m43779f(activity).f50173c.mo22847b(activity, AnalyticsFlowKey.DISCONNECT_POPUP, true);
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        C17635b.m43779f(activity).f50173c.mo22849g(activity, AnalyticsFlowKey.DISCONNECT_POPUP);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.cancel_btn).setOnClickListener(new C16740o(this, 5));
        view.findViewById(R.id.disconnect_btn).setOnClickListener(new C17979a(this, 0));
        C17885a.m44469w0((ImageView) view.findViewById(R.id.profile_image), (Uri) getArguments().get("profile_image_uri_extra"), R.drawable.img_profile_placeholder_60);
    }
}
