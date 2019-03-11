package chapterEight;

import java.util.Scanner;

public class Adder{
		
	Scanner input = new Scanner(System.in);
	
	private int firstNumber, secondNumber, score, correctAnswer, points;
	
	public Adder() {
		//constructor
		newGame();
		
	}
	
	public void newGame() {
		setFirstNumber(0);
		setSecondNumber(0);
		setCorrectAnswer(0);
		setScore(0);
	}
	
	public void newQuestion() {
		setFirstNumber(0);
		setSecondNumber(0);
		setCorrectAnswer(0);
	}
	
	
	public void question() {
		//asks the questions
		setFirstNumber( (int)(Math.random() * 19 + 1) );
		setSecondNumber( (int)(Math.random() * 19 + 1) );

		System.out.println(getFirstNumber() + " + " + getSecondNumber() + " = ");
		setPoints(5);
		
		
	}
	
	public void answer(int inputedAnswer) {
		setCorrectAnswer( getFirstNumber() + getSecondNumber() );
		
		if(points >= 0) {
			
		
		if(inputedAnswer == getCorrectAnswer() ) {
			
			setScore(getScore() + points);
			//System.out.println("You got: " + getPoints() + " points");
		} 
		
		if(inputedAnswer != getCorrectAnswer()) {
			points -= 2;
			
			if(points >= 0) {
				System.out.println("Enter Another Answer ");
				answer(input.nextInt());
			}else {
				System.out.println(getFirstNumber() + " + " + getSecondNumber() + " =  " + getCorrectAnswer() );		
			}
			
		}
		
		} 
		
}

	public int getFirstNumber() {
		return firstNumber;
	}
	
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		
		this.points = points;
		
	}
	
}
