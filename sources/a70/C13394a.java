package a70;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.C14753n;
import com.moovit.payment.wallet.WalletTab;
import o00.C18681n;
import p130j2.C5367a;
import p543hq.C17474b;
import p688nu.C18631c;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import y60.C20709e;

/* renamed from: a70.a */
public class C13394a extends C13398c {

    /* renamed from: q */
    public static final WalletTab f33242q = WalletTab.VALID;

    /* renamed from: o */
    public final C13395a f33243o = new C13395a();

    /* renamed from: p */
    public RecyclerView f33244p;

    /* renamed from: a70.a$a */
    public class C13395a extends BroadcastReceiver {
        public C13395a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C13394a aVar = C13394a.this;
            WalletTab walletTab = C13394a.f33242q;
            aVar.mo40269n2();
        }
    }

    /* renamed from: m2 */
    public final boolean mo40268m2() {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView = this.f33244p;
        if (recyclerView != null) {
            adapter = recyclerView.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter == null || adapter.getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: n2 */
    public final void mo40269n2() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C20709e.m48682a().mo52853b(f33242q, false).addOnSuccessListener((Activity) activity, new C14753n(this, 9)).addOnFailureListener((Activity) activity, (OnFailureListener) new C18631c(this, 4));
        }
    }

    /* renamed from: o2 */
    public final void mo40270o2() {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView = this.f33244p;
        if (recyclerView != null) {
            adapter = recyclerView.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter != null && isResumed()) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "wallet_section_impression");
            aVar.mo49935c(AnalyticsAttributeKey.COUNT, adapter.getItemCount());
            mo46797j2(aVar.mo49933a());
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C20709e.m48682a().f52295b.getClass();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.wallet_preview_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C25750e.recycler_view);
        this.f33244p = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = this.f33244p;
        Context requireContext = requireContext();
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        sparseIntArray.put(0, C25749d.divider_horizontal);
        recyclerView2.mo4593g(new C18681n(requireContext, sparseIntArray, false), -1);
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    public final void onResume() {
        super.onResume();
        mo40270o2();
    }

    public final void onStart() {
        super.onStart();
        C20709e.m48684d(requireContext(), this.f33243o, new WalletTab[0]);
        mo40269n2();
    }

    public final void onStop() {
        super.onStop();
        Context requireContext = requireContext();
        C5367a.m13473a(requireContext).mo21148d(this.f33243o);
    }
}
