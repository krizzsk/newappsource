package p453dw;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.util.time.Time;
import com.moovit.view.dialogs.DropDownListPopup;
import ga0.C12699d;

/* renamed from: dw.g */
public final /* synthetic */ class C16731g implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ StopDetailActivity f43576b;

    /* renamed from: c */
    public final /* synthetic */ DropDownListPopup f43577c;

    /* renamed from: d */
    public final /* synthetic */ Time f43578d;

    public /* synthetic */ C16731g(StopDetailActivity stopDetailActivity, DropDownListPopup dropDownListPopup, Time time) {
        this.f43576b = stopDetailActivity;
        this.f43577c = dropDownListPopup;
        this.f43578d = time;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        StopDetailActivity stopDetailActivity = this.f43576b;
        DropDownListPopup dropDownListPopup = this.f43577c;
        Time time = this.f43578d;
        int i2 = StopDetailActivity.f39653z0;
        stopDetailActivity.getClass();
        dropDownListPopup.dismiss();
        if (i == 0) {
            C12699d.C12701b bVar = new C12699d.C12701b((Context) stopDetailActivity);
            bVar.mo39494d("time_picker_dialog_fragment_tag");
            bVar.mo39488j();
            bVar.mo39483e(0);
            bVar.mo39486h(stopDetailActivity);
            bVar.mo39485g();
            if (time != null) {
                bVar.mo39487i(time.mo24631g());
            }
            bVar.mo39489k().show(stopDetailActivity.getSupportFragmentManager(), "time_picker_dialog_fragment_tag");
        } else if (i == 1) {
            stopDetailActivity.mo45901D2((Time) null, false);
        } else if (i == 2) {
            stopDetailActivity.mo45901D2((Time) null, true);
        }
    }
}
