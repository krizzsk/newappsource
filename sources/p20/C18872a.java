package p20;

import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.model.Image;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: p20.a */
public final class C18872a extends C18880g {

    /* renamed from: f */
    public final Collection<? extends C18880g> f48041f;

    public C18872a(LatLonE6 latLonE6, Image image, Set set) {
        super(latLonE6, image, (Image) null, m45901a(set));
        this.f48041f = set;
    }

    /* renamed from: a */
    public static int m45901a(Set set) {
        Iterator it = set.iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            int i2 = ((C18880g) it.next()).f48057e;
            if (i2 >= 0) {
                z = true;
                i += i2;
            }
        }
        if (z) {
            return i;
        }
        return -1;
    }
}
