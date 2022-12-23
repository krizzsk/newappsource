package p437dg;

import com.appboy.support.StringUtils;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p359ag.C13447d;
import p359ag.C13450g;
import p359ag.C13451h;
import p359ag.C13452i;
import p359ag.C13454k;
import p359ag.C13457n;
import p359ag.C13458o;
import p359ag.C13459p;
import p384bg.C13622c;
import p509gg.C17189a;

/* renamed from: dg.o */
public final class C16626o {

    /* renamed from: A */
    public static final C16663s f43314A = new C16663s(Calendar.class, GregorianCalendar.class, new C16652s());

    /* renamed from: B */
    public static final C16661q f43315B = new C16661q(Locale.class, new C16653t());

    /* renamed from: C */
    public static final C16654u f43316C;

    /* renamed from: D */
    public static final C16664t f43317D;

    /* renamed from: E */
    public static final C16656w f43318E = new C16656w();

    /* renamed from: a */
    public static final C16661q f43319a = new C16661q(Class.class, new C13457n(new C16643k()));

    /* renamed from: b */
    public static final C16661q f43320b = new C16661q(BitSet.class, new C13457n(new C16655v()));

    /* renamed from: c */
    public static final C16659z f43321c = new C16659z();

    /* renamed from: d */
    public static final C16662r f43322d;

    /* renamed from: e */
    public static final C16662r f43323e = new C16662r(Byte.TYPE, Byte.class, new C16628a0());

    /* renamed from: f */
    public static final C16662r f43324f = new C16662r(Short.TYPE, Short.class, new C16630b0());

    /* renamed from: g */
    public static final C16662r f43325g = new C16662r(Integer.TYPE, Integer.class, new C16632c0());

    /* renamed from: h */
    public static final C16661q f43326h = new C16661q(AtomicInteger.class, new C13457n(new C16634d0()));

    /* renamed from: i */
    public static final C16661q f43327i = new C16661q(AtomicBoolean.class, new C13457n(new C16636e0()));

    /* renamed from: j */
    public static final C16661q f43328j = new C16661q(AtomicIntegerArray.class, new C13457n(new C16627a()));

    /* renamed from: k */
    public static final C16629b f43329k = new C16629b();

    /* renamed from: l */
    public static final C16631c f43330l = new C16631c();

    /* renamed from: m */
    public static final C16633d f43331m = new C16633d();

    /* renamed from: n */
    public static final C16661q f43332n = new C16661q(Number.class, new C16635e());

    /* renamed from: o */
    public static final C16662r f43333o = new C16662r(Character.TYPE, Character.class, new C16637f());

    /* renamed from: p */
    public static final C16640h f43334p = new C16640h();

    /* renamed from: q */
    public static final C16641i f43335q = new C16641i();

    /* renamed from: r */
    public static final C16661q f43336r;

    /* renamed from: s */
    public static final C16661q f43337s = new C16661q(StringBuilder.class, new C16642j());

    /* renamed from: t */
    public static final C16661q f43338t = new C16661q(StringBuffer.class, new C16644l());

    /* renamed from: u */
    public static final C16661q f43339u = new C16661q(URL.class, new C16645m());

    /* renamed from: v */
    public static final C16661q f43340v = new C16661q(URI.class, new C16646n());

    /* renamed from: w */
    public static final C16664t f43341w = new C16664t(InetAddress.class, new C16647o());

    /* renamed from: x */
    public static final C16661q f43342x = new C16661q(UUID.class, new C16648p());

    /* renamed from: y */
    public static final C16661q f43343y = new C16661q(Currency.class, new C13457n(new C16649q()));

    /* renamed from: z */
    public static final C16650r f43344z = new C16650r();

