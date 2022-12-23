package k40;

import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import com.moovit.network.request.UnexpectedInterlocutorException;
import j40.C5384a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.text.ParseException;
import org.apache.thrift.TBase;
import p977zz.C20951m;
import vi0.C25111a;
import vi0.C25114d;
import vi0.C25121g;
import xi0.C25276a;

/* renamed from: k40.c */
public final class C5479c {
    /* renamed from: a */
    public static C25121g m13664a(HttpURLConnection httpURLConnection, InputStream inputStream) throws IOException, BadResponseException, ServerException {
        return m13665b(new C25276a(inputStream), httpURLConnection.getContentType(), httpURLConnection, false);
    }

    /* renamed from: b */
    public static C25121g m13665b(C25276a aVar, String str, HttpURLConnection httpURLConnection, boolean z) throws BadResponseException, ServerException {
        try {
            C20951m c = C20951m.m49061c(str);
            if (c != null && c.mo53025b("application/octet")) {
                return new C25111a(aVar);
            }
            if (c != null && c.mo53025b("application/json")) {
                return new C25114d(aVar);
            }
            if (z) {
                throw new ApplicationBugException("Attempting to send thrift data with content type " + c);
            } else if (httpURLConnection.getHeaderField("SERVER_SEND_TIME") == null) {
                throw new UnexpectedInterlocutorException("Unexpected Content-Type " + c + " and missing SERVER_SEND_TIME header");
            } else {
                throw new BadResponseException("Unrecognized Content-Type: " + c);
            }
        } catch (ParseException e) {
            throw new BadResponseException((Exception) e);
        }
    }

    /* renamed from: c */
    public static int m13666c(C5384a aVar) {
        return aVar.getServerId().f15142b;
    }

    /* renamed from: d */
    public static short m13667d(ServerId serverId) {
        int i = serverId.f15142b;
        if (i <= 32767 && i >= -32768) {
            return (short) i;
        }
        throw new IllegalArgumentException(C16759e.m42349e("The given server id is not short: ", i));
    }

    /* renamed from: e */
    public static String m13668e(TBase<?, ?> tBase) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
            tBase.mo25202X0(new C25114d(new C25276a((OutputStream) byteArrayOutputStream)));
            return byteArrayOutputStream.toString("UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
