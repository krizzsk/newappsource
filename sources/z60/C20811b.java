package z60;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.payment.wallet.WalletTab;
import ja0.C12793c;
import o00.C18665b;
import p130j2.C5367a;
import p304x.C7070l;
import p372at.C13515b;
import p687nt.C18588a;
import p805su.C19543e;
import p977zz.C20941h;
import v40.C25748c;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import y60.C20709e;

/* renamed from: z60.b */
public class C20811b extends C15682c<MoovitActivity> {

    /* renamed from: u */
    public static final /* synthetic */ int f52529u = 0;

    /* renamed from: n */
    public final C20812a f52530n = new C20812a();

    /* renamed from: o */
    public SwipeRefreshLayout f52531o;

    /* renamed from: p */
    public RecyclerView f52532p;

    /* renamed from: q */
    public WalletTab f52533q;

    /* renamed from: r */
    public int f52534r;

    /* renamed from: s */
    public int f52535s;

    /* renamed from: t */
    public int f52536t;

    /* renamed from: z60.b$a */
    public class C20812a extends BroadcastReceiver {
        public C20812a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C20811b bVar = C20811b.this;
            int i = C20811b.f52529u;
            bVar.mo52945n2(false);
        }
    }

    public C20811b() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static C20811b m48807m2(WalletTab walletTab, int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("tab", walletTab);
        bundle.putInt("empty_state_title", i);
        bundle.putInt("empty_state_subtitle", 0);
        bundle.putInt("empty_state_drawable", i2);
        C20811b bVar = new C20811b();
        bVar.setArguments(bundle);
        return bVar;
    }

    /* renamed from: n2 */
    public final void mo52945n2(boolean z) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C20709e.m48682a().mo52853b(this.f52533q, z).addOnSuccessListener((Activity) activity, new C13515b(this, 12)).addOnFailureListener((Activity) activity, (OnFailureListener) new C19543e(this, 7)).addOnCompleteListener((Activity) activity, new C18588a(this, 5));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle Q1 = mo46782Q1();
        this.f52533q = (WalletTab) Q1.getParcelable("tab");
        this.f52534r = Q1.getInt("empty_state_title");
        this.f52535s = Q1.getInt("empty_state_subtitle");
        this.f52536t = Q1.getInt("empty_state_drawable");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        View inflate = layoutInflater.inflate(C25751f.wallet_items_list_fragment, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C25750e.swipe_refresh_layout);
        this.f52531o = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeColors(C20941h.m49043f(C25748c.colorSecondary, inflate.getContext()));
        this.f52531o.setOnRefreshListener(new C7070l(this, 21));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C25750e.recycler_view);
        this.f52532p = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        this.f52532p.mo4593g(new C18665b(context, C25749d.divider_horizontal), -1);
        this.f52532p.setAdapter(new C12793c());
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        Context requireContext = requireContext();
        C5367a.m13473a(requireContext).mo21148d(this.f52530n);
    }

    public final void onResume() {
        super.onResume();
        C20709e.m48684d(requireContext(), this.f52530n, this.f52533q);
        mo52945n2(false);
    }
}
