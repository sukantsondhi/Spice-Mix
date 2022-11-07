class SpiceMixologistCli {
    public SpiceMixGame Sp;


    public static SpiceMixGame playGame( SpiceMixGame Game) {

        while (true) {
            System.out.println("Previous Attempts:");

            if (Game.getPreviousAttempts() == null) {
                System.out.println("No previous attempts.");

                Game = new SpiceMixGame();
            }

            else {
                break;                
            }
        } return null;      
    }

    public static void main(String[] args) {
        ;
    }
}
