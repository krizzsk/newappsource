package p691nx;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15682c;
import com.moovit.app.MoovitAppActivity;
import com.tranzmate.R;
import p039c7.C1800c;
import p578jf.C17843u;
import w40.C25761d;

/* renamed from: nx.b */
public class C18644b extends C15682c<MoovitAppActivity> {

    /* renamed from: p */
    public static final /* synthetic */ int f47509p = 0;

    /* renamed from: n */
    public ViewGroup f47510n;

    /* renamed from: o */
    public final C18645a f47511o = new C18645a();

    /* renamed from: nx.b$a */
    public class C18645a extends BroadcastReceiver {
        public C18645a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C18644b bVar = C18644b.this;
            int i = C18644b.f47509p;
            bVar.mo51030m2();
        }
    }

    public C18644b() {
        super(MoovitAppActivity.class);
    }

    /* renamed from: m2 */
    public final void mo51030m2() {
        if (mo46775H1() && getView() != null) {
            this.f47510n.setVisibility(8);
            C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) requireActivity(), new C17843u(this, 5));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.gtt_tod_section_fragment, viewGroup, false);
        this.f47510n = viewGroup2;
        viewGroup2.findViewById(R.id.list_item_view).setOnClickListener(new C1800c(this, 29));
        return this.f47510n;
    }

    public final void onStart() {
        super.onStart();
        mo51030m2();
        C25761d.m64300h(requireContext(), this.f47511o);
    }

    public final void onStop() {
        super.onStop();
        C25761d.m64301k(requireContext(), this.f47511o);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo51030m2();
    }
}
