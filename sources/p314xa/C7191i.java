package p314xa;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.moovit.map.items.MapItem;
import java.util.Comparator;
import lf0.C24240p;
import mf0.C24362h;
import p687nt.C18618p;

/* renamed from: xa.i */
public final /* synthetic */ class C7191i implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f22318b;

    /* renamed from: c */
    public final /* synthetic */ Object f22319c;

    public /* synthetic */ C7191i(Object obj, int i) {
        this.f22318b = i;
        this.f22319c = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f22318b) {
            case 0:
                MediaCodecUtil.C3934e eVar = (MediaCodecUtil.C3934e) this.f22319c;
                return eVar.mo256h(obj2) - eVar.mo256h(obj);
            case 1:
                C24240p pVar = (C24240p) this.f22319c;
                C24362h.m61211f(pVar, "$tmp0");
                return ((Number) pVar.invoke(obj, obj2)).intValue();
            default:
                C18618p pVar2 = (C18618p) this.f22319c;
                MapItem mapItem = (MapItem) obj;
                MapItem mapItem2 = (MapItem) obj2;
                int i = C18618p.f47429s;
                pVar2.getClass();
                return Float.compare(pVar2.mo51000a(mapItem.f42551d, mapItem.f42550c), pVar2.mo51000a(mapItem2.f42551d, mapItem2.f42550c));
        }
    }
}
