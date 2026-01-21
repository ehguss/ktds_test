package oop;

public class CraneGameMachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CraneGameMachine dollGame = new CraneGameMachine();
		dollGame.isInsertCoin = true;
		dollGame.dolls = 30;
		
		dollGame.insertCoin();
		dollGame.doGame();
		
		dollGame.insertCoin();
		dollGame.doGame();
		
		dollGame.insertCoin();
		dollGame.doGame();
		
		dollGame.insertCoin();
		dollGame.doGame();
		
		dollGame.insertCoin();
		dollGame.doGame();
		
		dollGame.insertCoin();
		dollGame.doGame();
		
	}

}
