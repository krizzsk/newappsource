package fa0;

import android.view.View;
import android.widget.AdapterView;
import com.moovit.view.address.AddressInputView;
import p054d0.C4291k0;

/* renamed from: fa0.c */
public final /* synthetic */ class C12651c implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ AddressInputView f31269b;

    public /* synthetic */ C12651c(AddressInputView addressInputView) {
        this.f31269b = addressInputView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AddressInputView addressInputView = this.f31269b;
        int i2 = AddressInputView.f24023t;
        addressInputView.getClass();
        addressInputView.f24033q.setTag(((AddressInputView.C7939f) adapterView.getAdapter()).f24042b.get(i).f24041b);
        addressInputView.f24032p.setError((CharSequence) null);
        AddressInputView.C7937d dVar = addressInputView.f24024h;
        if (dVar != null) {
            ((C4291k0) dVar).mo19811f(false);
        }
    }
}
