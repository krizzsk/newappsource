package tf0;

import hg0.C23479o;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import jh0.C23730d;
import jh0.C23733g;
import kotlin.reflect.jvm.internal.C23863e;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.text.C24179b;
import kotlin.text.Regex;
import mf0.C24362h;
import p584jl.C17885a;
import qg0.C24746g;
import sg0.C24876c;
import sg0.C24879e;
import tg0.C24985d;
import tg0.C24991g;
import ug0.C25069e;
import ug0.C25070f;
import zf0.C25442g;
import zf0.C25455m;
import zf0.C25486u;
import zf0.C25491z;

/* renamed from: tf0.b */
public abstract class C24962b {

    /* renamed from: tf0.b$a */
    public static final class C24963a extends C24962b {

        /* renamed from: a */
        public final Field f63096a;

        public C24963a(Field field) {
            C24362h.m61211f(field, "field");
            this.f63096a = field;
        }

        /* renamed from: a */
        public final String mo61523a() {
            StringBuilder sb = new StringBuilder();
            String name = this.f63096a.getName();
            C24362h.m61210e(name, "field.name");
            sb.append(C23479o.m57578a(name));
            sb.append("()");
            Class<?> type = this.f63096a.getType();
            C24362h.m61210e(type, "field.type");
            sb.append(ReflectClassUtilKt.m58950b(type));
            return sb.toString();
        }
    }

    /* renamed from: tf0.b$b */
    public static final class C24964b extends C24962b {

        /* renamed from: a */
        public final Method f63097a;

        /* renamed from: b */
        public final Method f63098b;

        public C24964b(Method method, Method method2) {
            C24362h.m61211f(method, "getterMethod");
            this.f63097a = method;
            this.f63098b = method2;
        }

        /* renamed from: a */
        public final String mo61523a() {
            return C23863e.m58668a(this.f63097a);
        }
    }

    /* renamed from: tf0.b$c */
    public static final class C24965c extends C24962b {

        /* renamed from: a */
        public final C25491z f63099a;

        /* renamed from: b */
        public final ProtoBuf$Property f63100b;

        /* renamed from: c */
        public final JvmProtoBuf.JvmPropertySignature f63101c;

        /* renamed from: d */
        public final C24876c f63102d;

        /* renamed from: e */
        public final C24879e f63103e;

        /* renamed from: f */
        public final String f63104f;

        public C24965c(C25491z zVar, ProtoBuf$Property protoBuf$Property, JvmProtoBuf.JvmPropertySignature jvmPropertySignature, C24876c cVar, C24879e eVar) {
            String str;
            String str2;
            String str3;
            C24362h.m61211f(protoBuf$Property, "proto");
            C24362h.m61211f(cVar, "nameResolver");
            C24362h.m61211f(eVar, "typeTable");
            this.f63099a = zVar;
            this.f63100b = protoBuf$Property;
            this.f63101c = jvmPropertySignature;
            this.f63102d = cVar;
            this.f63103e = eVar;
            if (jvmPropertySignature.mo59947s()) {
                str = C24362h.m61216k(cVar.getString(jvmPropertySignature.mo59942m().mo59933h()), cVar.getString(jvmPropertySignature.mo59942m().mo59934i()));
            } else {
                C24985d.C24986a b = C24991g.m62699b(protoBuf$Property, cVar, eVar, true);
                if (b != null) {
                    String str4 = b.f63123a;
                    String str5 = b.f63124b;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C23479o.m57578a(str4));
                    C25442g b2 = zVar.mo53399b();
                    C24362h.m61210e(b2, "descriptor.containingDeclaration");
                    if (!C24362h.m61206a(zVar.mo53429g(), C25455m.f63743d) || !(b2 instanceof DeserializedClassDescriptor)) {
                        if (C24362h.m61206a(zVar.mo53429g(), C25455m.f63740a) && (b2 instanceof C25486u)) {
                            C23730d dVar = ((C23733g) zVar).f59945E;
                            if (dVar instanceof C24746g) {
                                C24746g gVar = (C24746g) dVar;
                                if (gVar.f62645c != null) {
                                    String d = gVar.f62644b.mo53547d();
                                    C24362h.m61210e(d, "className.internalName");
                                    str2 = C24362h.m61216k(C25069e.m62820i(C24179b.m60581c0(d, '/')).mo61604f(), "$");
                                }
                            }
                        }
                        str2 = "";
                    } else {
                        ProtoBuf$Class protoBuf$Class = ((DeserializedClassDescriptor) b2).f61260f;
                        GeneratedMessageLite.C24069e<ProtoBuf$Class, Integer> eVar2 = JvmProtoBuf.f61007i;
                        C24362h.m61210e(eVar2, "classModuleName");
                        Integer num = (Integer) C17885a.m44423T(protoBuf$Class, eVar2);
                        if (num == null) {
                            str3 = "main";
                        } else {
                            str3 = cVar.getString(num.intValue());
                        }
                        Regex regex = C25070f.f63265a;
                        C24362h.m61211f(str3, "name");
                        str2 = C24362h.m61216k(C25070f.f63265a.mo60284c(str3, "_"), "$");
                    }
                    str = C13715c.m34245k(sb, str2, "()", str5);
                } else {
                    throw new KotlinReflectionInternalError(C24362h.m61216k(zVar, "No field signature for property: "));
                }
            }
            this.f63104f = str;
        }

        /* renamed from: a */
        public final String mo61523a() {
            return this.f63104f;
        }
    }

    /* renamed from: tf0.b$d */
    public static final class C24966d extends C24962b {

        /* renamed from: a */
        public final JvmFunctionSignature.C23838c f63105a;

        /* renamed from: b */
        public final JvmFunctionSignature.C23838c f63106b;

        public C24966d(JvmFunctionSignature.C23838c cVar, JvmFunctionSignature.C23838c cVar2) {
            this.f63105a = cVar;
            this.f63106b = cVar2;
        }

        /* renamed from: a */
        public final String mo61523a() {
            return this.f63105a.f60203b;
        }
    }

    /* renamed from: a */
    public abstract String mo61523a();
}
