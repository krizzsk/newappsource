package p641lu;

import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import com.moovit.app.metro.selection.MetroListActivity;
import com.moovit.metro.selection.Country;
import com.moovit.metro.selection.MetroArea;
import com.moovit.view.address.AddressInputView;
import com.tranzmate.R;
import p054d0.C4291k0;
import p977zz.C20944i0;
import p977zz.C20975x0;

/* renamed from: lu.c */
public final /* synthetic */ class C18278c implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f46610b;

    /* renamed from: c */
    public final /* synthetic */ KeyEvent.Callback f46611c;

    public /* synthetic */ C18278c(KeyEvent.Callback callback, int i) {
        this.f46610b = i;
        this.f46611c = callback;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.f46610b) {
            case 0:
                MetroListActivity metroListActivity = (MetroListActivity) this.f46611c;
                int i2 = MetroListActivity.f38959o0;
                metroListActivity.getClass();
                C20944i0 i0Var = (C20944i0) adapterView.getItemAtPosition(i);
                Country country = (Country) i0Var.f52692a;
                MetroArea metroArea = (MetroArea) i0Var.f52693b;
                if (!C20975x0.m49118e(metroListActivity.f38960U, metroArea)) {
                    metroListActivity.f38961X = country;
                    metroListActivity.f38960U = metroArea;
                    metroListActivity.mo45522z2();
                    metroListActivity.mo45520y2(metroArea);
                    metroListActivity.f38964l0.setContentDescription(metroListActivity.getString(R.string.voice_over_current_metro, new Object[]{metroListActivity.f38960U.f14803c}));
                    return;
                }
                return;
            default:
                AddressInputView addressInputView = (AddressInputView) this.f46611c;
                int i3 = AddressInputView.f24023t;
                addressInputView.getClass();
                addressInputView.f24031o.setTag(((AddressInputView.C7939f) adapterView.getAdapter()).f24042b.get(i).f24041b);
                addressInputView.f24030n.setError((CharSequence) null);
                AddressInputView.C7937d dVar = addressInputView.f24024h;
                if (dVar != null) {
                    ((C4291k0) dVar).mo19811f(false);
                }
                addressInputView.mo24774r();
                return;
        }
    }
}
