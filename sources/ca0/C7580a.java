package ca0;

import a00.C13382a;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.moovit.image.model.QrCodeImage;
import java.util.ArrayList;
import n00.C18496d;
import p583jk.C17884p;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19746x;

/* renamed from: ca0.a */
public final class C7580a extends C18496d {

    /* renamed from: d */
    public final ArrayList f23082d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7580a(android.content.Context r3, java.util.List<java.lang.String> r4) {
        /*
            r2 = this;
            int r0 = p824tp.C19742t.qr_view
            java.lang.String r1 = "qrCodes"
            ce0.C21100e.m49373x(r4, r1)
            int r1 = r4.size()
            int[] r1 = new int[r1]
            java.util.Arrays.fill(r1, r0)
            r2.<init>(r3, r1)
            com.facebook.appevents.l r3 = new com.facebook.appevents.l
            r0 = 28
            r3.<init>(r0)
            r0 = 0
            java.util.ArrayList r3 = c00.C13720d.m34273c(r4, r0, r3)
            r2.f23082d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca0.C7580a.<init>(android.content.Context, java.util.List):void");
    }

    /* renamed from: a */
    public final void mo23842a(int i, View view) {
        QrCodeImage qrCodeImage = (QrCodeImage) this.f23082d.get(i);
        ImageView imageView = (ImageView) view.findViewById(C19740r.qr_view);
        Context context = view.getContext();
        C13382a.m33674j(imageView, context.getString(C19746x.voiceover_qr_code_image), context.getString(C19746x.number_of_number, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(getCount())}));
        C17884p.m44354Y(imageView).mo51642v(qrCodeImage).mo51628o0(qrCodeImage).mo22730m(C19739q.ic_close_circ_24_error).mo10850T(imageView);
    }

    public final int getCount() {
        return this.f23082d.size();
    }
}
