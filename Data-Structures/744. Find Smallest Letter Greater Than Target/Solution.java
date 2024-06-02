class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char[] letters = {"c", "f", "j"};
        char target = 'a';

        int start=0;
        int end=letters.length-1;
        int mid=0;
        while (start<=end){
            mid=start+(start+end)/2;
            if (a[m]>target)end=mid-1;
            else if (letters[m]<target)start=mid+1;
        }
        return letters[mid]>target?letters[mid]:letters[0];
    }
}