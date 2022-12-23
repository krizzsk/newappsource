package ya0;

import com.nutiteq.components.MapPos;
import java.util.Comparator;

/* renamed from: ya0.e */
public final class C13278e implements Comparator<MapPos> {
    public final int compare(Object obj, Object obj2) {
        MapPos mapPos = (MapPos) obj;
        MapPos mapPos2 = (MapPos) obj2;
        double d = mapPos.f24175b - mapPos2.f24175b;
        if (d == 0.0d) {
            double d2 = mapPos.f24176c - mapPos2.f24176c;
            if (d2 == 0.0d) {
                return 0;
            }
            if (d2 < 0.0d) {
                return -1;
            }
        } else if (d < 0.0d) {
            return -1;
        }
        return 1;
    }
}
