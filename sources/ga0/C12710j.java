package ga0;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import p734ps.C18972a;

/* renamed from: ga0.j */
public final /* synthetic */ class C12710j implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ C12711k f31387b;

    /* renamed from: c */
    public final /* synthetic */ DialogInterface.OnClickListener f31388c;

    public /* synthetic */ C12710j(C12711k kVar, C18972a aVar) {
        this.f31387b = kVar;
        this.f31388c = aVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C12711k kVar = this.f31387b;
        DialogInterface.OnClickListener onClickListener = this.f31388c;
        kVar.getClass();
        onClickListener.onClick(kVar, i);
    }
}
