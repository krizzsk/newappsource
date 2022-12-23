package com.cubic.umo.pass.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/TxDTO;", "Landroid/os/Parcelable;", "", "txId", "ts", "Lcom/cubic/umo/pass/model/TransactionType;", "type", "", "balance", "Lcom/cubic/umo/pass/model/Money;", "balanceMoney", "fare", "", "location", "description", "", "isReaderTimeOut", "millis", "copy", "(JJLcom/cubic/umo/pass/model/TransactionType;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/Money;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/cubic/umo/pass/model/TxDTO;", "<init>", "(JJLcom/cubic/umo/pass/model/TransactionType;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/Money;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class TxDTO implements Parcelable {
    public static final Parcelable.Creator<TxDTO> CREATOR = new C2258a();

    /* renamed from: b */
    public final long f8232b;

    /* renamed from: c */
    public final long f8233c;

    /* renamed from: d */
    public final TransactionType f8234d;

    /* renamed from: e */
    public final Integer f8235e;

    /* renamed from: f */
    public final Money f8236f;

    /* renamed from: g */
    public final Integer f8237g;

    /* renamed from: h */
    public final String f8238h;

    /* renamed from: i */
    public final String f8239i;

    /* renamed from: j */
    public final Boolean f8240j;

    /* renamed from: k */
    public final Integer f8241k;

    /* renamed from: com.cubic.umo.pass.model.TxDTO$a */
    public static final class C2258a implements Parcelable.Creator<TxDTO> {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            C24362h.m61211f(parcel, "parcel");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            TransactionType valueOf = TransactionType.valueOf(parcel.readString());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Money createFromParcel = parcel.readInt() == 0 ? null : Money.CREATOR.createFromParcel(parcel);
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TxDTO(readLong, readLong2, valueOf, valueOf2, createFromParcel, valueOf3, readString, readString2, bool, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public final Object[] newArray(int i) {
            return new TxDTO[i];
        }
    }

    public TxDTO(long j, long j2, TransactionType transactionType, Integer num, Money money, Integer num2, String str, String str2, @C12943g(name = "readerTimedOut") Boolean bool, Integer num3) {
        C24362h.m61211f(transactionType, "type");
        this.f8232b = j;
        this.f8233c = j2;
        this.f8234d = transactionType;
        this.f8235e = num;
        this.f8236f = money;
        this.f8237g = num2;
        this.f8238h = str;
        this.f8239i = str2;
        this.f8240j = bool;
        this.f8241k = num3;
    }

    public final TxDTO copy(long j, long j2, TransactionType transactionType, Integer num, Money money, Integer num2, String str, String str2, @C12943g(name = "readerTimedOut") Boolean bool, Integer num3) {
        TransactionType transactionType2 = transactionType;
        C24362h.m61211f(transactionType2, "type");
        return new TxDTO(j, j2, transactionType2, num, money, num2, str, str2, bool, num3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TxDTO)) {
            return false;
        }
        TxDTO txDTO = (TxDTO) obj;
        return this.f8232b == txDTO.f8232b && this.f8233c == txDTO.f8233c && this.f8234d == txDTO.f8234d && C24362h.m61206a(this.f8235e, txDTO.f8235e) && C24362h.m61206a(this.f8236f, txDTO.f8236f) && C24362h.m61206a(this.f8237g, txDTO.f8237g) && C24362h.m61206a(this.f8238h, txDTO.f8238h) && C24362h.m61206a(this.f8239i, txDTO.f8239i) && C24362h.m61206a(this.f8240j, txDTO.f8240j) && C24362h.m61206a(this.f8241k, txDTO.f8241k);
    }

    public final int hashCode() {
        long j = this.f8232b;
        long j2 = this.f8233c;
        int hashCode = (this.f8234d.hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        Integer num = this.f8235e;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Money money = this.f8236f;
        int hashCode3 = (hashCode2 + (money == null ? 0 : money.hashCode())) * 31;
        Integer num2 = this.f8237g;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f8238h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8239i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f8240j;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.f8241k;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TxDTO(txId=");
        k.append(this.f8232b);
        k.append(", ts=");
        k.append(this.f8233c);
        k.append(", type=");
        k.append(this.f8234d);
        k.append(", balance=");
        k.append(this.f8235e);
        k.append(", balanceMoney=");
        k.append(this.f8236f);
        k.append(", fare=");
        k.append(this.f8237g);
        k.append(", location=");
        k.append(this.f8238h);
        k.append(", description=");
        k.append(this.f8239i);
        k.append(", isReaderTimeOut=");
        k.append(this.f8240j);
        k.append(", millis=");
        k.append(this.f8241k);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeLong(this.f8232b);
        parcel.writeLong(this.f8233c);
        parcel.writeString(this.f8234d.name());
        Integer num = this.f8235e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num);
        }
        Money money = this.f8236f;
        if (money == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            money.writeToParcel(parcel, i);
        }
        Integer num2 = this.f8237g;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num2);
        }
        parcel.writeString(this.f8238h);
        parcel.writeString(this.f8239i);
        Boolean bool = this.f8240j;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num3 = this.f8241k;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num3);
        }
    }
}
