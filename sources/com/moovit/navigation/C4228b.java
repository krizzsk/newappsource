package com.moovit.navigation;

import aa0.C7530f;
import android.graphics.Bitmap;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.Color;
import com.moovit.map.C16286k;
import com.moovit.map.LineStyle;
import com.moovit.map.MapFragment;
import com.moovit.navigation.NavigationLeg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;

/* renamed from: com.moovit.navigation.b */
public final class C4228b {

    /* renamed from: a */
    public final MapFragment f15086a;

    /* renamed from: b */
    public final EnumMap f15087b;

    /* renamed from: c */
    public final EnumMap f15088c;

    /* renamed from: d */
    public final Color f15089d;

    /* renamed from: e */
    public final Color f15090e;

    /* renamed from: f */
    public final ArrayList f15091f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f15092g = new ArrayList();

    /* renamed from: h */
    public int f15093h;

    public C4228b(MapFragment mapFragment) {
        C21100e.m49373x(mapFragment, "mapFragment");
        this.f15086a = mapFragment;
        EnumMap enumMap = new EnumMap(ArrivalState.class);
        this.f15087b = enumMap;
        enumMap.put(ArrivalState.TRAVELLING, new Color(2130771712));
        enumMap.put(ArrivalState.ARRIVING_SOON, new Color(2130706687));
        enumMap.put(ArrivalState.ARRIVAL_IMMINENT, new Color(2147483392));
        enumMap.put(ArrivalState.DISEMBARK, new Color(-65536));
        enumMap.put(ArrivalState.ARRIVED, new Color(2147418367));
        EnumMap enumMap2 = new EnumMap(NavigationLeg.Type.class);
        this.f15088c = enumMap2;
        enumMap2.put(NavigationLeg.Type.WAIT, new Color(2130706432));
        enumMap2.put(NavigationLeg.Type.BICYCLE, new Color(Integer.MAX_VALUE));
        enumMap2.put(NavigationLeg.Type.DOCKLESS, new Color(2147467467));
        enumMap2.put(NavigationLeg.Type.WALK, new Color(2130706687));
        enumMap2.put(NavigationLeg.Type.TRANSIT, new Color(-65536));
        enumMap2.put(NavigationLeg.Type.TAXI, new Color(2147418367));
        enumMap2.put(NavigationLeg.Type.CAR, new Color(2130771712));
        this.f15089d = new Color(0);
        this.f15090e = new Color(-65536);
    }

    /* renamed from: a */
    public final void mo19702a() {
        Iterator it = this.f15091f.iterator();
        while (it.hasNext()) {
            this.f15086a.mo48638i3(it.next());
        }
        this.f15091f.clear();
    }

    /* renamed from: b */
    public final void mo19703b(NavigationLeg navigationLeg) {
        mo19702a();
        Color.C15756a aVar = Color.f40999c;
        LineStyle.LineJoin lineJoin = LineStyle.LineJoin.NONE;
        Color color = (Color) this.f15088c.get(navigationLeg.f15054b);
        C21100e.m49373x(color, "color");
        C21100e.m49357p(6.0f, "strokeWidth");
        LineStyle lineStyle = new LineStyle(color, 6.0f, lineJoin, (Bitmap) null, (Bitmap) null, BitmapDescriptorFactory.HUE_RED);
        for (NavigationPath navigationPath : navigationLeg.f15055c) {
            for (T t : Collections.unmodifiableList(navigationPath.f15068h.f15035b)) {
                this.f15091f.add(this.f15086a.mo48660v2(C7530f.m17269b(t.f15046b, 12), new C16286k((Color) this.f15087b.get(t.f15051g.f15024b), lineStyle)));
            }
        }
    }
}
