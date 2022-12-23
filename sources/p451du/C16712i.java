package p451du;

import android.view.View;
import android.widget.AdapterView;
import com.moovit.app.linedetail.p416ui.C15101a;

/* renamed from: du.i */
public final /* synthetic */ class C16712i implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ C15101a.C15109h f43520b;

    public /* synthetic */ C16712i(C15101a.C15109h hVar) {
        this.f43520b = hVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C15101a.C15109h hVar = this.f43520b;
        hVar.f38855c.dismiss();
        C15101a.m38469m2(C15101a.this, i);
    }
}
