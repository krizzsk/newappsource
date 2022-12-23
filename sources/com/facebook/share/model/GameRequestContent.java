package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/share/model/GameRequestContent;", "Lcom/facebook/share/model/ShareModel;", "ActionType", "Filters", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class GameRequestContent implements ShareModel {
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new C2496a();

    /* renamed from: b */
    public final String f8907b;

    /* renamed from: c */
    public final String f8908c;

    /* renamed from: d */
    public final ArrayList f8909d;

    /* renamed from: e */
    public final String f8910e;

    /* renamed from: f */
    public final String f8911f;

    /* renamed from: g */
    public final ActionType f8912g;

    /* renamed from: h */
    public final String f8913h;

    /* renamed from: i */
    public final Filters f8914i;

    /* renamed from: j */
    public final ArrayList f8915j;

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/facebook/share/model/GameRequestContent$ActionType;", "", "(Ljava/lang/String;I)V", "SEND", "ASKFOR", "TURN", "INVITE", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum ActionType {
        SEND,
        ASKFOR,
        TURN,
        INVITE
    }

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo59060d2 = {"Lcom/facebook/share/model/GameRequestContent$Filters;", "", "(Ljava/lang/String;I)V", "APP_USERS", "APP_NON_USERS", "EVERYBODY", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum Filters {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$a */
    public static final class C2496a implements Parcelable.Creator<GameRequestContent> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new GameRequestContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new GameRequestContent[i];
        }
    }

    public GameRequestContent(Parcel parcel) {
        C24362h.m61211f(parcel, "parcel");
        this.f8907b = parcel.readString();
        this.f8908c = parcel.readString();
        this.f8909d = parcel.createStringArrayList();
        this.f8910e = parcel.readString();
        this.f8911f = parcel.readString();
        this.f8912g = (ActionType) parcel.readSerializable();
        this.f8913h = parcel.readString();
        this.f8914i = (Filters) parcel.readSerializable();
        this.f8915j = parcel.createStringArrayList();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f8907b);
        parcel.writeString(this.f8908c);
        parcel.writeStringList(this.f8909d);
        parcel.writeString(this.f8910e);
        parcel.writeString(this.f8911f);
        parcel.writeSerializable(this.f8912g);
        parcel.writeString(this.f8913h);
        parcel.writeSerializable(this.f8914i);
        parcel.writeStringList(this.f8915j);
    }
}
