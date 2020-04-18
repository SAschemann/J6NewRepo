/*
    This is the class for the game gui. It has four clickable options and a text area for setting text. 
    There are two nested classes here, and were nested so that they could change the prompts and options texts.
*/
package prototwopulled;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import utilities.SessionHandler;
import java.io.*;
import java.lang.reflect.*;
//test


public class GameGUI extends javax.swing.JFrame {

    //Variable declarations
    public static UserPlayer internalPlayer;     
    String option;
    //Declare a VaultLogic object to call that classes method on
    VaultLogic vLogic = new VaultLogic();
    
    //**Declared an object of type session handler to call the session ahndler on
    SessionHandler sesh = new SessionHandler();
    
    //grabs the boolean variable startingState from ProtoGUI used in determining
    //whether a new game is being created or loaded
    
    //New Game Constructor
    public GameGUI(UserPlayer player) {
            initComponents();
            setLocation(415,100);
            setResizable(false);
            jLabel1.setVisible(false);
            //set internalplayer variable to the player variable which is passed in
            internalPlayer = player;
            //declare a vaultrooms object to call the starting method on
            VaultRooms vRooms = new VaultRooms();
            //this method call using the vRooms object created here sets the prompt and options for the first "room" at the start of the game.
            vRooms.intro();
    }
    
