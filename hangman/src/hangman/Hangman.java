package hangman;
import java.util.*;

public class Hangman {
	public static void main(String[] args){
		Scanner ch = new Scanner(System.in);
		 boolean isExit = false;
		do{
			System.out.println("Shuffle Game & Yan yin yaw pakapow ying shup Game");
			System.out.println("1.Shuffle Game");
			System.out.println("2.Yan yin yaw pakapow ying shup Game");
			System.out.println("0.Quit");
			System.out.print("Please select 1 or 2 : ");
			int choice = ch.nextInt();
			switch(choice){
		 
				case 1: 
					shuffle (); 
					break;
				case 2 :
					yingshup();
					break;
				case 0 :
					isExit = true;
					System.out.println("Bye Be ~~~");
					break;
				default :
					System.out.print("Please select 0 1 2 only");
			}
		}while(!isExit);	
	}
	public static void shuffle (){
		Scanner answord = new Scanner(System.in);
		System.out.println("-------------------------------------------------------");
		System.out.println(" #####  #     # #     # ####### ####### #       #######");
		System.out.println("#     # #     # #     # #       #       #       #      "); 
		System.out.println("#       #     # #     # #       #       #       #      "); 
		System.out.println(" #####  ####### #     # #####   #####   #       #####  "); 
		System.out.println("      # #     # #     # #       #       #       #      "); 
		System.out.println("#     # #     # #     # #       #       #       #      "); 
		System.out.println(" #####  #     #  #####  #       #       ####### #######"); 
		System.out.println("-------------------------------------------------------");
	
			String[] answerword = new String[]{"hippopotemas",
												"mosquito",
												"lizard",
												"lion",
												"koara"};
			String[] word = new String[]{"smitphpooaup",
											"qoiosmut",
											"kaalo",
											"arlizd",
											"lino"};
			//Variable
		String a = "";
		int score = 0;
		boolean iscorect = false, isExit = false;
		
		System.out.println("1.Arrange the letters to from the word corect");
		System.out.println("2.next  = Skip");
		System.out.println("3.quite = End Game!!");
		
		do{
			for(int i = 0;i < word.length;i++){
				isExit = false;
				iscorect = false;
				while(!iscorect && !isExit){
					
					System.out.println((i+1)+". " + word[i]);
					System.out.print("Answord is : ");
					a = answord.nextLine();
					if(a.equals(answerword[i])){
						iscorect = true;
						score++;
						
					}else if(!a.equals(answerword[i])){
						if(a.equals("quit")){
							System.out.printf("Score %d !!!",score);
							isExit = true;
							break;
						}else if(a.equals("next")){
							break;
						}
						else {
							iscorect = false;
						}
						
					}
					
				}
				
				if(isExit){
					break;
				}
				System.out.println("Score "+score);
				
				
			}
			
		}
		while(!isExit);
		
	}
	
