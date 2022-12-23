package u20;

import android.webkit.URLUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import q00.C19047a;
import r00.C19209a;

/* renamed from: u20.a */
public class C19874a extends C19047a.C19049b<Integer> {
    public C19874a(int i) {
        super(Integer.valueOf(i));
    }

    /* renamed from: b */
    public Integer mo39882a(Map<String, String> map) throws Exception {
        int i;
        if (URLUtil.isValidUrl(map.get("SUBWAY_LAYER_URL"))) {
            i = 5;
        } else {
            i = 4;
        }
        if (URLUtil.isValidUrl(map.get("PATHWAY_LAYERS_URL"))) {
            i |= 2;
        }
        if (C19209a.m46358d(map.get("HAS_MAP_CAMPAIGNS"))) {
            i |= 8;
        }
        if (C19209a.m46358d(map.get("IS_BIKE_SHARING_SUPPORT"))) {
            i |= 16;
        }
        if (C19209a.m46358d(map.get("IS_BIKE_REPAIR_SUPPORT"))) {
            i |= 2048;
        }
        if (C19209a.m46358d(map.get("IS_DOCKLESS_BIKES_SUPPORTED"))) {
            i |= 32;
        }
        if (C19209a.m46358d(map.get("IS_DOCKLESS_KICK_SCOOTERS_SUPPORTED"))) {
            i |= 64;
        }
        if (C19209a.m46358d(map.get("IS_DOCKLESS_SCOOTERS_SUPPORTED"))) {
            i |= RecyclerView.C1119a0.FLAG_IGNORE;
        }
        if (C19209a.m46358d(map.get("IS_DOCKLESS_MOPED_SUPPORTED"))) {
            i |= 256;
        }
        if (C19209a.m46358d(map.get("IS_DOCKLESS_CAR_SUPPORTED"))) {
            i |= 512;
        }
        if (C19209a.m46358d(map.get("IS_CAR_SHARING_SUPPORT"))) {
            i |= 1024;
        }
        if (C19209a.m46358d(map.get("IS_PARKING_LOT_SUPPORTED"))) {
            i |= 4096;
        }
        return Integer.valueOf(i);
    }
}
