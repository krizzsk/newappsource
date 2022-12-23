package com.moovit.network.model;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import c00.C13720d;
import c00.C13722f;
import f00.C16919g;
import j40.C5384a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import p641lu.C18277b;
import p714ow.C18847a;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;

public final class ServerId implements C5384a, Parcelable {
    public static final Parcelable.Creator<ServerId> CREATOR = new C4253a();

    /* renamed from: c */
    public static final C18277b f15138c = new C18277b(4);

    /* renamed from: d */
    public static final C18847a f15139d = new C18847a(3);

    /* renamed from: e */
    public static final C4254b f15140e = new C4254b();

    /* renamed from: f */
    public static final C4255c f15141f = new C4255c();

    /* renamed from: b */
    public final int f15142b;

    /* renamed from: com.moovit.network.model.ServerId$a */
    public class C4253a implements Parcelable.Creator<ServerId> {
        public final Object createFromParcel(Parcel parcel) {
            return (ServerId) C19612n.m46981v(parcel, ServerId.f15141f);
        }

        public final Object[] newArray(int i) {
            return new ServerId[i];
        }
    }

    /* renamed from: com.moovit.network.model.ServerId$b */
    public class C4254b implements C19600l<ServerId> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51939l(((ServerId) obj).f15142b);
        }
    }

    /* renamed from: com.moovit.network.model.ServerId$c */
    public class C4255c implements C19589j<ServerId> {
        public final Object read(C19615p pVar) throws IOException {
            return new ServerId(pVar.mo51924l());
        }
    }

    /* renamed from: com.moovit.network.model.ServerId$d */
    public class C4256d implements C19589j<LongServerId> {
        public final Object read(C19615p pVar) throws IOException {
            return new LongServerId((long) pVar.mo51924l());
        }
    }

    /* renamed from: com.moovit.network.model.ServerId$e */
    public static class C4257e extends C16919g<ServerId> {
        public C4257e() {
            super("last_known_metro_id", null);
        }

        /* renamed from: a */
        public final Object mo19759a(SharedPreferences sharedPreferences) {
            if (sharedPreferences.contains(this.f43935a)) {
                return new ServerId(sharedPreferences.getInt(this.f43935a, 0));
            }
            return (ServerId) this.f43936b;
        }

        /* renamed from: c */
        public final void mo19760c(SharedPreferences.Editor editor, Object obj) {
            editor.putInt(this.f43935a, ((ServerId) obj).f15142b);
        }
    }

    static {
        new C4256d();
    }

    public ServerId(int i) {
        this.f15142b = i;
    }

    /* renamed from: b */
    public static ServerId m11392b(String str) {
        return new ServerId(Integer.parseInt(str));
    }

    /* renamed from: d */
    public static ArrayList m11393d(List list) {
        C18277b bVar = f15138c;
        ArrayList arrayList = new ArrayList(list.size());
        C13720d.m34276f(list, (C13722f) null, bVar, arrayList);
        return arrayList;
    }

    /* renamed from: f */
    public static void m11394f(Collection collection, HashSet hashSet) {
        C13720d.m34276f(collection, (C13722f) null, f15138c, hashSet);
    }

    /* renamed from: c */
    public final String mo19751c() {
        return Integer.toString(this.f15142b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ServerId) && this.f15142b == ((ServerId) obj).f15142b) {
            return true;
        }
        return false;
    }

    public final ServerId getServerId() {
        return this;
    }

    public final int hashCode() {
        return this.f15142b;
    }

    public final String toString() {
        return mo19751c();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15140e);
    }
}
