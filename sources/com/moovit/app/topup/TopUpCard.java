package com.moovit.app.topup;

import ce0.C21100e;
import com.moovit.image.model.Image;
import p760qx.C19198b;

public final class TopUpCard {

    /* renamed from: a */
    public final Type f40497a;

    /* renamed from: b */
    public final String f40498b;

    /* renamed from: c */
    public final String f40499c;

    /* renamed from: d */
    public final Image f40500d;

    /* renamed from: e */
    public final C19198b f40501e;

    public enum Type {
        REGULAR,
        BALANCE
    }

    public TopUpCard(Type type, Image image, String str, String str2, String str3, C19198b bVar) {
        C21100e.m49373x(type, "type");
        this.f40497a = type;
        C21100e.m49373x(image, "icon");
        this.f40500d = image;
        C21100e.m49373x(str, "name");
        this.f40498b = str;
        this.f40499c = str2;
        C21100e.m49373x(str3, "actionUri");
        C21100e.m49373x(bVar, "balance");
        this.f40501e = bVar;
    }
}
