package p222q7;

import android.view.View;
import com.cubic.umo.pass.camera.GraphicOverlay;
import com.google.android.exoplayer2.p052ui.StyledPlayerControlView;

/* renamed from: q7.a */
public final /* synthetic */ class C6211a implements View.OnLayoutChangeListener {

    /* renamed from: b */
    public final /* synthetic */ int f19626b;

    /* renamed from: c */
    public final /* synthetic */ View f19627c;

    public /* synthetic */ C6211a(int i, View view) {
        this.f19626b = i;
        this.f19627c = view;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f19626b) {
            case 0:
                ((GraphicOverlay) this.f19627c).getClass();
                return;
            default:
                StyledPlayerControlView styledPlayerControlView = (StyledPlayerControlView) this.f19627c;
                int i9 = i4 - i2;
                int i11 = i8 - i6;
                if (i3 - i == i7 - i5 && i9 == i11) {
                    int i12 = StyledPlayerControlView.f14287O0;
                    styledPlayerControlView.getClass();
                    return;
                } else if (styledPlayerControlView.f14291B0.isShowing()) {
                    styledPlayerControlView.mo16544q();
                    styledPlayerControlView.f14291B0.update(view, (styledPlayerControlView.getWidth() - styledPlayerControlView.f14291B0.getWidth()) - styledPlayerControlView.f14295D0, (-styledPlayerControlView.f14291B0.getHeight()) - styledPlayerControlView.f14295D0, -1, -1);
                    return;
                } else {
                    return;
                }
        }
    }
}
