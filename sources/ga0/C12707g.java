package ga0;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: ga0.g */
public final /* synthetic */ class C12707g implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C12709i f31383b;

    /* renamed from: c */
    public final /* synthetic */ DialogInterface.OnClickListener f31384c;

    /* renamed from: d */
    public final /* synthetic */ int f31385d;

    public /* synthetic */ C12707g(C12709i iVar, DialogInterface.OnClickListener onClickListener, int i) {
        this.f31383b = iVar;
        this.f31384c = onClickListener;
        this.f31385d = i;
    }

    public final void onClick(View view) {
        C12709i iVar = this.f31383b;
        DialogInterface.OnClickListener onClickListener = this.f31384c;
        int i = this.f31385d;
        iVar.getClass();
        onClickListener.onClick(iVar, i);
    }
}
