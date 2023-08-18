/*--------------------------------------------------------------------------
GWU CSCI 1112 Spring 2023
author: James Taylor

This class is a demo of a simple game using the rules provided by the 
TileGame class.  This game could be expanded rather easily to model the 
entire Scrabble game but it is a rough approximation of the concept that
we will call Scramble instead.
--------------------------------------------------------------------------*/

class Scramble {

    /// This is the entry point for the basic Scramble example TileGame
    public static void main( String[] args ) {
        // Game Settings or inputs.  Change these to change up the game play
        int HANDSIZE = 7;
        long GAMESEED = 500;
        int PLAYERS = 4;
        int ROUNDS = 2;

        String[] dictionary = WordTool.getDictionary ();
        UniformRandom.set_seed(GAMESEED);

        // running score to accumulate scores over multiple rounds
        int[] scores = new int[PLAYERS];

        // iterate for each round        
        for( int j = 0; j < ROUNDS; j++ ) {
            System.out.println( "Round " + (j+1) );

            // iterate for each player's turn
            for( int i = 0; i < scores.length; i++ ) {
                int score = 0;
   
                // draw a new hand
                char[] hand = TileGame.drawHand(HANDSIZE);
                String best = TileGame.getBestWord(hand, dictionary);

                // sanity check - handle potential for a "pass"
                if( best != null ) {
                    score = TileGame.getWordScore(best.toCharArray());
                }
                // update the running score
                scores[i] += score;

                // this is just for ease of printing
                String scramble = new String(hand);

                // print what the player would play and the score
                System.out.println("  Player " + (i+1) + ":" + scramble + "," + best + "," + score);
            }
        }
        
        System.out.println("Final Scores:");
        for( int i = 0; i < scores.length; i++ ) {
            System.out.println("  Player " + (i+1) + ":" + scores[i] );
        }
    }
}
