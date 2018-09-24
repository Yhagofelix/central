/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoemjava;
import javax.swing.JOptionPane;
/**
 *
 * @author yhago
 */
public class JogoEmJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		String nome ;
		int chutes = 1 ;
		int tentativas = 1;
		int randon = (int)(1+Math.random()*100);
		int botao;
		boolean continuar = true;
		nome = JOptionPane.showInputDialog(null,"Olá,qual o seu nome?");
		while (continuar){
		tentativas = Integer.parseInt(JOptionPane.showInputDialog(null,"Vamos começar,qual o número?"));
		for(int i = 0; i < 10; i++)
			while(tentativas != randon && chutes < 10) 
		{
				if  (tentativas < randon)
				JOptionPane.showMessageDialog(null,"Tente um numero maior " +nome+".");
				else 
				JOptionPane.showMessageDialog(null,"Tente um numero menor " +nome+".");
				tentativas++;
				chutes++;
				tentativas = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o número? "));
		}
		if (tentativas == randon){
			JOptionPane.showMessageDialog(null,"Parabéns "+nome+" você acertou na " +chutes+ " tentativa(s)");	
			botao = JOptionPane.showConfirmDialog(null,"Gostaria de jogar novamente?","Jogo da Adivinhação",JOptionPane.YES_NO_OPTION);
			if (botao == JOptionPane.YES_OPTION)
				continuar = true;  // o usuário optou por continuar
			else 
				continuar = false;  // o usuário optou por sair
		}	
	else 
		botao = JOptionPane.showConfirmDialog(null,"Acabaram suas chances!Quer Jogar de novo?","Jogo da Adivinhação",JOptionPane.YES_NO_OPTION);
		if (botao == JOptionPane.YES_OPTION)
			continuar = true; // o usuário optou por continuar
		else 
			continuar = true;  // o usuário optou por sair
        }
        System.exit(0);
    }
    
}
