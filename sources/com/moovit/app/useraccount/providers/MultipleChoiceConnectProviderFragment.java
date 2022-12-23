package com.moovit.app.useraccount.providers;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.moovit.app.useraccount.providers.facebook.FacebookConnectProviderFragment;
import com.tranzmate.R;
import p001a0.C0017h;
import p009a8.C0115o;
import p583jk.C17884p;
import p645ly.C18298a;
import p668my.C18479c;

public class MultipleChoiceConnectProviderFragment extends Fragment {
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireView = requireView();
        int id = requireView.getId();
        FragmentManager childFragmentManager = getChildFragmentManager();
        C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
        if (C0115o.m217h()) {
            K.mo4041e(id, new FacebookConnectProviderFragment(), (String) null, 1);
        }
        if (C17884p.m44338I(requireView.getContext())) {
            K.mo4041e(id, new C18298a(), (String) null, 1);
        }
        K.mo4041e(id, new C18479c(), (String) null, 1);
        K.mo4040d();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (Fragment onActivityResult : getChildFragmentManager().mo3930H()) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.connect_and_sync_fragment, viewGroup, false);
    }
}
