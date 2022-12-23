package p713ov;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.List;

/* renamed from: ov.d */
public final /* synthetic */ class C18835d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C18836e f47952a;

    public /* synthetic */ C18835d(C18836e eVar) {
        this.f47952a = eVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C18836e eVar = this.f47952a;
        CheckBox checkBox = eVar.f47956q;
        List<TextView> list = eVar.f47957r;
        boolean isChecked = checkBox.isChecked();
        for (TextView activated : list) {
            activated.setActivated(isChecked);
        }
        eVar.mo51322t2();
    }
}
