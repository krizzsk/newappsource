package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: androidx.viewpager2.adapter.b */
public final class C1349b extends FragmentManager.C0896l {

    /* renamed from: a */
    public final /* synthetic */ Fragment f5058a;

    /* renamed from: b */
    public final /* synthetic */ FrameLayout f5059b;

    /* renamed from: c */
    public final /* synthetic */ FragmentStateAdapter f5060c;

    public C1349b(FragmentStateAdapter fragmentStateAdapter, Fragment fragment, FrameLayout frameLayout) {
        this.f5060c = fragmentStateAdapter;
        this.f5058a = fragment;
        this.f5059b = frameLayout;
    }

    /* renamed from: c */
    public final void mo4000c(FragmentManager fragmentManager, Fragment fragment, View view) {
        if (fragment == this.f5058a) {
            fragmentManager.mo3965j0(this);
            FragmentStateAdapter fragmentStateAdapter = this.f5060c;
            FrameLayout frameLayout = this.f5059b;
            fragmentStateAdapter.getClass();
            FragmentStateAdapter.m3645j(view, frameLayout);
        }
    }
}
