package corbaObjects.scs;

/**
 * corbaObjects/scs/PropertySeqHelper.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from deployment.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min28s BRST
 */

abstract public class PropertySeqHelper {
	private static String _id = "IDL:corbaObjects/scs/PropertySeq:1.0";

	public static void insert(org.omg.CORBA.Any a,
			corbaObjects.scs.Property[] that) {
		org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
		a.type(type());
		write(out, that);
		a.read_value(out.create_input_stream(), type());
	}

	public static corbaObjects.scs.Property[] extract(org.omg.CORBA.Any a) {
		return read(a.create_input_stream());
	}

	private static org.omg.CORBA.TypeCode __typeCode = null;

	synchronized public static org.omg.CORBA.TypeCode type() {
		if (__typeCode == null) {
			__typeCode = corbaObjects.scs.PropertyHelper.type();
			__typeCode = org.omg.CORBA.ORB.init().create_sequence_tc(0,
					__typeCode);
			__typeCode = org.omg.CORBA.ORB.init().create_alias_tc(
					corbaObjects.scs.PropertySeqHelper.id(), "PropertySeq",
					__typeCode);
		}
		return __typeCode;
	}

	public static String id() {
		return _id;
	}

	public static corbaObjects.scs.Property[] read(
			org.omg.CORBA.portable.InputStream istream) {
		corbaObjects.scs.Property value[] = null;
		int _len0 = istream.read_long();
		value = new corbaObjects.scs.Property[_len0];
		for (int _o1 = 0; _o1 < value.length; ++_o1)
			value[_o1] = corbaObjects.scs.PropertyHelper.read(istream);
		return value;
	}

	public static void write(org.omg.CORBA.portable.OutputStream ostream,
			corbaObjects.scs.Property[] value) {
		ostream.write_long(value.length);
		for (int _i0 = 0; _i0 < value.length; ++_i0)
			corbaObjects.scs.PropertyHelper.write(ostream, value[_i0]);
	}

}