    //Load game constructor, same as new game constructor but loads game functionality
    public GameGUI(UserPlayer player, String str){
            //SessionHandler.load();
            //System.out.println(internalPlayer.getPlayerPosition());
            initComponents();
            setLocation(415,100);
            setResizable(false);
            
            //set internalplayer variable to the elements in the file passed in
            SessionHandler.load();
            
            //this if statement checks the player object to see if they have the pipboy equipped and then hides or displays the pipboy accordingly 
            if(internalPlayer.inquirePipBoy() == false){
                jLabel1.setVisible(false);
            } else{
                jLabel1.setVisible(true);
            }

            //declare a vaultrooms object to call the starting method on
            VaultRooms vRooms = new VaultRooms();
            //declare a vaultlogic object to call the starting method on
            VaultLogic vLogic = new VaultLogic();
            
            
            
            //This SOP statement prints to the console to check for the player position            
            //System.out.println("Before switch statement + " + internalPlayer.getPlayerPosition() + internalPlayer.inquirePipBoy());
            
            //switch statement that sets prompt and options after the user chooses to load a save, runs off internalplayer object which is 
            //the loaded player object from the sessionhandler.load() method
            switch (internalPlayer.getPlayerPosition()){
                
                //each room will need a case, but that's not so bad for a save and load feature. 
                case "firstDeadEnd":
                    //this sop statement checks to make sure we're getting inside the switch statement
                    //System.out.println("Inside switch statement");
                    //this method call sets the prompt and option for the firstDeadEndRoom
                    vLogic.firstDeadEndRoom();
                break;
                
                case "firstHallway":
                    vLogic.firstHallway();
                break;
                
                case "firstTerminalPartOne":
                    vLogic.firstTerminalPartOne();
                break;
                
                case "deadBody":
                    vLogic.inspectDeadBody();
                break;
                
                case "deadBodyEquipped":
                    vLogic.inspectDeadBodyHasPipBoy();
                break;
                
                case "introTwo":
                    vLogic.introTwo();
                break;
                
                case "startCont":
                    vLogic.startCont();
                break;
                
                case "endOfHallDoor":
                    vLogic.endOfHallDoor();
                break;
                
                case "bunkhouse":
                    vLogic.bunkhouse();
                break;
                
                case "waterRoom":
                    vLogic.waterRoom();
                break;
                
                case "firstTerminalPartTwo":
                    vLogic.firstTerminalPartTwo();
                break;
                
                case "bunkroom":
                    vLogic.bunkroom();
                break;
                
                case "maintenanceCloset":
                    vLogic.maintenanceCloset();
                break;
                
                case "upStairsLanding":
                    vLogic.upStairsLanding();
                break;
                
                case "arcingWires":
                    vLogic.arcingWires();
                break;
                
                case "firstLockedDoor":
                    vLogic.firstLockedDoor();
                break;

            }//end of loading switch statement
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escape Vault 23");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 255, 0));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jTextArea1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 255, 0));
        jButton1.setBorder(null);
        jButton1.setFocusable(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 255, 0));
        jButton2.setBorder(null);
        jButton2.setFocusable(false);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 255, 0));
        jButton3.setBorder(null);
        jButton3.setFocusable(false);
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 255, 0));
        jButton4.setBorder(null);
        jButton4.setFocusable(false);
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 51));
        jLabel1.setText("Pip Boy: Equipped");
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);

        jBSave.setText("Save");
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBSave)
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSave))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //This method updates the game gui's prompt
    public  void setPrompt(String prompt){
        jTextArea1.setText(prompt);
    }
    
    //This method sets all options. It will be possible to write methods for setting any number of options and hiding the others, based on what that particular
    //"room" requires
    public void setAllOptions(String Op1, String Op2, String Op3, String Op4){
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton1.setText(Op1);
        jButton2.setText(Op2);
        jButton3.setText(Op3);
        jButton4.setText(Op4);
    }
    
    //Use this method to set the prompts for one option
    public void setOneOption(String Op1){
        jButton1.setVisible(true);
        jButton1.setText(Op1);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
    }
    
    //Use this method to set the prompts for continuing to view text on a computer terminal. 
    public void contComputerTerm(){
        jButton1.setVisible(true);
        jButton1.setText("Continue Reading");
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
    }
    
    //Use this method to set the prompts for concluding to view text on a computer terminal. Should be called only after contComputerTerm() is called.
    public void contComputerTermConclude(){
        jButton1.setText("Exit Terminal");
    }
    
    public void setTwoOptions(String Op1, String Op2){
        jButton1.setText(Op1);
        jButton2.setText(Op2);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
    }
    
    public void setThreeOptions(String Op1, String Op2, String Op3){
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(false);
        jButton1.setText(Op1);
        jButton2.setText(Op2);
        jButton3.setText(Op3);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //This is what happens when a button is clicked. The variable option is set to a string for this option, then
        //the gameLogic method is called which contains the switch statement. It takes the variable option as well as the
        //internalPlayer variable which is the player class object. 
        option = "Option1";
        //The player object is returned from the gameLogic method so that any changes made to the user's character don't go out of scope
        internalPlayer = vLogic.gameLogic(internalPlayer, option);
        //Resets the save prompt
        jBSave.setText("Save");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //This is what happens when a button is clicked. The variable option is set to a string for this option, then
        //the gameLogic method is called which contains the switch statement. It takes the variable option as well as the
        //internalPlayer variable which is the player class object. 
        option = "Option2";
        //The player object is returned from the gameLogic method so that any changes made to the user's character don't go out of scope
        internalPlayer = vLogic.gameLogic(internalPlayer, option);
        //Resets the save prompt
        jBSave.setText("Save");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //This is what happens when a button is clicked. The variable option is set to a string for this option, then
        //the gameLogic method is called which contains the switch statement. It takes the variable option as well as the
        //internalPlayer variable which is the player class object. 
        option = "Option3";
        //The player object is returned from the gameLogic method so that any changes made to the user's character don't go out of scope
        internalPlayer = vLogic.gameLogic(internalPlayer, option);
        //Resets the save prompt
        jBSave.setText("Save");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //This is what happens when a button is clicked. The variable option is set to a string for this option, then
        //the gameLogic method is called which contains the switch statement. It takes the variable option as well as the
        //internalPlayer variable which is the player class object. 
        option = "Option4";
        //The player object is returned from the gameLogic method so that any changes made to the user's character don't go out of scope
        internalPlayer = vLogic.gameLogic(internalPlayer, option);
        //Resets the save prompt
        jBSave.setText("Save");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        sesh.save();
        jBSave.setText("FILE SAVED!");
    }//GEN-LAST:event_jBSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    //This is the private nested class VaultRooms. It contains the methods which are called to set the game gui's prompts and options.
    private class VaultRooms{
    
        
        //This is an example of what a room method would look like. It contains method calls to the game screen class's methods that set the prompt and 
        //options text. These options are able to be called on the game screen class because this is a nested class.
        public void intro(){
            setPrompt("!!!.........'aghhh'.....................'oof'...............\n" +
                    "......................'ugh'................................. \n" +
                    "\n" +
                    "You feel nothing... Nothing but searing white-hot pain... It radiates through your skull and down your spine. You find yourself sitting down with your "+
                    "back to the wall. Your joints ache and your wrist feels tight. The well lit room does you no favors for your headache. 'Get it together....!' you almost gasp "+
                    "when you realize you can't remember your name! Who are you? What are you doing here?!"
                    );
            
            setOneOption("What the hell is happening???");
        }
        
        public void introTwo(){
            setPrompt("You look around and notice some immediate things other than the rusty equipment and lab materials strewn about. Specifically, a dead body lying on a table.........\n"+
                    "You begin to hyper-ventilate... Breathe... The second of clarity made you realize you remember this room! The hybrid Lab-Workshop... Why did you know that?"+
                    " The Vault... The Vault... You're in the Vault. A subterannean metal home, safe from the irradiated outside world. You can remember all that but not your name??? "+
                    "Breathe... You'll have to keep your wits to survive and escape... The Vault");
            
            setOneOption("Inspect the room further");
        }
        
        public void startCont(){
            setPrompt("Your eyes adjust to the harsh tubes of fluorescent lights and notice a few more things. The hybrid workshop was split in half. One side with greasy tools, parts, and "+
                    "doodads. The other beakers, scopes, and other various fragile items. At least you still recognized all these things. The body on the table you did not recognize though... "+
                    "You couldnt decide if the stench was from him or the room in general. A computer terminal glowed on an adjacent desk from the body, text on the screen. On one wall lied a large"+
                    "metallic door. An archway gave way to a darkened back room to your left.  ");
            
            setAllOptions("Open the metallic door", "Walk through the archway", "Inspect terminal", "Inspect body");
        }
        
        public void firstLockedDoor(){
            setPrompt("You wander over to the large metallic door, fastened with nickel-plated rivets and screws. In the center of the door lies a small, rectangular, crude monitor. "+
                    "You walk in front of the monitor and the green suddenly turns to red and a negative sounding tone emits from the monitor 'BRRZT'.... The door doesn't open");
            
            setOneOption("Go back");
        }

        public void firstHallway(){
            setPrompt("The PipBoy's haptic feedback vibrates, seemingly with the door as it rushes open. You dart outside and notice a yellow label 'BF' in the corner. This must be "+
                    "the basement floor. You're in a hallway illuminated in red Emergency lights. Behind you is the Lab/Workshop. At the end of this hallway a staircase leading upwards. "+
                    "On the opposite wall two doors lie next to each other. Cloudy plexiglass allows you to see shadows and shapes in the next rooms. A metallic placard on each door read Air-Water "+
                    "Filtration Room, and Bunkhousing.");
            setAllOptions("Back into Lab/Workshop Room", "Approach staircase", "Enter Bunkhouse", "Enter Air-Water Filtration Room");
        }
        
        public void firstDeadEndRoom(){
            setPrompt("You compose yourself and walk under the archway into the back room. Beakers and glassware lined one side of the wall while gears lined the other." +
                    " The room was dark besides a single shaft of light coming from a vent flush with the ceiling. The light rhythmically flickered inside the vent behind a loud fan. Every "+
                    "time the fan turned you could hear a light thump. The stench in this room... it was thick and foul. You felt queesy with a dreaded sense of deja-vu as you felt like somewhere"+
                    "deep inside you knew what was inside that vent. The dreaded feeling makes you step back into the previous room ");
            
            setOneOption("Go back to the main room of the lab-workshop");
        }
        
        public void firstTerminalPartOne(){
            setPrompt("DATE- 6-17-3012 \n"+
                    "Porter Cassius :-LOG-: We found a friend inside the Air/Water filter in the Water Room. Poor little guy was an inch from death and almost fell in the tank. "+
                    "Had to use a jackquarter to get him out so I think I'll call him Jack :) Gerald says the cat gives him the creeps.\n"+
                    "DATE- 6-19-3012 \n"+
                    ":-LOG-: Observer Mathew tried to kill Jack! Said everything from the outside was impure and had to go! I got him out of there and now hes staying with me in the Water Room. Poor guy");
            
            contComputerTerm();
        }
        
        public void firstTerminalPartTwo(){
            setPrompt("DATE- 6-24-3012. \n"+
                    ":-LOG-: Gerald say 2 get rid of Jackky cuz Im 'different' uhhh idk maybe but I like him n i like waterrrrrrrrrrrrrrrrrdzxf2\n\n"+
                    "DATE 6-29-3012\n"+
                    ":-LOG-: MEE-owWw MeoWWW mEEoW M:EOW. is what Jack say to me. jackie good boy. everyone love that boY :) Jack speak 2 me"+
                    "Jackie like the waTer too22222dffa22 can Jack swim??");
            
            contComputerTermConclude();
        }
        
        public void inspectDeadBody(){
            setPrompt("The body is cold and you look at the face to see if you recognize it but you don't. His eyes are bulged out a bit and his skin was pale. Although you don't recognize " +
                    "the face, a feeling in your stomach tells you somehow you know this man in some way. You don't want to stick around at all but you notice his vault suit had a Pipboy clinched"+   
                    " around his wrist. You remembered PipBoys were assigned to every Vault Dweller. They were a state of the art tool that held your vitals and had lots of useful functions."+
                    " The PipBoy  around the man's wrist had an inscription that read 'Porter Cassius'..");
            
            setTwoOptions("Take the Pipboy!", "Don't take the Pipboy.");
        }
        
        public void inspectDeadBodyHasPipBoy(){
            setPrompt("Checking back on the body reveals little else. The face was still unfamiliar. He wore the standard blue/yellow VaultDweller jumpsuit we all wore. Not fashionable"+
                    " but the best we could in our nuclear post-apocalypse situtation so who could complain. The PipBoy I grabbed around his wrist "+
                    "read 'Porter Cassius'. You hope he had a quick painless death at the very least as you feel you knew him in some way. You take a moment of silence staring at him in the harsh+"+
                    " light before turning around.");
            setOneOption("Enough morbid consideration");
        }
        
        public void endOfHallDoor(){
            setPrompt("Before you is a staircase leading up. You hear ominous noises filtering in and out from upstairs and you're not exactly sure what"+
                    " they are. Your hand grips the rail and you look towards the stairs...");
            setTwoOptions("Go back", "Go Upstairs");
        }
        
        public void bunkhouse(){
            setPrompt("A corridor divides this room, and on either side there are a half dozen more doors, " +
                    "presumambly behind which are the actual bunkrooms. The same red emergency lighting is in use here.");
            setThreeOptions("Go back to hallway", "Check the nearest bunkroom", "Check Office");
        }
        
        public void bunkroom(){
            setPrompt("This is a tiny living space. A twin bed takes up more than half the space, and a wash basin and chair take up the rest. The concrete walls are unpainted.");
            setOneOption("Go back to the bunkhouse");
        }
        
        public void waterRoom(){
            setPrompt("Your PipBoy unlocks this room instantly. ");
            setTwoOptions("Go back to hallway", "Climb up mini-ladder");
        }
        
        public void upMiniLadder(){
            setPrompt("Test");
            setOneOption("Try to touch machinery.");
        }
        
        public void upStairsLanding(){
            setPrompt("You find yourself on the landing of the main floor. The stairs you came up are behind you. You can see a room marked 'Observer's Office'"
            + ". Opposite you there appears to be a railing. To the left of where you are, is the vault door. It looks like a door to the world's biggest safe.");
            setAllOptions("Go back", "Look over railing", "Inspect vault door", "Go to 'Observer's Office'");
        }
        
        public void maintenanceCloset(){
            setPrompt("bunkhouse office");
            setTwoOptions("Go back", "Inspect Terminal");
        }
        
        public void closetComputerChoices(){
            setPrompt("testing closet computer choices");
            
            setThreeOptions("'Message to Roy'", "'About Cordyceps'","Exit Terminal");
        }
        
        public void closetComputerChoice1(){
            setPrompt("....................../´¯/)\n"+
                    "....................,/¯../\n"+
                    ".................../..../\n"+
                    "............./´¯/'...'/´¯¯`·¸\n"+
                    "........../'/.../..../......./¨¯\\\n"+
                    "........('(...´...´.... ¯~/'...')\n"+
                    ".........\\.................'...../\n"+
                    ".......''..\\................ _.·´\n"+
                    "............\\..............(\n"+
                    "..............\\.............\\ ");
            
            setOneOption("Back to Main choices");
        }
        
        public void closetComputerChoice2(){
            setPrompt("-MEDICINE JOURNAL- ::On The Cordyceps Virus::\n"+
                    "'Toxoplasmosis', a");       
            setOneOption("Continue Article");
        }
        
        public void closetComputerChoice22(){
            setPrompt("Cordyceps 2-2");
            
            setOneOption("Exit Article");
        }
        
        public void arcingWires(){
            setPrompt("Your hands slowly glide across the propeller blades, inching towards the black tuft. The mini-ladder wobbles slightly under you but the curiosity in your heart"+
                    " burns to see what's there. You just feel the tip of the fuzzy object before your palm "+
                    "suddenly brushes up against a small metal switch-\n"+
                    "BRRRZRRRRRRTTTT\n"+
                    "Before you can even react, the switch you flip turns the fan on and a vacuum obliterates your arm instantly. Your body drops into the tank and your vision darkens....");
            setOneOption("Game Over!");
        }
    }//end of vault rooms class
    
    //This is the vault logic class. It contains the switch statements. The big switch statement has as its cases the "rooms" of the game. It gets the player
    //position which is initially set to start(in the UserPlayer class) and goes to that particular case. Then, there is a switch statement nested there, which
    //works off the option the user chose. The options and prompt are set accordingly, and the player position is updated. The calls to the nested class vualtrooms methods
    //work without an object because this class extends the vaultrooms class. 
    private class VaultLogic extends VaultRooms{
        
        //This will be the only method in this class
        public UserPlayer gameLogic(UserPlayer passedPlayer, String option){
            
            switch (passedPlayer.getPlayerPosition()) {
                
                    case "start":
                        /*
                            The following SOP statement is used for testing to see if the pipboy is actually equipped after the player takes it off the dead body.
                            GETTING THE PIPBOY IS CURRENTLY WORKING - 3/4/20
                        */
                        //System.out.println(passedPlayer.inquirePipBoy());
                        
                        switch (option) {
                            
                            case "Option1":
                                introTwo();
                                passedPlayer.updatePosition("introTwo");
                                break;
                        }//end of internal switch statement for room "intro"
                    break;
                    
                    case "introTwo":
                        switch(option){
                            case "Option1":
                                startCont();
                                passedPlayer.updatePosition("startCont");
                        }
                    break;
                    
                    case "startCont":
                        switch(option){
                            case "Option1":
                                if(passedPlayer.inquirePipBoy() == false) {
                                    firstLockedDoor();
                                    passedPlayer.updatePosition("firstLockedDoor");
                                }
                                else{
                                    firstHallway();
                                    passedPlayer.updatePosition("firstHallway");
                                }
                                break;
                                
                            case "Option2":
                                firstDeadEndRoom();
                                passedPlayer.updatePosition("firstDeadEnd");                                
                            break;
                            case "Option3":
                                firstTerminalPartOne();
                                passedPlayer.updatePosition("firstTerminalPartOne");                                
                            break;
                            case "Option4":
                                if(passedPlayer.inquirePipBoy() == false){
                                    inspectDeadBody();
                                    passedPlayer.updatePosition("deadBody");
                                }
                                else{
                                    inspectDeadBodyHasPipBoy();
                                    passedPlayer.updatePosition("deadBodyEquipped");
                                }                                
                            break;
                        }//end of internal switch statement for startcont
                    break;
 
                    case "firstLockedDoor":
                        switch(option){
                            
                            case "Option1":
                                startCont();
                                passedPlayer.updatePosition("startCont");
                            break;                               
                            
                        }
                    case "firstHallway":
                        switch (option){
                            
                            case "Option1":
                                startCont();
                                passedPlayer.updatePosition("startCont");
                            break;
                            
                            case "Option2":
                                endOfHallDoor();
                                passedPlayer.updatePosition("endOfHallDoor");
                            break;
                            
                            case "Option3":
                                bunkhouse();
                                passedPlayer.updatePosition("bunkhouse");
                            break;
                            
                            case "Option4":
                                waterRoom();
                                passedPlayer.updatePosition("waterRoom");
                            break;
                                
                        }//end of internal switch statement for room "exampleCont"
                    break;
                        
                    case "firstDeadEnd":
                        switch (option){
                            
                            case "Option1":
                                startCont();
                                passedPlayer.updatePosition("startCont");
                                break;
                                
                        }//end of internal switch statement for room "exampleOfOneButton"
                    break;
                        
                    case "firstTerminalPartOne":
                        switch (option){
                            
                            case "Option1":
                                firstTerminalPartTwo();
                                passedPlayer.updatePosition("firstTerminalPartTwo");
                            break;
                                
                        }//end of internal switch statement for room "firstTerminalPartOne"
                    break;
                        
                    case "firstTerminalPartTwo":
                        switch (option){
                            
                            case "Option1":
                                startCont();
                                passedPlayer.updatePosition("startCont");
                            break;
                                
                        }//end of intenral switch statement for room "firstTerminalPartTwo
                    break;
                    
                    case "deadBody":
                        switch (option){
                                
                                case "Option1":
                                    passedPlayer.equipPipBoy();
                                    jLabel1.setVisible(true);
                                    startCont();
                                    passedPlayer.updatePosition("startCont");
                                break;
                                
                                case "Option2":
                                    startCont();
                                    passedPlayer.updatePosition("startCont");
                                break;
                        }//end of internal switch statement for room "deadBody"
                    break;
                    
                    case "deadBodyEquipped":
                        switch(option){
                            
                            case "Option1":
                                startCont();
                                passedPlayer.updatePosition("startCont");
                            break;
                        }//end of internal switch statement fcr room deadbodyequipped
                    break;
                    
                    case "waterRoom":
                        switch(option){
                            case "Option1":
                                firstHallway();
                                passedPlayer.updatePosition("firstHallway");
                            break;
                            
                            case "Option2":
                                upMiniLadder();
                                passedPlayer.updatePosition("upMiniLadder");
                            break;
                        }
                    break;
                    
                    case "upMiniLadder":
                        switch(option){
                            case "Option1":
                                arcingWires();
                                passedPlayer.updatePosition("arcingWires");
                            break;
                        }
                    break;
                    
                    case "bunkhouse":
                        switch(option){
                            case "Option1":
                                firstHallway();
                                passedPlayer.updatePosition("firstHallway");
                            break;
                            
                            case "Option2":
                                bunkroom();
                                passedPlayer.updatePosition("bunkroom");
                            break;
                            
                            case "Option3":
                                maintenanceCloset();
                                passedPlayer.updatePosition("maintenanceCloset");
                            break;
                        }//end of internal switch statement for room bunkhouse
                    break;
                    
                    case "bunkroom":
                        switch(option){
                            case "Option1":
                                bunkhouse();
                                passedPlayer.updatePosition("bunkhouse");
                            break;
                        }//end of internal switch statement for room bunkroom
                    break;
                    
                    case "endOfHallDoor":
                        switch(option){
                            case "Option1":
                                firstHallway();
                                passedPlayer.updatePosition("firstHallway");
                            break;
                            
                            case "Option2":
                                upStairsLanding();
                                passedPlayer.updatePosition("upStairsLanding");
                            break;
                        }//end of room endofhalllanding nested switch statement
                    break; 
                    
                    case "maintenanceCloset":
                        switch(option){
                            case "Option1":
                                bunkhouse();
                                passedPlayer.updatePosition("bunkhouse");
                            break;
                            
                            case "Option2":
                                closetComputerChoices();
                                passedPlayer.updatePosition("closetComputerChoices");
                            break;
                        }//end of room maintenance closet internal switch statement
                    break;
                    
                    case "closetComputerChoices":
                        switch(option){
                            case "Option1":
                                closetComputerChoice1();
                                passedPlayer.updatePosition("closetComputerChoice1");
                            break;
                            
                            case "Option2":
                                closetComputerChoice2();
                                passedPlayer.updatePosition("closetComputerChoice2");
                            break;
                            
                            case "Option3":
                                maintenanceCloset();
                                passedPlayer.updatePosition("maintenanceCloset");
                            break;
                        }
                    break; 
                    
                    case "closetComputerChoice1":
                        switch(option){
                            case "Option1":
                                closetComputerChoices();
                                passedPlayer.updatePosition("closetComputerChoices");
                            break;
                        }
                    break;
                    
                    case "closetComputerChoice2":
                        switch(option){
                            case "Option1":
                                closetComputerChoice22();
                                passedPlayer.updatePosition("closetComputerChoice22");
                            break;    
                        }
                    break;
                    
                    case "closetComputerChoice22":
                        switch(option){
                            case "Option 1":
                                closetComputerChoices();
                                passedPlayer.updatePosition("closetComputerChoices");
                            break;
                        }
                    break;
                    
                    case "arcingWires":
                        switch(option){
                            case "Option1":
                                ProtoGUI gameOverGui = new ProtoGUI();
                                gameOverGui.setVisible(true);
                                dispose();
                            break;
                        }//end of room arcing wires 
                    
                    
                    
            }//end of external switch statement
            return passedPlayer;
        }//end of gamelogic method
    }//end of vault logic class

}//end of GameGUI class
