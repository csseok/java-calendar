package seok.calendar;

import java.util.Scanner;

public class Prompt {

	public void runPrompt() {
		String PROMPT= "cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
			int month =1;
			int year = 2023;
			while(true) {	
				
			System.out.println("년도를 입력하세요");
			System.out.println("YEAR> ");
			year = scanner.nextInt();
			System.out.println("달을 입력하세요");
			System.out.println("MONTH> ");
			System.out.println(PROMPT);
			month = scanner.nextInt();
			if(month==-1) { break;}
			if(month>12) {continue;}

			cal.printCalendar(year, month);
		}
		
		System.out.println("끝났습니다.");
		
			
		
		scanner.close();
	}
	public static void main(String[] args) {

		//셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
		}
	}


