package jogDaVel;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class jogDaVel {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
			int [][] tab = new int [3][3];
			int esc = 0;
			int winJog1 = 0, winJog2 = 0;//Ganhador
			int lin, col = 0;//Tabuleiro 00 ou 11
			int jog1 = 0, jog2 = 0;//Jogadores
			int cont = 0;//Jogadas
			
			for(lin = 0; lin<3; lin++) {
				for(col = 0; col<3; col++) {
					tab[lin][col] = esc;
					esc++;
				}
			}//Tabuleiro
			do {
				System.out.println("       JOGO DA VELHA");
				System.out.println("###########################");
				System.out.println("Jogador1: 00 e Jogador2: 11");
				System.out.println("###########################");
				for(lin= 0; lin<3; lin++) {
					for(col= 0; col<3; col++) {
						System.out.printf("|  %d  |", tab[lin][col]);
					}
					System.out.println("\n");
				}
				System.out.println("###########################");//Resultado
				
				if(cont==0 || cont==2 || cont==4 || cont==6 || cont==8) {
					System.out.println("Jogador1: ");
					jog1 = scan.nextInt();
					if(jog1==0) {
						tab[0][0] = 11;
					}else if(jog1==1) {
						tab[0][1] = 11;
					}else if(jog1==2) {
						tab[0][2] = 11;
					}else if(jog1==3) {
						tab[1][0] = 11;
					}else if(jog1==4) {
						tab[1][1] = 11;
					}else if(jog1==5) {
						tab[1][2] = 11;
					}else if(jog1==6) {
						tab[2][0] = 11;
					}else if(jog1==7) {
						tab[2][1] = 11;
					}else if(jog1==8) {
						tab[2][2] = 11;
					}	
				}else if(cont==1 || cont==3 || cont==5 || cont==7 || cont==9) {
					System.out.println("Jogador2: ");
					jog2 = scan.nextInt();
					if(jog2==0) {
						tab[0][0] = 22;
						System.out.println("2");
					}else if(jog2==1) {
						tab[0][1] = 22;
					}else if(jog2==2) {
						tab[0][2] = 22;
					}else if(jog2==3) {
						tab[1][0] = 22;
					}else if(jog2==4) {
						tab[1][1] = 22;
					}else if(jog2==5) {
						tab[1][2] = 22;
					}else if(jog2==6) {
						tab[2][0] = 22;
					}else if(jog2==7) {
						tab[2][1] = 22;
					}else if(jog2==8) {
						tab[2][2] = 22;
					}
				}//Jogadores
				if(tab[0][0]==11&&tab[0][1]==11&&tab[0][2]==11) {
					winJog1 = 1;
				}else if(tab[1][0]==11&&tab[1][1]==11&&tab[1][2]==11) {
					winJog1 = 1;
				}else if(tab[2][0]==11&&tab[2][1]==11&&tab[2][2]==11) {
					winJog1 = 1;
				}else if(tab[0][0]==11&&tab[1][0]==11&&tab[2][0]==11) {
					winJog1 = 1;
				}else if(tab[0][1]==11&&tab[1][1]==11&&tab[2][1]==11) {
					winJog1 = 1;
				}else if(tab[0][2]==11&&tab[1][2]==11&&tab[2][2]==11) {
					winJog1 = 1;
				}else if(tab[2][0]==11&&tab[1][1]==11&&tab[0][2]==11) {
					winJog1 = 1;
				}else if(tab[0][0]==11&&tab[1][1]==11&&tab[2][2]==11) {
					winJog1 = 1;
				}//Win Jogador1
				if(tab[0][0]==22&&tab[0][1]==22&&tab[0][2]==22) {
					winJog2 = 1;
				}else if(tab[1][0]==22&&tab[1][1]==22&&tab[1][2]==22) {
					winJog2 = 1;
				}else if(tab[2][0]==22&&tab[2][1]==22&&tab[2][2]==22) {
					winJog2 = 1;
				}else if(tab[0][0]==22&&tab[1][0]==22&&tab[2][0]==22) {
					winJog2 = 1;
				}else if(tab[0][1]==22&&tab[1][1]==22&&tab[2][1]==22) {
					winJog2 = 1;
				}else if(tab[0][2]==22&&tab[1][2]==22&&tab[2][2]==22) {
					winJog2 = 1;
				}else if(tab[2][0]==22&&tab[1][1]==22&&tab[0][2]==22) {
					winJog2 = 1;
				}else if(tab[0][0]==22&&tab[1][1]==22&&tab[2][2]==22) {
					winJog2 = 1;
				}//Win Jogador2
				cont += 1;
			}while(winJog1==0 || winJog1== 0 || cont<9);
			if(winJog1 == 1) {
				JOptionPane.showMessageDialog(null, "Vit�ria jogador 1");
			}else if(winJog2 == 1) {
				JOptionPane.showMessageDialog(null, "Vit�ria jogador 2");
			}else if(cont == 9){
				JOptionPane.showMessageDialog(null, "Empate");
			}//Resultado
	}
}