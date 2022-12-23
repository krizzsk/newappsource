package p094g5;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.appboy.support.ValidationUtils;
import java.io.IOException;
import java.util.ArrayList;
import p059d5.C4371c;
import p107h5.C5058f;

/* renamed from: g5.o */
public final class C4818o implements C4814k0<C4371c> {

    /* renamed from: a */
    public int f16225a;

    public C4818o(int i) {
        this.f16225a = i;
    }

    /* renamed from: a */
    public final Object mo20314a(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        int i;
        C4371c cVar;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (jsonReader.mo6824B() == JsonReader.Token.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.mo6830e();
        }
        while (jsonReader.mo6835v()) {
            arrayList.add(Float.valueOf((float) jsonReader.mo6837x()));
        }
        if (z) {
            jsonReader.mo6832q();
        }
        if (this.f16225a == -1) {
            this.f16225a = arrayList.size() / 4;
        }
        int i4 = this.f16225a;
        float[] fArr = new float[i4];
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = this.f16225a * 4;
            if (i5 >= i) {
                break;
            }
            int i8 = i5 / 4;
            double floatValue = (double) ((Float) arrayList.get(i5)).floatValue();
            int i9 = i5 % 4;
            if (i9 == 0) {
                if (i8 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i8 - 1] >= f2) {
                        fArr[i8] = f2 + 0.01f;
                    }
                }
                fArr[i8] = (float) floatValue;
            } else if (i9 == 1) {
                i6 = (int) (floatValue * 255.0d);
            } else if (i9 == 2) {
                i7 = (int) (floatValue * 255.0d);
            } else if (i9 == 3) {
                iArr[i8] = Color.argb(ValidationUtils.APPBOY_STRING_MAX_LENGTH, i6, i7, (int) (floatValue * 255.0d));
            }
            i5++;
        }
        C4371c cVar2 = new C4371c(fArr, iArr);
        if (arrayList.size() > i) {
            int size = (arrayList.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i11 = 0;
            while (i < arrayList.size()) {
                if (i % 2 == 0) {
                    dArr[i11] = (double) ((Float) arrayList.get(i)).floatValue();
                } else {
                    dArr2[i11] = (double) ((Float) arrayList.get(i)).floatValue();
                    i11++;
                }
                i++;
            }
            while (true) {
                int[] iArr2 = cVar2.f15373b;
                if (i3 >= iArr2.length) {
                    break;
                }
                int i12 = iArr2[i3];
                double d = (double) cVar2.f15372a[i3];
                int i13 = 1;
                while (true) {
                    if (i13 >= size) {
                        cVar = cVar2;
                        i2 = (int) (dArr2[size - 1] * 255.0d);
                        break;
                    }
                    int i14 = i13 - 1;
                    double d2 = dArr[i14];
                    double d3 = dArr[i13];
                    if (d3 >= d) {
                        double d4 = (d - d2) / (d3 - d2);
                        cVar = cVar2;
                        PointF pointF = C5058f.f17056a;
                        double max = Math.max(0.0d, Math.min(1.0d, d4));
                        double d5 = dArr2[i14];
                        i2 = (int) ((((dArr2[i13] - d5) * max) + d5) * 255.0d);
                        break;
                    }
                    C4371c cVar3 = cVar2;
                    i13++;
                }
                int argb = Color.argb(i2, Color.red(i12), Color.green(i12), Color.blue(i12));
                C4371c cVar4 = cVar;
                cVar4.f15373b[i3] = argb;
                i3++;
                cVar2 = cVar4;
            }
        }
        return cVar2;
    }
}
