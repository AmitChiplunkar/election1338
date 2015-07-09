package evm;

import java.util.ArrayList;

public class VoterList {
	ArrayList<Voter> vlist = new ArrayList<Voter>();
	
	 	
	 		
	  public VoterList(){
	 		vlist.add(new Voter("Amit"));
	  }
		
		public ArrayList<Voter> getVlist() {
			return vlist;
		}
}
