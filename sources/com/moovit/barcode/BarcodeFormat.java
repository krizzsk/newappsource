package com.moovit.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import p810sz.C19577c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003HÖ\u0001j\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, mo59060d2 = {"Lcom/moovit/barcode/BarcodeFormat;", "", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "AZTEC", "CODABAR", "CODE_39", "CODE_93", "CODE_128", "DATA_MATRIX", "EAN_8", "EAN_13", "ITF", "PDF_417", "QR_CODE", "UPC_A", "UPC_E", "Barcode_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public enum BarcodeFormat implements Parcelable {
    AZTEC,
    CODABAR,
    CODE_39,
    CODE_93,
    CODE_128,
    DATA_MATRIX,
    EAN_8,
    EAN_13,
    ITF,
    PDF_417,
    QR_CODE,
    UPC_A,
    UPC_E;
    
    /* access modifiers changed from: private */
    public static final C19577c<BarcodeFormat> CODER = null;
    public static final Parcelable.Creator<BarcodeFormat> CREATOR = null;
    public static final C15679a Companion = null;

    /* renamed from: com.moovit.barcode.BarcodeFormat$a */
    public static final class C15679a {
    }

    /* renamed from: com.moovit.barcode.BarcodeFormat$b */
    public static final class C15680b implements Parcelable.Creator<BarcodeFormat> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return BarcodeFormat.valueOf(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new BarcodeFormat[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        BarcodeFormat barcodeFormat;
        BarcodeFormat barcodeFormat2;
        BarcodeFormat barcodeFormat3;
        BarcodeFormat barcodeFormat4;
        BarcodeFormat barcodeFormat5;
        BarcodeFormat barcodeFormat6;
        BarcodeFormat barcodeFormat7;
        BarcodeFormat barcodeFormat8;
        BarcodeFormat barcodeFormat9;
        BarcodeFormat barcodeFormat10;
        BarcodeFormat barcodeFormat11;
        BarcodeFormat barcodeFormat12;
        BarcodeFormat barcodeFormat13;
        Companion = new C15679a();
        CREATOR = new C15680b();
        CODER = new C19577c<>(BarcodeFormat.class, barcodeFormat, barcodeFormat2, barcodeFormat3, barcodeFormat4, barcodeFormat5, barcodeFormat6, barcodeFormat7, barcodeFormat8, barcodeFormat9, barcodeFormat10, barcodeFormat11, barcodeFormat12, barcodeFormat13);
    }

    public static final C19577c<BarcodeFormat> getCODER() {
        Companion.getClass();
        return CODER;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(name());
    }
}
