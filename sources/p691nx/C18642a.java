package p691nx;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.moovit.C15682c;
import com.moovit.app.MoovitAppActivity;
import com.tranzmate.R;
import p946ys.C20763d;
import w40.C25761d;

/* renamed from: nx.a */
public class C18642a extends C15682c<MoovitAppActivity> {

    /* renamed from: p */
    public static final /* synthetic */ int f47505p = 0;

    /* renamed from: n */
    public ViewGroup f47506n;

    /* renamed from: o */
    public final C18643a f47507o = new C18643a();

    /* renamed from: nx.a$a */
    public class C18643a extends BroadcastReceiver {
        public C18643a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C18642a aVar = C18642a.this;
            int i = C18642a.f47505p;
            aVar.mo51028m2();
        }
    }

    public C18642a() {
        super(MoovitAppActivity.class);
    }

    /* renamed from: m2 */
    public final void mo51028m2() {
        if (mo46775H1() && getView() != null) {
            this.f47506n.setVisibility(8);
            C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) requireActivity(), new C20763d(this, 4));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.bus_italia_tod_section_fragment, viewGroup, false);
        this.f47506n = viewGroup2;
        viewGroup2.findViewById(R.id.list_item_view).setOnClickListener(new C4052r(this, 28));
        return this.f47506n;
    }

    public final void onStart() {
        super.onStart();
        mo51028m2();
        C25761d.m64300h(requireContext(), this.f47507o);
    }

    public final void onStop() {
        super.onStop();
        C25761d.m64301k(requireContext(), this.f47507o);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo51028m2();
    }
}
