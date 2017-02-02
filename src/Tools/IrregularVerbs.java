package Tools;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IrregularVerbs {
	
	public ArrayList<Quintuplet> irregularVerbs = new ArrayList<Quintuplet>();
	//private Quintuplet iVerb = new Quintuplet(null,null,null,null,null);
	private File file;
	
	
	public IrregularVerbs() throws IOException {
		
		this.file = new File("/Users/isabellepolizzi/Desktop/TelecomNancy/English/IrregularVerbs.csv");
		
		Scanner s = new Scanner(file);
		String line = s.next();
		
		while (s.hasNextLine())  {
			
			//System.out.println(line);
			Quintuplet iVerb = new Quintuplet(null,null,null,null,null);
			Scanner sc = new Scanner(line);
			sc.useDelimiter(";");
			
			String verb = sc.next();
			iVerb.setVb(verb); // Verbal Base
			verb = sc.next();
			iVerb.setPtr(verb); // Preterit
			verb = sc.next();
			iVerb.setPp(verb); // Past participle
			verb = sc.next();
			iVerb.setT1(verb); // Translation 
			verb = sc.next();
			iVerb.setT2(verb); // Other translation (if exists)
			
			/*if (iVerb.getT2() != null) {
				System.out.println("Verbal base : " + iVerb.getVb() + "\nPreterit : " + iVerb.getPtr() + "\nPast participle : " + iVerb.getPp() + "\nTranslation : " + iVerb.getT1() + ", " + iVerb.getT2() +"\n");
			} else {
				System.out.println("Verbal base : " + iVerb.getVb() + "\nPreterit : " + iVerb.getPtr() + "\nPast participle : " + iVerb.getPp() + "\nTranslation : " + iVerb.getT1() +"\n");
			}*/

			irregularVerbs.add(iVerb);
			
			line = s.next();
			sc.close();
		}
		
		s.close();
	}


	public ArrayList<Quintuplet> getIrregularVerbs() {
		return irregularVerbs;
	}	
	
}
