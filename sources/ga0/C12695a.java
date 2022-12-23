package ga0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import ga0.C12702e;
import p824tp.C19740r;

@Deprecated
/* renamed from: ga0.a */
public class C12695a extends C12702e {

    /* renamed from: ga0.a$a */
    public static class C12696a<B extends C12696a<B>> extends C12702e.C12703a<B> {
        public C12696a(Context context) {
            super(context);
        }

        public C12696a(Resources resources) {
            super(resources);
        }
    }

    /* renamed from: U1 */
    public void mo39472U1(C12709i iVar, Bundle bundle) {
        iVar.mo39501b(mo39473V1((FrameLayout) iVar.findViewById(C19740r.content)));
    }

    /* renamed from: V1 */
    public View mo39473V1(FrameLayout frameLayout) {
        int i = getArguments().getInt("layoutResId", 0);
        if (i == 0) {
            return null;
        }
        return LayoutInflater.from(frameLayout.getContext()).inflate(i, frameLayout, false);
    }
}
