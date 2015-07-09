package evm;

public class EVotingMachine {
	
	    BallotingUnit Bu;
		ControlUnit Cu;
		private BallotingUnit Bu;
		private ControlUnit Cu;
	 	
	 	public EVotingMachine() {
			Bu = new BallotingUnit();
	 		Cu = new ControlUnit();
	 	}
		
		public void EVservice(Voter v,CandidateList cl) {
			Bu = new BallotingUnit(cl);
			Bu.useBallot();
		}

}
