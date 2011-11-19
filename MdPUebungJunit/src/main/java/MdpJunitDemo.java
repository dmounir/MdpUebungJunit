
public class MdpJunitDemo implements IMdpJunitDemo {

	@Override
	public boolean isEmpty(String s) {
		return (s == null || s.isEmpty()) ;
		
	}

	@Override
	public String capitalize(String s) {
		StringBuilder o = new StringBuilder("");
		if (s.length() > 0) {
			o.append(s.substring(0,1).toUpperCase());
		}
		if (s.length() > 1) {
			o.append(s.substring(1).toLowerCase());
		}
		return o.toString();
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		StringBuilder o = new StringBuilder();
		for (int i = s.length() - 1 ; i >= 0 ; i--) {
			o.append(s.substring(i, i+1));
			
		}
		return o.toString();
	}

	@Override
	public String join(String... strings) {
		StringBuilder o = new StringBuilder();
		o.append(strings[0]);
		for (int i = 1; i < strings.length; i++) {
			o.append(" ");
			o.append(strings[i]);
			
		}
		return o.toString();
	}

}
