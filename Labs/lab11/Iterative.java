public class Iterative {

	public BitList complement( BitList in ) {
		String s = in.toString();
		if (s == "") {
			throw new IllegalArgumentException();
		}
		String s2 = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				s2 = s2 + "0";
			} else if (s.charAt(i) == '0') {
				s2 = s2 +"1";
			}
		}

		return new BitList(s2);
	}

	public BitList or( BitList a, BitList b ) {
		if (a.iterator().hasNext() == false) {
			throw new IllegalArgumentException();
		}
		String sa = a.toString();
		if (sa == "0") {
			throw new IllegalArgumentException();
		}
		String sb = b.toString();
		if (sb == "0") {
			throw new IllegalArgumentException();
		}
		if (sb.length() != sa.length()) {
			throw new IllegalArgumentException();
		}
		String sReturn = "";

		for (int i = 0; i < sa.length(); i++) {
			if (sa.charAt(i) == '1' || sb.charAt(i) == '1') {
				sReturn = sReturn + "1";
			} else {
				sReturn = sReturn +"0";
			}
		}

		return new BitList(sReturn);
	}

	public BitList and( BitList a, BitList b ) {
		if (a.iterator().hasNext() == false) {
			throw new IllegalArgumentException();
		}
		String sa = a.toString();
		if (sa == "0") {
			throw new IllegalArgumentException();
		}
		String sb = b.toString();
		if (sb == "0") {
			throw new IllegalArgumentException();
		}
		if (sb.length() != sa.length()) {
			throw new IllegalArgumentException();
		}
		String sReturn = "";

		for (int i = 0; i < sa.length(); i++) {
			if (sa.charAt(i) == '1' && sb.charAt(i) == '1') {
				sReturn = sReturn + "1";
			} else {
				sReturn = sReturn +"0";
			}
		}

		return new BitList(sReturn);
	}

	public BitList xor( BitList a, BitList b ) {
		if (a.iterator().hasNext() == false) {
			throw new IllegalArgumentException();
		}
		String sa = a.toString();
		if (sa == "0") {
			throw new IllegalArgumentException();
		}
		String sb = b.toString();
		if (sb == "0") {
			throw new IllegalArgumentException();
		}
		if (sb.length() != sa.length()) {
			throw new IllegalArgumentException();
		}
		String sReturn = "";

		for (int i = 0; i < sa.length(); i++) {
			if (sa.charAt(i) !=  sb.charAt(i)) {
				sReturn = sReturn + "1";
			} else {
				sReturn = sReturn +"0";
			}
		}

		return new BitList(sReturn);
	}
}