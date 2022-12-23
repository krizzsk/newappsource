package p713ov;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.List;

/* renamed from: ov.c */
public final /* synthetic */ class C18834c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C18836e f47951a;

    public /* synthetic */ C18834c(C18836e eVar) {
        this.f47951a = eVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C18836e eVar = this.f47951a;
        CheckBox checkBox = eVar.f47954o;
        List<TextView> list = eVar.f47955p;
        boolean isChecked = checkBox.isChecked();
        for (TextView activated : list) {
            activated.setActivated(isChecked);
        }
        eVar.mo51322t2();
    }
}
