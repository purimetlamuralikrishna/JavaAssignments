package com.murali;

public class VowelAndConsonant {
	
	
	void checkingChar(char c) {
		
		if(c == 'A' || c=='a'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
			System.out.println("Vowel");
		}
		else if(c=='b'||c=='c'||c=='d'||c=='f'||c=='g'||c=='h'||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'
				||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z'||
				c=='B'||c=='C'||c=='D'||c=='F'||c=='G'||c=='H'||c=='J'||c=='K'||c=='L'||c=='M'||c=='N'
				||c=='P'||c=='Q'||c=='R'||c=='S'||c=='T'||c=='V'||c=='W'||c=='X'||c=='Y'||c=='Z'){
			System.out.println("Consonant");
				}
		else {
			System.out.println("Invalid character");
		}
	}

	public static void main(String[] args) {
		
		VowelAndConsonant alphabet = new VowelAndConsonant();
		
		alphabet.checkingChar('a');
		alphabet.checkingChar('B');
		alphabet.checkingChar('1');
	}

}
