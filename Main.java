import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      encounterOne();
     
    }
      public static void encounterOne(){ for(int i=1; i<=20; i++){
    	  System.out.print(":)");
      }
      System.out.println();
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("You're starting on a pedestal as do 23 other tributes in front of a cornucopia. \nYou vs everyone else. \nIn front of you are weapons of choice. As the gong rings, you run for supplies. \nThe first tributes to reach the weapons have an advantage. You grab a knife and backpack as a tribute approaches.");
        System.out.println("be clever: (enter only '1' or '2') 1) stab tribute, OR 2) hit with backpack.");
        int userInput=keyboard.nextInt();
        if(userInput==1){
            System.out.println("knife kills opponent");
            encounterTwo(); 
         }
        if(userInput==2){
        System.out.println("tribute dodges swinging backpack and throws a knife at your heart, killing you. \n\nGAME OVER! \nPlacing out of 24: 24th\n\nNEW GAME HAS STARTED\n");
        encounterOne();
       
      }
      }
      
      public static void encounterTwo(){ for(int i=1; i<=20; i++){
    	  System.out.print(":)");
      }
      System.out.println();
          Scanner keyboard = new Scanner(System.in);
      System.out.println("You survive the fight, but the bloodbath isn't over. \nYou choose to: 1) keep fighting to show your jawline, OR 2) run out of the cornucopia clearing and into the forest.");
      
      int userGame=keyboard.nextInt();
      if(userGame==1){
          System.out.println("you start to fight with another tribute. This time, a career! \nYou fight competently, but the career is too clever and eventually kills you! \n\nGAME OVER!\nPlacing out of 24: 18th\n\nNEW GAME HAS STARTED\n");
          encounterOne();
      }
      if(userGame==2){
          System.out.println("congrats! You survived the bloodbath and make it through the trees! 10 tributes died in the bloodbath: District 5 girl, District 6 boy, both from 7, District 9 boy, both from 10, District 11 boy, and both from 12. \nAfter the bloodbath, your district partner that is also from district 4 finds you with the girl from District 6 (they became allies) \nand asks for an alliance. You: 1) decline, OR 2) agree.");
          encounterThree();
          
      }
      }
      
      public static void encounterThree(){ for(int i=1; i<=20; i++){
    	  System.out.print(":)");
      }
      System.out.println();
          Scanner keyboard = new Scanner(System.in);
          int userDay=keyboard.nextInt(); 
          if(userDay==1){
              System.out.println("your partner gets upset that you declined, so she and the girl from 6 kill you. \n\nGAME OVER!\nPlacing out of 24: 14th\n\nNEW GAME HAS STARTED\n");
              encounterOne();
          }    
          if(userDay==2){
              System.out.println("okay, great! You guys have agreed to form an alliance and promise to protect one another. You guys keep moving through \nthe arena and find a place to sleep for the night. However, early the next morning before sunrise, \nthe girl from District 9, who has set camp close to you and your allies, makes a fire, drawing the careers to her. \nAfter they kill her, the careers head toward your camp and you sneak behind a tree trunk that they arrive nearby. \nYou see the girl from 2, boy from 1, girl from 3 and both from 8, noticing that they made an alliance. \nThe girl from 6 that has a bow and arrow asks you whether to shoot the arrow at them or not to take advantage. You say: 1) yes, OR 2) no.");
              encounterFour();
          }  
      }
      
          public static void encounterFour(){ for(int i=1; i<=20; i++){
        	  System.out.print(":)");
          }
          System.out.println(); 
              Scanner keyboard = new Scanner(System.in);
              int userFight=keyboard.nextInt();
              if(userFight==1){
                  System.out.println("success! Allegra (District 6 girl) shoots the boy from 8 then you fight. You and your district partner also manage to kill the girls from 3 and 8, while the boy from 1 and girl from 2 run away. \nLater in the morning, the careers kill the boy from 5. Only 9 tributes left in the games!");
                  encounterFive();
                  
                  }
                  if(userFight==2){
                      System.out.println("oh, no! Allegra doesn't shoot and the careers therefore find you behind the tree and kill you all! They took the advantage instead!\nPlacing out of 24: 12th\n\nNEW GAME HAS STARTED");
                      encounterOne();
                  }
          
          }
                  public static void encounterFive(){ for(int i=1; i<=20; i++){
                	  System.out.print(":)");
                  }
                  System.out.println();
                      Scanner keyboard = new Scanner(System.in);
                  System.out.println("later that day, you, Laura and Allegra decide to have Laura steal the water and food supplies from the careers while you and Allegra create a diversion. \nYou diversion: 1) Allegra shoots one career and you let them chase you, OR 2) you walk down to the careers, stab one, then run.");
                 
                  
                  int userNight=keyboard.nextInt();
                  if(userNight==1){
                      System.out.println("Allegra ends up shooting the girl from District 1. They then run and the boy from 3 chases them. \nAfter the girl from 1 dies and the boys from 1 and 2 fail to save her, they get up and run after you too. \nThat's when Laura approaches the career's camp from hiding and takes all of their food, and takes their water bottles and fills it in the creek next to the supplies. \nOnce the boy from 3 reaches you, you manage to kill him and the boy from 1 and both tributes from 2 lose you. However, you need to find Laura tommorow because you lost her.");
                      encounterSix();
                  }
                      
                      if(userNight==2){
                          System.out.println("Looks like running close up to the careers did't work out. You attempted to stab the girl from 1 but the boy from 1 snuck around you and killed you himself. \nYou should have just hid behind a tree and have Allegra shoot her from a distance! \nGAME OVER\nPlacing out of 24: 8th\n\nNEW GAME HAS STARTED.");
                          encounterOne();}
                      
                  }
                  
                  
                  public static void encounterSix(){ for(int i=1; i<=20; i++){
                	  System.out.print(":)");
                  }
                  System.out.println();
                	  Scanner keyboard = new Scanner(System.in);
                	  System.out.println("You and Allegra find a rock to sleep on for the night, determined to find Laura the next day. \nIn the morning, while you and Allegra go for a walk, you hear Laura screaming at a distance and run for her. \nYou find her sitting next to the boy from 2's body as she killed him then you guys run. Allegra runs ahead but the girl from 2 appears behind a tree and \nkills her, then runs away. You decide to: 1) run after the girl from 2 and kill her to avenge Allegra's death, OR 2) cry \nnext to her body then walk away to somewhere safe where the careers won't find you.");
                	  
                  
                	  int userSad=keyboard.nextInt();
                	  if(userSad==1){
                		  System.out.println("You run after the girl from 2 but she turns around and throws a knife at you. \n\nGAME OVER!\nPlacing out of 24: 5th\n\nNEW GAME HAS STARTED\n");
                		  encounterOne();
                	  }
                  
                	  
                	  if(userSad==2){
                	  	  System.out.println("You and Laura end up surviving, and walk to the far side of the arena to stay safe, smoldering up in a tree.");
                	  	  encounterSeven();
                	  }
                  }
                	  
                	  public static void encounterSeven(){ 
                		  
                	for(int i=1; i<=20; i++){
                    	  System.out.print(":)");
                      }
                      System.out.println();
                		  Scanner keyboard = new Scanner(System.in);
                		  System.out.println("There are only five of you left: you and Laura, the boy from 1, the girl from 2 and the girl from 11. \nBy late afternoon, you and Laura see the boy from 1 and girl from 2 chasing the girl from 11 near your tree. \nAfter the boy from 1 kills the girl from 11, Laura hops out of the tree and throws a knife at the girl from 2. \nAfter her cannon sounds, the boy from 1 throws a knife at Laura and she falls to the ground. You: 1) immediatly \nhop out of the tree to fight, OR 2) hide in the tree until he approaches the bottom in an attempt to finish off Laura.");
                		  
                		  
                		  int userWin=keyboard.nextInt();
                		  if(userWin==1){
                			  System.out.println("Once the boy from 1 sees you, you run into each other and he stabs you first. After he finished both you and Laura off, he ends up winning the games. You, however, have died. \n\nGAME OVER!\nPlacing out of 24: 2nd\n\nNEW GAME HAS STARTED\n");
                			  encounterOne();
                		  }
                		  
                		  if(userWin==2)
                			  System.out.println("As the boy from 1 approaches Laura, you hop out of the tree and stab him in the back, killing him. \nAfter his cannon fire, you walk up to Laura's body on the ground as she says thankyou for being such a great friend before dying. \nYou have won the games!");
                		  }
                	  }
                  

              
              
              
          
          
      
      

      
    

