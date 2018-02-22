package prob2;

public class SmartPhone extends MusicPhone {
	@Override
	public void execute(String function) {
		// TODO Auto-generated method stub

		if (function.equals("앱")) {
			AppPlay();
			return;
		}

		super.execute(function);
	}

	private void AppPlay() {
		// TODO Auto-generated method stub
		System.out.println("앱실행");

	}

}
