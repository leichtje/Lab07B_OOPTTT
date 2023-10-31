public class TicTacToeWins extends TicTacToeFrame {

    public static void validMove(String player, int row, int col){
        board[row][col] = player;
    }
    public static boolean isTie(){
        boolean xFlag = false;
        boolean oFlag = false;
        for(int row=0; row < ROW; row++)
        {
            if(board[row][0].equals("X") ||
                    board[row][1].equals("X") ||
                    board[row][2].equals("X")) {
                xFlag = true;
            }if(board[row][0].equals("O") ||
                board[row][1].equals("O") ||
                board[row][2].equals("O")) {
            oFlag = true;
        }if(! (xFlag && oFlag) )
        {
            return false;
        }
            xFlag = oFlag = false;
        }
        for(int col=0; col < COL; col++)
        {
            if(board[0][col].equals("X") ||
                    board[1][col].equals("X") ||
                    board[2][col].equals("X")) {
                xFlag = true;
            }if(board[0][col].equals("O") ||
                board[1][col].equals("O") ||
                board[2][col].equals("O"))
        {
            oFlag = true;
        } if(! (xFlag && oFlag) )
        {
            return false;
        }
        }

        xFlag = oFlag = false;
        if(board[0][0].equals("X") ||
                board[1][1].equals("X") ||
                board[2][2].equals("X") )
        {
            xFlag = true;
        }
        if(board[0][0].equals("O") ||
                board[1][1].equals("O") ||
                board[2][2].equals("O") )
        {
            oFlag = true;
        } if(! (xFlag && oFlag) )
        {
            return false;
        }
        xFlag = oFlag = false;
        if(board[0][2].equals("X") ||
                board[1][1].equals("X") ||
                board[2][0].equals("X") )
        {
            xFlag = true;
        } if(board[0][2].equals("O") ||
                board[1][1].equals("O") ||
                board[2][0].equals("O") )
        {
            oFlag = true;
        } if(! (xFlag && oFlag) )
        {
            return false;
        }
        return true;
    }
    public static boolean isWin(String player){
        return isColWin(player) || isRowWin(player) || isDiagonalWin(player);
    }
    private static boolean isRowWin(String player){
        for(int row = 0; row < ROW; row++){
            if(board[row][0].equals(player) && board[row][1].equals(player) && board[row][2].equals(player)){
                return true;
            }
        }
        return false;
    }
    private static boolean isColWin(String player){
        for(int col = 0; col < COL; col++){
            if(board[0][col].equals(player) && board[1][col].equals(player) && board[2][col].equals(player)){
                return true;
            }
        }
        return false;
    }

    private static boolean isDiagonalWin(String player){
        for(int row = 0; row < ROW; row++){
            for(int col = 0; col < COL; col++){
                if(board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)){
                    return true;
                }
                if(board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)){
                    return true;
                }
            }
        }
        return false;
    }
}
