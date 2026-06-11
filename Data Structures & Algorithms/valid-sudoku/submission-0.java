class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> flagger=new HashSet<>();
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                char num=board[r][c];
                if(num!='.'){
                    if(!flagger.add(num + " is not in the row" +r)
                    ||!flagger.add(num + " is not in the col" +c)
                    ||!flagger.add(num +" is not int the grid" +c/3+"-"+r/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
