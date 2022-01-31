package Controller;

import java.util.Scanner;

import Model.Fifa;

import Model.AssassinsCreed;

import Model.Battlefield;

import Model.CallOfDuty;

import Model.GrandTheftAuto;

import Model.Headset;

import Model.Playstation;

import Model.Xbox;

import Model.Pagamento;

import java.util.InputMismatchException;

import java.util.ArrayList;

public class LojaConsoleGames {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList <String> lista = new ArrayList <String>();
		
		int opcao;
		
		System.out.println("Bem-Vindo a Loja Console Games!");
		System.out.println("O que você deseja? ");
		System.out.println("1) Console ");
		System.out.println("2) Games ");
		System.out.println("3) Headset ");
		
		try {
			
		System.out.println("Informe a opção desejada: ");
		opcao = sc.nextInt();
		
		}
				
		catch(InputMismatchException e) {
			
		System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
		sc.nextLine();
  
		System.out.println("Informe a opção desejada: ");
		opcao = sc.nextInt();
		
		System.out.println("Reiniciando o programa...");
		
		}
		
		finally {
				
		}
				
		if(opcao == 1) {
			
			// CONSOLES
			
			int opcao2;
			
			System.out.println("Qual console você deseja ?");
			System.out.println("1) PS4");
			System.out.println("2) Xbox One ");
			System.out.println("3) PS3 ");
			System.out.println("4) Xbox 360");
			
			try {
				
			System.out.println("Informe a opção desejada: ");
			opcao2 = sc.nextInt();
			
			}
			
			catch(InputMismatchException e) {
				
			System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
			sc.nextLine();
				  	  
			System.out.println("Informe a opção desejada: ");
			opcao2 = sc.nextInt();
			
			System.out.println("Reiniciando o programa...");
			
			}
			
			finally {

			}
						
			if(opcao2 == 1) {
							
				// PS4
				
				Playstation p4 = new Playstation();
				
				int opcao3;
				
				System.out.println("Qual modelo de PS4 você deseja? ");
				System.out.println("1) PS4 Slim Preto - 1500 R$ ");
				System.out.println("2) PS4 Slim Branco - 1700 R$ ");
				System.out.println("3) PS4 Pro Preto -  2000 R$ ");
				System.out.println("4) PS4 Pro Branco - 2200 R$ ");
				
				try {
					
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				}
				
				catch(InputMismatchException e) {
					
				System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
				sc.nextLine();
					  					  
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				System.out.println("Reiniciando o programa...");
				
				}
				
				finally {

				}
								
				System.out.println("Qual a Quantidade? ");
				p4.setQuantidade(sc.nextInt());
								
				if(opcao3 == 1) {
					
					p4.setTipo("PS4");
					p4.setCor("Preto");
					p4.setPro(false);
					
					p4.calcularPreço(p4.getTipo(), p4.getCor(), p4.getQuantidade(), p4.getPro());
					
					p4.status();
					
					lista.add(p4.getTipo() + " " + p4.getCor() + "(" + p4.getQuantidade() + ")");
					
				}
				
                 if(opcao3 == 2) {
					
					p4.setTipo("PS4");
					p4.setCor("Branco");
					p4.setPro(false);
					
					p4.calcularPreço(p4.getTipo(), p4.getCor(), p4.getQuantidade(), p4.getPro());
					
					p4.status();
					
					lista.add(p4.getTipo() + " " + p4.getCor() + "(" + p4.getQuantidade() + ")");
					
                 }
                 
                 if(opcao3 == 3) {
 					
 					p4.setTipo("PS4");
 					p4.setCor("Preto");
 					p4.setPro(true);
 					
 					p4.calcularPreço(p4.getTipo(), p4.getCor(), p4.getQuantidade(), p4.getPro());
 					
 					p4.status();
 					
 					lista.add(p4.getTipo() + " " + p4.getCor() + "(" + p4.getQuantidade() + ")");
 					
                  }
                 
                 if(opcao3 == 4) {
 					
 					p4.setTipo("PS4");
 					p4.setCor("Branco");
 					p4.setPro(true);
 					
 					p4.calcularPreço(p4.getTipo(), p4.getCor(), p4.getQuantidade(), p4.getPro());
 					
 					p4.status();
 					
 					lista.add(p4.getTipo() + " " + p4.getCor() + "(" + p4.getQuantidade() + ")");
 					
                  }
                 
			}
			
			if(opcao2 == 2) {
				
				// XBOX ONE
				
				Xbox x1 = new Xbox();
				
				int opcao3;
				
				System.out.println("Qual modelo de Xbox One você deseja? ");
				System.out.println("1) Xbox One Preto - 1500 R$ ");
				System.out.println("2) Xbox One Branco - 1700 R$ ");
				
				try {
					
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				}
				
				catch(InputMismatchException e) {
					
				System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
				sc.nextLine();
					  					  
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				System.out.println("Reiniciando o programa...");
				
				}
				
				finally {
	
				}			
				
				System.out.println("Qual a quantidade? ");
				x1.setQuantidade(sc.nextInt());
								
                 if(opcao3 == 1) {
					
					x1.setTipo("XboxOne");
					x1.setCor("Preto");
					
					x1.calcularPreço(x1.getTipo(), x1.getCor(), x1.getQuantidade());
					
					x1.status();
					
					lista.add(x1.getTipo() + " " + x1.getCor() + "(" + x1.getQuantidade() + ")");
					
				}
				
                 if(opcao3 == 2) {
					
					x1.setTipo("XboxOne");
					x1.setCor("Branco");
					
					x1.calcularPreço(x1.getTipo(), x1.getCor(), x1.getQuantidade());
					
					x1.status();
					
					lista.add(x1.getTipo() + " " + x1.getCor() + "(" + x1.getQuantidade() + ")");
					
                 } 
				
			}
			
			if(opcao2 == 3) {
				
				// PS3
				
				Playstation p3 = new Playstation();
				
				int opcao3;
				
				System.out.println("Qual modelo de PS3 você deseja? ");
				System.out.println("1) PS3 Preto - 1000 R$ ");
				System.out.println("2) PS3 Branco - 1200 R$ ");
				
				try {
					
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				}
				
				catch(InputMismatchException e) {
					
				System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
				sc.nextLine();
					  					  
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				System.out.println("Reiniciando o programa...");
				
				}
				
                finally {

				}
								
				System.out.println("Qual a quantidade? ");
				p3.setQuantidade(sc.nextInt());
								
                 if(opcao3 == 1) {
					
					p3.setTipo("PS3");
					p3.setCor("Preto");
					
					p3.calcularPreço(p3.getTipo(), p3.getCor(), p3.getQuantidade());
					
					p3.status();
					
					lista.add(p3.getTipo() + " " + p3.getCor() + "(" + p3.getQuantidade() + ")");
					
				}
				
                 if(opcao3 == 2) {
					
					p3.setTipo("PS3");
					p3.setCor("Branco");
					
					p3.calcularPreço(p3.getTipo(), p3.getCor(), p3.getQuantidade());
					
					p3.status();
					
					lista.add(p3.getTipo() + " " + p3.getCor() + "(" + p3.getQuantidade() + ")");
					
                 } 
			
			}
			
			if(opcao2 == 4) {
			
				//XBOX 360
				
				Xbox x3 = new Xbox();
				
				int opcao3;
				
				System.out.println("Qual modelo de Xbox 360 você deseja? ");
				System.out.println("1) Xbox 360 Preto - 1000 R$ ");
				System.out.println("2) Xbox 360 Branco - 1200 R$ ");
				
				try {
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				}
				
			    catch(InputMismatchException e) {
					
			    System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
			    sc.nextLine();
									  								  
			    System.out.println("Informe a opção desejada: ");
			    opcao3 = sc.nextInt();
			    
			    System.out.println("Reiniciando o programa...");
			    
				}
								
			    finally {
	
				}
								
				System.out.println("Qual a quantidade? ");
				x3.setQuantidade(sc.nextInt());
								
                 if(opcao3 == 1) {
					
					x3.setTipo("Xbox360");
					x3.setCor("Preto");
					
					x3.calcularPreço(x3.getTipo(), x3.getCor(), x3.getQuantidade());
					
					x3.status();
					
					lista.add(x3.getTipo() + " " + x3.getCor() + "(" + x3.getQuantidade() + ")");
					
				}
				
                 if(opcao3 == 2) {
					
					x3.setTipo("Xbox360");
					x3.setCor("Branco");
					
					x3.calcularPreço(x3.getTipo(), x3.getCor(), x3.getQuantidade());
					
					x3.status();
					
					lista.add(x3.getTipo() + " " + x3.getCor() + "(" + x3.getQuantidade() + ")");
					
                 }
			
			}
		
		}
		
