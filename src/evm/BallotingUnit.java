package evm;

import java.util.ArrayList;

public class BallotingUnit {
	Lamp readylamp,candidatelamp;
		CandidateButton cb;
		ArrayList<CandidateButton> cb = new ArrayList<CandidateButton>();
	 	BallotPaperScreen Bps;
	 	
		public BallotingUnit(CandidateList cl) {
	 		readylamp = new BollatReadyLamp();
	 		candidatelamp = new BallotCandidateLamp();
			for(int i=0;i<cl.allCL.size();i++){
				cb.add(cl.allCL.get(i));
			}
	 		cb = new CandidateButton();
	 		Bps = new BallotPaperScreen();
	 	}
		
		public void useBallot() {
			
			
		}
}
