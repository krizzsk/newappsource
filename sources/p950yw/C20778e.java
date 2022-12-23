package p950yw;

import android.content.Context;
import android.graphics.Rect;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.C16025f;
import com.moovit.map.C16281i;
import com.moovit.map.MapFragment;
import java.util.HashMap;
import java.util.List;
import v10.C20065a;

/* renamed from: yw.e */
public final class C20778e extends C16025f<C20065a> {

    /* renamed from: i */
    public final /* synthetic */ Context f52426i;

    /* renamed from: j */
    public final /* synthetic */ MapFragment f52427j;

    /* renamed from: k */
    public final /* synthetic */ BoxE6 f52428k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20778e(Context context, List list, Context context2, MapFragment mapFragment, BoxE6 boxE6) {
        super(context, list);
        this.f52426i = context2;
        this.f52427j = mapFragment;
        this.f52428k = boxE6;
    }

    /* renamed from: f */
    public final void mo48195f(HashMap hashMap, boolean z) {
        Rect d = C16281i.m41508d(hashMap.values());
        int g = UiUtils.m40248g(this.f52426i, 16.0f);
        d.left += g;
        d.top += g;
        d.right += g;
        d.bottom += g;
        this.f52427j.mo48606B2(d, this.f52428k, false);
    }
}
