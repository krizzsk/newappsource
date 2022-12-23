package p376ax;

import com.moovit.location.mappicker.MapLocationPickerHelper;
import com.moovit.map.MapFragment;

/* renamed from: ax.a */
public final /* synthetic */ class C13539a implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ C13540b f33465a;

    /* renamed from: b */
    public final /* synthetic */ MapFragment f33466b;

    public /* synthetic */ C13539a(C13540b bVar, MapFragment mapFragment) {
        this.f33465a = bVar;
        this.f33466b = mapFragment;
    }

    /* renamed from: a */
    public final void mo21406a() {
        C13540b bVar = this.f33465a;
        MapFragment mapFragment = this.f33466b;
        int i = C13540b.f33467q;
        MapLocationPickerHelper mapLocationPickerHelper = new MapLocationPickerHelper(mapFragment, bVar.mo40428v2());
        mapLocationPickerHelper.f42295g = bVar;
        bVar.getLifecycle().mo4224a(mapLocationPickerHelper);
    }
}
