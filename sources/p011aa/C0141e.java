package p011aa;

import com.google.android.exoplayer2.metadata.Metadata;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import mf0.C24362h;
import p326ya.C7354a;
import p326ya.C7357c;
import p404ce.C13786c;
import p583jk.C17875h;
import p906wz.C20431c;
import p906wz.C20437h;
import p956ze.C20839b;

/* renamed from: aa.e */
public abstract class C0141e implements C13786c, C20437h, C7354a {
    /* renamed from: a */
    public void mo313a(C20431c cVar, boolean z) {
    }

    /* renamed from: b */
    public Object mo314b(Class cls) {
        C20839b h = mo40719h(cls);
        if (h == null) {
            return null;
        }
        return h.get();
    }

    /* renamed from: c */
    public boolean mo315c(C20431c cVar, ServerException serverException) {
        return true;
    }

    /* renamed from: d */
    public boolean mo316d(C20431c cVar, IOException iOException) {
        return true;
    }

    /* renamed from: f */
    public Set mo317f(Class cls) {
        return (Set) mo40718e(cls).get();
    }

    /* renamed from: g */
    public Metadata mo318g(C7357c cVar) {
        boolean z;
        ByteBuffer byteBuffer = cVar.f13647d;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        if (cVar.mo21175g()) {
            return null;
        }
        return mo321m(cVar, byteBuffer);
    }

    /* renamed from: i */
    public boolean mo319i(C20431c cVar, IOException iOException) {
        return true;
    }

    /* renamed from: l */
    public abstract void mo320l(CallableMemberDescriptor callableMemberDescriptor);

    /* renamed from: m */
    public abstract Metadata mo321m(C7357c cVar, ByteBuffer byteBuffer);

    /* renamed from: n */
    public abstract void mo322n(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    /* renamed from: o */
    public void mo323o(CallableMemberDescriptor callableMemberDescriptor, Collection collection) {
        C24362h.m61211f(callableMemberDescriptor, "member");
        callableMemberDescriptor.mo53416I0(collection);
    }
}
