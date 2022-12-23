package p505gc;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.chip.C13945a;
import com.google.android.material.chip.Chip;

/* renamed from: gc.a */
public final class C17169a extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f44403a;

    public C17169a(Chip chip) {
        this.f44403a = chip;
    }

    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        C13945a aVar = this.f44403a.f34507f;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }
}
