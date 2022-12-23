package s40;

import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c70.C13752e;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.C7923a;
import i30.C5268d;
import java.util.Calendar;
import l40.C5605d;
import p824tp.C19728f;
import q00.C19047a;
import q40.C6177b;
import r40.C6250a;
import r40.C6251b;
import r40.C6252c;

/* renamed from: s40.d */
public final class C6465d {

    /* renamed from: a */
    public final C5605d f20184a;

    /* renamed from: b */
    public final C6177b f20185b;

    /* renamed from: c */
    public final C13752e f20186c;

    /* renamed from: d */
    public final C19728f f20187d;

    /* renamed from: e */
    public final C19047a f20188e;

    /* renamed from: f */
    public final int f20189f;

    /* renamed from: g */
    public final Calendar f20190g;

    /* renamed from: h */
    public final ServerId f20191h;

    /* renamed from: i */
    public C6250a f20192i;

    /* renamed from: j */
    public SparseBooleanArray f20193j;

    /* renamed from: k */
    public SparseBooleanArray f20194k;

    /* renamed from: l */
    public SparseIntArray f20195l;

    /* renamed from: m */
    public SparseIntArray f20196m;

    /* renamed from: n */
    public C6251b f20197n;

    /* renamed from: o */
    public C5268d f20198o;

    /* renamed from: p */
    public C6252c f20199p;

    public C6465d(C5605d dVar, C6177b bVar, C13752e eVar, C19728f fVar, C19047a aVar, int i, ServerId serverId) {
        C21100e.m49373x(dVar, "parser");
        this.f20184a = dVar;
        C21100e.m49373x(bVar, "cache");
        this.f20185b = bVar;
        C21100e.m49373x(eVar, "requestContext");
        this.f20186c = eVar;
        C21100e.m49373x(fVar, "metroContext");
        this.f20187d = fVar;
        C21100e.m49373x(aVar, "configuration");
        this.f20188e = aVar;
        this.f20189f = i;
        this.f20190g = C7923a.m18011k(fVar, i);
        C21100e.m49373x(serverId, "lineId");
        this.f20191h = serverId;
    }
}
