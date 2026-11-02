class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0; i<9; i++){
            Set<Character> seen = new HashSet<>();

            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    if(!seen.add(board[i][j])){
                        return false;
                    }
                }
            }
        }

        for(int i=0; i<9; i++){
            Set<Character> seen = new HashSet<>();

            for(int j=0; j<9; j++){
                if(board[j][i] != '.'){
                    if(!seen.add(board[j][i])){
                        return false;
                    }
                }
            }
        }

        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                Set<Character> seen = new HashSet<>();

                for(int row=i; row<i+3; row++){
                    for(int col=j; col<j+3; col++){
                        
                        if(board[row][col] != '.'){
                            if(!seen.add(board[row][col])){
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
        
    }
}
