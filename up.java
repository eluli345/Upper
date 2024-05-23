package pruebas;

public class up {
	
	public String upper(String a) {
		
		String txt = a;
        StringBuilder r = new StringBuilder();

        boolean startWord = true;

        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);

            if (startWord && Character.isLetter(c)) {
                r.append(Character.toUpperCase(c));
                startWord = false;
            } else {
                r.append(Character.toLowerCase(c));
            }

            if (c == ' ' || c == ',' || c == '.') {
                startWord = true;
            }
        }

        String text = r.toString();
		
		return text;
	}
	
	
}
