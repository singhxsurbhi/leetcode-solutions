class Solution {
    public boolean validUtf8(int[] data) {
        int remain = 0;
        for(int i: data) {
            if(remain == 0) {
                if((i >> 7) == 0b0) {
                    continue;
                } else if((i >> 5) == 0b110) {
                    remain = 1;
                } else if((i >> 4) == 0b1110) {
                    remain = 2;
                } else if((i >> 3) == 0b11110) {
                    remain = 3;
                } else return false;
            }
            else {
                if((i >> 6) == 0b10) {
                    remain--;
                } else {
                    return false;
                }
            }
        }
        return remain == 0;
    }
}