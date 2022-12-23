package p589jq;

import c00.C13722f;
import com.moovit.accessibility.UserProfileAccessibilityPrefType;
import com.moovit.transit.LocationDescriptor;
import java.util.AbstractSet;
import java.util.Set;

/* renamed from: jq.c */
public final /* synthetic */ class C17911c implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f45958b;

    /* renamed from: c */
    public final /* synthetic */ Set f45959c;

    public /* synthetic */ C17911c(AbstractSet abstractSet, int i) {
        this.f45958b = i;
        this.f45959c = abstractSet;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f45958b) {
            case 0:
                return this.f45959c.contains((UserProfileAccessibilityPrefType) obj);
            case 1:
                return this.f45959c.contains((String) obj);
            default:
                return this.f45959c.contains(((LocationDescriptor) obj).f23649d);
        }
    }
}