		if(opcao == 2) {			
			
			// JOGOS			
			
			int opcao2;
			
			System.out.println("Informe o seu console:  ");
			System.out.println("1) PS4 ou Xbox One ");
			System.out.println("2) PS3 ou Xbox 360 ");
			
			try {
				
			System.out.println("Informe a opção desejada: ");
			opcao2 = sc.nextInt();
			
			}
			
			catch(InputMismatchException e) {
				
			System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
			sc.nextLine();
								  								  
			System.out.println("Informe a opção desejada: ");
			opcao2 = sc.nextInt();
			
			System.out.println("Reiniciando o programa...");
			
			}
							
	        finally {
		
			}
			
			if(opcao2 == 1) {
				
				int opcao3;
				
				System.out.println("Qual Tipo de jogo você deseja? ");
				System.out.println("1) Grande Theft Auto ");
				System.out.println("2) Call of Duty ");
				System.out.println("3) Fifa ");
				System.out.println("4) Battlefield ");
				System.out.println("5) Assassin's Creed ");
				
				try {
					
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				}
				
				catch(InputMismatchException e) {
					
				System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
				sc.nextLine();
									  									  
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				System.out.println("Reiniciando o programa...");
				
				}
								
				finally {

				}
				
				
				if(opcao3 == 1) {
					
					//GTA
					
					GrandTheftAuto gta = new GrandTheftAuto();
					
					int opcao4;
					
					System.out.println("Qual GTA para consoles da nova geração(PS4 e Xbox One) você deseja? ");
					System.out.println("1) GTA 5 - 250 R$ ");
					System.out.println("2) GTA 4 - 150 R$ ");
					System.out.println("3) GTA San Andreas (Remastered) - 100 R$ ");
					
					try {
						
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					}
					
					catch(InputMismatchException e) {
						
					System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
					sc.nextLine();
										  										  
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					System.out.println("Reiniciando o programa...");
					
					}
									
					finally {
						
					}
										
					System.out.println("Qual a quantidade ? ");
					gta.setQuantidade(sc.nextInt());
					
					if(opcao4 == 1) {
						
						gta.setTipo("GTA 5");
						
						gta.calcularPreço(gta.getTipo(), gta.getQuantidade());
						
						gta.status();
						
						lista.add(gta.getTipo() + "(" + gta.getQuantidade() + ")");
						
					}
					
					if(opcao4 == 2) {
						
						gta.setTipo("GTA 4");
						
						gta.calcularPreço(gta.getTipo(), gta.getQuantidade());
						
						gta.status();
						
						lista.add(gta.getTipo() + "(" + gta.getQuantidade() + ")");
						
					}
					
                    if(opcao4 == 3) {
						
						gta.setTipo("GTA San Andreas");
						
						gta.calcularPreço(gta.getTipo(), gta.getQuantidade());
						
						gta.status();
						
						lista.add(gta.getTipo() + "(" + gta.getQuantidade() + ")");
						
					}			
					
				}
				
				if(opcao3 == 2) {
					
					//CALL OF DUTY
					
					CallOfDuty cod = new CallOfDuty();
					
					int opcao4;
					
					System.out.println("Qual COD para consoles da nova geração(PS4 e Xbox One) você deseja? ");
					System.out.println("1) Black Ops 4 - 300 R$ ");
					System.out.println("2) Black Ops 3 - 250 R$ ");
					System.out.println("3) World War 2 - 200 R$ ");
					System.out.println("4) Infinity Warfare - 175 R$ ");
					System.out.println("5) Advanced Warfare - 150 R$");
					
					try {
						
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					
					}
					
					catch(InputMismatchException e) {
						
					System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
					sc.nextLine();
										  										  
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					System.out.println("Reiniciando o programa...");
					
					}
									
		            finally {

					}
										
					System.out.println("Qual a quantidade ? ");
					cod.setQuantidade(sc.nextInt());
										
                    if(opcao4 == 1) {
						
						cod.setTipo("Black Ops 4");
						
						cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
						
						cod.status();
						
						lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
						
					}
					
					if(opcao4 == 2) {
						
						cod.setTipo("Black Ops 3");
						
						cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
						
						cod.status();
						
						lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
						
					}
					
                    if(opcao4 == 3) {
						
						cod.setTipo("World War 2");
						
						cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
						
						cod.status();
						
						lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
						
					}
                    
                    if(opcao4 == 4) {
                    	
                    	cod.setTipo("Infinity Warfare");
                    	
                    	cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
                    	
                    	cod.status();
                    	
                    	
                    	lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
                 
                    }
                    
                    if(opcao4 == 5) {
                    	
                    	cod.setTipo("Advanced Warfare");
                    	
                    	cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
                    	
                    	cod.status();
                    	
                    	lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
                    	
                    }					
					
				}
				
				if(opcao3 == 3) {
					
					//FIFA
					
					Fifa fifa = new Fifa();
					
                    int opcao4;
					
					System.out.println("Qual Fifa para consoles da nova geração(PS4 e Xbox One) você deseja? ");
					System.out.println("1) Fifa 19 - 250 R$ ");
					System.out.println("2) Fifa 18 - 200 R$ ");
					System.out.println("3) Fifa 17 - 150 R$ ");
					System.out.println("4) Fifa 16 - 115 R$ ");
					
					try {
						
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					}
					
					catch(InputMismatchException e) {
						
					System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
					sc.nextLine();
										  									  
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					System.out.println("Reiniciando o programa...");
					
					}
									
					finally {

					}
										
					System.out.println("Qual a quantidade ? ");
					fifa.setQuantidade(sc.nextInt());
									
                    if(opcao4 == 1) {
						
						fifa.setTipo("Fifa 19");
						
						fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
						
						fifa.status();
						
						lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
						
					}
					
					if(opcao4 == 2) {
						
						fifa.setTipo("Fifa 18");
						
						fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
						
						fifa.status();
						
						lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
						
					}
					
                    if(opcao4 == 3) {
						
						fifa.setTipo("Fifa 17");
						
						fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
						
						fifa.status();
						
						lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
						
					}
                    
                    if(opcao4 == 4) {
                    	
                    	fifa.setTipo("Fifa 16");
                    	
                    	fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
                    	
                    	fifa.status();
                    	
                    	lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
                    	
                    }
		
				}
				
				if(opcao3 == 4) {
					
					//BATTLEFIELD
					
					Battlefield bf = new Battlefield();
					
                    int opcao4;
					
					System.out.println("Qual Battlefield para consoles da nova geração(PS4 e Xbox One) você deseja? ");
					System.out.println("1) Battlefield 5 - 250 R$ ");
					System.out.println("2) Battlefield 1 - 200 R$ ");
					System.out.println("3) Battlefield Hardline - 150 R$ ");
					
					try {
						
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					}
					
					catch(InputMismatchException e) {
						
					System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
					sc.nextLine();
										  										  
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					System.out.println("Reiniciando o programa...");
					
					}
									
					finally {

					}
										
					System.out.println("Qual a quantidade ? ");
					bf.setQuantidade(sc.nextInt());
					
					if(opcao4 == 1) {
						
						bf.setTipo("BF5");
						
						bf.calcularPreço(bf.getTipo(), bf.getQuantidade());
						
						bf.status();
						
						lista.add(bf.getTipo() + "(" + bf.getQuantidade() + ")");
						
					}
					
					if(opcao4 == 2) {
						
						bf.setTipo("BF1");
						
						bf.calcularPreço(bf.getTipo(), bf.getQuantidade());
						
						bf.status();
						
						lista.add(bf.getTipo() + "(" + bf.getQuantidade() + ")");
						
					}
					
                    if(opcao4 == 3) {
						
						bf.setTipo("Battlefield Hardline");
						
						bf.calcularPreço(bf.getTipo(), bf.getQuantidade());
						
						bf.status();
						
						lista.add(bf.getTipo() + "(" + bf.getQuantidade() + ")");
						
					}
                    
				}
				
				if(opcao3 == 5) {
					
					//ASSASSINS CREED
					
					AssassinsCreed ac = new AssassinsCreed();
					
                    int opcao4;
					
					System.out.println("Qual AssassinsCreed para consoles da nova geração(PS4 e Xbox One) você deseja? ");
					System.out.println("1) AssassinsCreed Odyssey - 250 R$ ");
					System.out.println("2) AssassinsCreed Origins - 200 R$ ");
					System.out.println("3) AssassinsCreed Syndicate - 150 R$ ");
					System.out.println("4) AssassinsCreed Unity - 150 R$ ");
					
					try {
						
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					}
					
					catch(InputMismatchException e) {
						
					System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
					sc.nextLine();
										  
										  
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					System.out.println("Reiniciando o programa...");
					
					}
									
					finally {

					}					
					
					System.out.println("Qual a quantidade ? ");
					ac.setQuantidade(sc.nextInt());					
					
                    if(opcao4 == 1) {
						
						ac.setTipo("Odyssey");
						
						ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
						
						ac.status();
						
						lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
						
					}
					
					if(opcao4 == 2) {
						
						ac.setTipo("Origins");
						
						ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
						
						ac.status();
						
						lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
						
					}
					
                    if(opcao4 == 3) {
						
						ac.setTipo("Syndicate");
						
						ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
						
						ac.status();
						
						lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
						
					}
                    
                    if(opcao4 == 4) {
                    	
                    	ac.setTipo("Unity");
                    	
                    	ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
                    	
                    	ac.status();
                    	
                    	lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
                    	
                    }			
					
				}
				
			}
			
                if(opcao2 == 2) {
				
				int opcao3;
				
				System.out.println("Qual Tipo de jogo você deseja? ");
				System.out.println("1) Grande Theft Auto ");
				System.out.println("2) Call of Duty ");
				System.out.println("3) Fifa ");
				System.out.println("4) Battlefield ");
				System.out.println("5) Assassin's Creed ");
				
				try {
					
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				}
				
				catch(InputMismatchException e) {
					
				System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
				sc.nextLine();
									  									  
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				System.out.println("Reiniciando o programa...");
				
				}
								
				finally {

				}
							
				if(opcao3 == 1) {
					
					//GTA
					
					GrandTheftAuto gta = new GrandTheftAuto();
					
					int opcao4;
					
					System.out.println("Qual GTA para consoles da velha geração(PS3 e Xbox 360) você deseja? ");
					System.out.println("1) GTA San Andreas (Remastered) - 100 R$ ");
					System.out.println("2) GTA Liberty City - 50 R$ ");
					System.out.println("3) GTA Vice City - 50 R$ ");
					
					try {
						
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					}
					
					catch(InputMismatchException e) {
						
					System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
					sc.nextLine();
										  										  
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					System.out.println("Reiniciando o programa...");
					
					}
									
					finally {

					}
										
					System.out.println("Qual a quantidade ? ");
					gta.setQuantidade(sc.nextInt());
					
					if(opcao4 == 1) {
						
						gta.setTipo("GTA San Andreas");
						
						gta.calcularPreço(gta.getTipo(), gta.getQuantidade());
						
						gta.status();
						
						lista.add(gta.getTipo() + "(" + gta.getQuantidade() + ")");
						
					}
					
					if(opcao4 == 2) {
						
						gta.setTipo("GTA Liberty City");
						
						gta.calcularPreço(gta.getTipo(), gta.getQuantidade());
						
						gta.status();
						
						lista.add(gta.getTipo() + "(" + gta.getQuantidade() + ")");
						
					}
					
                    if(opcao4 == 3) {
						
						gta.setTipo("GTA Vice City");
						
						gta.calcularPreço(gta.getTipo(), gta.getQuantidade());
						
						gta.status();
						
						lista.add(gta.getTipo() + "(" + gta.getQuantidade() + ")");
						
					}
	
				}
				
				if(opcao3 == 2) {
					
					//CALL OF DUTY
					
					CallOfDuty cod = new CallOfDuty();
					
					int opcao4;
					
					System.out.println("Qual COD para consoles da velha geração(PS3 e Xbox 360) você deseja? ");
					System.out.println("1) Black Ops 2 - 125 R$ ");
					System.out.println("2) Black Ops 1 - 100 R$ ");
					System.out.println("3) Modern Warfare 3 - 75 R$ ");
					System.out.println("4) Modern Warfare 2 - 50 R$ ");
					
					try {
						
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					}
					
					catch(InputMismatchException e) {
						
					System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
					sc.nextLine();
										  										  
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					System.out.println("Reiniciando o programa...");
					
					}
									
					finally {

					}
										
					System.out.println("Qual a quantidade ? ");
					cod.setQuantidade(sc.nextInt());
									
                    if(opcao4 == 1) {
						
						cod.setTipo("Black Ops 2");
						
						cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
						
						cod.status();
						
						lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
						
					}
					
					if(opcao4 == 2) {
						
						cod.setTipo("Black Ops 1");
						
						cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
						
						cod.status();
						
						lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
						
					}
					
                    if(opcao4 == 3) {
						
						cod.setTipo("Modern Warfare 3");
						
						cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
						
						cod.status();
						
						lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
						
					}
                    
                    if(opcao4 == 4) {
                    	
                    	cod.setTipo("Modern Warfare 2");
                    	
                    	cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
                    	
                    	cod.status();
                    	
                    	lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
                    	
                    }
			
				}
				
				if(opcao3 == 3) {
					
					//FIFA
					
					Fifa fifa = new Fifa();
					
                    int opcao4;
					
					System.out.println("Qual Fifa para consoles da velha geração(PS3 e Xbox 360) você deseja? ");
					System.out.println("1) Fifa 15 - 100 R$ ");
					System.out.println("2) Fifa 14 - 75 R$ ");
					System.out.println("3) Fifa 13 - 50 R$ ");
					System.out.println("4) Fifa 12 - 25 R$ ");
					
					try {
						
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					}
					
					catch(InputMismatchException e) {
						
					System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
					sc.nextLine();
										  										  
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					System.out.println("Reiniciando o programa...");
					
					}
									
					finally {

					}					
					
					System.out.println("Qual a quantidade ? ");
					fifa.setQuantidade(sc.nextInt());
										
                    if(opcao4 == 1) {
						
						fifa.setTipo("Fifa 15");
						
						fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
						
						fifa.status();
						
						lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
						
					}
					
					if(opcao4 == 2) {
						
						fifa.setTipo("Fifa 14");
						
						fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
						
						fifa.status();
						
						lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
						
					}
					
                    if(opcao4 == 3) {
						
						fifa.setTipo("Fifa 13");
						
						fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
						
						fifa.status();
						
						lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
						
					}
                    
                    if(opcao4 == 4) {
                    	
                    	fifa.setTipo("Fifa 12");
                    	
                    	fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
                    	
                    	fifa.status();
                    	
                    	lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
                    	
                    }
		
				}
				
				if(opcao3 == 4) {
					
					//BATTLEFIELD
					
					Battlefield bf = new Battlefield();
					
                    int opcao4;
					
					System.out.println("Qual Battlefield para consoles da velha geração(PS3 e Xbox 360) você deseja? ");
					System.out.println("1) Battlefield 4 - 115 R$ ");
					System.out.println("2) Battlefield 3 - 100 R$ ");
					
					try {
						
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					}
					
					catch(InputMismatchException e) {
						
					System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
					sc.nextLine();
										  										  
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					System.out.println("Reiniciando o programa...");
					
					}
									
					finally {

					}
										
					System.out.println("Qual a quantidade ? ");
					bf.setQuantidade(sc.nextInt());
					
					if(opcao4 == 1) {
						
						bf.setTipo("BF4");
						
						bf.calcularPreço(bf.getTipo(), bf.getQuantidade());
						
						bf.status();
						
						lista.add(bf.getTipo() + "(" + bf.getQuantidade() + ")");
						
					}
					
					if(opcao4 == 2) {
						
						bf.setTipo("BF3");
						
						bf.calcularPreço(bf.getTipo(), bf.getQuantidade());
						
						bf.status();
						
						lista.add(bf.getTipo() + "(" + bf.getQuantidade() + ")");
						
					}

				}
				
				if(opcao3 == 5) {
					
					//ASSASSINS CREED
					
					AssassinsCreed ac = new AssassinsCreed();
					
                    int opcao4;
					
					System.out.println("Qual AssassinsCreed para consoles da velha geração(PS3 e Xbox 360) você deseja? ");
					System.out.println("1) AssassinsCreed Black Flag - 125 R$ ");
					System.out.println("2) AssassinsCreed 3 - 100 R$ ");
					System.out.println("3) AssassinsCreed Revelations - 100 R$ ");
					System.out.println("4) AssassinsCreed Brotherhood - 50 R$ ");
					
					try {
						
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					}
					
					catch(InputMismatchException e) {
						
					System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
					sc.nextLine();
										  										  
					System.out.println("Informe a opção desejada: ");
					opcao4 = sc.nextInt();
					
					System.out.println("Reiniciando o programa...");
					
					}
									
				   finally {

					}
									
					System.out.println("Qual a quantidade ? ");
					ac.setQuantidade(sc.nextInt());
										
                    if(opcao4 == 1) {
						
						ac.setTipo("Black Flag");
						
						ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
						
						ac.status();
						
						lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
						
					}
					
					if(opcao4 == 2) {
						
						ac.setTipo("Assassin's Creed 3");
						
						ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
						
						ac.status();
						
						lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
						
					}
					
                    if(opcao4 == 3) {
						
						ac.setTipo("Revelations");
						
						ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
						
						ac.status();
						
						lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
						
					}
                    
                    if(opcao4 == 4) {
                    	
                    	ac.setTipo("Brotherhood");
                    	
                    	ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
                    	
                    	ac.status();
                    	
                    	lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
                    	
                    }

				}
				
			}
	
		}
		
