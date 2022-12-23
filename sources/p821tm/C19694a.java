package p821tm;

import ce0.C21100e;
import java.util.ArrayList;
import java.util.List;
import p502fx.C17117b;

/* renamed from: tm.a */
public final class C19694a {

    /* renamed from: a */
    public final /* synthetic */ int f50004a = 1;

    /* renamed from: b */
    public Object f50005b;

    /* renamed from: c */
    public Object f50006c;

    /* renamed from: d */
    public Object f50007d;

    /* renamed from: e */
    public Object f50008e;

    /* renamed from: f */
    public Object f50009f;

    /* renamed from: g */
    public Object f50010g;

    /* renamed from: h */
    public Object f50011h;

    /* renamed from: i */
    public Object f50012i;

    public C19694a(String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, C17117b bVar) {
        C21100e.m49373x(str, "screenId");
        this.f50005b = str;
        this.f50006c = str2;
        this.f50007d = str3;
        this.f50008e = str4;
        this.f50009f = str5;
        this.f50010g = str6;
        this.f50011h = arrayList;
        this.f50012i = bVar;
    }

    public final String toString() {
        switch (this.f50004a) {
            case 1:
                StringBuilder k = C13555b.m33972k("TodPassengerScreen{screenId=");
                k.append((String) this.f50005b);
                k.append("title=");
                k.append((String) this.f50006c);
                k.append("subtitle=");
                k.append((String) this.f50007d);
                k.append("lottieImageUrl=");
                k.append((String) this.f50008e);
                k.append("imageSubtitle=");
                k.append((String) this.f50009f);
                k.append("listItemsTitle=");
                k.append((String) this.f50010g);
                k.append("listItems=");
                k.append((List) this.f50011h);
                k.append("action=");
                k.append((C17117b) this.f50012i);
                k.append("}");
                return k.toString();
            default:
                return super.toString();
        }
    }
}