    /* renamed from: dg.o$a */
    public class C16627a extends C13458o<AtomicIntegerArray> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Exception) e);
                }
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            jsonWriter.beginArray();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value((long) atomicIntegerArray.get(i));
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: dg.o$a0 */
    public class C16628a0 extends C13458o<Number> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Byte.valueOf((byte) jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Exception) e);
            }
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) obj);
        }
    }

    /* renamed from: dg.o$b */
    public class C16629b extends C13458o<Number> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Exception) e);
            }
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) obj);
        }
    }

    /* renamed from: dg.o$b0 */
    public class C16630b0 extends C13458o<Number> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Short.valueOf((short) jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Exception) e);
            }
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) obj);
        }
    }

    /* renamed from: dg.o$c */
    public class C16631c extends C13458o<Number> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) obj);
        }
    }

    /* renamed from: dg.o$c0 */
    public class C16632c0 extends C13458o<Number> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Exception) e);
            }
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) obj);
        }
    }

    /* renamed from: dg.o$d */
    public class C16633d extends C13458o<Number> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) obj);
        }
    }

    /* renamed from: dg.o$d0 */
    public class C16634d0 extends C13458o<AtomicInteger> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            try {
                return new AtomicInteger(jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Exception) e);
            }
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((long) ((AtomicInteger) obj).get());
        }
    }

    /* renamed from: dg.o$e */
    public class C16635e extends C13458o<Number> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            int i = C16657x.f43348a[peek.ordinal()];
            if (i == 1 || i == 3) {
                return new LazilyParsedNumber(jsonReader.nextString());
            }
            if (i == 4) {
                jsonReader.nextNull();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + peek);
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) obj);
        }
    }

    /* renamed from: dg.o$e0 */
    public class C16636e0 extends C13458o<AtomicBoolean> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            return new AtomicBoolean(jsonReader.nextBoolean());
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value(((AtomicBoolean) obj).get());
        }
    }

    /* renamed from: dg.o$f */
    public class C16637f extends C13458o<Character> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            if (nextString.length() == 1) {
                return Character.valueOf(nextString.charAt(0));
            }
            throw new JsonSyntaxException(C25541a.m63881k("Expecting character, got: ", nextString));
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            Character ch = (Character) obj;
            if (ch == null) {
                str = null;
            } else {
                str = String.valueOf(ch);
            }
            jsonWriter.value(str);
        }
    }

    /* renamed from: dg.o$f0 */
    public static final class C16638f0<T extends Enum<T>> extends C13458o<T> {

        /* renamed from: a */
        public final HashMap f43345a = new HashMap();

        /* renamed from: b */
        public final HashMap f43346b = new HashMap();

        public C16638f0(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    C13622c cVar = (C13622c) cls.getField(name).getAnnotation(C13622c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String put : cVar.alternate()) {
                            this.f43345a.put(put, enumR);
                        }
                    }
                    this.f43345a.put(name, enumR);
                    this.f43346b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (Enum) this.f43345a.get(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            Enum enumR = (Enum) obj;
            if (enumR == null) {
                str = null;
            } else {
                str = (String) this.f43346b.get(enumR);
            }
            jsonWriter.value(str);
        }
    }

    /* renamed from: dg.o$g */
    public class C16639g extends C13458o<String> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            } else if (peek == JsonToken.BOOLEAN) {
                return Boolean.toString(jsonReader.nextBoolean());
            } else {
                return jsonReader.nextString();
            }
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((String) obj);
        }
    }

    /* renamed from: dg.o$h */
    public class C16640h extends C13458o<BigDecimal> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigDecimal(jsonReader.nextString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Exception) e);
            }
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) (BigDecimal) obj);
        }
    }

    /* renamed from: dg.o$i */
    public class C16641i extends C13458o<BigInteger> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigInteger(jsonReader.nextString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Exception) e);
            }
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Number) (BigInteger) obj);
        }
    }

    /* renamed from: dg.o$j */
    public class C16642j extends C13458o<StringBuilder> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuilder(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            StringBuilder sb = (StringBuilder) obj;
            if (sb == null) {
                str = null;
            } else {
                str = sb.toString();
            }
            jsonWriter.value(str);
        }
    }

    /* renamed from: dg.o$k */
    public class C16643k extends C13458o<Class> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            throw new UnsupportedOperationException(C13555b.m33969h((Class) obj, C13555b.m33972k("Attempted to serialize java.lang.Class: "), ". Forgot to register a type adapter?"));
        }
    }

    /* renamed from: dg.o$l */
    public class C16644l extends C13458o<StringBuffer> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuffer(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            StringBuffer stringBuffer = (StringBuffer) obj;
            if (stringBuffer == null) {
                str = null;
            } else {
                str = stringBuffer.toString();
            }
            jsonWriter.value(str);
        }
    }

    /* renamed from: dg.o$m */
    public class C16645m extends C13458o<URL> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
            } else {
                String nextString = jsonReader.nextString();
                if (!StringUtils.NULL_USER_ID_SUBSTITUTE_STRING.equals(nextString)) {
                    return new URL(nextString);
                }
            }
            return null;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            URL url = (URL) obj;
            if (url == null) {
                str = null;
            } else {
                str = url.toExternalForm();
            }
            jsonWriter.value(str);
        }
    }

    /* renamed from: dg.o$n */
    public class C16646n extends C13458o<URI> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
            } else {
                try {
                    String nextString = jsonReader.nextString();
                    if (!StringUtils.NULL_USER_ID_SUBSTITUTE_STRING.equals(nextString)) {
                        return new URI(nextString);
                    }
                } catch (URISyntaxException e) {
                    throw new JsonIOException((Exception) e);
                }
            }
            return null;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            URI uri = (URI) obj;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toASCIIString();
            }
            jsonWriter.value(str);
        }
    }

    /* renamed from: dg.o$o */
    public class C16647o extends C13458o<InetAddress> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return InetAddress.getByName(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            InetAddress inetAddress = (InetAddress) obj;
            if (inetAddress == null) {
                str = null;
            } else {
                str = inetAddress.getHostAddress();
            }
            jsonWriter.value(str);
        }
    }

    /* renamed from: dg.o$p */
    public class C16648p extends C13458o<UUID> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return UUID.fromString(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            UUID uuid = (UUID) obj;
            if (uuid == null) {
                str = null;
            } else {
                str = uuid.toString();
            }
            jsonWriter.value(str);
        }
    }

    /* renamed from: dg.o$q */
    public class C16649q extends C13458o<Currency> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            return Currency.getInstance(jsonReader.nextString());
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value(((Currency) obj).getCurrencyCode());
        }
    }

    /* renamed from: dg.o$r */
    public class C16650r implements C13459p {

        /* renamed from: dg.o$r$a */
        public class C16651a extends C13458o<Timestamp> {

            /* renamed from: a */
            public final /* synthetic */ C13458o f43347a;

            public C16651a(C13458o oVar) {
                this.f43347a = oVar;
            }

            /* renamed from: a */
            public final Object mo40320a(JsonReader jsonReader) throws IOException {
                Date date = (Date) this.f43347a.mo40320a(jsonReader);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* renamed from: b */
            public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
                this.f43347a.mo40321b(jsonWriter, (Timestamp) obj);
            }
        }

        /* renamed from: a */
        public final <T> C13458o<T> mo40360a(Gson gson, C17189a<T> aVar) {
            if (aVar.f44431a != Timestamp.class) {
                return null;
            }
            return new C16651a(gson.getAdapter(Date.class));
        }
    }

    /* renamed from: dg.o$s */
    public class C16652s extends C13458o<Calendar> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                String nextName = jsonReader.nextName();
                int nextInt = jsonReader.nextInt();
                if ("year".equals(nextName)) {
                    i = nextInt;
                } else if ("month".equals(nextName)) {
                    i2 = nextInt;
                } else if ("dayOfMonth".equals(nextName)) {
                    i3 = nextInt;
                } else if ("hourOfDay".equals(nextName)) {
                    i4 = nextInt;
                } else if ("minute".equals(nextName)) {
                    i5 = nextInt;
                } else if ("second".equals(nextName)) {
                    i6 = nextInt;
                }
            }
            jsonReader.endObject();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            Calendar calendar = (Calendar) obj;
            if (calendar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("year");
            jsonWriter.value((long) calendar.get(1));
            jsonWriter.name("month");
            jsonWriter.value((long) calendar.get(2));
            jsonWriter.name("dayOfMonth");
            jsonWriter.value((long) calendar.get(5));
            jsonWriter.name("hourOfDay");
            jsonWriter.value((long) calendar.get(11));
            jsonWriter.name("minute");
            jsonWriter.value((long) calendar.get(12));
            jsonWriter.name("second");
            jsonWriter.value((long) calendar.get(13));
            jsonWriter.endObject();
        }
    }

    /* renamed from: dg.o$t */
    public class C16653t extends C13458o<Locale> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            String str;
            String str2;
            String str3 = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            } else {
                str = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str3 = stringTokenizer.nextToken();
            }
            if (str2 == null && str3 == null) {
                return new Locale(str);
            }
            if (str3 == null) {
                return new Locale(str, str2);
            }
            return new Locale(str, str2, str3);
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            Locale locale = (Locale) obj;
            if (locale == null) {
                str = null;
            } else {
                str = locale.toString();
            }
            jsonWriter.value(str);
        }
    }

    /* renamed from: dg.o$u */
    public class C16654u extends C13458o<C13450g> {
        /* renamed from: c */
        public static C13450g m42215c(JsonReader jsonReader) throws IOException {
            switch (C16657x.f43348a[jsonReader.peek().ordinal()]) {
                case 1:
                    return new C13454k((Number) new LazilyParsedNumber(jsonReader.nextString()));
                case 2:
                    return new C13454k(Boolean.valueOf(jsonReader.nextBoolean()));
                case 3:
                    return new C13454k(jsonReader.nextString());
                case 4:
                    jsonReader.nextNull();
                    return C13451h.f33305b;
                case 5:
                    C13447d dVar = new C13447d();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        dVar.mo40327C(m42215c(jsonReader));
                    }
                    jsonReader.endArray();
                    return dVar;
                case 6:
                    C13452i iVar = new C13452i();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        iVar.mo40346C(m42215c(jsonReader), jsonReader.nextName());
                    }
                    jsonReader.endObject();
                    return iVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: d */
        public static void m42216d(C13450g gVar, JsonWriter jsonWriter) throws IOException {
            boolean z;
            if (gVar == null || (gVar instanceof C13451h)) {
                jsonWriter.nullValue();
            } else if (gVar instanceof C13454k) {
                C13454k x = gVar.mo40343x();
                Serializable serializable = x.f33307b;
                if (serializable instanceof Number) {
                    jsonWriter.value(x.mo40357C());
                } else if (serializable instanceof Boolean) {
                    jsonWriter.value(x.mo40333i());
                } else {
                    jsonWriter.value(x.mo40326B());
                }
            } else if (gVar instanceof C13447d) {
                jsonWriter.beginArray();
                Iterator<C13450g> it = gVar.mo40340s().iterator();
                while (it.hasNext()) {
                    m42216d(it.next(), jsonWriter);
                }
                jsonWriter.endArray();
            } else if (gVar instanceof C13452i) {
                jsonWriter.beginObject();
                LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                LinkedTreeMap.C14559e<K, V> eVar = linkedTreeMap.header.f36719e;
                int i = linkedTreeMap.modCount;
                while (true) {
                    LinkedTreeMap.C14559e<K, V> eVar2 = linkedTreeMap.header;
                    if (eVar != eVar2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        jsonWriter.endObject();
                        return;
                    } else if (eVar == eVar2) {
                        throw new NoSuchElementException();
                    } else if (linkedTreeMap.modCount == i) {
                        LinkedTreeMap.C14559e<K, V> eVar3 = eVar.f36719e;
                        jsonWriter.name((String) eVar.f36721g);
                        m42216d((C13450g) eVar.f36722h, jsonWriter);
                        eVar = eVar3;
                    } else {
                        throw new ConcurrentModificationException();
                    }
                }
            } else {
                StringBuilder k = C13555b.m33972k("Couldn't write ");
                k.append(gVar.getClass());
                throw new IllegalArgumentException(k.toString());
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo40320a(JsonReader jsonReader) throws IOException {
            return m42215c(jsonReader);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            m42216d((C13450g) obj, jsonWriter);
        }
    }

    /* renamed from: dg.o$v */
    public class C16655v extends C13458o<BitSet> {
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
            if (r7.nextInt() != 0) goto L_0x005d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0062 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo40320a(com.google.gson.stream.JsonReader r7) throws java.io.IOException {
            /*
                r6 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r7.beginArray()
                com.google.gson.stream.JsonToken r1 = r7.peek()
                r2 = 0
            L_0x000d:
                com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.END_ARRAY
                if (r1 == r3) goto L_0x0069
                int[] r3 = p437dg.C16626o.C16657x.f43348a
                int r4 = r1.ordinal()
                r3 = r3[r4]
                r4 = 1
                if (r3 == r4) goto L_0x0055
                r5 = 2
                if (r3 == r5) goto L_0x0050
                r5 = 3
                if (r3 != r5) goto L_0x0039
                java.lang.String r1 = r7.nextString()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x002d }
                if (r1 == 0) goto L_0x005c
                goto L_0x005d
            L_0x002d:
                com.google.gson.JsonSyntaxException r7 = new com.google.gson.JsonSyntaxException
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = p379.C25541a.m63881k(r0, r1)
                r7.<init>((java.lang.String) r0)
                throw r7
            L_0x0039:
                com.google.gson.JsonSyntaxException r7 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>((java.lang.String) r0)
                throw r7
            L_0x0050:
                boolean r4 = r7.nextBoolean()
                goto L_0x005d
            L_0x0055:
                int r1 = r7.nextInt()
                if (r1 == 0) goto L_0x005c
                goto L_0x005d
            L_0x005c:
                r4 = 0
            L_0x005d:
                if (r4 == 0) goto L_0x0062
                r0.set(r2)
            L_0x0062:
                int r2 = r2 + 1
                com.google.gson.stream.JsonToken r1 = r7.peek()
                goto L_0x000d
            L_0x0069:
                r7.endArray()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p437dg.C16626o.C16655v.mo40320a(com.google.gson.stream.JsonReader):java.lang.Object");
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            BitSet bitSet = (BitSet) obj;
            jsonWriter.beginArray();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value(bitSet.get(i) ? 1 : 0);
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: dg.o$w */
    public class C16656w implements C13459p {
        /* renamed from: a */
        public final <T> C13458o<T> mo40360a(Gson gson, C17189a<T> aVar) {
            Class<Enum> cls = Enum.class;
            Class cls2 = aVar.f44431a;
            if (!cls.isAssignableFrom(cls2) || cls2 == cls) {
                return null;
            }
            if (!cls2.isEnum()) {
                cls2 = cls2.getSuperclass();
            }
            return new C16638f0(cls2);
        }
    }

    /* renamed from: dg.o$x */
    public static /* synthetic */ class C16657x {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43348a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43348a = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43348a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43348a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43348a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f43348a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f43348a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f43348a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f43348a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f43348a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f43348a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p437dg.C16626o.C16657x.<clinit>():void");
        }
    }

    /* renamed from: dg.o$y */
    public class C16658y extends C13458o<Boolean> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            } else if (peek == JsonToken.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
            } else {
                return Boolean.valueOf(jsonReader.nextBoolean());
            }
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            jsonWriter.value((Boolean) obj);
        }
    }

    /* renamed from: dg.o$z */
    public class C16659z extends C13458o<Boolean> {
        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Boolean.valueOf(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
            } else {
                str = bool.toString();
            }
            jsonWriter.value(str);
        }
    }

    static {
        C16658y yVar = new C16658y();
        f43322d = new C16662r(Boolean.TYPE, Boolean.class, yVar);
        C16639g gVar = new C16639g();
        f43336r = new C16661q(String.class, gVar);
        C16654u uVar = new C16654u();
        f43316C = uVar;
        f43317D = new C16664t(C13450g.class, uVar);
    }
}
