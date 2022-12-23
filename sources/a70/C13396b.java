package a70;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.design.view.list.ListItemView;
import java.util.ArrayList;
import p001a0.C0017h;
import p304x.C7029b1;
import p572iw.C17662e;
import v40.C25750e;
import v40.C25751f;
import w40.C25761d;
import y60.C20709e;

/* renamed from: a70.b */
public class C13396b extends C15682c<MoovitActivity> {

    /* renamed from: q */
    public static final /* synthetic */ int f33246q = 0;

    /* renamed from: n */
    public final C13397a f33247n = new C13397a();

    /* renamed from: o */
    public final C17662e f33248o = new C17662e(this, 14);

    /* renamed from: p */
    public ListItemView f33249p;

    /* renamed from: a70.b$a */
    public class C13397a extends BroadcastReceiver {
        public C13397a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C13396b bVar = C13396b.this;
            int i = C13396b.f33246q;
            bVar.mo40273n2();
        }
    }

    public C13396b() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public final void mo40272m2(C13398c cVar, String str) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        if (cVar != null) {
            C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
            K.mo4111f(C25750e.container, cVar, str);
            K.mo4040d();
            return;
        }
        Fragment z = childFragmentManager.mo3983z(C25750e.container);
        if (z != null) {
            C0909a aVar = new C0909a(childFragmentManager);
            aVar.mo4050p(z);
            C7029b1 b1Var = new C7029b1(this, 11);
            if (!aVar.f3777g) {
                aVar.f3778h = false;
                if (aVar.f3787q == null) {
                    aVar.f3787q = new ArrayList<>();
                }
                aVar.f3787q.add(b1Var);
                aVar.mo4043i();
                return;
            }
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
    }

    /* renamed from: n2 */
    public final void mo40273n2() {
        if (C25761d.m64299a().mo83590e()) {
            if (getChildFragmentManager().mo3923A("wallet_preview") == null) {
                mo40272m2(new C13394a(), "wallet_preview");
            }
        } else if (getChildFragmentManager().mo3923A("wallet_unregistered_state") == null) {
            C20709e.m48682a().f52295b.getClass();
            mo40272m2((C13398c) null, "wallet_unregistered_state");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.wallet_section, viewGroup, false);
        ListItemView listItemView = (ListItemView) inflate.findViewById(C25750e.header);
        this.f33249p = listItemView;
        listItemView.getAccessoryView().setOnClickListener(this.f33248o);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C25761d.m64300h(requireContext(), this.f33247n);
        mo40273n2();
    }

    public final void onStop() {
        super.onStop();
        C25761d.m64301k(requireContext(), this.f33247n);
    }
}
