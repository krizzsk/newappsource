package p40;

import android.content.Context;
import android.graphics.PointF;
import com.bumptech.glide.Priority;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.image.C16028g;
import com.moovit.image.glide.data.ImageData;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.common.MVImageType;
import java.io.DataInputStream;
import java.io.IOException;
import l40.C5605d;
import p583jk.C17884p;
import r10.C19220d;
import s00.C19393f;
import v00.C20062a;

/* renamed from: p40.h */
public final class C6075h extends C6071e {
    public C6075h() {
        super(16);
    }

    /* renamed from: q */
    public final C20062a mo22056q(C19393f fVar) {
        return fVar.f49342p;
    }

    /* renamed from: s */
    public final void mo22057s(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase, C5605d dVar) throws IOException {
        DataInputStream a = dVar.mo21433a("images.dat");
        int readInt = a.readInt();
        for (int i = 0; i < readInt; i++) {
            int readInt2 = a.readInt();
            byte readByte = a.readByte();
            float readFloat = a.readFloat();
            float readFloat2 = a.readFloat();
            int readInt3 = a.readInt();
            ServerId serverId2 = new ServerId(readInt2);
            ImageData.Format c = C16028g.m40825c(MVImageType.findByValue(readByte));
            PointF pointF = new PointF(readFloat, readFloat2);
            byte[] bArr = new byte[readInt3];
            a.readFully(bArr, 0, readInt3);
            ((C19220d) C17884p.m44353X(context).mo51641u().mo10855Y(new ImageData(serverId2, c, bArr, pointF))).mo22740y(Priority.HIGH).mo10862d0();
        }
    }
}
