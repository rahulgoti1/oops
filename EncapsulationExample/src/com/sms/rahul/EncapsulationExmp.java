package com.sms.rahul;

/*
 * If i am not making methods in class then suppose i want to change primitive data type then required to changes in all place where i used it
 * for that reason implements all methods in Single class called CricketScore
 * 
 * Polymorphism can be achieved using two things -> Interface and Inheritance
 * Inheritance : used when is a relationship is available -> car is Vehicle
 * Interface : used when more class have same behaviour or Logic lke plane and Bird both can have Fly logic so make interface like flyable
 */

class CricketScore {
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void addRuns(int score) {
		this.score += score;
	}

	public void six() {
		addRuns(6);
	}

	public void four() {
		addRuns(4);
	}

	public void one() {
		addRuns(1);
	}

	public void two() {
		addRuns(2);
	}

	public void displayRuns() {
		System.out.println("Score : " + score);
	}

}

public class EncapsulationExmp {

	public static void main(String[] args) {

		CricketScore cs = new CricketScore();
		cs.six();
		cs.four();
		cs.one();
		cs.two();
		cs.displayRuns();

	}

}
