package rg0;

import cf0.C21136j;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.C23825c;
import mf0.C24362h;
import rf0.C24805g;
import rf0.C24806h;
import sg0.C24871a;

/* renamed from: rg0.a */
public final class C24810a extends C24871a {

    /* renamed from: f */
    public static final C24810a f62743f = new C24810a(1, 0, 7);

    /* renamed from: rg0.a$a */
    public static final class C24811a {
        /* renamed from: a */
        public static C24810a m62340a(InputStream inputStream) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            C24806h hVar = new C24806h(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(C21136j.m49436X(hVar, 10));
            C24805g p = hVar.iterator();
            while (p.f62733d) {
                p.nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] J0 = C23825c.m58498J0(arrayList);
            return new C24810a(Arrays.copyOf(J0, J0.length));
        }
    }

    static {
        new C24810a(new int[0]);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24810a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        C24362h.m61211f(iArr, "numbers");
    }
}
