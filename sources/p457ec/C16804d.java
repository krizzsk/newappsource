package p457ec;

import android.content.res.TypedArray;
import android.view.View;
import com.google.android.material.bottomsheet.C13924b;

/* renamed from: ec.d */
public final class C16804d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C13924b f43759b;

    public C16804d(C13924b bVar) {
        this.f43759b = bVar;
    }

    public final void onClick(View view) {
        C13924b bVar = this.f43759b;
        if (bVar.f34423j && bVar.isShowing()) {
            C13924b bVar2 = this.f43759b;
            if (!bVar2.f34425l) {
                TypedArray obtainStyledAttributes = bVar2.getContext().obtainStyledAttributes(new int[]{16843611});
                bVar2.f34424k = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                bVar2.f34425l = true;
            }
            if (bVar2.f34424k) {
                this.f43759b.cancel();
            }
        }
    }
}
