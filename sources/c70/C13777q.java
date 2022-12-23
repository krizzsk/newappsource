package c70;

import c70.C13777q;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import k40.C5479c;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;
import p906wz.C20431c;
import vi0.C25121g;

/* renamed from: c70.q */
public abstract class C13777q<RS extends C13777q<RS, T, R>, T extends TBase<?, ?>, R> extends C13773n<RS> {

    /* renamed from: f */
    public final Class<T> f33920f;

    /* renamed from: g */
    public ArrayList f33921g;

    public C13777q(Class<T> cls) {
        this.f33920f = cls;
    }

    /* renamed from: b */
    public final void mo5817b(C20431c cVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        C13772m mVar = (C13772m) cVar;
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        int readInt = dataInputStream.readInt();
        C25121g a = C5479c.m13664a(httpURLConnection, dataInputStream);
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i < readInt) {
            try {
                TBase tBase = (TBase) this.f33920f.newInstance();
                tBase.mo25201C1(a);
                arrayList.add(mo40535e(tBase));
                i++;
            } catch (TTransportException e) {
                throw new IOException(e);
            } catch (TException e2) {
                throw new BadResponseException((Exception) e2);
            } catch (IllegalAccessException e3) {
                StringBuilder k = C13555b.m33972k("Unable to access ");
                k.append(this.f33920f);
                throw new ApplicationBugException(k.toString(), e3);
            } catch (InstantiationException e4) {
                StringBuilder k2 = C13555b.m33972k("Unable to instantiate ");
                k2.append(this.f33920f);
                throw new ApplicationBugException(k2.toString(), e4);
            }
        }
        this.f33921g = arrayList;
    }

    /* renamed from: e */
    public abstract R mo40535e(T t) throws BadResponseException;
}