		if(opcao == 3) {
			
			int opcao2;
			
			Headset h7 = new Headset();
			
			System.out.println("Qual marca de headset você deseja ? ");
			System.out.println("1) HyperX ");
			System.out.println("2) Razer ");
			
			try {
				
			System.out.println("Informe a opção desejada: ");
			opcao2 = sc.nextInt();
			
			}
			
			catch(InputMismatchException e) {
				
			System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
			sc.nextLine();
								  							  
			System.out.println("Informe a opção desejada: ");
			opcao2 = sc.nextInt();
			
			System.out.println("Reiniciando o programa...");
			
			}
							
			finally {

			}
						
			if(opcao2 == 1) {
				
				int opcao3;
				
				System.out.println("Qual headset da HyperX você deseja ? ");
				System.out.println("1) HyperX Cloud Stinger ");
				System.out.println("2) HyperX Cloud 9 ");
				
				try {
					
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				}
				
				catch(InputMismatchException e) {
					
				System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
				sc.nextLine();
									  									  
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				System.out.println("Reiniciando o programa...");
				
				}
								
				finally {

				}
								
				System.out.println("Qual a quantidade? ");
				h7.setQuantidade(sc.nextInt());
				
				if(opcao3 == 1) {
					
					h7.setMarca("HyperX");
					h7.setTipo("Cloud Stinger");
					
					h7.calcularPreço(h7.getMarca(), h7.getTipo(), h7.getQuantidade());
					
					h7.status();
					
					lista.add(h7.getTipo() + "(" + h7.getQuantidade() + ")");
					
				}
				
				if(opcao3 == 2) {
					
					h7.setMarca("HyperX");
					h7.setTipo("Cloud 9");
					
					h7.calcularPreço(h7.getMarca(), h7.getTipo(), h7.getQuantidade());
					
					h7.status();
					
					lista.add(h7.getTipo() + "(" + h7.getQuantidade() + ")");
					
				}
				
			}
			
			if(opcao2 == 2) {
				
                int opcao3;
				
				System.out.println("Qual headset da Razer você deseja ? ");
				System.out.println("1) Razer Kraken Pro ");
				System.out.println("2) Razer Kraken ");
				
				try {
					
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				}
				
				catch(InputMismatchException e) {
					
				System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
				sc.nextLine();
									  									  
				System.out.println("Informe a opção desejada: ");
				opcao3 = sc.nextInt();
				
				System.out.println("Reiniciando o programa...");
				
				}
								
				finally {

				}
							
				System.out.println("Qual a quantidade? ");
				h7.setQuantidade(sc.nextInt());
				
				if(opcao3 == 1) {
					
					h7.setMarca("Razer");
					h7.setTipo("Kraken Pro");
					
					h7.calcularPreço(h7.getMarca(), h7.getTipo(), h7.getQuantidade());
					
					h7.status();
					
					lista.add(h7.getTipo() + "(" + h7.getQuantidade() + ")");
					
				}
				
				if(opcao3 == 2) {
					
					h7.setMarca("Razer");
					h7.setTipo("Kraken");
					
					h7.calcularPreço(h7.getMarca(), h7.getTipo(), h7.getQuantidade());
					
					h7.status();
					
					lista.add(h7.getTipo() + "(" + h7.getQuantidade() + ")");
					
				}
				
			}
	
		}
		
