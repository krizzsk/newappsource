package jc0;

import android.content.DialogInterface;
import jc0.C12804b;
import mf0.C24362h;

/* renamed from: jc0.a */
public final /* synthetic */ class C12803a implements DialogInterface.OnDismissListener {

    /* renamed from: b */
    public final /* synthetic */ C12804b f31665b;

    public /* synthetic */ C12803a(C12804b bVar) {
        this.f31665b = bVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C12804b bVar = this.f31665b;
        C24362h.m61211f(bVar, "this$0");
        C12804b.C12805a aVar = bVar.f31667b;
        if (aVar != null) {
            aVar.zze();
        }
    }
}
