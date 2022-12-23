package com.moovit.ridesharing.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public final class EventBookingBucket implements Parcelable {
    public static final Parcelable.Creator<EventBookingBucket> CREATOR = new C16422a();

    /* renamed from: h */
    public static C16423b f42919h = new C16423b(EventBookingBucket.class);

    /* renamed from: b */
    public final ServerId f42920b;

    /* renamed from: c */
    public final Image f42921c;

    /* renamed from: d */
    public final String f42922d;

    /* renamed from: e */
    public final long f42923e;

    /* renamed from: f */
    public final long f42924f;

    /* renamed from: g */
    public final Set<Integer> f42925g;

    /* renamed from: com.moovit.ridesharing.model.EventBookingBucket$a */
    public class C16422a implements Parcelable.Creator<EventBookingBucket> {
        public final Object createFromParcel(Parcel parcel) {
            return (EventBookingBucket) C19612n.m46981v(parcel, EventBookingBucket.f42919h);
        }

        public final Object[] newArray(int i) {
            return new EventBookingBucket[i];
        }
    }

    /* renamed from: com.moovit.ridesharing.model.EventBookingBucket$b */
    public class C16423b extends C19619s<EventBookingBucket> {
        public C16423b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            HashSet hashSet;
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            Image image = (Image) pVar.mo51962q(C16019d.m40803a().f41718d);
            String t = pVar.mo51948t();
            long m = pVar.mo51925m();
            long m2 = pVar.mo51925m();
            HashSet hashSet2 = new HashSet(2);
            int l = pVar.mo51924l();
            if (l == -1) {
                hashSet = null;
            } else {
                for (int i2 = 0; i2 < l; i2++) {
                    hashSet2.add(Integer.valueOf(pVar.mo51924l()));
                }
                hashSet = hashSet2;
            }
            return new EventBookingBucket(serverId, image, t, m, m2, hashSet);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            EventBookingBucket eventBookingBucket = (EventBookingBucket) obj;
            ServerId serverId = eventBookingBucket.f42920b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51967q(eventBookingBucket.f42921c, C16019d.m40803a().f41718d);
            qVar.mo51955t(eventBookingBucket.f42922d);
            qVar.mo51940m(eventBookingBucket.f42923e);
            qVar.mo51940m(eventBookingBucket.f42924f);
            Set<Integer> set = eventBookingBucket.f42925g;
            if (set == null) {
                qVar.mo51939l(-1);
                return;
            }
            qVar.mo51939l(set.size());
            for (Integer intValue : set) {
                qVar.mo51939l(intValue.intValue());
            }
        }
    }

    public EventBookingBucket(ServerId serverId, Image image, String str, long j, long j2, HashSet hashSet) {
        this.f42920b = serverId;
        this.f42921c = image;
        this.f42922d = str;
        this.f42923e = j;
        this.f42924f = j2;
        this.f42925g = hashSet;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42919h);
    }
}
