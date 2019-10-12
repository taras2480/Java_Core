package ua.lviv.lgs.hw;

public class Robot {
	private String working;

	public Robot(String working) {
		this.working = working;
	}

	public String work(String working) {

		return this.working;

	}

	public String getWorking() {
		return working;
	}

	public void setWorking(String working) {
		this.working = working;
	}

	@Override
	public String toString() {
		return "Robot [working=" + working + "]";
	}

}
