package p502fx;

import ce0.C21100e;
import com.moovit.app.tod.model.TodPassengerActionRequiredInfoType;
import p001a0.C0016g;
import p551hy.C17517b;

/* renamed from: fx.b */
public final class C17117b {

    /* renamed from: a */
    public final String f44298a;

    /* renamed from: b */
    public final C17120e f44299b;

    /* renamed from: c */
    public final TodPassengerActionRequiredInfoType f44300c;

    /* renamed from: d */
    public final C17517b f44301d;

    /* renamed from: e */
    public final String f44302e;

    public C17117b(String str, C17120e eVar, TodPassengerActionRequiredInfoType todPassengerActionRequiredInfoType, C17517b bVar, String str2) {
        C21100e.m49373x(str, "actionId");
        this.f44298a = str;
        this.f44299b = eVar;
        C21100e.m49373x(todPassengerActionRequiredInfoType, "requiredInfoType");
        this.f44300c = todPassengerActionRequiredInfoType;
        this.f44301d = bVar;
        this.f44302e = str2;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodPassengerAction{actionId=");
        k.append(this.f44298a);
        k.append("buttonSpec=");
        k.append(this.f44299b);
        k.append("requiredInfoType=");
        k.append(this.f44300c);
        k.append("requiredInfoData=");
        k.append(this.f44301d);
        k.append("instructions=");
        return C0016g.m31o(k, this.f44302e, "}");
    }
}
