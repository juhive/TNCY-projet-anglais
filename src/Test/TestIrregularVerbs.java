package Test;

import java.io.IOException;
import java.util.ArrayList;

import Tools.IrregularVerbs;
import Tools.Quintuplet;

public class TestIrregularVerbs {
	
	 public static void main(String[] args) throws IOException {
		ArrayList<Quintuplet> iv = (new IrregularVerbs()).getIrregularVerbs();
		
		for (int i=0;i<iv.size();i++) {
			System.out.println(i + " " +(iv.get(i)).getVb() + " " +(iv.get(i)).getT1());
		}
	}

}