	public static void yingshup(){
		System.out.println(" _  _   __   _  _  _  _  ____  ____ ");
		System.out.println("/ )( \\ / _\\ ( \\/ )( \\/ )(  __)(  _ \\"); 
		System.out.println(") __ (/    \\/ \\/ \\/ \\/ \\ ) _)  )   /");    
		System.out.println("\\_)(_/\\_/\\_/\\_)(_/\\_)(_/(____)(__\\_)");
		System.out.println(" ____   ___  __  ____  ____   __  ____  ____ ");  
		System.out.println("/ ___) / __)(  )/ ___)/ ___) /  \\(  _ \\/ ___)");  
		System.out.println("\\___ \\( (__  )( \\___ \\\\___ \\(  O ))   /\\___ \\");
		System.out.println("(____/ \\___)(__)(____/(____/ \\__/(__\\_)(____/");  
		System.out.println(" ____   __   ____  ____  ____ ");
		System.out.println("(  _ \\ / _\\ (  _ \\(  __)(  _ \\");
		System.out.println(" ) __//    \\ ) __/ ) _)  )   /");
		System.out.println("(__)  \\_/\\_/(__)  (____)(__\\_)");
		System.out.println("=================================================================");
		int HScore=0,CScore=0, x = 0;
		boolean isCorrect=false;
		Scanner sc=new Scanner(System.in);
		int i=0;
			while(i<1){
				isCorrect=false;
				if(HScore!=5&&CScore!=5){
					i=0;
					System.out.println("Please input 1(Hammer),2(Scissors),3(Paper) : ");
					while(!isCorrect){
						try{
							x=sc.nextInt();
							isCorrect = true;
						} catch(Exception e){
							System.out.println("Please input 1(Hammer),2(Scissors),3(Paper) : ");
							isCorrect = false;
							sc.nextLine();
						}
					}
					
					
					switch (x){
						case 1:
							int xx=(int )(Math.random() * 3 + 1	);
							System.out.println(xx);
							if(xx==1){
								System.out.println("Draw!!");
							}
							else if(xx==2){
								System.out.println("Win!!!");
								HScore+=1;
							}
							else if(xx==3){
								System.out.println("Lose!");
								CScore+=1;
							}
							break;
						case 2:
							int yy=(int )(Math.random() * 3 + 1);
							System.out.println(yy);
							if(yy==2){
								System.out.println("Draw!!");
							}
							else if(yy==3){
								System.out.println("Win!!!");
								HScore+=1;
							}
							else if(yy==1){
								System.out.println("Lose!");
								CScore+=1;
							}
							break;
						case 3:
							int zz=(int )(Math.random() * 3 + 1);
							System.out.println(zz);
							if(zz==3){
								System.out.println("Draw!!");
							}
							else if(zz==1){
								System.out.println("Win!!!");
								HScore+=1;
							}
							else if(zz==2){
								System.out.println("Lose!");
								CScore+=1;
							}
							break;
						default:
							System.out.println("Error command not found!!!");
							i=1;
						}
						System.out.println("Human Score : "+HScore);
						System.out.println("Computer Score : "+CScore);
						}
				else if(HScore==5){
					System.out.println(" !!!       !!!      YYYYYYY       YYYYYYY                                     WWWWWWWW                           WWWWWWWW iiii                         !!!       !!! ");
				    System.out.println("!!:!!     !!:!!     Y:::::Y       Y:::::Y                                     W::::::W                           W::::::Wi::::i                       !!:!!     !!:!!"); 
				    System.out.println("!:::!     !:::!     Y:::::Y       Y:::::Y                                     W::::::W                           W::::::W iiii                        !:::!     !:::!");    
				    System.out.println("!:::!     !:::!     Y::::::Y     Y::::::Y                                     W::::::W                           W::::::W                             !:::!     !:::!");
				    System.out.println("!:::!     !:::!     YYY:::::Y   Y:::::YYYooooooooooo   uuuuuu    uuuuuu        W:::::W           WWWWW           W:::::Wiiiiiiinnnn  nnnnnnnn         !:::!     !:::!");  
				    System.out.println("!:::!     !:::!        Y:::::Y Y:::::Y oo:::::::::::oo u::::u    u::::u         W:::::W         W:::::W         W:::::W i:::::in:::nn::::::::nn       !:::!     !:::!");  
				    System.out.println("!:::!     !:::!         Y:::::Y:::::Y o:::::::::::::::ou::::u    u::::u          W:::::W       W:::::::W       W:::::W   i::::in::::::::::::::nn      !:::!     !:::!");
				    System.out.println("!:::!     !:::!          Y:::::::::Y  o:::::ooooo:::::ou::::u    u::::u           W:::::W     W:::::::::W     W:::::W    i::::inn:::::::::::::::n     !:::!     !:::!");  
				    System.out.println("!:::!     !:::!           Y:::::::Y   o::::o     o::::ou::::u    u::::u            W:::::W   W:::::W:::::W   W:::::W     i::::i  n:::::nnnn:::::n     !:::!     !:::!");
				    System.out.println("!:::!     !:::!            Y:::::Y    o::::o     o::::ou::::u    u::::u             W:::::W W:::::W W:::::W W:::::W      i::::i  n::::n    n::::n     !:::!     !:::!");
				    System.out.println("!!:!!     !!:!!            Y:::::Y    o::::o     o::::ou::::u    u::::u              W:::::W:::::W   W:::::W:::::W       i::::i  n::::n    n::::n     !!:!!     !!:!!");
				    System.out.println(" !!!       !!!             Y:::::Y    o::::o     o::::ou:::::uuuu:::::u               W:::::::::W     W:::::::::W        i::::i  n::::n    n::::n      !!!       !!! ");
				    System.out.println("                           Y:::::Y    o:::::ooooo:::::ou:::::::::::::::uu              W:::::::W       W:::::::W        i::::::i n::::n    n::::n                    ");
				    System.out.println(" !!!       !!!          YYYY:::::YYYY o:::::::::::::::o u:::::::::::::::u               W:::::W         W:::::W         i::::::i n::::n    n::::n      !!!       !!! ");
				    System.out.println("!!:!!     !!:!!         Y:::::::::::Y  oo:::::::::::oo   uu::::::::uu:::u                W:::W           W:::W          i::::::i n::::n    n::::n     !!:!!     !!:!!");
				    System.out.println(" !!!       !!!          YYYYYYYYYYYYY    ooooooooooo       uuuuuuuu  uuuu                 WWW             WWW           iiiiiiii nnnnnn    nnnnnn      !!!       !!! ");

					break;
				}
				else if(CScore==5){
					System.out.println("#     #                  #                            ");
				    System.out.println(" #   #   ####  #    #    #        ####   ####  ###### ");
				    System.out.println("  # #   #    # #    #    #       #    # #      #      ");
				    System.out.println("   #    #    # #    #    #       #    #  ####  #####  ");
				    System.out.println("   #    #    # #    #    #       #    #      # #      ");
				    System.out.println("   #    #    # #    #    #       #    #      # #      ");
				    System.out.println("   #     ####   ####     #######  ####   ####  ###### ");
					break;
				}
		}
	
	}
}