		for(boolean i = true; i == true;) {
			
			int opcao1;
			
			System.out.println("");
			System.out.println("Deseja comprar algo mais?");
			System.out.println("1) Sim");
			System.out.println("1) Não");
			
			opcao1 = sc.nextInt();		
			
			if(opcao1 == 1) {
				
				System.out.println("O que você deseja? ");
				System.out.println("1) Console ");
				System.out.println("2) Games ");
				System.out.println("3) Headset ");
				
				try {
					
				System.out.println("Informe a opção desejada: ");
				opcao = sc.nextInt();
				
				}
						
				catch(InputMismatchException e) {
					
				System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
				sc.nextLine();
		  
				System.out.println("Informe a opção desejada: ");
				opcao = sc.nextInt();
				
				System.out.println("Reiniciando o programa...");
				
				}
				
				finally {
						
				}
						
				if(opcao == 1) {
					
					// CONSOLES
					
					int opcao2;
					
					System.out.println("Qual console você deseja ?");
					System.out.println("1) PS4");
					System.out.println("2) Xbox One ");
					System.out.println("3) PS3 ");
					System.out.println("4) Xbox 360");
					
					try {
						
					System.out.println("Informe a opção desejada: ");
					opcao2 = sc.nextInt();
					
					}
					
					catch(InputMismatchException e) {
						
					System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
					sc.nextLine();
						  	  
					System.out.println("Informe a opção desejada: ");
					opcao2 = sc.nextInt();
					
					System.out.println("Reiniciando o programa...");
					
					}
					
					finally {

					}
								
					if(opcao2 == 1) {
									
						// PS4
						
						Playstation p4 = new Playstation();
						
						int opcao3;
						
						System.out.println("Qual modelo de PS4 você deseja? ");
						System.out.println("1) PS4 Slim Preto - 1500 R$ ");
						System.out.println("2) PS4 Slim Branco - 1700 R$ ");
						System.out.println("3) PS4 Pro Preto -  2000 R$ ");
						System.out.println("4) PS4 Pro Branco - 2200 R$ ");
						
						try {
							
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						}
						
						catch(InputMismatchException e) {
							
						System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
						sc.nextLine();
							  					  
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						System.out.println("Reiniciando o programa...");
						
						}
						
						finally {

						}
										
						System.out.println("Qual a Quantidade? ");
						p4.setQuantidade(sc.nextInt());
										
						if(opcao3 == 1) {
							
							p4.setTipo("PS4");
							p4.setCor("Preto");
							p4.setPro(false);
							
							p4.calcularPreço(p4.getTipo(), p4.getCor(), p4.getQuantidade(), p4.getPro());
							
							p4.status();
							
							lista.add(p4.getTipo() + " " + p4.getCor() + "(" + p4.getQuantidade() + ")");
							
						}
						
		                 if(opcao3 == 2) {
							
							p4.setTipo("PS4");
							p4.setCor("Branco");
							p4.setPro(false);
							
							p4.calcularPreço(p4.getTipo(), p4.getCor(), p4.getQuantidade(), p4.getPro());
							
							p4.status();
							
							lista.add(p4.getTipo() + " " + p4.getCor() + "(" + p4.getQuantidade() + ")");
							
		                 }
		                 
		                 if(opcao3 == 3) {
		 					
		 					p4.setTipo("PS4");
		 					p4.setCor("Preto");
		 					p4.setPro(true);
		 					
		 					p4.calcularPreço(p4.getTipo(), p4.getCor(), p4.getQuantidade(), p4.getPro());
		 					
		 					p4.status();
		 					
		 					lista.add(p4.getTipo() + " " + p4.getCor() + "(" + p4.getQuantidade() + ")");
		 					
		                  }
		                 
		                 if(opcao3 == 4) {
		 					
		 					p4.setTipo("PS4");
		 					p4.setCor("Branco");
		 					p4.setPro(true);
		 					
		 					p4.calcularPreço(p4.getTipo(), p4.getCor(), p4.getQuantidade(), p4.getPro());
		 					
		 					p4.status();
		 					
		 					lista.add(p4.getTipo() + " " + p4.getCor() + "(" + p4.getQuantidade() + ")");
		 					
		                  }
		                 
					}
					
					if(opcao2 == 2) {
						
						// XBOX ONE
						
						Xbox x1 = new Xbox();
						
						int opcao3;
						
						System.out.println("Qual modelo de Xbox One você deseja? ");
						System.out.println("1) Xbox One Preto - 1500 R$ ");
						System.out.println("2) Xbox One Branco - 1700 R$ ");
						
						try {
							
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						}
						
						catch(InputMismatchException e) {
							
						System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
						sc.nextLine();
							  					  
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						System.out.println("Reiniciando o programa...");
						
						}
						
						finally {
			
						}			
						
						System.out.println("Qual a quantidade? ");
						x1.setQuantidade(sc.nextInt());
										
		                 if(opcao3 == 1) {
							
							x1.setTipo("XboxOne");
							x1.setCor("Preto");
							
							x1.calcularPreço(x1.getTipo(), x1.getCor(), x1.getQuantidade());
							
							x1.status();
							
							lista.add(x1.getTipo() + " " + x1.getCor() + "(" + x1.getQuantidade() + ")");
							
						}
						
		                 if(opcao3 == 2) {
							
							x1.setTipo("XboxOne");
							x1.setCor("Branco");
							
							x1.calcularPreço(x1.getTipo(), x1.getCor(), x1.getQuantidade());
							
							x1.status();
							
							lista.add(x1.getTipo() + " " + x1.getCor() + "(" + x1.getQuantidade() + ")");
							
		                 } 
						
					}
					
					if(opcao2 == 3) {
						
						// PS3
						
						Playstation p3 = new Playstation();
						
						int opcao3;
						
						System.out.println("Qual modelo de PS3 você deseja? ");
						System.out.println("1) PS3 Preto - 1000 R$ ");
						System.out.println("2) PS3 Branco - 1200 R$ ");
						
						try {
							
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						}
						
						catch(InputMismatchException e) {
							
						System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
						sc.nextLine();
							  					  
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						System.out.println("Reiniciando o programa...");
						
						}
						
		                finally {

						}
										
						System.out.println("Qual a quantidade? ");
						p3.setQuantidade(sc.nextInt());
										
		                 if(opcao3 == 1) {
							
							p3.setTipo("PS3");
							p3.setCor("Preto");
							
							p3.calcularPreço(p3.getTipo(), p3.getCor(), p3.getQuantidade());
							
							p3.status();
							
							lista.add(p3.getTipo() + " " + p3.getCor() + "(" + p3.getQuantidade() + ")");
							
						}
						
		                 if(opcao3 == 2) {
							
							p3.setTipo("PS3");
							p3.setCor("Branco");
							
							p3.calcularPreço(p3.getTipo(), p3.getCor(), p3.getQuantidade());
							
							p3.status();
							
							lista.add(p3.getTipo() + " " + p3.getCor() + "(" + p3.getQuantidade() + ")");
							
		                 } 
					
					}
					
					if(opcao2 == 4) {
					
						//XBOX 360
						
						Xbox x3 = new Xbox();
						
						int opcao3;
						
						System.out.println("Qual modelo de Xbox 360 você deseja? ");
						System.out.println("1) Xbox 360 Preto - 1000 R$ ");
						System.out.println("2) Xbox 360 Branco - 1200 R$ ");
						
						try {
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						}
						
					    catch(InputMismatchException e) {
							
					    System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
					    sc.nextLine();
											  								  
					    System.out.println("Informe a opção desejada: ");
					    opcao3 = sc.nextInt();
					    
					    System.out.println("Reiniciando o programa...");
					    
						}
										
					    finally {
			
						}
										
						System.out.println("Qual a quantidade? ");
						x3.setQuantidade(sc.nextInt());
										
		                 if(opcao3 == 1) {
							
							x3.setTipo("Xbox360");
							x3.setCor("Preto");
							
							x3.calcularPreço(x3.getTipo(), x3.getCor(), x3.getQuantidade());
							
							x3.status();
							
							lista.add(x3.getTipo() + " " + x3.getCor() + "(" + x3.getQuantidade() + ")");
							
						}
						
		                 if(opcao3 == 2) {
							
							x3.setTipo("Xbox360");
							x3.setCor("Branco");
							
							x3.calcularPreço(x3.getTipo(), x3.getCor(), x3.getQuantidade());
							
							x3.status();
							
							lista.add(x3.getTipo() + " " + x3.getCor() + "(" + x3.getQuantidade() + ")");
							
		                 }
					
					}
				
				}
				
				if(opcao == 2) {			
					
					// JOGOS			
					
					int opcao2;
					
					System.out.println("Informe o seu console:  ");
					System.out.println("1) PS4 ou Xbox One ");
					System.out.println("2) PS3 ou Xbox 360 ");
					
					try {
						
					System.out.println("Informe a opção desejada: ");
					opcao2 = sc.nextInt();
					
					}
					
					catch(InputMismatchException e) {
						
					System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
					sc.nextLine();
										  								  
					System.out.println("Informe a opção desejada: ");
					opcao2 = sc.nextInt();
					
					System.out.println("Reiniciando o programa...");
					
					}
									
			        finally {
				
					}
					
					if(opcao2 == 1) {
						
						int opcao3;
						
						System.out.println("Qual Tipo de jogo você deseja? ");
						System.out.println("1) Grande Theft Auto ");
						System.out.println("2) Call of Duty ");
						System.out.println("3) Fifa ");
						System.out.println("4) Battlefield ");
						System.out.println("5) Assassin's Creed ");
						
						try {
							
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						}
						
						catch(InputMismatchException e) {
							
						System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
						sc.nextLine();
											  									  
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						System.out.println("Reiniciando o programa...");
						
						}
										
						finally {

						}
						
						
						if(opcao3 == 1) {
							
							//GTA
							
							GrandTheftAuto gta = new GrandTheftAuto();
							
							int opcao4;
							
							System.out.println("Qual GTA para consoles da nova geração(PS4 e Xbox One) você deseja? ");
							System.out.println("1) GTA 5 - 250 R$ ");
							System.out.println("2) GTA 4 - 150 R$ ");
							System.out.println("3) GTA San Andreas (Remastered) - 100 R$ ");
							
							try {
								
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							}
							
							catch(InputMismatchException e) {
								
							System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
							sc.nextLine();
												  										  
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							System.out.println("Reiniciando o programa...");
							
							}
											
							finally {
								
							}
												
							System.out.println("Qual a quantidade ? ");
							gta.setQuantidade(sc.nextInt());
							
							if(opcao4 == 1) {
								
								gta.setTipo("GTA 5");
								
								gta.calcularPreço(gta.getTipo(), gta.getQuantidade());
								
								gta.status();
								
								lista.add(gta.getTipo() + "(" + gta.getQuantidade() + ")");
								
							}
							
							if(opcao4 == 2) {
								
								gta.setTipo("GTA 4");
								
								gta.calcularPreço(gta.getTipo(), gta.getQuantidade());
								
								gta.status();
								
								lista.add(gta.getTipo() + "(" + gta.getQuantidade() + ")");
								
							}
							
		                    if(opcao4 == 3) {
								
								gta.setTipo("GTA San Andreas");
								
								gta.calcularPreço(gta.getTipo(), gta.getQuantidade());
								
								gta.status();
								
								lista.add(gta.getTipo() + "(" + gta.getQuantidade() + ")");
								
							}			
							
						}
						
						if(opcao3 == 2) {
							
							//CALL OF DUTY
							
							CallOfDuty cod = new CallOfDuty();
							
							int opcao4;
							
							System.out.println("Qual COD para consoles da nova geração(PS4 e Xbox One) você deseja? ");
							System.out.println("1) Black Ops 4 - 300 R$ ");
							System.out.println("2) Black Ops 3 - 250 R$ ");
							System.out.println("3) World War 2 - 200 R$ ");
							System.out.println("4) Infinity Warfare - 175 R$ ");
							System.out.println("5) Advanced Warfare - 150 R$");
							
							try {
								
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							}
							
							catch(InputMismatchException e) {
								
							System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
							sc.nextLine();
												  										  
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							System.out.println("Reiniciando o programa...");
							
							}
											
				            finally {

							}
												
							System.out.println("Qual a quantidade ? ");
							cod.setQuantidade(sc.nextInt());
												
		                    if(opcao4 == 1) {
								
								cod.setTipo("Black Ops 4");
								
								cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
								
								cod.status();
								
								lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
								
							}
							
							if(opcao4 == 2) {
								
								cod.setTipo("Black Ops 3");
								
								cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
								
								cod.status();
								
								lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
								
							}
							
		                    if(opcao4 == 3) {
								
								cod.setTipo("World War 2");
								
								cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
								
								cod.status();
								
								lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
								
							}
		                    
		                    if(opcao4 == 4) {
		                    	
		                    	cod.setTipo("Infinity Warfare");
		                    	
		                    	cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
		                    	
		                    	cod.status();
		                    	
		                    	
		                    	lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
		                 
		                    }
		                    
		                    if(opcao4 == 5) {
		                    	
		                    	cod.setTipo("Advanced Warfare");
		                    	
		                    	cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
		                    	
		                    	cod.status();
		                    	
		                    	lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
		                    	
		                    }					
							
						}
						
						if(opcao3 == 3) {
							
							//FIFA
							
							Fifa fifa = new Fifa();
							
		                    int opcao4;
							
							System.out.println("Qual Fifa para consoles da nova geração(PS4 e Xbox One) você deseja? ");
							System.out.println("1) Fifa 19 - 250 R$ ");
							System.out.println("2) Fifa 18 - 200 R$ ");
							System.out.println("3) Fifa 17 - 150 R$ ");
							System.out.println("4) Fifa 16 - 115 R$ ");
							
							try {
								
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							}
							
							catch(InputMismatchException e) {
								
							System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
							sc.nextLine();
												  									  
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							System.out.println("Reiniciando o programa...");
							
							}
											
							finally {

							}
												
							System.out.println("Qual a quantidade ? ");
							fifa.setQuantidade(sc.nextInt());
											
		                    if(opcao4 == 1) {
								
								fifa.setTipo("Fifa 19");
								
								fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
								
								fifa.status();
								
								lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
								
							}
							
							if(opcao4 == 2) {
								
								fifa.setTipo("Fifa 18");
								
								fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
								
								fifa.status();
								
								lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
								
							}
							
		                    if(opcao4 == 3) {
								
								fifa.setTipo("Fifa 17");
								
								fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
								
								fifa.status();
								
								lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
								
							}
		                    
		                    if(opcao4 == 4) {
		                    	
		                    	fifa.setTipo("Fifa 16");
		                    	
		                    	fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
		                    	
		                    	fifa.status();
		                    	
		                    	lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
		                    	
		                    }
				
						}
						
						if(opcao3 == 4) {
							
							//BATTLEFIELD
							
							Battlefield bf = new Battlefield();
							
		                    int opcao4;
							
							System.out.println("Qual Battlefield para consoles da nova geração(PS4 e Xbox One) você deseja? ");
							System.out.println("1) Battlefield 5 - 250 R$ ");
							System.out.println("2) Battlefield 1 - 200 R$ ");
							System.out.println("3) Battlefield Hardline - 150 R$ ");
							
							try {
								
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							}
							
							catch(InputMismatchException e) {
								
							System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
							sc.nextLine();
												  										  
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							System.out.println("Reiniciando o programa...");
							
							}
											
							finally {

							}
												
							System.out.println("Qual a quantidade ? ");
							bf.setQuantidade(sc.nextInt());
							
							if(opcao4 == 1) {
								
								bf.setTipo("BF5");
								
								bf.calcularPreço(bf.getTipo(), bf.getQuantidade());
								
								bf.status();
								
								lista.add(bf.getTipo() + "(" + bf.getQuantidade() + ")");
								
							}
							
							if(opcao4 == 2) {
								
								bf.setTipo("BF1");
								
								bf.calcularPreço(bf.getTipo(), bf.getQuantidade());
								
								bf.status();
								
								lista.add(bf.getTipo() + "(" + bf.getQuantidade() + ")");
								
							}
							
		                    if(opcao4 == 3) {
								
								bf.setTipo("Battlefield Hardline");
								
								bf.calcularPreço(bf.getTipo(), bf.getQuantidade());
								
								bf.status();
								
								lista.add(bf.getTipo() + "(" + bf.getQuantidade() + ")");
								
							}
		                    
						}
						
						if(opcao3 == 5) {
							
							//ASSASSINS CREED
							
							AssassinsCreed ac = new AssassinsCreed();
							
		                    int opcao4;
							
							System.out.println("Qual AssassinsCreed para consoles da nova geração(PS4 e Xbox One) você deseja? ");
							System.out.println("1) AssassinsCreed Odyssey - 250 R$ ");
							System.out.println("2) AssassinsCreed Origins - 200 R$ ");
							System.out.println("3) AssassinsCreed Syndicate - 150 R$ ");
							System.out.println("4) AssassinsCreed Unity - 150 R$ ");
							
							try {
								
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							}
							
							catch(InputMismatchException e) {
								
							System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
							sc.nextLine();
												  
												  
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							System.out.println("Reiniciando o programa...");
							
							}
											
							finally {

							}					
							
							System.out.println("Qual a quantidade ? ");
							ac.setQuantidade(sc.nextInt());					
							
		                    if(opcao4 == 1) {
								
								ac.setTipo("Odyssey");
								
								ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
								
								ac.status();
								
								lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
								
							}
							
							if(opcao4 == 2) {
								
								ac.setTipo("Origins");
								
								ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
								
								ac.status();
								
								lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
								
							}
							
		                    if(opcao4 == 3) {
								
								ac.setTipo("Syndicate");
								
								ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
								
								ac.status();
								
								lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
								
							}
		                    
		                    if(opcao4 == 4) {
		                    	
		                    	ac.setTipo("Unity");
		                    	
		                    	ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
		                    	
		                    	ac.status();
		                    	
		                    	lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
		                    	
		                    }			
							
						}
						
					}
					
		                if(opcao2 == 2) {
						
						int opcao3;
						
						System.out.println("Qual Tipo de jogo você deseja? ");
						System.out.println("1) Grande Theft Auto ");
						System.out.println("2) Call of Duty ");
						System.out.println("3) Fifa ");
						System.out.println("4) Battlefield ");
						System.out.println("5) Assassin's Creed ");
						
						try {
							
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						}
						
						catch(InputMismatchException e) {
							
						System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
						sc.nextLine();
											  									  
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						System.out.println("Reiniciando o programa...");
						
						}
										
						finally {

						}
									
						if(opcao3 == 1) {
							
							//GTA
							
							GrandTheftAuto gta = new GrandTheftAuto();
							
							int opcao4;
							
							System.out.println("Qual GTA para consoles da velha geração(PS3 e Xbox 360) você deseja? ");
							System.out.println("1) GTA San Andreas (Remastered) - 100 R$ ");
							System.out.println("2) GTA Liberty City - 50 R$ ");
							System.out.println("3) GTA Vice City - 50 R$ ");
							
							try {
								
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							}
							
							catch(InputMismatchException e) {
								
							System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
							sc.nextLine();
												  										  
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							System.out.println("Reiniciando o programa...");
							
							}
											
							finally {

							}
												
							System.out.println("Qual a quantidade ? ");
							gta.setQuantidade(sc.nextInt());
							
							if(opcao4 == 1) {
								
								gta.setTipo("GTA San Andreas");
								
								gta.calcularPreço(gta.getTipo(), gta.getQuantidade());
								
								gta.status();
								
								lista.add(gta.getTipo() + "(" + gta.getQuantidade() + ")");
								
							}
							
							if(opcao4 == 2) {
								
								gta.setTipo("GTA Liberty City");
								
								gta.calcularPreço(gta.getTipo(), gta.getQuantidade());
								
								gta.status();
								
								lista.add(gta.getTipo() + "(" + gta.getQuantidade() + ")");
								
							}
							
		                    if(opcao4 == 3) {
								
								gta.setTipo("GTA Vice City");
								
								gta.calcularPreço(gta.getTipo(), gta.getQuantidade());
								
								gta.status();
								
								lista.add(gta.getTipo() + "(" + gta.getQuantidade() + ")");
								
							}
			
						}
						
						if(opcao3 == 2) {
							
							//CALL OF DUTY
							
							CallOfDuty cod = new CallOfDuty();
							
							int opcao4;
							
							System.out.println("Qual COD para consoles da velha geração(PS3 e Xbox 360) você deseja? ");
							System.out.println("1) Black Ops 2 - 125 R$ ");
							System.out.println("2) Black Ops 1 - 100 R$ ");
							System.out.println("3) Modern Warfare 3 - 75 R$ ");
							System.out.println("4) Modern Warfare 2 - 50 R$ ");
							
							try {
								
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							}
							
							catch(InputMismatchException e) {
								
							System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
							sc.nextLine();
												  										  
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							System.out.println("Reiniciando o programa...");
							
							}
											
							finally {

							}
												
							System.out.println("Qual a quantidade ? ");
							cod.setQuantidade(sc.nextInt());
											
		                    if(opcao4 == 1) {
								
								cod.setTipo("Black Ops 2");
								
								cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
								
								cod.status();
								
								lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
								
							}
							
							if(opcao4 == 2) {
								
								cod.setTipo("Black Ops 1");
								
								cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
								
								cod.status();
								
								lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
								
							}
							
		                    if(opcao4 == 3) {
								
								cod.setTipo("Modern Warfare 3");
								
								cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
								
								cod.status();
								
								lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
								
							}
		                    
		                    if(opcao4 == 4) {
		                    	
		                    	cod.setTipo("Modern Warfare 2");
		                    	
		                    	cod.calcularPreço(cod.getTipo(), cod.getQuantidade());
		                    	
		                    	cod.status();
		                    	
		                    	lista.add(cod.getTipo() + "(" + cod.getQuantidade() + ")");
		                    	
		                    }
					
						}
						
						if(opcao3 == 3) {
							
							//FIFA
							
							Fifa fifa = new Fifa();
							
		                    int opcao4;
							
							System.out.println("Qual Fifa para consoles da velha geração(PS3 e Xbox 360) você deseja? ");
							System.out.println("1) Fifa 15 - 100 R$ ");
							System.out.println("2) Fifa 14 - 75 R$ ");
							System.out.println("3) Fifa 13 - 50 R$ ");
							System.out.println("4) Fifa 12 - 25 R$ ");
							
							try {
								
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							}
							
							catch(InputMismatchException e) {
								
							System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
							sc.nextLine();
												  										  
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							System.out.println("Reiniciando o programa...");
							
							}
											
							finally {

							}					
							
							System.out.println("Qual a quantidade ? ");
							fifa.setQuantidade(sc.nextInt());
												
		                    if(opcao4 == 1) {
								
								fifa.setTipo("Fifa 15");
								
								fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
								
								fifa.status();
								
								lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
								
							}
							
							if(opcao4 == 2) {
								
								fifa.setTipo("Fifa 14");
								
								fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
								
								fifa.status();
								
								lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
								
							}
							
		                    if(opcao4 == 3) {
								
								fifa.setTipo("Fifa 13");
								
								fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
								
								fifa.status();
								
								lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
								
							}
		                    
		                    if(opcao4 == 4) {
		                    	
		                    	fifa.setTipo("Fifa 12");
		                    	
		                    	fifa.calcularPreço(fifa.getTipo(), fifa.getQuantidade());
		                    	
		                    	fifa.status();
		                    	
		                    	lista.add(fifa.getTipo() + "(" + fifa.getQuantidade() + ")");
		                    	
		                    }
				
						}
						
						if(opcao3 == 4) {
							
							//BATTLEFIELD
							
							Battlefield bf = new Battlefield();
							
		                    int opcao4;
							
							System.out.println("Qual Battlefield para consoles da velha geração(PS3 e Xbox 360) você deseja? ");
							System.out.println("1) Battlefield 4 - 115 R$ ");
							System.out.println("2) Battlefield 3 - 100 R$ ");
							
							try {
								
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							}
							
							catch(InputMismatchException e) {
								
							System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
							sc.nextLine();
												  										  
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							System.out.println("Reiniciando o programa...");
							
							}
											
							finally {

							}
												
							System.out.println("Qual a quantidade ? ");
							bf.setQuantidade(sc.nextInt());
							
							if(opcao4 == 1) {
								
								bf.setTipo("BF4");
								
								bf.calcularPreço(bf.getTipo(), bf.getQuantidade());
								
								bf.status();
								
								lista.add(bf.getTipo() + "(" + bf.getQuantidade() + ")");
								
							}
							
							if(opcao4 == 2) {
								
								bf.setTipo("BF3");
								
								bf.calcularPreço(bf.getTipo(), bf.getQuantidade());
								
								bf.status();
								
								lista.add(bf.getTipo() + "(" + bf.getQuantidade() + ")");
								
							}

						}
						
						if(opcao3 == 5) {
							
							//ASSASSINS CREED
							
							AssassinsCreed ac = new AssassinsCreed();
							
		                    int opcao4;
							
							System.out.println("Qual AssassinsCreed para consoles da velha geração(PS3 e Xbox 360) você deseja? ");
							System.out.println("1) AssassinsCreed Black Flag - 125 R$ ");
							System.out.println("2) AssassinsCreed 3 - 100 R$ ");
							System.out.println("3) AssassinsCreed Revelations - 100 R$ ");
							System.out.println("4) AssassinsCreed Brotherhood - 50 R$ ");
							
							try {
								
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							}
							
							catch(InputMismatchException e) {
								
							System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
							sc.nextLine();
												  										  
							System.out.println("Informe a opção desejada: ");
							opcao4 = sc.nextInt();
							
							System.out.println("Reiniciando o programa...");
							
							}
											
						   finally {

							}
											
							System.out.println("Qual a quantidade ? ");
							ac.setQuantidade(sc.nextInt());
												
		                    if(opcao4 == 1) {
								
								ac.setTipo("Black Flag");
								
								ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
								
								ac.status();
								
								lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
								
							}
							
							if(opcao4 == 2) {
								
								ac.setTipo("Assassin's Creed 3");
								
								ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
								
								ac.status();
								
								lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
								
							}
							
		                    if(opcao4 == 3) {
								
								ac.setTipo("Revelations");
								
								ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
								
								ac.status();
								
								lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
								
							}
		                    
		                    if(opcao4 == 4) {
		                    	
		                    	ac.setTipo("Brotherhood");
		                    	
		                    	ac.calcularPreço(ac.getTipo(), ac.getQuantidade());
		                    	
		                    	ac.status();
		                    	
		                    	lista.add(ac.getTipo() + "(" + ac.getQuantidade() + ")");
		                    	
		                    }

						}
						
					}
			
				}
				
				if(opcao == 3) {
					
					int opcao2;
					
					Headset h7 = new Headset();
					
					System.out.println("Qual marca de headset você deseja ? ");
					System.out.println("1) HyperX ");
					System.out.println("2) Razer ");
					
					try {
						
					System.out.println("Informe a opção desejada: ");
					opcao2 = sc.nextInt();
					
					}
					
					catch(InputMismatchException e) {
						
					System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
					sc.nextLine();
										  							  
					System.out.println("Informe a opção desejada: ");
					opcao2 = sc.nextInt();
					
					System.out.println("Reiniciando o programa...");
					
					}
									
					finally {

					}
								
					if(opcao2 == 1) {
						
						int opcao3;
						
						System.out.println("Qual headset da HyperX você deseja ? ");
						System.out.println("1) HyperX Cloud Stinger ");
						System.out.println("2) HyperX Cloud 9 ");
						
						try {
							
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						}
						
						catch(InputMismatchException e) {
							
						System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
						sc.nextLine();
											  									  
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						System.out.println("Reiniciando o programa...");
						
						}
										
						finally {

						}
										
						System.out.println("Qual a quantidade? ");
						h7.setQuantidade(sc.nextInt());
						
						if(opcao3 == 1) {
							
							h7.setMarca("HyperX");
							h7.setTipo("Cloud Stinger");
							
							h7.calcularPreço(h7.getMarca(), h7.getTipo(), h7.getQuantidade());
							
							h7.status();
							
							lista.add(h7.getTipo() + "(" + h7.getQuantidade() + ")");
							
						}
						
						if(opcao3 == 2) {
							
							h7.setMarca("HyperX");
							h7.setTipo("Cloud 9");
							
							h7.calcularPreço(h7.getMarca(), h7.getTipo(), h7.getQuantidade());
							
							h7.status();
							
							lista.add(h7.getTipo() + "(" + h7.getQuantidade() + ")");
							
						}
						
					}
					
					if(opcao2 == 2) {
						
		                int opcao3;
						
						System.out.println("Qual headset da Razer você deseja ? ");
						System.out.println("1) Razer Kraken Pro ");
						System.out.println("2) Razer Kraken ");
						
						try {
							
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						}
						
						catch(InputMismatchException e) {
							
						System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
						sc.nextLine();
											  									  
						System.out.println("Informe a opção desejada: ");
						opcao3 = sc.nextInt();
						
						System.out.println("Reiniciando o programa...");
						
						}
										
						finally {

						}
									
						System.out.println("Qual a quantidade? ");
						h7.setQuantidade(sc.nextInt());
						
						if(opcao3 == 1) {
							
							h7.setMarca("Razer");
							h7.setTipo("Kraken Pro");
							
							h7.calcularPreço(h7.getMarca(), h7.getTipo(), h7.getQuantidade());
							
							h7.status();
							
							lista.add(h7.getTipo() + "(" + h7.getQuantidade() + ")");
							
						}
						
						if(opcao3 == 2) {
							
							h7.setMarca("Razer");
							h7.setTipo("Kraken");
							
							h7.calcularPreço(h7.getMarca(), h7.getTipo(), h7.getQuantidade());
							
							h7.status();
							
							lista.add(h7.getTipo() + "(" + h7.getQuantidade() + ")");
							
						}
						
					}
			
				}
				
			}
			
			if(opcao1 == 2) {
				
				System.out.println("");
				System.out.println("Finalizando pedido...");
				System.out.println("Obrigado pela preferência!!");
				System.out.println("");
				
				break;
				
			}
			
		}
		
