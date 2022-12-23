package p244s3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.app.servicealerts.LineServiceAlertDigestView;
import com.usebutton.sdk.internal.api.AppActionRequest;
import h90.C12740b;
import k00.C17988b;
import m80.C12868d;
import m80.C12873i;
import p030bo.app.C1637m4;
import p030bo.app.C1700u1;
import z00.C20795a;

/* renamed from: s3.t */
public final /* synthetic */ class C6445t implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f20143b;

    /* renamed from: c */
    public final /* synthetic */ Object f20144c;

    public /* synthetic */ C6445t(Object obj, int i) {
        this.f20143b = i;
        this.f20144c = obj;
    }

    public final void onFailure(Exception exc) {
        CharSequence charSequence;
        switch (this.f20143b) {
            case 0:
                C1637m4.m4485a((C1700u1) this.f20144c, exc);
                return;
            case 1:
                int i = LineServiceAlertDigestView.f39539m;
                ((LineServiceAlertDigestView) this.f20144c).setVisibility(8);
                return;
            default:
                RecyclerView recyclerView = ((C12740b) this.f20144c).f31478r;
                Context context = recyclerView.getContext();
                C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
                Drawable b = C17988b.m44611b(C12868d.img_empty_error_sign, context);
                int i2 = C12873i.general_error_title;
                if (i2 == 0) {
                    charSequence = null;
                } else {
                    charSequence = context.getText(i2);
                }
                recyclerView.setAdapter(new C20795a(b, (CharSequence) null, charSequence));
                return;
        }
    }
}
