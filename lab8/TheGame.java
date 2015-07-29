
public class TheGame {
    //Authors Mohammed Ibrahim And Hugo Sanchez

	// Notice that the Game does not know about the GUI interface to the game
	
	private int howManyPushed = 0;
	private int limit;
	private String doneMessage = null;
    private String extraMessage=null;
	
	public TheGame(int i) {
		limit = i;
	}

	public void badSpot() {
		doneMessage = "You clicked and You Lose - Loser!";
	}
	
	public void spot() {
		howManyPushed++;
		if (howManyPushed == limit)
			doneMessage = "Curses, you win";
	
	}

    public void otherSpot(){
		 extraMessage="You clicked "+ howManyPushed+ " time(s).";
    }
    public String getExtraMessage(){
	return extraMessage;
    }
	public String getDoneMessage() {
		return doneMessage;
	}
}