		Pagamento pag = new Pagamento();
		
		int opção3;
		
		System.out.println("Qual a forma de pagamento desejada?");
        System.out.println("1) Dinheiro");
        System.out.println("2) Cheque");
        
        try {
        	
        System.out.print("Informe a opção desejada: ");
        opção3 = sc.nextInt();
        pag.setTipo(opção3);
        
        }
        
        catch(InputMismatchException e) {
			
        System.out.println("Você digitou uma letra. Por gentilza, digite apenas o numero da sua opção desejada.");
        sc.nextLine();
        					         					  
        System.out.println("Informe a opção desejada: ");
        opção3 = sc.nextInt();
        pag.setTipo(opção3);
        
        System.out.println("Reiniciando o programa...");
        
        }
        				
        finally {

        }
             
        if(opção3 == 2) {
        	
        	System.out.print("Informe o número do cheque: ");
        	pag.setNum(sc.nextInt());
        	System.out.print("Informe o número da conta: ");
        	pag.setConta(sc.nextInt());
        	System.out.print("Informe a agência: ");
        	pag.setAgencia(sc.nextInt());
        	System.out.print("Informe o banco: ");
        	pag.setBanco(sc.next());
        	
        }
		
			pag.status();
		   
			System.out.println("Lista de produtos: " + lista);
			
			sc.close();
			
	}

}